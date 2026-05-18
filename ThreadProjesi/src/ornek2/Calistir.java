package ornek2;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac = new Sayac();
		Thread t1 = new Thread(sayac);
		t1.start();
		t1.join(); // Thread'in bitmesini bekler.
		new Thread(sayac).start();
		System.err.println("Program sonu");
	}
}
