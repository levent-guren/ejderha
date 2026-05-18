package ornek3;

import java.util.HashSet;
import java.util.Set;

public class HashSetOrnegi {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Ali");
		set.add("Veli");
		set.add("Zeynep");
		set.add("Veli");
		set.add("Ali");
		set.add("Zeynep");
		set.add("Ali");
		set.add("Veli");
		set.add("Kazım");
		set.add("Veli");
//		for (String s : set) {
//			System.out.println(s);
//		}
		set.forEach(System.out::println);
	}
}
