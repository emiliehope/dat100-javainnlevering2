package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int[] tab = { 1, 2, 6, 5};
		int[] tab1 = { 3, 4, 7, 9}; 

		int x = 1;

		// System.out.print(tab);

		// String tall = tilStreng(tab);

		System.out.print(tilStreng(tab));

		//System.out.println();

		//System.out.println(summer(tab));

		/* System.out.println(finnesTall(tab, x)); 
		
		System.out.println(posisjonTall(tab, x)); 
		
		
		for (int i: reverser(tab)) {
			System.out.print(i+ ", "); 
		} 
		
		System.out.print(erSortert(tab)); */
		
		/* for (int i: settSammen(tab, tab1)) {
			 System.out.print(i + " "); 
		} */

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

		for (int i = 0; i < tabell.length; i++) {
			tab += tabell[i]; 
			
			if (i < tabell.length -1) {
				tab += ","; 
			}
		
		}
		tab += "]"; 
		return tab;  

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

		
		 int sum = 0;
		 
		 for (int i : tabell) { //her er i både plassen og elementet i tabellen
		 sum+=i;
		 
		 } return sum;
	}

		/* int sum = 0;
		int i = 0;

		while (i < tabell.length) {
			sum += tabell[i];
			i++;

		}
		return sum; 
	} */

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
		
		int[] reversertabell = new int [tabell.length]; 
				
		for (int i = 0; i < tabell.length; i++) {
		
			reversertabell[i] = tabell[tabell.length -1 -i]; 
			
		}
	return reversertabell; 

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		
		for (int i = 0; i < tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) 
				return false; 
		}
		return true; 
	} 

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nytab = new int [tabell1.length + tabell2.length]; 
		for (int i = 0; i < tabell1.length; i++) {
			nytab[i] = tabell1[i]; 
		}
		int n = 0; 
		
		for (int i = tabell1.length; i < nytab.length; i++) {
			nytab[i] = tabell2[n]; 
			n += 1; 
		}
		return nytab; 
	}
}
