package fr.icam.bb8;

import java.io.InputStream;
import java.util.Scanner;

public class UnitR {

	public static void main(String[] arguments) {
		System.out.println("processing " + arguments[0]);
		int rows = 0;
		int cols = 0;
		int[][] grid = new int[0][0];
		InputStream inputStream = UnitR.class.getResourceAsStream(arguments[0]);
		Scanner scanner = new Scanner(inputStream);
		scanner.useDelimiter("\n");
		boolean done = false;
		int i = 0;
		while (scanner.hasNext()) {
			String line = scanner.next();
			if (done) {
				Scanner tail = new Scanner(line);
				tail.useDelimiter(",");
				int j = 0;
				while (tail.hasNext()) {
					int val = tail.nextInt();
					grid[i][j] = val;
					j++;
				}
				tail.close();
				i++;
			} else {
				Scanner head = new Scanner(line);
				head.useDelimiter(",");
				rows = head.nextInt();
				cols = head.nextInt();
				grid = new int[rows][cols];
				head.close();
				done = true;
			}
		}
		scanner.close();
		int min_x = -1;
		int min_y = -1;
		int max_x = -1;
		int max_y = -1;
		int min_v = 0;
		int max_v = 0;
		int sum_v = 0;
		float avg_v = 0;
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				int val = grid[x][y];
				sum_v = sum_v + val;
				if (min_x < 0 && min_y < 0) {
					min_x = x;
					min_y = y;
					min_v = val;
				}
				if (max_x < 0 && max_y < 0) {
					max_y = x;
					max_y = y;
					max_v = val;
				}
				if (val < min_v) {
					min_x = x;
					min_y = y;
					min_v = val;
				}
				if (val > max_v) {
					max_x = x;
					max_y = y;
					max_v = val;
				}
			}
		}
		avg_v = (float) sum_v / ((float) cols * rows);
		System.out.println("min = " + min_v + " at (" + min_x + "," + min_y + ")");
		System.out.println("max = " + max_v + " at (" + max_x + "," + max_y + ")");
		System.out.println("avg = " + avg_v);
		int MAX = 1024;
		int MIN = 0;
		int[][] GRID = new int[rows][cols];
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				int val = grid[x][y];
				int VAL = ((val + Math.abs(MIN - min_v)) * (MAX - MIN)) / (max_v - min_v);
				GRID[x][y] = VAL;
			}
		}
		int MIN_X = -1;
		int MIN_Y = -1;
		int MAX_X = -1;
		int MAX_Y = -1;
		int MIN_V = 0;
		int MAX_V = 0;
		int SUM_V = 0;
		float AVG_V = 0;
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				int VAL = GRID[x][y];
				SUM_V = SUM_V + VAL;
				if (MIN_X < 0 && MIN_Y < 0) {
					MIN_X = x;
					MIN_Y = y;
					MIN_V = VAL;
				}
				if (MAX_X < 0 && MAX_Y < 0) {
					MAX_Y = x;
					MAX_Y = y;
					MAX_V = VAL;
				}
				if (VAL < MIN_V) {
					MIN_X = x;
					MIN_Y = y;
					MIN_V = VAL;
				}
				if (VAL > MAX_V) {
					MAX_X = x;
					MAX_Y = y;
					MAX_V = VAL;
				}
			}
		}
		AVG_V = (float) SUM_V / ((float) cols * rows);
		System.out.println("min = " + MIN_V + " at (" + MIN_X + "," + MIN_Y + ")");
		System.out.println("max = " + MAX_V + " at (" + MAX_X + "," + MAX_Y + ")");
		System.out.println("avg = " + AVG_V);
	}
	
}
