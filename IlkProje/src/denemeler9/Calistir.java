package denemeler9;

import java.util.ArrayList;
import java.util.List;

public class Calistir {
	public static void main(String[] args) {
		SayiSakla<Integer> sakla = new SayiSakla<>(1);
		System.out.println(sakla.getDeger());
		sakla.yaz();

		SayiSakla<Double> sakla2 = new SayiSakla<>(2.0);
		System.out.println(sakla2.getDeger());
		sakla2.yaz();

		List<Integer> dizi = new ArrayList<>();
		dizi.add(1);
		sakla2.yaz(dizi);

		System.out.println(sakla2.ikiKati(3.0));

	}
}
