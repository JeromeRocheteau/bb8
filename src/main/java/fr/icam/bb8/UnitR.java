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

	private void init() {
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

	int index(String name) {
		for (int i = 0; i < systems.length; i++) {
			if (namings[i].equalsIgnoreCase(name)) {
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

	private void loop() {
		System.out.println("hello! my name is <r-unit> and i'm ready.");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("what do you want? ");
			String line  = scanner.nextLine();
			if (line.equalsIgnoreCase("exit")) {
				break;
			} else if (line.equalsIgnoreCase("route")) {
				int s = -1;
				do {
					System.out.print("from? ");
					String source = scanner.nextLine();
					s = index(source);
				} while (s == -1);
				int t = -1;
				do {
					System.out.print("to? ");
					String target = scanner.nextLine();
					t = index(target);
				} while (t == -1);
				String src = namings[s];
				String tgt = namings[t];
				long duration = navmaps[s][t];
				if (duration == 0) {
					System.out.println("there is no route from " + src + " to " + tgt + ".");
				} else {
					System.out.println("the direct route from " + src + " to " + tgt + " takes " + duration + "ms.");
				}
			} else {
				System.out.println("\nsorry, i don't understand your request.");
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
		(new UnitR()).process();
	}

	/*
	
	void write() throws Exception {
		OutputStream output = new FileOutputStream("result.txt");
		PrintStream printer = new PrintStream(output);
		for (int i = 0; i < navmaps.length; i++) {
			if (i > 0) {
				printer.print("\t");
			}
			printer.format("%20d", i);
		}
		printer.print("\n");
		for (int i = 0; i < navmaps.length; i++) {
			printer.format("%20d", i);
			for (int j = 0; j < navmaps[i].length; j++) {
				printer.print("\t");
				printer.format("%20d", navmaps[i][j]);
			}
			printer.print("\n");
		}
		printer.close();
		output.close();
	}
	
	void gen() throws Exception {
		Random random = new Random();
		OutputStream output = new FileOutputStream("navmaps.csv");
		PrintStream printer = new PrintStream(output);
		for (int i = 0; i < systems.length; i++) {
			long s = systems[i];
			String source = namings[i];
			for (int j = i + 1; j < systems.length; j++) {
				long t = systems[j];
				String target = namings[j];
				if (source.equalsIgnoreCase("corellia")) {
					if (target.equalsIgnoreCase("coruscant")) {
						long k = 4L * 60L * 60L * 1000L + random.nextInt(1000);
						printer.format("%d,%d,%d%n", s, t, k);
					} else if (target.equalsIgnoreCase("tatooine")) {
						long k = 4L * 60L * 60L * 1000L + random.nextInt(1000);
						printer.format("%d,%d,%d%n", s, t, k);	
					}
				} else if (source.equalsIgnoreCase("coruscant")) {
					if (target.equalsIgnoreCase("tatooine")) {
						long k = 22L * 24L * 60L * 60L * 1000L + random.nextInt(1000);
						printer.format("%d,%d,%d%n", s, t, k);
					}
				} else {
					if (random.nextBoolean()) {
						int a = random.nextInt(12) + 1;
						int b = random.nextInt(12) + 1;
						int size = Math.max(6, Math.max(a, b));
						long k = 0;
						for (int n = 0; n < size; n++) {
							k += random.nextInt(10) * Math.pow(10, n);
						}
						printer.format("%d,%d,%d%n", s, t, Math.abs(k));
					} else {
						printer.format("%d,%d,%d%n", s, t, 0);
					}
				}
			}
		}
		printer.close();
		output.close();
	}
	
	void gen(String file) throws Exception {
		for (int i = 0; i < navmaps.length; i++) {
			String source = namings[i];
			for (int j = 0; j < navmaps.length; j++) {
				String target = namings[j];
				if (source.equalsIgnoreCase("corellia")) {
					if (target.equalsIgnoreCase("coruscant")) {
						System.out.println("coruscant-corellia: " + navmaps[i][j]);
					} else if (target.equalsIgnoreCase("tatooine")) {
						System.out.println("corellia-tatooine: " + navmaps[i][j]);	
					}
				} else if (source.equalsIgnoreCase("coruscant")) {
					if (target.equalsIgnoreCase("tatooine")) {
						System.out.println("coruscant-tatooine: " + navmaps[i][j]);
					}
				}
				
			}
		}
	}	
	
	void check() throws Exception {
		OutputStream r2d2Output = new FileOutputStream("r2d2.csv");
		PrintStream r2d2Printer = new PrintStream(r2d2Output);
		OutputStream bb8Output = new FileOutputStream("bb8.csv");
		PrintStream bb8Printer = new PrintStream(bb8Output);
		for (int i = 0; i < navmaps.length; i++) {
			String source = namings[i];
			for (int j = 0; j < navmaps.length; j++) {
				String target = namings[j];
				long k = navmaps[i][j];
				if (source.equalsIgnoreCase("Ahch-To")) {
					
				}
			}
		}
		r2d2Printer.close();
		r2d2Output.close();
		bb8Printer.close();
		bb8Output.close();
	}
	
	*/
	
}
