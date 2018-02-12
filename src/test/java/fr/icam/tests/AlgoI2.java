package fr.icam.tests;

import org.junit.Test;

public class AlgoI2 {

	/** L'objectif de ces tests est d'introduire les concepts :
	 * 
	 *  1. d'entiers, d'expressions entières et d'opérations sur les entiers
	 *  2. d'affectation d'une valeur à une variable
	 *  3. de compositions d'instructions
	 */
	
	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test01() {
		int x = 0;
		System.out.println("x = " + x);
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	@Test
	public void test02() {
		int x = 0;
		System.out.println("x = " + x);
		x = 5;
		System.out.println("x = " + x);
	}
	
	/** Exécutez l'algorithme test03 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	
	int x = 10;
	
	@Test
	public void test03() {
		System.out.println("x = " + x);
		x = 5;
		System.out.println("x = " + x);
	}
	
	/** Exécutez l'algorithme test04 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	
	int y;
	
	@Test
	public void test04() {
		System.out.println("y = " + y);
		y = 5;
		System.out.println("y = " + y);
	}
	
	/** Exécutez l'algorithme test05 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */	
	@Test
	public void test05() {
		int x = 10;
		int y = 5;
		int z = x + y;
		System.out.println("x = " + x + ", y = " + y + ", x + y = " + z);
	}
	
	/** Exécutez l'algorithme test06 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */	
	@Test
	public void test06() {
		int x = 10;
		int y = 5;
		int z = x - y;
		System.out.println("x = " + x + ", y = " + y + ", x - y = " + z);
	}
	
	/** Exécutez l'algorithme test07 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */	
	@Test
	public void test07() {
		int x = 10;
		int y = 5;
		int z = x * y;
		System.out.println("x = " + x + ", y = " + y + ", x * y = " + z);
	}
	
	/** Exécutez l'algorithme test07 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */	
	@Test
	public void test08() {
		int x = 10;
		int y = 5;
		int z = x / y;
		System.out.println("x = " + x + ", y = " + y + ", x / y = " + z);
	}
	
	/** Exécutez l'algorithme test07 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */	
	@Test
	public void test09() {
		int x = 10;
		int y = 5;
		int z = x % y;
		System.out.println("x = " + x + ", y = " + y + ", x % y = " + z);
	}
		
}