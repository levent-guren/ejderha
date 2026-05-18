package stream;

import java.util.Arrays;
import java.util.List;

public class Ornek {
	public static void main(String[] args) {
		List<String> isimler = Arrays.asList("a", "l", "i", "o", "p", "b");
		// @formatter:off
		isimler.stream().parallel().map(s -> {
			System.out.println(s + ":" + 1);
			return s;
		}).map(s -> {
			System.out.println(s + ":" + 2);
			return s;
		}).forEach(s-> {
			System.out.println(s + ":" + 3);
		});
		// @formatter:on
	}
}
