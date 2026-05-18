package siralama;

public class Bubble2 {
	public static void main(String[] args) {
		String[] isimler = { "Ali", "Veli", "Kemal", "Aslı", "Ümran", "Özlem", "Zeynep", "Ğ", "Ş", "İ", "Çağrı", "m" };
		sirala(isimler);
		for (int i = 0; i < isimler.length; i++) {
			System.out.println(isimler[i]);
		}
	}

	private static void sirala(String[] isimler) {
		for (int i = 0; i < isimler.length - 1; i++) {
			for (int j = 0; j < isimler.length - 1; j++) {
				if (isimler[j].compareTo(isimler[j + 1]) > 0) {
					// yer değiştirmeleri gerekiyor
					String temp = isimler[j];
					isimler[j] = isimler[j + 1];
					isimler[j + 1] = temp;
				}
			}
		}
	}
}
