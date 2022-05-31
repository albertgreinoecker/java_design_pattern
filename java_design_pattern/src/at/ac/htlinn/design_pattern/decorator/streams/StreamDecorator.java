package at.ac.htlinn.design_pattern.decorator.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class StreamDecorator {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("any.txt");
		FileOutputStream fos = new FileOutputStream(file); 
		PrintWriter pw = new PrintWriter(fos);
		pw.println("x");
		pw.println("y");
		pw.close();
		
		//Or use in one statement:
		PrintWriter pw2 = new PrintWriter(new FileOutputStream(new File("any2.txt")));
		pw2.print("zz");
		pw2.close();
	}

}
