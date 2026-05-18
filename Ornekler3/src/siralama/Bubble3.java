package siralama;

import java.util.Arrays;
import java.util.stream.Stream;

public class Bubble3 {
	public static void main(String[] args) {
		// @formatter:off
		Kitap[] kitaplar = { 
				new Kitap("Empati", 520, 2010),
				new Kitap("Harry Potter", 800, 2015),
				new Kitap("Anna Kararina", 1200, 2022),
				new Kitap("Uzay Yolu", 230, 2011),
				new Kitap("Aya Yolculuk", 120, 2018),
				new Kitap("Açlık Oyunları", 650, 2019),
				new Kitap("Yüzüklerin Efendisi", 1640, 2024)
		};
		// @formatter:on
		sirala(kitaplar);
		Stream.of(kitaplar).forEach(System.out::println);
		Arrays.sort(kitaplar, (k1, k2) -> Integer.compare(k1.getSayfaSayisi(), k2.getSayfaSayisi()));
		System.out.println("--------------");
		Stream.of(kitaplar).forEach(System.out::println);
		Arrays.sort(kitaplar, (k1, k2) -> Integer.compare(k1.getBasimYili(), k2.getBasimYili()));
		System.out.println("--------------");
		Stream.of(kitaplar).forEach(System.out::println);

	}

	private static <T extends Comparable<T>> void sirala(T[] objeler) {
		for (int i = 0; i < objeler.length - 1; i++) {
			for (int j = 0; j < objeler.length - 1; j++) {
				if (objeler[j].compareTo(objeler[j + 1]) > 0) {
					// yer değiştirmeleri gerekiyor
					T temp = objeler[j];
					objeler[j] = objeler[j + 1];
					objeler[j + 1] = temp;
				}
			}
		}
	}
}
