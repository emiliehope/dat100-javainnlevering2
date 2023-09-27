package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int[] tab = { 1, 2, 3, 6 };

		int x = 1;

		/* System.out.print(tab);

		String tall = tilStreng(tab);

		System.out.print(tall);

		System.out.println();

		System.out.println(summer(tab));

		System.out.println(finnesTall(tab, x)); */
		
		System.out.println(posisjonTall(tab, x)); 

	}

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {

			System.out.println(tabell[i]);

		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tab = "[";

		for (int a : tabell) {
			tab += a + ",";
		}

		return tab + "]";

	}

	// c)
	public static int summer(int[] tabell) {

		/*
		 * int sum = 0;
		 * 
		 * for (int i = 0; i < tabell.length; i++) {
		 * 
		 * sum +=tabell[i];
		 * 
		 * 
		 * } return sum;
		 */

		/*
		 * int sum = 0;
		 * 
		 * for (int i : tabell) { //her er i både plassen og elementet i tabellen sum
		 * +=i;
		 * 
		 * } return sum;
		 */

		int sum = 0;
		int i = 0;

		while (i < tabell.length) {
			sum += tabell[i];
			i++;

		}
		return sum;
	}

	// d)

	public static boolean finnesTall(int[] tabell, int tall) {

		// boolean sann = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				// sann = true;
				return true;
			}

		}
		return false;
		// return sann;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int a = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return a;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");
	}
}
