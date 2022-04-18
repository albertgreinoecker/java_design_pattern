package at.ac.htlinn.design_pattern.command.simple_stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Simple example to demonstrate the usage of class Stack
 *
 */
public class MyStack {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();
		
		s1.push("First Element");
		s1.push("Second Element");
		
		System.out.println(s1);
		
		String e1 = s1.pop(); //also removes top element
		System.out.printf("Fetched top Element: %s\n", e1);
		
		System.out.println(s1);
		
		
		String e2 = s1.peek(); //leaves top element on stack
		System.out.printf("Peek top Element: %s\n", e2);
		
		System.out.println(s1); //unchanged
		
		int idx = s1.search("First Element");
		System.out.printf("Position of searched Element: %d \n", idx);
		
		
		s1.pop();
		try
		{
			s1.pop();	
		} catch (EmptyStackException e)
		{
			System.out.println("Kein Element mehr am Stack!!!");
		}
	}

}
