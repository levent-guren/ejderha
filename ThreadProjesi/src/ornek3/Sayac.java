package ornek3;

public class Sayac implements Runnable {
	public volatile boolean dur = false;

	public void setDur(boolean dur) {
		this.dur = dur;
	}

	public boolean isDur() {
		return dur;
	}

	@Override
	public void run() {
		long sayac = 0;
		while (!dur) {
			sayac++;
			Thread.yield();
		}
		System.out.println(sayac);
	}
}
