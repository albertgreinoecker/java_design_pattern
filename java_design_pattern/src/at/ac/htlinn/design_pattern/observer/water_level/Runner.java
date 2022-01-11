package at.ac.htlinn.design_pattern.observer.water_level;

/**
 * Register 3 Measurepoints and notify the main water level check instance
 * periodically
 * 
 * @author albert
 *
 */
public class Runner {

	public static void main(String[] args) {
		MainWaterLevelChecker b = new MainWaterLevelChecker();
		MeasureP1 p1 = new MeasureP1();
		MeasureP2 p2 = new MeasureP2();
		MeasureP3 p3 = new MeasureP3();

		b.register(p1);
		b.register(p2);
		b.register(p3);

		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
	}
}
