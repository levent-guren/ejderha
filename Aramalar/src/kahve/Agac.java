package kahve;

import lombok.Data;

@Data
public class Agac {
	@Data
	private static class Node {
		private Node leftNode;
		private Node rightNode;
		private Kahve kahve;
	}

	private Node root;

	public void addKahve(Kahve kahve) {
		Node locNode = findNode(root, kahve);
		Node node = new Node();
		node.setKahve(kahve);

		if (locNode == null) {
			root = node;
		} else {
			if (kahve.compareTo(locNode.getKahve()) < 0) {
				locNode.setLeftNode(node);
			} else if (kahve.compareTo(locNode.getKahve()) > 0) {
				locNode.setRightNode(node);
			} else {
				// eşitlik durumu
				locNode.setKahve(kahve);
			}
		}
	}

	private Node findNode(Node node, Kahve kahve) {
		if (node == null) {
			return null;
		}
		if (kahve.compareTo(node.getKahve()) < 0) {
			// sol tarafına eklenecek.
			if (node.getLeftNode() == null) {
				return node;
			} else {
				return findNode(node.getLeftNode(), kahve);
			}
		} else if (kahve.compareTo(node.getKahve()) > 0) {
			// sag tarafına eklenecek.
			if (node.getRightNode() == null) {
				return node;
			} else {
				return findNode(node.getRightNode(), kahve);
			}
		}
		return node;
	}

	public boolean search(Kahve kahve) {
		Node node = findNode(root, kahve);
		if (node == null) {
			return false;
		}
		if (node.getKahve().compareTo(kahve) == 0) {
			return true;
		}
		return false;

	}
}
