package at.ac.htlinn.design_pattern.observer.customobservable;

import java.util.Vector;

/**
 * Möchte man den kompletten Pattern schreiben ohne bereits existierenden
 * Klassen bzw. Interfaces zu verwenden, dann muss man die Implementierungen
 * direkt hier unterbringen
 * 
 * @author albert
 *
 */
public class SimpleCustomObservable {
	private boolean changed = false;
	private Vector<MyObserver> obs;

	public SimpleCustomObservable() {
		obs = new Vector<>();
	}

	public synchronized void addObserver(MyObserver o) {
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}

	public synchronized void deleteObserver(MyObserver o) {
		obs.removeElement(o);
	}

	public void notifyObservers(Object arg) {
		Object[] arrLocal;

		synchronized (this) {

			if (!changed)
				return;
			arrLocal = obs.toArray();
			clearChanged();
		}

		for (int i = arrLocal.length - 1; i >= 0; i--)
			((MyObserver) arrLocal[i]).update(this, arg);
	}

	protected synchronized void setChanged() {
		changed = true;
	}

	protected synchronized void clearChanged() {
		changed = false;
	}

	public synchronized void doAnythingAndNotify() {
		for (int i = 0; i < 1000; i++) {
			setChanged();
			notifyObservers(i + " call");
		}
	}

}
