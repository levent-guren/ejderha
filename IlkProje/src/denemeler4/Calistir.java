package denemeler4;

public class Calistir {
	public static void main(String[] args) {
		test(new B());
		test(new E());
		test(new F());
		test(new G());
		test(new H());

	}

	static void test(OrtakTip a) {
		a.x();
	}
}
