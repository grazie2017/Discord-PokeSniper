package entities;

import java.util.ArrayList;

public class WaitingPokemons {
	public static ArrayList<PokeLocation> waiting = new ArrayList<>();
	
	public static void add(PokeLocation toAdd) {
		waiting.add(toAdd);
	}
	
	public static void remove() {
		waiting.remove(0);
	}
	
	public static PokeLocation next() {
		PokeLocation temp = waiting.get(0);
		remove();
		return temp;		
	}
	public static Boolean isWaiting() {
		return waiting.size() > 0;
	}
}
