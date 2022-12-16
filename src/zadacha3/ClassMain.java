package zadacha3;

import java.util.*;

public class ClassMain {
	public static void main (String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("Brenfort", "Fudbal", 24));
		list.add(new SportskiKlub("Fulham", "Fudbal", 24));
		list.add(new SportskiKlub("Elche", "Fudbal", 24));
		Collections.sort(list);
		for (SportskiKlub a: list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrChlenovi());
			System.out.println("");
		}
	}
}
