package at.ac.htlinn.design_pattern.observer.simple;

import java.util.Observable;

/**
 * Simple example of a concrete observable Class
 * @author albert
 *
 */
public class MyObservable extends Observable {

	public void runner() throws InterruptedException
	{
		
		for (int i = 0; i < 1000;i++)
		{
			setChanged();
			notifyObservers(i + " call");
			Thread.sleep(1000);
		}
	}
	
	@Override
	public String toString() {
		return "MyObservable";
	}
	
}
