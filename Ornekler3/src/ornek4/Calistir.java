package ornek4;

public class Calistir {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object o = new Object(); // stack ve heap memory kullanılıyor
		o = new Object(); // burada sadece heap memory kullanıldı
	}
}
