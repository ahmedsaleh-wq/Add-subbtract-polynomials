import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int coeff;
		int exp;
		int n;

		PolyList PolyList_1 = new PolyList();

		System.out.println("Enter the largest exponent for Polynomial 1: ");
		n = in.nextInt();
		exp = n;
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter coefficient of exponent x^" + exp);
			coeff = in.nextInt();
			PolyList_1.addNode(coeff, exp);
			exp--;
		}

		System.out.println("==============================================");

		PolyList PolyList_2 = new PolyList();

		System.out.println("Enter the largest exponent for Polynomial 2: ");
		n = in.nextInt();
		exp = n;
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter coefficient of exponent x^" + exp);
			coeff = in.nextInt();
			PolyList_2.addNode(coeff, exp);
			exp--;
		}

		boolean exit = false;
		while (!exit) {
			System.out.println("==============================================");
			System.out.println("Choose action: " + "\n 1) Add Polynomials" + "\n 2) Subtract Polynomials"
					+ "\n 3) Print Polynomials" + "\n 4) Print Polynomials degree" + "\n 5) Remove nodes with coeff 0"
					+ "\n 6) Print spacific node using the exponent in poly 1"
					+ "\n 7) Print spacific node using the exponent in poly 2" + "\n 8) EXit");

			int op = in.nextInt();
			switch (op) {

			case 1:
				PolyOps addOps = new PolyOps();
				System.out.println(addOps.addPolys(PolyList_1, PolyList_2).toString());
				break;
			case 2:
				PolyOps subOps = new PolyOps();
				System.out.println(subOps.subtractPolys(PolyList_1, PolyList_2).toString());
				break;
			case 3:
				System.out.println("polynomial 1: " + PolyList_1.toString());
				System.out.println("polynomial 2: " + PolyList_2.toString());
				break;

			case 4:
				System.out.println("polynomial 1 degree: " + PolyList_1.getDegree());
				System.out.println("polynomial 2 degree: " + PolyList_2.getDegree());
				break;
			case 5:
				PolyList_1.Reduce();
				PolyList_2.Reduce();
				System.out.println("polynomial 1 after removing 0 coeff: " + PolyList_1.toString());
				System.out.println("polynomial 2 after removing 0 coeff: " + PolyList_2.toString());
				break;
			case 6:
				System.out.println("Enter exponent: ");
				System.out.println(PolyList_1.getNode(in.nextInt()).toString());
				break;
			case 7:
				System.out.println("Enter exponent: ");
				System.out.println(PolyList_2.getNode(in.nextInt()).toString());
				break;
			case 8:
				exit = true;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}

		}

	}

}
