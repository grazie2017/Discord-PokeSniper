package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import entities.AllJsonData;
import entities.AllPokemonNames;
import entities.Pokemon;
import resources.DPSUtils;

public class JSONHandler {

	@SuppressWarnings("rawtypes")
	public static void PokeList() {
		HashMap<String, Pokemon> pokehash = new HashMap<>();
		ArrayList<Pokemon> poke = new ArrayList<>();

		try {
			File f = new File(DPSUtils.getCurrentDirectory() + "/settings.json");
			if (f.exists() && !f.isDirectory()) {
				FileReader reader = new FileReader(DPSUtils.getCurrentDirectory() + "/settings.json");
				JSONParser jsonParser = new JSONParser();
				JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
				String token = (String) jsonObject.get("token");
				Integer amount = Integer.parseInt((String) jsonObject.get("amountToCatch") == null ? "957"
						: (String) jsonObject.get("amountToCatch"));
				String farm = (String) jsonObject.get("autoFarm");
				Integer waitingTime = Integer.parseInt(
						(String) jsonObject.get("waitingTime") == null ? "60" : (String) jsonObject.get("waitingTime"));
				Boolean autoFarm = farm == null ? true : Boolean.parseBoolean(farm);
				JSONArray pokemon = (JSONArray) jsonObject.get("pokemons");
				Iterator i = pokemon.iterator();
				boolean start = false;
				while (i.hasNext()) {
					JSONObject innerObj = (JSONObject) i.next();
					if (innerObj.get("id") != null) {
						String pokeName = (String) innerObj.get("name");
						if (pokeName.equals("Exeggcutor"))
							pokeName = "Exeggutor";
						Integer number = Integer.parseInt((String) innerObj.get("id"));
						if (number == 69 && pokeName.equals("Machamp"))
							start = true;
						if (start) {
							number = number - 1;
						}
						String checkName = (String) innerObj.get("displayName");
						if (number == 29) {
							checkName = "Nidoran (F)";
							pokeName = "nidoran-f";
						}
						if (number == 32) {
							checkName = "Nidoran (M)";
							pokeName = "nidoran-m";
						}
						if (number == 83)
							checkName = "Farfetch'd";
						if (number == 84)
							checkName = pokeName;
						if (number == 122)
							checkName = "Mr. Mime";
						if (checkName == null)
							checkName = pokeName;
						pokehash.put(pokeName,
								new Pokemon(number, pokeName, (Boolean) innerObj.get("catch"),
										checkName.equals(pokeName) ? null : checkName,
										Integer.parseInt((String) innerObj.get("amount") == null ? "0"
												: (String) innerObj.get("amount"))));
						if (innerObj.get("amount") != null)
							DPSUtils.setPokeCatchCounter(Integer.parseInt((String) innerObj.get("amount")));
					}
				}
				if (pokehash.size() + 1 != AllPokemonNames.amountOfPokemons) {
					Iterator it = pokehash.entrySet().iterator();
					for (int x = 0; x <= pokehash.size(); x++)
						poke.add(new Pokemon());
					while (it.hasNext()) {
						Map.Entry pair = (Map.Entry) it.next();
						poke.get(((Pokemon) pair.getValue()).getId()).setPokemon((Pokemon) pair.getValue());
						it.remove();
					}
					new AllJsonData(token, poke, amount, autoFarm, waitingTime);
				} else {
					System.err.println("Error with pokemons in settings.json, creating file from scratch!");
					poke = createNewFileList();
					new AllJsonData(token == null ? "" : token, poke, 995, autoFarm == null ? true : autoFarm,
							waitingTime == null ? 60 : waitingTime);
				}
			} else {
				System.err.println("settings.json file was not found, creating file.");
				poke = createNewFileList();
				new AllJsonData("", poke, 995, true, 60);
			}
		} catch (Exception e) {
			System.err.println("Error with reading settings.json file, creating new file.");
			try {
				poke = createNewFileList();
			} catch (FileNotFoundException | UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			new AllJsonData("", poke, 995, true, 60);
		}

	}

	private static ArrayList<Pokemon> createNewFileList() throws FileNotFoundException, UnsupportedEncodingException {
		ArrayList<Pokemon> poke = new ArrayList<>();
		PrintWriter writer = new PrintWriter(DPSUtils.getCurrentDirectory() + "/settings.json", "UTF-8");
		writer.close();
		for (String pok1 : AllPokemonNames.pok) {
			String[] split = pok1.split("\\|");
			poke.add(new Pokemon(split[0], split[1], split.length == 3 ? split[2] : split[1]));
		}
		return poke;
	}

	public static void UpdatePokeList() {
		try {
			FileWriter write = new FileWriter(DPSUtils.getCurrentDirectory() + "/settings.json");
			String str = "{\n";
			str += "\t\"token\": \"" + AllJsonData.getToken() + "\", \n";
			str += "\t\"amountToCatch\": \"" + AllJsonData.getAmountToCatch() + "\", \n";
			str += "\t\"autoFarm\": \"" + AllJsonData.getPokeFarm() + "\", \n";
			str += "\t\"waitingTime\": \"" + AllJsonData.getWaitingTime() + "\", \n";
			str += "\t\"pokemons\": [\n";
			for (Pokemon pokemon : AllJsonData.getPokelist()) {
				if (pokemon.getId() != null)
					str += pokemon.toJSON();
			}
			str += "\t]\n";
			str += "}";
			write.write(str);
			write.flush();
			write.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}