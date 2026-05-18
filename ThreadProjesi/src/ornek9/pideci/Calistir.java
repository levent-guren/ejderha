package ornek9.pideci;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Pideci pideci = new Pideci();
		Thread firinci = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				pideci.ekmekUret();
				bekle((long) (Math.random() * 50 + 50));
			}
		});
		Thread musteri = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				pideci.ekmekSat();
				bekle((long) (Math.random() * 500 + 50));
			}
		});
		firinci.start();
		musteri.start();
		firinci.join();
		musteri.join();
		System.out.println("Program sonu.");
	}

	private static void bekle(long d) {
		try {
			Thread.sleep(d);
		} catch (InterruptedException e) {
		}
	}
}
