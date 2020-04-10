package Begginer;

public class loops {

	public static void main(String[] args) {

		// post increment;takes value than adds
		int a = 1; // 2
		int b = a++; // 1
		System.out.println(a);
		System.out.println(b);

		// pre increment adds than takes value
		int c = 1; // 2
		int d = ++c; // 2
		System.out.println(c);
		System.out.println(d);

		// post decreament;takes vLUE FIRST than subtrCTS
		int e = 1; // 0
		int f = e--; // 1
		System.out.println(e);
		System.out.println(f);

		// PRE decrement; subtracts than takes the value
		int g = 1; // 0
		int h = --g; // 0
		System.out.println(g);
		System.out.println(h);

		System.out.println("practice ends here===========+======+==+=======");

		// while loops;
		int m = 0; // declare variable
		while (m < 10) {
			m++;
			System.out.println("mohammad" + (m++));
		}

		System.out.println("-----------------------for loop below");

		for (int j = 0; j < 10; j++) {
			if (a > b && b < a) {
				System.out.println("Happy" + (j + 1));
			} else if (c < a && c > a) {
				System.out.println("money");
			} else if (b < c && c > a) {
				System.out.println("paper money");
			} else {
				System.out.println("Dat right");
				j++;
			}

		}
		System.out.println("=====================morning practice");
		// morning practice;;;;;;;;;;===============
		// post incriment;takes value than adds
		int q = 10;
		int j = q++;
		System.out.println(q);
		System.out.println(j);

		// pre increment;adds than takes value
		int v = 9;
		int z = ++v;
		System.out.println(v);
		System.out.println(z);

		// post decrement;takes value than subtracts
		int n = 9;
		int x = n--;
		System.out.println(n);
		System.out.println(x);

		// pre decrement ;subtracts than takes the value;

		int l = 10;
		int u = --l;
		System.out.println(l);
		System.out.println(u);

		int n1 = 0;
		while (n1 < 10) {
			n1++;
		}
		if (l < u) {
			System.out.println("facts");
		} else if (n > x) {
			System.out.println("wrong");
		} else if (u > l) {
			System.out.println("mayb");
		} else if (l > x) {
			System.out.println("lost");
		} else {
			System.out.println("was lost");
		}

	}

}
