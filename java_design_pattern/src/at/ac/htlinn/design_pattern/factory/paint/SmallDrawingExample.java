package at.ac.htlinn.design_pattern.factory.paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SmallDrawingExample extends JFrame implements ActionListener{

	Container container;
	JButton b;
	public SmallDrawingExample() {
	this.setLayout(new BorderLayout());
	container = new Container();
	b = new JButton("Start");
	this.add(container, BorderLayout.CENTER);
	b.addActionListener(this);
	this.add(b, BorderLayout.SOUTH);
	
	}
	
	public void repaint(Graphics g) {
		g.setColor(Color.RED);
		g.clearRect(0, 0, container.getWidth(), container.getHeight());
		//Die Zeichenfunktionen kommen dann in die einzelnen Figur-Klassen Rechteck, Kreis, ...
		g.drawRect(100, 100, 200, 200); //x,y,w,h
		g.drawOval(400, 400, 2*20, 2*20); //x,y,durchmesser-x,durchmesser-y
		g.fillOval(700, 400, 2*50, 2*50);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint(container.getGraphics());
	}
	
	public static void main(String[] args) {
		SmallDrawingExample frame = new SmallDrawingExample();
		frame.setSize(1000,1000);
		frame.setVisible(true);
	}

}