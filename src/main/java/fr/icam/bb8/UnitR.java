package fr.icam.bb8;

import java.io.InputStream;
import java.util.Scanner;

public class UnitR {

	long[] systems;
	String[] namings;
	double[] centers;
	double[] majors;
	double[] minors;
	long[][] navmaps;

	void init() {
		systems = new long[359];
		namings = new String[359];
		centers = new double[359];
		majors = new double[359];
		minors = new double[359];
		navmaps = new long[359][359];
	}
	
	void read() throws Exception {
		InputStream input = UnitR.class.getResourceAsStream("/systems.csv");
		Scanner scanner = new Scanner(input);
		int i = 0;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] items = line.split(",");
			systems[i] = Long.valueOf(items[0]).longValue();
			namings[i] = items[1];
			centers[i] = Double.valueOf(items[2]).doubleValue();
			majors[i] = Double.valueOf(items[3]).doubleValue();
			minors[i] = Double.valueOf(items[4]).doubleValue();
			i++;
		}
		scanner.close();
		input.close();
	}
	
	int index(long id) {
		for (int i = 0; i < systems.length; i++) {
			if (systems[i] == id) {
				return i;
			}
		}
		return -1;
	}
	
	void load() throws Exception {
		InputStream input = UnitR.class.getResourceAsStream("/navmaps.csv");
		Scanner scanner = new Scanner(input);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] items = line.split(",");
			long source = Long.valueOf(items[0]).longValue();
			long target = Long.valueOf(items[1]).longValue();
			long effort = Long.valueOf(items[2]).longValue();
			int i = index(source);
			int j = index(target);
			navmaps[i][j] = effort;
			navmaps[j][i] = effort;
		}
		scanner.close();
		input.close();
	}
	
	void setup() throws Exception {
		init();
		read();
		load();		
	}

	int index(String name) {
		for (int i = 0; i < namings.length; i++) {
			if (namings[i].equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}

	int ask(Scanner scanner, String text) {
		int s = -1;
		do {
			System.out.print(text);
			String source = scanner.nextLine();
			s = index(source);
		} while (s == -1);
		return s;
	}

	void route(Scanner scanner) {
		int s = ask(scanner, "from? ");
		int t = ask(scanner, "to? ");
		String src = namings[s];
		String tgt = namings[t];
		long duration = navmaps[s][t];
		if (duration == 0) {
			System.out.println("there is no direct route from " + src + " to " + tgt + ".");
		} else {
			System.out.println("the direct route from " + src + " to " + tgt + " takes " + duration + "ms.");
		}
	}

	void loop() {
		System.out.println("hello! my name is <r-unit> and i'm ready.");
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while (exit == false) {
			System.out.print("what are you asking for? ");
			String line  = scanner.nextLine();
			if (line.equalsIgnoreCase("exit")) {
				exit = true;
			} else if (line.equalsIgnoreCase("route")) {
				route(scanner);
			} else {
				System.out.println("sorry, i don't understand your request.");
			}
		}
		System.out.println("bye!");
		scanner.close();
	}
	
	void process() throws Exception {
		setup();
		loop();
	}
	
	public static void main(String[] arguments) throws Exception {
		UnitR unit = new UnitR();
		unit.process();
	}
	
}
