package ornek7;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac = new Sayac();
		Thread t1 = new Thread(sayac);
		Thread t2 = new Thread(sayac);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Son değer:" + Sayac.getSayac());
	}
}
