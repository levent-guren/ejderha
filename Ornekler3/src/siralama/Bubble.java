package siralama;

public class Bubble {
	public static void main(String[] args) {
		int[] sayilar = { 2, 5, 3, 4, 1, 6, 9, 7, 8 };
		sirala(sayilar);
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
	}

	private static void sirala(int[] sayilar) {
		for (int i = 0; i < sayilar.length - 1; i++) {
			for (int j = 0; j < sayilar.length - 1; j++) {
				if (sayilar[j] < sayilar[j + 1]) {
					// yer değiştirmeleri gerekiyor
					int temp = sayilar[j];
					sayilar[j] = sayilar[j + 1];
					sayilar[j + 1] = temp;
				}
			}
		}
	}
}
