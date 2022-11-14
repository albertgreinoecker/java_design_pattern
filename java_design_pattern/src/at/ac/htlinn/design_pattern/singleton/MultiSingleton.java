package at.ac.htlinn.design_pattern.singleton;

import java.util.HashMap;

/**
 * Example for working with multiple Singleton Instances
 * A Parameter type decides which instance should be (generated in case) and returned
 * @author albert
 *
 */
public class MultiSingleton {

	private static HashMap<String, MultiSingleton> instance = new HashMap<>();

	private MultiSingleton() 
	{
	}

	public static MultiSingleton instance(String type) {
		if (!instance.containsKey(type)) {
			instance.put(type, new MultiSingleton());
		}
		return instance.get(type);
	}


	public static void main(String[] args) {
		MultiSingleton s = MultiSingleton.instance("single1");
	}
}
