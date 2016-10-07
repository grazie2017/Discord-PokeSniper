package threads;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import entities.AllJsonData;
import entities.PokeLocation;
import entities.WaitingPokemons;
import resources.DPSUtils;
import resources.MyColors;
import resources.SnipeCache;
import resources.SyncPipe;

public class CatchMe extends Thread {
	static boolean stop = false;

	public void run() {
		while (true) {
			while (stop || !(WaitingPokemons.isWaiting())) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			stop = true;
			PokeLocation pokeLocation = WaitingPokemons.next();
			if (!SnipeCache.isCached(pokeLocation)) {
				double latitude = pokeLocation.getLatitude();
				double longitude = pokeLocation.getLongitude();
				String pokemonName = pokeLocation.getPokemonType().getDisplayName();
				DPSUtils.log("Sniping " + pokemonName + " @ " + latitude + ", " + longitude + ".", MyColors.caught);
				String[] command = { "cmd", };
				Process proc = null;
				try {
					proc = Runtime.getRuntime().exec(command);
					new Thread(new SyncPipe(proc.getErrorStream(), System.err)).start();
					new Thread(new SyncPipe(proc.getInputStream(), System.out)).start();
					PrintWriter stdin = new PrintWriter(proc.getOutputStream());
					String ex = "PokeSniper2.exe " + pokeLocation.getPokemonType().getName() + " " + latitude + " "
							+ longitude + " exit";
					stdin.println("cd " + DPSUtils.getCurrentDirectory() + "\n");
					stdin.println(ex);
					stdin.close();
					proc.waitFor();
					proc.destroy();
				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
				}
				SnipeCache.addToCache(pokeLocation);
				try {
					Integer wait;
					Random rand = new Random();
					if (SyncPipe.caught == true) {
						SyncPipe.caught = false;
						wait = rand.nextInt(5000) + AllJsonData.getWaitingTime() * 1000;
					} else {
						wait = rand.nextInt(2500) + 5000;
					}
					Double dob = wait / 1000.0;
					DPSUtils.log("Waiting "
							+ String.valueOf(dob).substring(0,
									String.valueOf(dob).length() > 5 ? 5 : String.valueOf(dob).length())
							+ "s to prevent ban!");
					Thread.sleep(wait);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			stop = false;
		}
	}
}
