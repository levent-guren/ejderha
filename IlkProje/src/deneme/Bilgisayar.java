package deneme;

public class Bilgisayar {
	static String marka;
	int ram;
	static {
		System.out.println(4);
	}
	static void test() {
		System.out.println(marka);
		// System.out.println(ram); hata verir
	}
	void test2() {
		System.out.println(Bilgisayar.marka);
		System.out.println(ram);
	}
	public void yaz() {
		System.out.println(ram);
	}
	public Bilgisayar(int ram) {
		System.out.println(5);
		this.ram = ram;
	}
	public Bilgisayar(Bilgisayar t) {
		System.out.println(6);
	}
	public Bilgisayar(String t) {
		System.out.println(7);
	}
	
	public Bilgisayar() {
		this((Bilgisayar)null);
		System.out.println(2);
	}
}
