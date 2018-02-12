package fr.icam.bb8;

import java.io.InputStream;
import java.util.Scanner;

public class UnitBB {
	
	class grid {
		int rows;
		int cols;
		int[][] grid;
	}
	
	grid scan(InputStream inputStream) {
		grid grid = new grid();
		Scanner scanner = new Scanner(inputStream);
		scanner.useDelimiter("\n");
		boolean done = false;
		int i = 0;
		while (scanner.hasNext()) {
			String line = scanner.next();
			if (done) {
				tail(grid, line, i);
				i++;
			} else {
				head(grid, line);
				done = true;
			}
		}
		scanner.close();
		return grid;
	}

	void head(grid grid, String line) {
		Scanner head = new Scanner(line);
		head.useDelimiter(",");
		grid.rows = head.nextInt();
		grid.cols = head.nextInt();
		grid.grid = new int[grid.rows][grid.cols];
		head.close();
	}

	void tail(grid grid, String line, int i) {
		Scanner tail = new Scanner(line);
		tail.useDelimiter(",");
		int j = 0;
		while (tail.hasNext()) {
			int val = tail.nextInt();
			grid.grid[i][j] = val;
			j++;
		}
		tail.close();
	}
	
	class point {
		int x = -1;
		int y = -1;
		int v = 0;
	}

	boolean def(point p) {
		return p.x < 0 && p.y < 0;
	}
	
	void set(point p, int x, int y, int v) {
		p.x = x;
		p.y = y;
		p.v = v;
	}
	
	class stats {
		int num = 0;
		int sum = 0;
	}
	
	static void add(stats s, int v) {
		s.num++;
		s.sum += v;
	}
	
	float avg(stats s) {
		return (float) s.sum / (float) s.num;
	}
	
	void process(grid grid, point min, point max, stats stats) {
		for (int x = 0; x < grid.rows; x++) {
			for (int y = 0; y < grid.cols; y++) {
				int v = grid.grid[x][y];
				add(stats, v);
				if (def(min)) {
					set(min, x, y, v);
				}
				if (def(max)) {
					set(max, x, y, v);
				}
				if (v < min.v) {
					set(min, x, y, v);
				}
				if (v > max.v) {
					set(max, x, y, v);
				}
			}
		}
	}

	grid compute(grid grid, point min, point max, int MIN, int MAX) {
		grid trans_grid = new grid();
		trans_grid.rows = grid.rows;
		trans_grid.cols = grid.cols;
		trans_grid.grid = new int[grid.rows][grid.cols];
		for (int x = 0; x < grid.rows; x++) {
			for (int y = 0; y < grid.cols; y++) {
				int v = grid.grid[x][y];
				int trans_v = ((v + Math.abs(MIN - min.v)) * (MAX - MIN)) / (max.v - min.v);
				trans_grid.grid[x][y] = trans_v;
			}
		}
		return trans_grid;
	}
	
	class pair {
		point fst;
		point snd;
		pair(point f, point s) {
			fst = f;
			snd = s;
		}
	}
	
	pair process(grid grid) {
		point min = new point();
		point max = new point();
		stats stats = new stats();
		process(grid, min, max, stats);
		display(min, max, stats);
		return new pair(min, max);
	}

	void display(point min, point max, stats stats) {
		System.out.println("min = " + min.v + " at (" + min.x + "," + min.y + ")");
		System.out.println("max = " + max.v + " at (" + max.x + "," + max.y + ")");
		System.out.println("avg = " + avg(stats));
	}
	
	void main(String name) {
		System.out.println("processing " + name);
		InputStream inputStream = UnitBB.class.getResourceAsStream(name);
		grid grid = scan(inputStream);
		pair pair = process(grid);
		grid new_grid = compute(grid, pair.fst, pair.snd, 0, 1024);
		process(new_grid);
	}
	
	public static void main(String[] arguments) {
		new UnitBB().main(arguments[0]);
	}
	
}
