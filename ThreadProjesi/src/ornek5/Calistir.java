package ornek5;

import java.lang.Thread.Builder.OfVirtual;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		OfVirtual ov = Thread.ofVirtual();
		Runnable t = () -> System.out.print(".");
		for (int i = 0; i < 100; i++) {
			ov.start(t);
			// ov.unstarted(t);
		}
		Thread.sleep(100);
		System.out.println();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.submit(() -> System.out.println("Executor"));
		executor.close();
	}
}