package zadacha5;

import java.util.*;

public class ClassMain {
	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String>();
		mnozestvo1.add("Marija");
		mnozestvo1.add("Bojan");
		mnozestvo1.add("Gjorgi");
		mnozestvo1.add("Natasha");
		Set<String> mnozestvo2 = new TreeSet<String>();
		mnozestvo2.add("Natasha");
		mnozestvo2.add("Marija");
		mnozestvo2.add("Iskra");
		mnozestvo2.add("Antonio");
		// unija na dvete mnozestva
		Set<String> unija = new TreeSet<String>();
		System.out.println("Unija na dvete mnozestva:");
		unija.addAll(mnozestvo2);
		unija.addAll(mnozestvo1);
		System.out.println(unija);
		// presek na dvete mnozestva
		System.out.println("presek na dvete mnozestva:");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}
