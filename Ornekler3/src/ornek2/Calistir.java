package ornek2;

public class Calistir {
	public static void main(String[] args) {
		CustomHashTable<String, Integer> liste = new CustomHashTable<>();
		liste.put("A", 5);
		liste.put("C", 2);
		liste.put("B", 4);
		liste.put("E", 4);
		liste.put("D", 1);
		liste.put("D", 18);
		liste.put("A", 28);
		System.out.println(liste.get("A"));
		System.out.println(liste.get("B"));
		System.out.println(liste.get("C"));
		System.out.println(liste.get("D"));
		System.out.println(liste.get("E"));
		System.out.println(liste.get("F"));
	}
}
