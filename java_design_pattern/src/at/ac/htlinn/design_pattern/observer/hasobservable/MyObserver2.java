package at.ac.htlinn.design_pattern.observer.hasobservable;

import java.util.Observable;
import java.util.Observer;

public class MyObserver2 implements Observer {

	/**
	 * @param o the observable to be registered
	 */
	public MyObserver2(SimpleObservable o)
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