package fr.icam.bb8;

import java.io.InputStream;
import java.util.Scanner;

public class UnitR {

	long[] systems;
	String[] namings;
	long[][] navmaps;

	void init() {
		systems = new long[359];
		namings = new String[359];
		navmaps = new long[359][359];
	}
	
	int read(String name, int index) throws Exception {
		InputStream input = UnitR.class.getResourceAsStream("/" + (name == null ? "" : name + "-") + "systems.csv");
		Scanner scanner = new Scanner(input);
		int i = index;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] items = line.split(",");
			systems[i] = Long.valueOf(items[0]).longValue();
			namings[i] = items[1];
			i++;
		}
		scanner.close();
		input.close();
		return i;
	}
	
	int index(long id) {
		for (int i = 0; i < systems.length; i++) {
			if (systems[i] == id) {
				return i;
			}
		}
		return -1;
	}
	
	void load(String name) throws Exception {
		InputStream input = UnitR.class.getResourceAsStream("/" + (name == null ? "" : name + "-") + "navmaps.csv");
		Scanner scanner = new Scanner(input);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] items = line.split(",");
			long source = Long.valueOf(items[0]).longValue();
			long target = Long.valueOf(items[1]).longValue();
			long effort = Long.valueOf(items[2]).longValue();
			int i = index(source);
			int j = index(target);
			if (i == -1 || j == -1) {
				System.err.println("skiping " + source + " -> " + target + " (" + effort + ")");
			} else {
				navmaps[i][j] = effort;
				navmaps[j][i] = effort;
			}
		}
		scanner.close();
		input.close();
	}
	
	void setup(String name) throws Exception {
		init();
		read(name, 0);
		load(name);		
	}

	int index(String name) {
		for (int i = 0; i < namings.length; i++) {
			String source = namings[i];
			if (source == null) {
				continue;
			} else if (source.equalsIgnoreCase(name)) {
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
			if (s == -1) {
				System.out.println("sorry, i don't know " + source + ".");
			}
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

	void list(Scanner scanner) {
		System.out.print("filtering on: ");
		String filter = scanner.nextLine();
		for (int i = 0; i < namings.length; i++) {
			if (namings[i] == null) {
				continue;
			} else {
				long id = systems[i];
				String pattern = namings[i].toLowerCase();
				String prefix = filter.toLowerCase();
				if (pattern.startsWith(prefix)) {
					System.out.println("  - " + namings[i] + " (" + id + ")");
					
				}				
			}
		}
	}
	
	void loop(String name) {
		System.out.println("hello! my name is " + name + " and i'm ready.");
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while (exit == false) {
			System.out.print("what are you asking for? ");
			String line  = scanner.nextLine();
			if (line.equalsIgnoreCase("exit")) {
				exit = true;
			} else if (line.equalsIgnoreCase("list")) {
				list(scanner);
			} else if (line.equalsIgnoreCase("route")) {
				route(scanner);
			} else {
				System.out.println("sorry, i don't understand your request.");
			}
		}
		System.out.println("bye!");
		scanner.close();
	}
	
	void process(String name) throws Exception {
		setup(name);
		loop(name);
	}
	
	public static void main(String[] arguments) throws Exception {
		UnitR unit = new UnitR();
		unit.process("bb8");
	}
	
}
