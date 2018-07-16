package fr.icam.bb8;

public class UnitBB extends UnitR {
	
	void setup(String[] names) throws Exception {
		init();
		int i = 0;
		for (String name : names) {
			System.out.println("initializing systems");
			i = read(name, i);
			System.out.println(i + " systems initialized from " + name);
		}
		for (String name : names) {
			load(name);
		}
	}
	
	void process(String name, String... names) throws Exception {
		setup(names);
		loop(name);
	}

	public static void main(String[] arguments) throws Exception {
		UnitBB unit = new UnitBB();
		unit.process("BB-8", "r2d2", "bb8");
	}
	
}
