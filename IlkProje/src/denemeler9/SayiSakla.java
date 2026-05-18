package denemeler9;

import java.util.List;

public class SayiSakla<T extends Number> {
	private T deger;

	public SayiSakla(T deger) {
		this.deger = deger;
	}

	public T getDeger() {
		return deger;
	}

	public void yaz() {
		System.out.println(deger);
	}

	public void yaz(List<? extends Number> dizi) {
		System.out.println(dizi);
	}

	@SuppressWarnings("hiding")
	public <T extends Number> int ikiKati(T sayi) {
		return sayi.intValue() * 2;
	}

}
