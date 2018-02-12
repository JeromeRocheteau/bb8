package fr.icam.tests;

import org.junit.Test;

public class AlgoI4 {

	/** L'objectif de ces tests est d'introduire les concepts :
	 * 
	 *  1. de boucles for et while
	 *  2. de fonctions ou procédures récursives
	 */

	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test01() {
		int i = 0;
		while (i < 5) {
			System.out.println((i + 1) + "-th iteration");
			i++;
		}
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test02() {
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "-th iteration");
		}
	}

	/** Exécutez l'algorithme test03 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test03() {
		int i = 0;
		do {
			System.out.println((i + 1) + "-th iteration");
			i++;			
		} while (i < 5);
	}
	
	/** Exécutez l'algorithme test04 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	
	void recursive(int i, int limit) {
		if (i < limit) {
			System.out.println((i + 1) + "-th iteration");
			recursive(i + 1, limit);
		}
	}
	
	@Test
	public void test04() {
		int i = 0;
		recursive(i, 5);
	}

	/** Complétez l'algorithme test05 afin qu'il calcule 
	 * la somme des 10 premiers nombres entiers naturels. 
	 */
	@Test
	public void test05() {
		
	}
	
}