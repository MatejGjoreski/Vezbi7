package zadacha2;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
	public static void main(String[] args) {
		MetodiZaListaNiza obj = new MetodiZaListaNiza();
		List<String> lista = new ArrayList<String>();
		lista.add("Mendeleks");
		lista.add("Tramadol");
		obj.listToArray(lista);
		String[] niza = {"mendeleks", "tramadol", "paracetamol"};
		obj.arrayToList(niza);
	}
}
