package at.ac.htlinn.design_pattern.observer.water_level;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class MainWaterLevelChecker implements Observer {

	final double LOWER_LIMIT = 0.1; 
	final double UPPER_LIMIT = 0.9;
	
	public MainWaterLevelChecker() 
	{
		
	}
	
	public void register(Observable o)
	{
		o.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object obj) {
		double d = (double)obj;
		String nowStr = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format( new Date());
		if (d < LOWER_LIMIT) 
		{
			System.out.printf("%s : %s fell below limit (%.3f)\n", nowStr, o.getClass().getSimpleName(), d);
		}
		if (d > UPPER_LIMIT)
		{
			System.out.printf("%s : %s went beyond limit (%.3f)\n", nowStr, o.getClass().getSimpleName(), d);
		}
	}
}
