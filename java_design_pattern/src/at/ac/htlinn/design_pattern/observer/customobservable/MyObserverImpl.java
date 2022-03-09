package at.ac.htlinn.design_pattern.observer.customobservable;

public class MyObserverImpl implements MyObserver {

	/**
	 * @param o the observable to be registered
	 */
	public MyObserverImpl(SimpleCustomObservable o)
	{
		o.addObserver(this);
	}
	
	@Override
	public void update(SimpleCustomObservable obs, Object o) {
		System.out.println("Bin ein MyObserver1 - Objekt");
		System.out.println(obs + ":" + o);	
	}
	
	@Override
	public String toString() {
		return "MyObserver1";
	}
}