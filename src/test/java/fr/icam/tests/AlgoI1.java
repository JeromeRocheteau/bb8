package fr.icam.tests;

import org.junit.Test;

public class AlgoI1 {

	/** L'objectif de ces tests est d'introduire :
	 * 
	 *  1. les procédures
	 *  2. les fonctions
	 *  3. les instructions
	 *  4. les valeurs
	 *  5. les appels à une fonction ou une procédure
	 *  6. les paramètres formels 
	 *  7. les paramètres réels 
	 *  8. les variables locales et les variables globales :
	 *     8.1 déclaration d'une variable 
	 *     8.2 affectation d'une valeur à une variable 
	 *     8.3 initialisation d'une variable 
	 *     8.4 portée d'une variable locale
	 *     8.5 portée d'une variable globale
	 */
	
	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. <code>System.out.print("Hello World!");</code> : est-ce une instruction ou une valeur ?
	 *  2. <code>"Hello World!"</code> : est-ce une instruction ou une valeur ?
	 *  3. <code>System.out.print(...)</code> : est-ce une fonction ou bien une procédure ?
	 *  4. Quelle sorte de paramètre est le paramètre <code>("Hello World!")</code> dans <code>System.out.print(...)</code> ? 
	 *     4.1 un paramètre formel 
	 *     4.2 un paramètre réel
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
	 *  3. À quoi correspond ce type de données <code>String</code> ?
	 *  4. À quoi correspond <code>name</code> : est-ce une variable ou une valeur ?
	 *  5. À quoi correspond <code>"Luke"</code> : est-ce une variable ou une valeur ?
	 *  6. À quoi correspond l'instruction <code>String name = "Luke"</code> ?
	 *     6.1. À quoi correspond <code>name = "Luke"</code> ?
	 *     6.2. À quoi correspond <code>String name</code> ?
	 *  7. À quoi correspond l'expression <code>"Hello" + name</code> ? Quelle est sa valeur ?
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
	 *  3. Que pouvez-vous en déduire quant aux instructions d'affectation et quant aux valeurs 
	 *     à partir du cas de l'instruction <code>String name = luke;</code> ?
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
	 *  3. À quoi correspond l'instruction <code>hello(name);</code> ?
	 *  4. À quoi correspond <code>void hello(String name) { ... }</code> : est-ce une procédure ou une fonction ?
	 *  5. À quoi correspond le type de données <code>void</code> ?
	 *  6. Quelle sorte de paramètre est le paramètre <code>name</code> dans <code>hello(String name)</code> ? 
	 *     6.1. un paramètre formel 
	 *     6.2. un paramètre réel 
	 *  7. Quel est l'intérêt d'avoir extrait l'algorithme <code>hello</code> de l'algorithme <code>test05</code> ? 
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
	 *  3. À quoi correspond l'instruction <code>String luke = "Luke";</code> ?
	 *  4. Quelle sorte de variable est la variable <code>luke</code> ?
	 *     4.1. une variable locale 
	 *     4.2. une variable globale 
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
	 *  3. À quoi correspond <code>String luke() { ... }</code> : est-ce une procédure ou une fonction ?
	 *  4. À quoi correspond l'instruction <code>return "Luke";</code> ?
	 *  5. À quoi correspond l'instruction <code>String name = luke();</code> ?
	 *  6. Que pouvez-vous en déduire quant aux instructions d'affectation et quant aux valeurs 
	 *     à partir du cas de l'instruction <code>String name = luke();</code> ?
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
	 *  un message de salut à Luke, puis à Han et puis à Leia.
	 */
	@Test
	public void test09() {
		// TODO
	}
	
}