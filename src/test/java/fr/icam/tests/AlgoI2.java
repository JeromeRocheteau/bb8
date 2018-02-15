package fr.icam.tests;

import org.junit.Test;

public class AlgoI2 {

	/** L'objectif de ces tests est d'introduire :
	 * 
	 *  1. les entiers (type de données, valeurs) 
	 *  2. les expressions entières 
	 *  3. les opérations sur les entiers
	 *  4. les affectations d'une valeur à une variable
	 *  5. les compositions d'instructions
	 */
	
	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>int x = 0;</code> ?
	 *  3. À quoi correspond le typde de données <code>int</code> ?
	 *  4. À quoi correspond l'instruction <code>System.out.println("x = " + x);</code> ?
	 *  5. À quoi correspond l'expression <code>"x = " + x</code> ?
	 */
	@Test
	public void test01() {
		int x = 0;
		System.out.println("x = " + x);
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>x = 5;</code> ?
	 *  3. Quelle conclusion pouvez-vous en déduire quant à l'usage des variables ?
	 *  4. La variable <code>x</code> est-elle une variable locale ou une variable globale ?
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
	 *  2. À quoi correspond l'instruction <code>int x = 10;</code> ?
	 *  3. La variable <code>x</code> est-elle une variable locale ou une variable globale ?
	 *  4. Est-ce la même variable <code>x</code> dans les algorithmes test02 et test03 ?
	 *     4.1. Si oui, peut-on afficher la valeur de la variable <code>x</code> avant sa déclaration dans l'algorithme test02 ? pourquoi ?
	 *     4.2. Sinon quelle est la différence entre les deux variables <code>x</code> ? 
	 *  5. Quelle conclusion pouvez-vous en déduire quant à la portée des variables locales ou globales ?
	 *  6. Comment l'éditeur Eclipse représente la différence entre variables locales et variables globales ?     
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
	 *  2. La variable <code>y</code> est-elle une variable locale ou une variable globale ?
	 *  3. Quelle conclusion pouvez-vous en déduire quant à la valeur initiale des variables globales ?
	 */
	
	int y;
	
	@Test
	public void test04() {
		System.out.println("y = " + y);
		y = 5;
		System.out.println("y = " + y);
	}
	
	/** Exécutez l'algorithme test05 :
	 *  (n'hésitez pas à modifier les valeurs de <code>x</code> et <code>y</code>)
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>int z = x + y</code> ?
	 *  3. À quoi correspond l'expression <code>x + y</code> ?
	 */	
	@Test
	public void test05() {
		int x = 10;
		int y = 5;
		int z = x + y;
		System.out.println("x = " + x + ", y = " + y + ", x + y = " + z);
	}
	
	/** Exécutez l'algorithme test06 :
	 *  (n'hésitez pas à modifier les valeurs de <code>x</code> et <code>y</code>)
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>int z = x - y</code> ?
	 *  3. À quoi correspond l'expression <code>x - y</code> ?
	 */	
	@Test
	public void test06() {
		int x = 10;
		int y = 5;
		int z = x - y;
		System.out.println("x = " + x + ", y = " + y + ", x - y = " + z);
	}
	
	/** Exécutez l'algorithme test07 :
	 *  (n'hésitez pas à modifier les valeurs de <code>x</code> et <code>y</code>)
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>int z = x * y</code> ?
	 *  3. À quoi correspond l'expression <code>x * y</code> ?
	 */	
	@Test
	public void test07() {
		int x = 10;
		int y = 5;
		int z = x * y;
		System.out.println("x = " + x + ", y = " + y + ", x * y = " + z);
	}
	
	/** Exécutez l'algorithme test08 :
	 *  (n'hésitez pas à modifier les valeurs de <code>x</code> et <code>y</code>)
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>int z = x / y</code> ?
	 *  3. À quoi correspond l'expression <code>x / y</code> ?
	 */	
	@Test
	public void test08() {
		int x = 10;
		int y = 5;
		int z = x / y;
		System.out.println("x = " + x + ", y = " + y + ", x / y = " + z);
	}
	
	/** Exécutez l'algorithme test09 :
	 *  (n'hésitez pas à modifier les valeurs de <code>x</code> et <code>y</code>)
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>int z = x % y</code> ?
	 *  3. À quoi correspond l'expression <code>x % y</code> ?
	 */	
	@Test
	public void test09() {
		int x = 10;
		int y = 5;
		int z = x % y;
		System.out.println("x = " + x + ", y = " + y + ", x % y = " + z);
	}
	
	/** Définissez l'algorithme test10 afin qu'il calcule et affiche la somme 
	 *  des trois variables <code>a</code>, <code>b</code> et <code>c</code>.
	 */
	
	int a = 5;
	
	int mid(int x, int y) {
		return (x + y) / 2; 
	}
	
	@Test
	public void test10() {
		int b = 10;
		int c = mid(a, b);
		// TODO
	}
		
}