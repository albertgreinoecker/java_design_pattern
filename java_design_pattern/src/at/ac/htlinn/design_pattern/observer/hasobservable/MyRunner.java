package at.ac.htlinn.design_pattern.observer.hasobservable;

import at.ac.htlinn.design_pattern.observer.simple.MyObservable;

public class MyRunner {

	public static void main(String[] args) {
			SimpleObservable observable = new SimpleObservable();
			MyObserver1 ob1 = new MyObserver1(observable);
			MyObserver2 ob2 = new MyObserver2(observable);
			observable.doAnythingAndNotify();
		}
	}


