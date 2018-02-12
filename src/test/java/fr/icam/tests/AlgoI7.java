package fr.icam.tests;

import org.junit.Test;

public class AlgoI7 {

	/** L'objectif de ces tests est d'introduire les concepts :
	 * 
	 *  1. les énumérations
	 *  2. les tableaux à deux dimensions
	 *  3. les valeurs indéfinies
	 */

	/** Exécutez l'algorithme test01 :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 */
	
	enum state {Cross, Nought};
	
	state[][] tictactoe;
	
	void init() {
		tictactoe = new state[3][3];
	}

	void head() {
		for (int i = 0; i < 3; i++) {
			System.out.print("\t");
			System.out.print(i);
		}
		System.out.print("\n");
	}

	void board() {
		for (int i = 0; i < 3; i++) {
			System.out.print(i);
			for (int j = 0; j < 3; j++) {
				state s = tictactoe[i][j];
				System.out.print("\t");
				if (s == null) {
					System.out.print("-");
				} else if (s == state.Cross) {
					System.out.print("x");
				} else if (s == state.Nought) {
					System.out.print("o");
				}
			}
			System.out.print("\n");
		}
	}
	
	void display() {
		head();
		board();
	}
	
	void play(int i, int j, state next) {
		if (i < 3) {
			if (j < 3) {
				state prev = tictactoe[i][j];
				if (prev == null) {
					tictactoe[i][j] = next;
				}
			}
		}
	}
	
	@Test
	public void test01() {
		init();
		display();
	}
		
}