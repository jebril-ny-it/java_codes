package Begginer;

public class D1arrays {

	public static void main(String[] args) {

		// arrays;to store similar data types values in a array variable
		// 1.int array;
		// lowest bound index=0
		// upper bound index =n-1(n is size of arrays)

		// dis advantages of arrays;
		// 1.size is fixed--static arrays--to over come this problem--we use
		// collections--arraylist,hasHTable--use dyamic array
		// 2.stores only similar data types--to over come this problem--we use object
		// array

		int q[] = new int[3];
		q[0] = 10;
		q[1] = 20;
		q[2] = 30;

		for (int row = 0; row < q.length; row++) {

			System.out.println(q[row]);
		}

		/////////

		double j[] = new double[3];
		j[0] = 10.00;
		j[1] = 20.00;
		j[2] = 30.00;

		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i]);
		}

		/////	

		String[] mohammadIsaJavaExpert = new String[3];

		mohammadIsaJavaExpert[0] = "mohammad";
		mohammadIsaJavaExpert[1] = "expert";
		mohammadIsaJavaExpert[2] = "120_000 job inshalah";

		for (int k = 0; k < mohammadIsaJavaExpert.length; k++) {

			System.out.println(mohammadIsaJavaExpert[k]);
		}

		System.out.println("=============morning practice done");
		// mormimg practive========
		// morning practice;;;;;;

		double m[] = new double[3];
		m[0] = 10.00;
		m[1] = 20.99;
		m[2] = 24.00;
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		int u[] = new int[3];
		u[0] = 12;
		u[1] = 10;
		u[2] = 32;
		for (int i = 0; i < u.length; i++) {
			System.out.println(u[i]);
		}

		String[] mohammad = new String[3];
		mohammad[0] = "money";
		mohammad[1] = "more money";
		mohammad[2] = "more more more money";
		for (int s = 0; s < mohammad.length; s++) {
			System.out.println(mohammad[s]);
		}

		// object array;used to store different data types values
		Object ob[] = new Object[7];
		ob[0] = "tommy";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[4] = "12/26/1990";
		ob[5] = "pali";
		ob[6] = 'm';
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}

		double[] me = new double[3];
		me[0] = 10.00;
		me[1] = 20.00;
		me[2] = 23.00;
		for (int row = 0; row < me.length; row++) {
			System.out.println(me[row]);
		}

	}

}
