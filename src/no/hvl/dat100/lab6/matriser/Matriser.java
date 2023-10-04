package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {

		int[][] tab = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] tab2 = { { 2, 2, 3 }, // oppg d)
				{ 4, 5, 6 }, { 7, 8, 9 } };

		// oppg c) int tall = 2;

		// skrivUt(tab);

		// oppg b) String tall = tilStreng(tab);

		// oppg b) System.out.print(tall);

		// oppg c) skrivUt(skaler(tall, tab));

		System.out.print(erLik(tab, tab2)); // oppg d)

	}

	
	// a)
	public static void skrivUt(int[][] matrise) {

		for (int r = 0; r < matrise.length; r++) {

			for (int k = 0; k < matrise[0].length; k++) {
				System.out.print(matrise[r][k] + " ");

			}
			System.out.println("\n");
		}
	}

	
	// b)
	public static String tilStreng(int[][] matrise) {

		String tab = "";

		for (int a = 0; a < matrise.length; a++) {

			for (int k = 0; k < matrise[a].length; k++) {

				tab += Integer.toString(matrise[a][k]);

				if (k < matrise[a].length - 1) {

					tab += " ";
				}

			}
			tab += "\n";
		}

		return tab;

	}

	
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {

			for (int k = 0; k < matrise[i].length; k++) {

				matrise[i][k] *= tall;
			}
		}
		return matrise;

	}

	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
