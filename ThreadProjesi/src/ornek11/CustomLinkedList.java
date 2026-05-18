package ornek11;

public class CustomLinkedList<T> {
	private Node<T> first;
	private Node<T> last;
	private int size;

	public void addFirst(T value) {
		Node<T> node = new Node<T>(value);
		if (first == null) {
			first = node;
		} else {
			node.setNext(first);
			first = node;
		}
		if (last == null) {
			last = first;
		}
		size++;
	}

	public void addLast(T value) {
		Node<T> node = new Node<T>(value);
		if (last == null) {
			last = node;
		} else {
			node.setPrevious(last);
			last = node;
		}
		if (first == null) {
			first = last;
		}
		size++;
	}

	public T get(int index) {
		Node<T> node;
		if (index < (size / 2)) {
			node = first;
			for (int i = 1; i < index; i++) {
				node = node.getNext();
			}
		} else {
			// istenen index ikinci yarıda. Arama sondan geriye doğru yapılacak.
			node = last;
			for (int i = size - 1; i > index; i--) {
				node = node.getPrevious();
			}
		}
		if (node == null || index < 0) {
			// index limitler dışında
			throw new ArrayIndexOutOfBoundsException();
		}
		return node.getValue();
	}
}
