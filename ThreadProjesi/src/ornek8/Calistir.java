package ornek8;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac = new Sayac();
		Thread t1 = new Thread(sayac);
		Thread t2 = new Thread(sayac);
		t1.start();
		t2.start();
		Thread.sleep(300);
		Sayac.setSayac(Sayac.getSayac() - 1);
		t1.join();
		t2.join();
		System.out.println("Son değer:" + Sayac.getSayac());
	}
}
