package ornek9.pideci;

import java.util.ArrayList;
import java.util.List;

public class Pideci {
	private volatile List<Pide> pideler = new ArrayList<>();

	public void ekmekUret() {
		synchronized (this) {
			if (pideler.size() > 9) {
				try {
					System.out.println("Pide koyacak yer kalmadı. Üretim için bekleniyor.");
					wait(); // 10 adet pide hali hazırda varsa yenisini üretmek için birinin satılmasını
							// bekle
					System.out.println("Üretim devam ediyor.");
				} catch (InterruptedException e) {
				}
			}
			pideler.add(new Pide());
			System.out.println("Pide üretildi. Raftaki pide adedi:" + pideler.size());
			notify(); // pide bekleyen müşteri(ler) varsa birini(rastgele) uyandır
		}
	}

	@SuppressWarnings("unused")
	public void ekmekSat() {
		synchronized (this) {
			if (pideler.size() == 0) {
				try {
					System.out.println("Pide yok. Üretilmesini bekliyor.");
					wait(); // pide yok. Üretilmesini bekle
					System.out.println("Satın alma devam ediyor.");
				} catch (InterruptedException e) {
				}
			}
			Pide pide = pideler.removeFirst(); // ilk pideyi al
			System.out.println("Pide satın alındı. Raftaki pide adedi:" + pideler.size());
			notify(); // pide üretmek için bekleniyorsa, yuer açıldı, uyandır
		}
	}
}
