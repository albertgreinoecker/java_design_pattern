package at.ac.htlinn.design_pattern.observer.ttt_mvc;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TTTLogger extends JFrame implements Observer {
	private static final long serialVersionUID = 1L;
	JTextArea txt;

	public TTTLogger(TTTModel model) {
		txt = new JTextArea();
		setLayout(new BorderLayout());
		add(txt);
		model.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object msg) {
		txt.append(msg.toString() + "\n");

	}

}
