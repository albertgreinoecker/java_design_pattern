package at.ac.htlinn.design_pattern.observer.hasobservable;

import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

/**
 * Wenn die Vererbung schon für eine andere Klasse belegt ist, muss man sich den Observer in der Klasse merken
 * Leider muss man einen kleinen Trick mit Reflection anwenden, damit man die setChanged-Methode von aussen aufrufen kann
 * @author albert
 *
 */
public class SimpleObservable {
	private Observable observable = new Observable();

	public synchronized void addObserver(Observer o) {
		observable.addObserver(o);
	}
	
    public synchronized void deleteObserver(Observer o) {
    	observable.deleteObserver(o);
    }
    
    public void doAnythingAndNotify()
    {
    	for (int i = 0; i < 1000;i++)
		{
    		//observable.setChanged(); is protected, so we have to use an inproper workaround with reflection
    		try {
				Method setChanged = observable.getClass().getDeclaredMethod("setChanged");
				setChanged.setAccessible(true); //turn on accessibility
				setChanged.invoke(observable); //call the method via reflection
			} catch (Exception e) {
				e.printStackTrace();
			}
    		observable.notifyObservers(i + " call");
		}
    }
	
}
