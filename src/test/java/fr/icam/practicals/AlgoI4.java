package fr.icam.practicals;

import org.junit.Test;

public class AlgoI4 {

	/** L'objectif de ces tests est d'introduire :
	 * 
	 *  1. les boucles <code>for</code> et <code>while</code>
	 *  2. les fonctions ou procédures récursives
	 */

	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspondent l'instruction <code>while ( ... ) { ... }</code> ?
	 *  3. À quoi correspondent l'expression <code>i < 5</code> ?
	 *  4. À quoi correspond l'instruction <code>i++</code> ?
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
	 *  2. L'aglorithme test02 est-il équivalent à l'algorithme test01 ?
	 *  3. À quoi correspondent l'instruction <code>for ( ... ) { ... }</code> ?
	 *  4. À quoi correspondent les instructions <code>int i = 0; i < 5; i++</code> ?
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
	 *  2. L'aglorithme test03 est-il équivalent aux algorithmes test01 et test02 ?
	 *  3. Quelle est la différence d'utilisation entre les instructions suivantes ?
	 *     3.1. <code>while (...) { ... }</code> 
	 *     3.2. <code>do { ... } while (...)</code>
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
	 *  2. L'aglorithme test04 est-il équivalent aux algorithmes test01, test02 et test03 ?
	 *  3. À quoi correspond cette procédure <code>void recursive(int i)</code> ?
	 *  4. Pourquoi s'agit-il d'une procédure dite récursive ? 
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