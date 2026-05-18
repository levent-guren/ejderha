package ornek8;

public class Sayac implements Runnable {
	private static volatile int sayac = 10;

	public static int getSayac() {
		return sayac;
	}

	public static void setSayac(int sayac) {
		Sayac.sayac = sayac;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			azalt();
		}
	}

	private synchronized void azalt() {
		int s = sayac;
		bekle();
		sayac = s - 1;
	}

	private void bekle() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
