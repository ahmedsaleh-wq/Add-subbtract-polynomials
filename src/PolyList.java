
public class PolyList {
	PolyNode head, tail;

	public void addNode(int coeff, int exp) {
		PolyNode node = new PolyNode();
		node.coeff = coeff;
		node.exp = exp;

		if (head == null) {
			head = tail = node;
			head.prev = null;
			tail.next = null;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
			tail.next = null;
		}
	}

	public void Reduce() {
		int value = 0;
		boolean find = false;

		PolyNode node = head;

		if (head == null) {
			System.out.println("LinkedList is empty!!");
			return;
		}
		while (node != null) {
			if (node.coeff == value) {
				find = true;
				break;
			}
			node = node.next;
		}
		if (find) {
			if (head == node) {
				head = node.next;
			}

			if (node.next != null) {
				node.next.prev = node.prev;
			}

			if (node.prev != null) {
				node.prev.next = node.next;
			}

			node = null;
		}
	}

	public int getDegree() {
		if (head == null || head.exp == -1) {
			return -1;
		}
		return head.exp;

	}

	public PolyNode getNode(int exp) {
		PolyNode Node = head;

		if (Node == null) {
			return null;
		}

		while (Node != null) {
			if (Node.exp == exp) {
				return Node;
			} else {
				Node = Node.next;
			}
		}
		return null;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("");
		PolyNode Node = head;

		while (Node != null) {
			stringBuilder.append(Node.coeff + "x^" + Node.exp);
			if (Node.next != null) {
				Node = Node.next;
				stringBuilder.append(" + ");
			} else
				break;
		}
		return stringBuilder.toString();
	}

}
