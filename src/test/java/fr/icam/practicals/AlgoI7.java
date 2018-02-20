package fr.icam.practicals;

import java.util.Scanner;

import org.junit.Test;

public class AlgoI7 {

	/** L'objectif de ces tests est d'introduire :
	 * 
	 *  1. les énumérations
	 *  2. les tableaux à deux dimensions
	 *  3. les valeurs indéfinies
	 */

	/** Exécutez l'algorithme <code>test01</code> :
	 * 
	 *  1. Quel est le résultat produit par cet algorithme ?
	 *  2. À quoi correspond la procédure <code>void init()</code> ?
	 *  3. À quoi correspond la procédure <code>void display()</code> ?
	 *     3.1. À quoi correspond la procédure <code>void head()</code> ?
	 *     3.2. À quoi correspond la procédure <code>void board()</code> ?
	 *  4. À quoi correspond la procédure <code>void play(int i, int j, state next)</code> ?
	 *  5. À quoi correspond le tableau <code>state[][] tictactoe</code> ?
	 *  6. À quoi correspond le type de données <code>state</code> ?
	 *  7. À quoi correspond la déclaration <code>enum state {cross, nought};</code> ?
	 *  8. À quoi correspond l'expression <code>s == cross</code> dans l'algorithme <code>board</code>?
	 *  9. À quoi correspond l'instruction <code>tictactoe[i][j] = next;</code> dans l'algorithme <code>play</code>?
	 */
	
	enum state {cross, nought};
	
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
				} else if (s == state.cross) {
					System.out.print("x");
				} else if (s == state.nought) {
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
		play(1, 1, state.cross);
		display();
		play(0, 0, state.nought);
		display();
		play(2, 2, state.cross);
		display();
		play(0, 2, state.nought);
		display();
		play(0, 1, state.cross);
		display();
		play(2, 1, state.nought);
		display();
		play(1, 0, state.cross);
		display();
		play(2, 0, state.nought);
		display();
		play(1, 2, state.cross);
		display();
	}

	/** Améliorez l'algorithme <code>test02</code> afin qu'il détecte 
	 *  automatiquement quand une partie est terminée c'est-à-dire 
	 *  qu'il stoppe la partie :
	 *  1. ou bien dès qu'un joueur est gagnant  
	 *  2. ou bien dès qu'il n'y a plus de coups à jouer. 
	 */

	class move {
		int x;
		int y;
		state s;
	}
	
	move read(boolean cross) throws Exception {
		move m = new move();
		m.s = cross ? state.cross : state.nought;	
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