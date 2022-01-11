package at.ac.htlinn.design_pattern.observer.simple;

import java.util.Observable;
import java.util.Observer;

/**
 * Just a simple class which gets notified by an Observable periodically
 * @author albert
 *
 */
public class MyObserver1 implements Observer {

	/**
	 * @param o the observable to be registered
	 */
	public MyObserver1(Observable o)
	{
		o.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object o) {
		System.out.println("Bin ein MyObserver1 - Objekt");
		System.out.println(obs + ":" + o);	
	}
	
	@Override
	public String toString() {
		return "MyObserver1";
	}

}
