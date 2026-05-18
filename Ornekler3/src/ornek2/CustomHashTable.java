package ornek2;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class CustomHashTable<K, V> {
	@Getter
	@Setter
	@AllArgsConstructor
	private static class Node<K, V> {
		private K key;
		private V value;

		@Override
		public int hashCode() {
			return Objects.hash(key, value);
		}

		@Override
		public boolean equals(Object node) {
			if (node == this) {
				return true;
			}
			if (!(node instanceof Node<?, ?> n)) {
				return false;
			}
			return Objects.equals(key, n.key) && Objects.equals(value, n.value);
		}
	}

	private List<Node<K, V>>[] buckets;

	public CustomHashTable() {
		bucketsInit();
	}

	@SuppressWarnings("unchecked")
	private void bucketsInit() {
		buckets = new List[2];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<Node<K, V>>();
		}
	}

	public void put(K key, V value) {
		int bucketNo = getBucketNumber(key);
		System.out.println(bucketNo + " nolu bucket'a " + value + " ekleniyor.");
		addValueToBucket(buckets[bucketNo], key, value);
	}

	public V get(K key) {
		int bucketNo = getBucketNumber(key);
		for (Node<K, V> n : buckets[bucketNo]) {
			if (n.getKey().equals(key)) {
				return n.getValue();
			}
		}
		return null;
	}

	private int getBucketNumber(K key) {
		int bucketNo = Math.floorMod(key.hashCode(), buckets.length);
		return bucketNo;
	}

	private void addValueToBucket(List<Node<K, V>> linkedList, K key, V value) {
		Node<K, V> node = new Node<K, V>(key, value);
		if (!linkedList.contains(node)) {
			linkedList.add(node);
		}
	}
}
