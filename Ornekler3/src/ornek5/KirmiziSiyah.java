package ornek5;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class KirmiziSiyah {
	public static void main(String[] args) {
		Map<Integer, String> cocuklar = new TreeMap<>();
		cocuklar.put(5, "Aslı");
		cocuklar.put(8, "Pelinsu");
		cocuklar.put(11, "Mertcan");
		cocuklar.put(9, "Asel");
		cocuklar.put(10, "Defne");
		System.out.println(cocuklar);

		Set<String> cocuklar2 = new TreeSet<>();
		cocuklar2.add("Aslı");
		cocuklar2.add("Pelinsu");
		cocuklar2.add("Mertcan");
		cocuklar2.add("Asel");
		cocuklar2.add("Defne");
		System.out.println(cocuklar2);
	}
}
