
public class PolyOps {

	public PolyList addPolys(PolyList poly1, PolyList poly2) throws IllegalArgumentException {
		PolyNode node_1 = poly1.head;
		PolyNode node_2 = poly2.head;
		PolyNode resultNode = new PolyNode();
		PolyList finalPolyList = new PolyList();

		while (node_1 != null && node_2 != null) {

			if (node_1.exp == node_2.exp) {
				resultNode.coeff = node_1.coeff + node_2.coeff;
				resultNode.exp = node_1.exp;
				node_1 = node_1.next;
				node_2 = node_2.next;
				finalPolyList.addNode(resultNode.coeff, resultNode.exp);
			} else if (node_1.exp > node_2.exp) {
				resultNode.coeff = node_1.coeff;
				resultNode.exp = node_1.exp;
				node_1 = node_1.next;
				finalPolyList.addNode(resultNode.coeff, resultNode.exp);
			}

			else {
				resultNode.coeff = node_2.coeff;
				resultNode.exp = node_2.exp;
				finalPolyList.addNode(resultNode.coeff, resultNode.exp);
			}

		}
		return finalPolyList;
	}

	public PolyList subtractPolys(PolyList poly1, PolyList poly2) throws IllegalArgumentException {
		PolyNode node_1 = poly1.head;
		PolyNode node_2 = poly2.head;
		PolyNode resultNode = new PolyNode();
		PolyList finalPolyList = new PolyList();

		while (node_1 != null && node_2 != null) {

			if (node_1.exp == node_2.exp) {
				resultNode.coeff = node_1.coeff - node_2.coeff;
				resultNode.exp = node_1.exp;
				node_1 = node_1.next;
				node_2 = node_2.next;
				finalPolyList.addNode(resultNode.coeff, resultNode.exp);
			} else if (node_1.exp > node_2.exp) {
				resultNode.coeff = node_1.coeff;
				resultNode.exp = node_1.exp;
				node_1 = node_1.next;
				finalPolyList.addNode(resultNode.coeff, resultNode.exp);
			}

			else {
				resultNode.coeff = node_2.coeff;
				resultNode.exp = node_2.exp;
				finalPolyList.addNode(resultNode.coeff, resultNode.exp);
			}

		}
		return finalPolyList;
	}
}
