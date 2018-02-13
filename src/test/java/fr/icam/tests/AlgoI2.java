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
	 *  2. <code>int x = 0;</code> : que signifie cette intruction ?
	 *  3. <code>int</code> : à quoi correspond ce type de données ?
	 *  4. <code>System.out.println("x = " + x);</code> : à quoi correspond cette instruction ?
	 *  5. <code>"x = " + x</code> : à quoi correspond cette expression ?
	 */
	@Test
	public void test01() {
		int x = 0;
		System.out.println("x = " + x);
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. <code>x = 5;</code> : que signifie cette intruction ?
	 *  3. quelle conclusion pouvez-vous en déduire quant à l'usage des variables ?
	 *  4. la variable <code>x</code> est-elle une variable locale ou une variable globale ?
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
	 *  2. <code>int x = 10;</code> : quelle est cette instruction ?
	 *  3. la variable <code>x</code> est-elle une variable locale ou une variable globale ?
	 *  4. est-ce la même variable <code>x</code> dans les algorithmes test02 et test03 ?
	 *  5. si oui, peut-on afficher la valeur de la variable <code>x</code> en tout d"but de l'algorithme test02 ? pourquoi ?
	 *  6. sinon quelle est la différence entre les deux variables <code>x</code> ? 
	 *  7. quelle conclusion pouvez-vous en déduire quant à la portée des variables locales ou globales ?
	 *  8. comment l'éditeur Eclipse représente la différence entre variables locales et variables globales ?     
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
	 *  2. la variable <code>y</code> est-elle une variable locale ou une variable globale ?
	 *  3. quelle conclusion pouvez-vous en déduire quant à la valeur initiale des variables globales ?
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
	 *  2. <code>int z = x + y</code> : que signifie cette instruction ?
	 *  3. <code>x + y</code> : que signifie cette expression ? ?
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
	 *  2. <code>int z = x - y</code> : que signifie cette instruction ?
	 *  3. <code>x - y</code> : que signifie cette expression ? ?
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
	 *  2. <code>int z = x * y</code> : que signifie cette instruction ?
	 *  3. <code>x * y</code> : que signifie cette expression ? ?
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
	 *  2. <code>int z = x / y</code> : que signifie cette instruction ?
	 *  3. <code>x / y</code> : que signifie cette expression ? ?
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
	 *  2. <code>int z = x % y</code> : que signifie cette instruction ?
	 *  3. <code>x % y</code> : que signifie cette expression ? ?
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