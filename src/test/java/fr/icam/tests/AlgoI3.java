package fr.icam.tests;

import org.junit.Test;

public class AlgoI3 {

	/** L'objectif de ces tests est d'introduire :
	 * 
	 *  1. les opérateurs de comparaison sur les entiers
	 *  2. les expressions et de valeurs booléennes
	 *  3. les instructions conditionnelles
	 */
	
	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond la fonction <code>int abs (int x) { ... }</code> ?
	 *  3. À quoi correspond l'instruction <code>if ( ... ) { ... } else { ... }</code> ?
	 *  4. À quoi correspond l'instruction <code>return x;</code> ?
	 *  5. À quoi correspond l'expression <code>x < 0</code> ?
	 *  6. Quelle est la valeur de l'expression <code>x < 0</code> ?
	 */
	
	int abs(int x) {
		if (x < 0) {
			return -x;
		} else {
			return x;
		}
	}
	
	@Test
	public void test01() {
		System.out.println("abs(0) = " + abs(0));
		System.out.println("abs(1) = " + abs(1));
		System.out.println("abs(-1) = " + abs(-1));
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'expression <code>x == y<code> ?
	 *  3. À quoi correspond l'expression <code>x != y<code> ?
	 *  4. À quoi correspond l'expression <code>x < y<code> ?
	 *  5. À quoi correspond l'expression <code>x <= y<code> ?
	 *  6. À quoi correspond l'expression <code>x > y<code> ?
	 *  7. À quoi correspond l'expression <code>x >= y<code> ?
	 */
	@Test
	public void test02() {
		int x = 10;
		int y = 5;
		System.out.println("x = " + x + ", y = " + y + ", x == y -> " + (x == y));
		System.out.println("x = " + x + ", y = " + y + ", x != y -> " + (x != y));
		System.out.println("x = " + x + ", y = " + y + ", x < y -> " + (x < y));
		System.out.println("x = " + x + ", y = " + y + ", x <= y -> " + (x <= y));
		System.out.println("x = " + x + ", y = " + y + ", x > y -> " + (x > y));
		System.out.println("x = " + x + ", y = " + y + ", x >= y -> " + (x >= y));
	}
	
	/** Exécutez l'algorithme test03 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>if ( ... ) { ... }</code> ?
	 *  3. Sue se passe-t-il si la condition <code>x == 0</code> est fausse ?
	 *  4. Quelle bonne pratique pouvez-vous en déduire quant à l'utilisation des instructions <code>if ( ... ) { ... }</code> ?
	 */
	@Test
	public void test03() {
		int x = 0;
		if (x == 0) {
			System.out.println("x is equal to 0");
		}
	}
	
	/** Exécutez l'algorithme test04 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>if ( ... ) { ... } else { ... }</code> ?
	 */
	@Test
	public void test04() {
		int x = 0;
		if (x == 0) {
			System.out.println("x is equal to 0");
		} else {
			System.out.println("x is greater than 0 or lower than 0");
		}
	}
	
	/** Exécutez l'algorithme test05 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'instruction <code>if ( ... ) { ... } else if ( ... ) { ... } else { ... }</code> ?
	 *  3. Par quelle instruction équivalente pourrait-on la remplacer ? 
	 */
	@Test
	public void test05() {
		int x = 0;
		if (x == 0) {
			System.out.println("x is equal to 0");
		} else if (x > 0) {
			System.out.println("x is greater than 0");
		} else {
			System.out.println("x is lower than 0");
		}
	}
	
	/** Exécutez l'algorithme test06 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond la fonction <code>boolean zero(int x) { ... }</code> ?
	 *  3. À quoi correspond la fonction <code>boolean sign(int x) { ... }</code> ?
	 */
	
	boolean zero(int x) {
		if (x == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean sign(int x) {
		if (x > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Test
	public void test06() {
		int x = 0;
		if (zero(x)) {
			System.out.println("x is equal to 0");
		} else if (sign(x)) {
			System.out.println("x is greater than 0");
		} else {
			System.out.println("x is lower than 0");
		}
	}
	
	/** Exécutez l'algorithme test07 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. L'algorithme test07 est-il équivalent à l'algorithme test06 ? justifiez !
	 */	
	@Test
	public void test07() {
		int x = 0;
		if (zero(x)) {
			System.out.println("x is equal to 0");
		} else {
			if (sign(x)) {
				System.out.println("x is greater than 0");
			} else {
				System.out.println("x is lower than 0");
			}
		}
	}
	
	/** Exécutez l'algorithme test08 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. L'algorithme test08 est-il équivalent aux algorithmes test06 et test07 ? justifiez !
	 */	
	@Test
	public void test08() {
		int x = 0;
		if (zero(x)) {
			System.out.println("x is equal to 0");
		} else {
			if (sign(x)) {
				System.out.println("x is greater than 0");
			}
			if (!sign(x)) {
				System.out.println("x is lower than 0");
			}
		}
	}
	
	/** Exécutez l'algorithme test09 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'expression <code>zero(x) || sign(x)</code> ?
	 *  3. Par quelles instructions équivalentes pourrait-on remplacer 
	 *     l'instruction <code>if (zero(x) || sign(x)) { ... } else { ... }</code> ? 
	 */	
	@Test
	public void test09() {
		int x = 0;
		if (zero(x) || sign(x)) {
			System.out.println("x is greater than or equal to 0");
		} else {
			System.out.println("x is lower than or equal to 0");
		}
	}
	
	/** Exécutez l'algorithme test10 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond l'expression <code>even(x) && even(y)</code> ?
	 *  3. Par quelles instructions équivalentes pourrait-on remplacer 
	 *     l'instruction <code>if (even(x) && even(y)) { ... } else { ... }</code> ?
	 */	
	
	boolean even(int x) {
		return (x % 2) == 0;
	}
	
	boolean odd(int x) {
		return !even(x);
	}
	
	@Test
	public void test10() {
		int x = 0;
		int y = 0;
		if (even(x) && even(y)) {
			System.out.println("both numbers are even");
		} else if (odd(x) && odd(y)) {
			System.out.println("both numbers are odd");
		} else {
			System.out.println("one number is even, the other is odd");
		}
	}
	
	/** Corrigez la fonction auxliaire <code>max</code>
	 *  afin qu'elle renvoie le plus grand nombre entre 
	 *  ses deux paramètres entiers. 
	 */	
	
	int max(int x, int y) {
		return 0;
	}
	
	@Test
	public void test11() {
		int x = 0;
		int y = 0;
		System.out.println("the maximum between " + x + " and " + y + " is " + max(x,y));
	}
	
	/** Corrigez la fonction auxliaire <code>max</code>
	 *  afin qu'elle renvoie le plus grand nombre entre 
	 *  ses trois paramètres entiers. 
	 */	
	
	int max(int x, int y, int z) {
		return 0;
	}
	
	@Test
	public void test12() {
		int x = 0;
		int y = 0;
		int z = 0;
		System.out.println("the maximum between " + x + ", " + y + " and " + z + " is " + max(x,y,z));
	}
	
}