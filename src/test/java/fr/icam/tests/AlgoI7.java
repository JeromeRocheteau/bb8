package fr.icam.tests;

import java.util.Scanner;

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
		System.out.print("\n");
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
		play(1, 1, state.Cross);
		display();
		play(0, 0, state.Nought);
		display();
		play(2, 2, state.Cross);
		display();
		play(0, 2, state.Nought);
		display();
		play(0, 1, state.Cross);
		display();
		play(2, 1, state.Nought);
		display();
		play(1, 0, state.Cross);
		display();
		play(2, 0, state.Nought);
		display();
		play(1, 2, state.Cross);
		display();
	}

	/** Améliorez l'algorithme test02 afin qu'il détecte automatiquement 
	 *  quand une partie est terminée. 
	 */

	class move {
		int x;
		int y;
		state s;
	}
	
	move read(boolean cross) throws Exception {
		move m = new move();
		m.s = cross ? state.Cross : state.Nought;	
		System.out.println("player: " + (cross ? "x" : "o"));
		System.out.print("row: ");
		m.x = scanner.nextInt();
		System.out.print("col: ");
		m.y = scanner.nextInt();
		return m;
	}
	
	boolean apply(move m) {
		if (0 <= m.x && m.x < 3) {
			if (0 <= m.y && m.y < 3) {
				state s = tictactoe[m.x][m.y];
				if (s == null) {
					tictactoe[m.x][m.y] = m.s;
					return true;
				}
			}	
		}
		return false;
	}
	
	Scanner scanner;
	
	@Test
	public void test02() throws Exception {
		scanner = new Scanner(System.in);
		int n = 0;
		init();
		display();
		while (n < 9) {
			move m = read(n % 2 == 0);
			boolean incr = apply(m);
			if (incr) {
				n++;
			}
			display();
		}
		scanner.close();
	}
	
}