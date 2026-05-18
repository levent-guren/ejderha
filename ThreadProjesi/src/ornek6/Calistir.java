package ornek6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calistir {
	public static void main(String[] args) {
//		try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
		try (ExecutorService executor = Executors.newSingleThreadExecutor()) {
			for (int i = 0; i < 10; i++) {
				int i2 = i;
				executor.submit(() -> {
					System.out.println(i2 + ". iş başladı");
					try {
						Thread.sleep(1000 + (int) (Math.random() * 1000));
					} catch (InterruptedException e) {
					}
					System.out.println(i2 + ". iş bitti");
				});
			}
			System.out.println("For döngüsü bitti.");
		}
	}
}
