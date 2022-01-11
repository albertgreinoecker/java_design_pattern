package at.ac.htlinn.design_pattern.observer.water_level;
import java.util.Observable;

/**
 * Simple measure point which sends water level (random number) periodically
 * @author albert
 *
 */
public class MeasureP1 extends Observable implements Runnable {

	@Override
	public void run() {
		while (true)
		{
			setChanged();
			notifyObservers(Math.random());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}