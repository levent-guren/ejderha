package siralama;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Kitap implements Comparable<Kitap> {
	private String adi;
	private int sayfaSayisi;
	private int basimYili;

	@Override
	public int compareTo(Kitap kitap) {
		return adi.compareTo(kitap.getAdi());
	}
}
