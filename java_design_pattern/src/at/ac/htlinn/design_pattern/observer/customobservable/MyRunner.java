package at.ac.htlinn.design_pattern.observer.customobservable;

public class MyRunner {

	public static void main(String[] args) {
			SimpleCustomObservable observable = new SimpleCustomObservable();
			MyObserver ob1 = new MyObserverImpl(observable);
			observable.doAnythingAndNotify();
		}
	}


