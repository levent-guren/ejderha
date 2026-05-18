package denemeler8;

import java.util.ArrayList;
import java.util.List;

public class ListOrnegi {
	public static void main(String[] args) {
		List isimler = new ArrayList();
		isimler.add("Murteza");
		isimler.add("Kamile");
		String isim1 = (String) isimler.get(0);
		System.out.println(isim1);

		List<String> isimler2 = new ArrayList<>();
		isimler2.add("Nimet");
		String isim2 = isimler2.get(0);
		System.out.println(isim2);

	}
}
