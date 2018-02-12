package fr.icam.tests;

import java.util.Random;

import org.junit.Test;

public class AlgoI5 {

	/** L'objectif de ces tests est d'introduire les concepts :
	 * 
	 *  1. de tableaux d'entiers
	 *  2. de boucles for et while
	 */

	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */

	void sequence(int[] t, int n, String sep) {
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				System.out.print(sep);	
			}
			System.out.print(t[i]);
		}
		System.out.println();
	}
	
	@Test
	public void test01() {
		int n = 10;
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = i;
		}
		sequence(t, n, ", ");
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test02() {
		int n = 10;
		int[] t = new int[n];
		int s = 0;
		for (int i = 0; i < n; i++) {
			s += i;
			t[i] = s;
		}
		sequence(t, n, ", ");
	}

	/** Exécutez l'algorithme test03 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test03() {
		int n = 10;
		int[] t = new int[n];
		random(t, n, 10);
		polynom(t, n);
	}

	void random(int[] t, int n, int b) {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			t[i] = random.nextInt(b);
		}
	}
	
	void polynom(int[] t, int n) {
		boolean plus = false;
		for (int i = n - 1; i >= 0; i--) {
			if (t[i] > 0) {
				if (plus) {
					System.out.print(" + ");
				}
				if (i > 1) {
					System.out.print(t[i] + "x^" + i);					
				} else if (i > 0) {
					System.out.print(t[i] + "x");
				} else {
					System.out.print(t[i]);
				}
				plus = true;
			}
		}
		System.out.println();
	}

	/** Exécutez l'algorithme test04 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test04() {
		int n = 10;
		int[][] t = new int[n][n];
		for (int i = 0; i < n; i++) {
			random(t[i], n, 10);
		}
		for (int i = 0; i < n; i++) {
			sequence(t[i], n, "\t");
		}
	}
	
}