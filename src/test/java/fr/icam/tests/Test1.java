package fr.icam.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {

	int[] array1 = new int[]  {1, 2, 7, 3, 5, 4};
	
	int[] array2 = new int[] {1, 5, 7, 3, 2, 4};
	
	int[] array3 = new int[] {1, 2, 7, 3, 5, 4, 9, 0, 8, 6, 3};
	
	int[] array4 = new int[] {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
	
	int[] array5 = new int[] {-2, 3, 2, 0, 1};
	
	/** Définissez l'algorithme swap afin qu'il échange les valeurs du tableau array aux indices i et j. 
	 *  Autrement dit, si array[i] = a et array[j] = b avant l'appel à la procédure swap 
	 *  alors, on a array[i] = b et array[j] = a après l'appel à la procédure swap. 
	 *  En revanche, pour autre indice différent de i et de j, les valeurs du tableau demeurent inchangées.
	 */

	void swap(int[] t, int i, int j) {
		
	}
	
	@Test
	public void test01() {
		int[] array = new int[] {1, 5, 7, 3, 2, 5};
		assertArrayEquals(array1, array);
		swap(array, 1, 4);
		assertArrayEquals(array2, array);
	}
	
	/** Corrigez les algorithmes min et max afin qu'ils renvoient, 
	 *  d'une part, l'indice du plus petit entier dans le tableau et, 
	 *  d'autre part, l'indice du plus grand entier dans le tableau.
	 */

	int min(int[] t) {
		return -1;
	}
	
	int max(int[] t) {
		return -1;
	}
	
	
	@Test
	public void test02() {
		assertEquals(7, min(array3));
		assertEquals(6, max(array3));
	}
	
	/** Corrigez les algorithmes find, first, last et findAll afin qu'ils renvoient respectivement  
	 *  premièrement, l'indice d'un élément dans le tableau t qui est égal à l'entier v, 
	 *  deuxièmement, l'indice du premier élément dans le tableau t qui est égal à l'entier v,
	 *  troisèmement, l'indice du dernier élément dans le tableau t qui est égal à l'entier v,
	 *  finalement, tous les indices des éléments dans le tableau t qui est égal à l'entier v,.
	 */
	
	int find(int[] t, int v) {
		return -1;
	}
	
	int first(int[] t, int v) {
		return -1;
	}
	
	int last(int[] t, int v) {
		return -1;
	}
	
	int[] finadAll(int[] t, int v) {
		return null;
	}
	
	
	@Test
	public void test03() {
		assertEquals(5, find(array3, 4));
		assertEquals(3, first(array3, 3));
		assertEquals(10, last(array3, 3));
	}
	
	/** Corrigez l'algorithme sort afin qu'il trie un tableau d'entiers 
	 *  dans l'ordre croissant de ses valeurs. 
	 */
	
	void sort(int[] t) {
		
	}
	
	@Test
	public void test04() {
		int[] array = new int[] {1, 2, 7, 3, 5, 4, 9, 0, 8, 6, 3};
		assertArrayEquals(array3, array);
		sort(array);
		assertArrayEquals(array4, array);
	}
	
	/** Corrigez l'algorithme value afin qu'il renvoie la valeur d'un polyôme, 
	 *  représenté par tableau d'entiers, en fonction de la valeur de x. 
	 *  Par exemple, le tableau t = {-2, 3, 2, 0, 1} correspond 
	 *  au polynôme p(x) = x^4 + 2x^2 + 3x - 2
	 */
	
	int value(int[] t, int x) {
		return 0;
	}
	
	@Test
	public void test05() {
		assertEquals(-2, value(array5, 0));
		assertEquals(4, value(array5, 1));
		assertEquals(28, value(array5, 2));
		assertEquals(106, value(array5, 3));
	}
		
}