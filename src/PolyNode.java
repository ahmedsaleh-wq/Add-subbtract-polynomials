
public class PolyNode {
	int coeff;
	int exp;
	PolyNode next;
	PolyNode prev;

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("");
		stringBuilder.append(coeff + "x^" + exp);
		return stringBuilder.toString();
	}
}
