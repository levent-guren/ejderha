package ornek1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableOrnegi {
	public static void main(String[] args) {
		Map<Integer, String> sehirler = new Hashtable<>();
		sehirler.put(1, "Adana");
		sehirler.put(6, "Anka");
		sehirler.put(67, "Zonguldak");
		sehirler.put(6, "Ankara");
		sehirler.put(34, "İstanbul");
		System.out.println(sehirler.get(6));
		System.out.println("---------------");
		Iterator<String> itr = sehirler.values().iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("---------------");
		/****************************/
		for (String s : sehirler.values()) {
			System.out.println(s);
		}
	}
}
