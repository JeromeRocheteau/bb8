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
	 *  2. <code>while ( ... ) { ... }</code> : que signifie cette instruction ?
	 *  3. <code>i < 5</code> : que signifie cette expression ?
	 *  4. <code>i++</code> : que signifie cette expression/instruction ?
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
	 *  2. l'aglorithm test02 est-il équivalent à l'algorithme test01 ?
	 *  3. <code>for ( ... ) { ... }</code> : que signifie cette instruction ?
	 *  4. <code>int i = 0; i < 5; i++</code> : que signifie ces instructions/expressions ?
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
	 *  2. l'aglorithm test03 est-il équivalent aux algorithmes test01 et test02 ?
	 *  3. quelle différence d'utilisation y a-t-il entre les instructions 
	 *      <code>while (...) { ... }</code> et <code>do { ... } while (...)</code> ? 
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
	 *  2. l'aglorithm test04 est-il équivalent aux algorithmes test01, test02 et test03 ?
	 *  3. <code>void recursive(int i)</code> : à quoi correspond cette procédure ?
	 *  4. pourquoi s'agit-il d'une procédure dite récursive ? 
	 */
	
	void recursive(int i) {
		if (i < 5) {
			System.out.println((i + 1) + "-th iteration");
			recursive(i + 1);
		}
	}
	
	@Test
	public void test04() {
		int i = 0;
		recursive(i);
	}

	/** Complétez l'algorithme test05 afin qu'il calcule 
	 *  la somme des 10 premiers nombres entiers naturels. 
	 */
	@Test
	public void test05() {
		
	}
	
}