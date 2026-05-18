package kahve;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Kahve implements Comparable<Kahve> {
	private String mensei;
	private Date kavrulmaTarihi;
	private int gram;

	@Override
	public int compareTo(Kahve kahve) {
		return Integer.compare(getGram(), kahve.getGram());
	}
}
