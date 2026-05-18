package ornek4;

import java.lang.Thread.Builder.OfVirtual;
import java.util.Arrays;
import java.util.function.Function;

public class Calistir {
	public static void main(String[] args) {
		// Thread.ofPlatform().start();
		OfVirtual ov = Thread.ofVirtual();
		ov.start(new Runnable() {
			@Override
			public void run() {

			}
		}); // anonymous class

		ov.start(() -> {
			System.out.println("Merhaba");
		}); // lambda
		ov.start(() -> System.out.println("Merhaba")); // lambda
		Function<Integer, Integer> t = x -> x + 1;
		System.out.println("lambda :" + t.apply(15));
		Arrays.asList(1, 2, 3).forEach(sayi -> System.out.println(sayi));
		Arrays.asList(1, 2, 3).forEach(System.out::println);
		Arrays.asList(1, 2, 3).forEach(Calistir::yaz);
	}

	public static void yaz(int sayi) {
		System.out.println(sayi);
	}
}
