package kahve;

import java.sql.Date;

public class Calistir {
	public static void main(String[] args) {
		var agac = new Agac();
		agac.addKahve(new Kahve("Brezilya", Date.valueOf("2026-05-11"), 2000));
		agac.addKahve(new Kahve("Kolombia", Date.valueOf("2026-05-12"), 1000));
		agac.addKahve(new Kahve("Etiyopya", Date.valueOf("2026-05-10"), 1500));
		agac.addKahve(new Kahve("Vietnam", Date.valueOf("2026-04-29"), 500));
		agac.addKahve(new Kahve("Guatemala", Date.valueOf("2026-05-15"), 4000));
		agac.addKahve(new Kahve("Brezilya", Date.valueOf("2026-05-13"), 5000));
		agac.addKahve(new Kahve("Vietnam", Date.valueOf("2026-05-11"), 3000));
		System.out
				.println("500 gr kahve var mı? " + agac.search(new Kahve("Vietnam", Date.valueOf("2026-04-29"), 500)));
		System.out.println(
				"3000 gr kahve var mı? " + agac.search(new Kahve("Vietnam", Date.valueOf("2026-05-11"), 3000)));
		System.out.println(
				"4000 gr kahve var mı? " + agac.search(new Kahve("Guatemala", Date.valueOf("2026-05-15"), 4000)));
		System.out.println(
				"3500 gr kahve var mı? " + agac.search(new Kahve("Vietnam", Date.valueOf("2026-05-11"), 3500)));
	}
}
