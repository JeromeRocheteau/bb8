package fr.icam.tests;

import org.junit.Test;

public class AlgoI6 {

	/** L'objectif de ces tests est d'introduire les concepts de :
	 * 
	 *  1. structures de données
	 *  2. tableaux
	 */

	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */	
	
	class point {
		int x;
		int y;
	}
	
	point create() {
		point p = new point();
		return p;
	}
	
	point create(int x, int y) {
		point p = new point();
		p.x = x;
		p.y = y;
		return p;
	}
	
	@Test
	public void test01() {
		point a = create();
		point b = create(0,0);
		System.out.println("a = " + "(" + a.x + "," + a.y + ")");
		System.out.println("b = " + "(" + b.x + "," + b.y + ")");
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */	
	
	boolean eq(point a, point b) {
		return a.x == b.x && a.y == b.y;
	}
	
	boolean neq(point a, point b) {
		return !eq(a,b);
	}
	
	boolean lt(point a, point b) {
		if (a.x < b.x) {
			return true;
		} else if (a.x == b.x) {
			return a.y < b.y;
		} else {
			return false;
		}
	}
	
	boolean lte(point a, point b) {
		return lt(a,b) || eq(a, b);
	}
	
	boolean gt(point a, point b) {
		return lt(b,a);
	}
	
	boolean gte(point a, point b) {
		return lte(b,a);
	}
	
	String str(point p) {
		return "(" + p.x + "," + p.y + ")";
	}
	
	@Test
	public void test02() {
		point a = create(1,2);
		point b = create(2,1);
		point c = create(1,2);
		point d = a;
		test02str(a, b, c, d);
		test02eq(a, b, c, d);
		test02lt(a, b, c, d);
		test02lte(a, b, c, d);
	}

	private void test02str(point a, point b, point c, point d) {
		System.out.println("a = " + str(a));
		System.out.println("b = " + str(b));
		System.out.println("c = " + str(c));
		System.out.println("d = " + str(d));
	}

	private void test02eq(point a, point b, point c, point d) {
		System.out.println("a == b: " + eq(a,b));
		System.out.println("a == c: " + eq(a,c));
		System.out.println("a == d: " + eq(a,d));
		System.out.println("b == c: " + eq(b,c));
		System.out.println("b == d: " + eq(b,d));
		System.out.println("c == d: " + eq(c,d));
	}

	private void test02lt(point a, point b, point c, point d) {
		System.out.println(" a < b: " + lt(a,b));
		System.out.println(" a < c: " + lt(a,c));
		System.out.println(" a < d: " + lt(a,d));
		System.out.println(" b < c: " + lt(b,c));
		System.out.println(" b < d: " + lt(b,d));
		System.out.println(" c < d: " + lt(c,d));
	}

	private void test02lte(point a, point b, point c, point d) {
		System.out.println("a <= b: " + lte(a,b));
		System.out.println("a <= c: " + lte(a,c));
		System.out.println("a <= d: " + lte(a,d));
		System.out.println("b <= c: " + lte(b,c));
		System.out.println("b <= d: " + lte(b,d));
		System.out.println("c <= d: " + lte(c,d));
	}

	/** Complétez l'algorithme test03 afin qu'il affiche 
	 *  les segments de droite sous la forme (1,2) -- (2,1)
	 *  si le point a vaut (1,2) et le point b vaut (2,1).  
	 */	
	
	class segment {
		point a;
		point b;
	}
	
	@Test
	public void test03() {
		// TODO
	}
	
	/** Complétez l'algorithme test04 afin qu'il calcule  
	 *  si deux segments de droite sont égaux.
	 */	
	
	@Test
	public void test04() {
		// TODO
	}
	
	/** Complétez l'algorithme test05 afin qu'il affiche des polygônes d'ordre variable.
	 *  Un polygône est une suite cyclique de segments de droite consécutifs, 
	 *  L'ordre d'un polygone est le nombre de ses côtés.
	 *  
	 *  L'algorithme test5 doit également afficher l'ensemble des sommets du polygône affiché.  
	 *  
	 *  Un polygône sera affiché sous la forme (1,2) -- (2,1) -- (5,3) -- (1,2)   
	 *  si, par exemple, il s'agit d'un triangle le premier segment vaut (1,2) -- (2,1), 
	 *  le deuxième segment vaut (2,1) -- (5,3) et le dernier segment vaut (5,3) -- (1,2).
	 *  
	 *  L'ensemble des sommets des polygône sera affiché sous la forme { (1,2) , (2,1) , (5,3) } 
	 *  en utilisant une fonction auxiliaire qui retourne l'ensemble des sommets d'une polygône.  
	 */	
	
	@Test
	public void test05() {
		// TODO
	}
	
}