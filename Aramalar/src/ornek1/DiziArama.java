package ornek1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiziArama {
	public static void main(String[] args) {
		int[] sayilar = { 1, 3, 4, 6, 7, 9, 11, 14, 18 };
		int sira = Arrays.binarySearch(sayilar, 9);
		System.out.println(sira);
		// @formatter:off
		Bilgisayar[] bilgisayarlar = {
				new Bilgisayar(1200, 128, "Acer"),
				new Bilgisayar(1800, 512, "Acer"),
				new Bilgisayar(2400, 256, "Asus"),
				new Bilgisayar(1100, 768, "Monster"),
				new Bilgisayar(1400, 1024, "Hp"),
				new Bilgisayar(2200, 256, "Dell")
		};
		// @formatter:on
		int bilgisayarSirasi = Arrays.binarySearch(bilgisayarlar, new Bilgisayar(1400, 1024, "Hp"),
				Comparator.comparingInt(b -> b.getHiz()));
		System.out.println(bilgisayarSirasi); // bulamadı. -2 döndürdü. Çünkü dizi sıralı değil. Bulursa =>0 bir değer
												// döndürüyor.
		Arrays.sort(bilgisayarlar, Comparator.comparingInt(b -> b.getHiz()));
		int bilgisayarSirasi2 = Arrays.binarySearch(bilgisayarlar, new Bilgisayar(1400, 1024, "Hp"),
				Comparator.comparingInt(b -> b.getHiz()));
		System.out.println(bilgisayarSirasi2);
		List<Bilgisayar> bilgisayarListesi = List.of(bilgisayarlar);
		int bilgisayarSirasi3 = Collections.binarySearch(bilgisayarListesi, new Bilgisayar(1400, 1024, "Hp"),
				Comparator.comparingInt(b -> b.getHiz()));
		System.out.println(bilgisayarSirasi3);
	}
}
