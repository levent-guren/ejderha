package ornek3;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac = new Sayac();
		new Thread(sayac).start();
		Thread.sleep(100);
		sayac.dur = true;
		System.out.println("Program sonu");
	}
}
