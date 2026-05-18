package deneme2;

public class Calistir {
	public static void main(String[] args) {
		Kedi kedi = new Kedi();
		kedi.yas = 3;
		((Canli) kedi).yas = 5;
		System.out.println(kedi.yas);
		System.out.println(((Canli) kedi).yas);

		System.out.println(kedi.getYas());
		System.out.println(((Canli) kedi).getYas());

	}
}
