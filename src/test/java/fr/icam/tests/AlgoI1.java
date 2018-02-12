package fr.icam.tests;

import org.junit.Test;

public class AlgoI1 {

	/** L'objectif de ces tests est d'introduire les concepts :
	 * 
	 *  1. de procédure
	 *  2. de fonction
	 *  3. d'instruction
	 *  4. de valeur
	 *  5. d'appel à une fonction ou une procédure
	 *  6. de paramètre formel 
	 *  7. de paramètre réel 
	 *  8. de variable locale et de variable globale :
	 *    8.1 déclaration d'une variable 
	 *    8.2 affectation d'une valeur à une variable 
	 *    8.3 initialisation d'une variable 
	 *    8.4 portée d'une variable locale
	 *    8.5 portée d'une variable globale
	 */
	
	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. <code>print("Hello World!");</code> : est-ce une instruction ou une valeur ?
	 *  2. <code>"Hello World!"</code> : est-ce une instruction ou une valeur ?
	 *  3. <code>print(...)</code> : est-ce une fonction ou bien une procédure ?
	 *  4. <code>("Hello World!")</code> : est-ce un paramètre formel 
	 *     ou un paramètre réel (argument) de <code>print(...)</code> ?
	 *  5. Comment définir l'algorithme test01 en une phrase ?
	 */
	@Test
	public void test01() {
		System.out.print("Hello World!\n");
	}
	
	/** Exécutez l'algorithme test02 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. Le résultat est-il le même que celui de l'algorithme test01 ?
	 *  3. <code>String</code> : que signifie ce type de données ?
	 *  4. <code>name</code> : est-ce une variable ou une valeur ?
	 *  5. <code>"Luke"</code> : est-ce une variable ou une valeur ?
	 *  6. <code>name = "Luke"</code> : que signifie cette partie de l'instruction ?
	 *  7. <code>String name</code> : que signifie cette partie de l'instruction ?
	 *  8. <code>String name = "Luke"</code> : que signifie cette instruction ?
	 *  9. <code>"Hello" + name</code> : que signifie cette expression ? quelle est la valeur de cette expression ?
	 */
	@Test
	public void test02() {
		String name = "Luke";
		System.out.print("Hello " + name + "!\n");
	}
	
	/** Complétez l'algorithme test03 afin qu'il produise 
	 *  le même résultat que celui de l'algorithme test01.
	 */	
	@Test
	public void test03() {
		String name = " ... "; // TODO 
		System.out.print("Hello " + name + "!\n");
	}

	/** Exécutez l'algorithme test04 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. Le résultat est-il le même que celui de l'algorithme test02 ?
	 *  3. <code>String name = luke</code> : que pouvez-vous en déduire quant aux instructions d'affectation et quant aux valeurs ?
	 */
	@Test
	public void test04() {
		String luke = "Luke";
		String name = luke;
		System.out.print("Hello " + name + "!\n");
	}

	/** Exécutez l'algorithme test05 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. Le résultat est-il le même que celui de l'algorithme test02 ?
	 *  3. <code>hello(name);</code> : que signifie cette instruction ?
	 *  4. <code>void hello(String name) { ... }</code> : est-ce une procédure ou une fonction ?
	 *  5. <code>void</code> : que signifie ce type de données ?
	 *  6. <code>hello(String name)</code> : <code>name</code> est-il un paramètre formel ou un paramètre réel ? 
	 *  7. Quel est l'intérêt d'avoir séparé l'algorithme <code>hello</code> de l'algorithme <code>test05</code> ? 
	 */

	void hello(String name) {
		System.out.print("Hello " + name + "!\n");
	}
	
	@Test
	public void test05() {
		String name = "Luke";
		hello(name);
	}

	/** Exécutez l'algorithme test06 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. Le résultat est-il le même que celui de l'algorithme test02 ?
	 *  3. <code>String luke = "Luke";</code> : que signifie cette instruction ?
	 *  4. <code>luke</code> : est-ce une variable locale ou une variable globale ?
	 *  5. Quelle est la différence entre une variable locale et une variable globale ?
	 *  6. Quelle est la différence avec l'algorithme test02 ?
	 */
	
	String luke = "Luke";
	
	@Test
	public void test06() {
		hello(luke);
	}
	
	/** Exécutez l'algorithme test07 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. Le résultat est-il le même que celui de l'algorithme test02 ?
	 *  3. <code>String luke() { ... }</code> : est-ce une procédure ou une fonction ?
	 *  4. <code>return "Luke";</code> : que signifie cette instruction ?
	 *  5. <code>String name = luke();</code> : que signifie cette instruction ?
	 *  6. <code>String name = luke</code> : que pouvez-vous en déduire quant aux instructions d'affectation et quant aux valeurs ?
	 *  7. Quelle est la différence entre une procédure et une fonction ?
	 *  8. Quelle est la différence avec l'algorithme test06 ?
	 */
	
	String luke() {
		return "Luke";
	}
	
	@Test
	public void test07() {
		String name = luke();
		hello(name);
	}
	
	/** Exécutez l'algorithme test08 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. Le résultat est-il le même que celui de l'algorithme test02 ?
	 *  3. Quelle est la différence avec l'algorithme test07 ?
	 *  4. Quel est le « meilleur » algorithme entre test02, test04, test05, test06 test07 et test08 ? 
	 */
	
	@Test
	public void test08() {
		hello(luke());
	}
	
	/** Définissez l'algorithme test09 afin qu'il affiche 
	 *  un message de salut à Luke, puis Han et puis Leia.
	 */
	@Test
	public void test09() {
		
	}
	
}