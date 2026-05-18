package ornek11;

public class Calistir {
	public static void main(String[] args) {
		CustomLinkedList<String> customLinkedList = new CustomLinkedList<String>();
		customLinkedList.addFirst("Ali");
		customLinkedList.addFirst("Zeynep");
		customLinkedList.addFirst("Fırat");
		customLinkedList.addLast("Kamile");
		customLinkedList.addLast("Murteza");
		System.out.println(customLinkedList.get(0)); // Fırat
		System.out.println(customLinkedList.get(3)); // Kamile

	}
}
