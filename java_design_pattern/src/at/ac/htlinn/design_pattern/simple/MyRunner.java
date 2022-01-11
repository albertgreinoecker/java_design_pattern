package at.ac.htlinn.design_pattern.simple;


public class MyRunner {

	public static void main(String[] args) throws InterruptedException {
		MyObservable observable = new MyObservable();
		MyObserver1 ob1 = new MyObserver1(observable);
		MyObserver2 ob2 = new MyObserver2(observable);
		observable.runner();
	}
}
