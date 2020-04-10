package Begginer;

public class D2Arrays {

	public static void main(String[] args) {
		String ahmad[][] = new String[3][4];
		ahmad[0][0] = "k1";
		ahmad[0][1] = "k1";
		ahmad[0][2] = "k1";
		ahmad[0][3] = "k1";

		ahmad[1][0] = "m1";
		ahmad[1][1] = "m1";
		ahmad[1][2] = "m1";
		ahmad[1][3] = "m1";

		ahmad[2][0] = "f1";
		ahmad[2][1] = "f1";
		ahmad[2][2] = "f1";
		ahmad[2][3] = "f1";

		for (int row = 0; row < ahmad.length; row++) {
			for (int cloum = 0; cloum < ahmad[0].length; cloum++) {
				System.out.println(ahmad[row][cloum]);
			}
		}
		System.out.println("=================morning practice done");
		// morning practice
		String[][] mohammad = new String[4][4];

		mohammad[0][0] = "m1";
		mohammad[0][1] = "m2";
		mohammad[0][2] = "m3";
		mohammad[0][3] = "m4";

		mohammad[1][0] = "d1";
		mohammad[1][1] = "d2";
		mohammad[1][2] = "d3";
		mohammad[1][3] = "d4";

		mohammad[2][0] = "g1";
		mohammad[2][1] = "g2";
		mohammad[2][2] = "g3";
		mohammad[2][3] = "g4";

		mohammad[3][0] = "g1";
		mohammad[3][1] = "g2";
		mohammad[3][2] = "g3";
		mohammad[3][3] = "g4";
		for (int row = 0; row < mohammad.length; row++) {
			for (int colum = 0; colum < mohammad[0].length; colum++) {
				System.out.println(mohammad[row][colum]);
			}

		}

	}

}
