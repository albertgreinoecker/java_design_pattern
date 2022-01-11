package at.ac.htlinn.design_pattern.observer.ttt_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TTTControl implements ActionListener {
	TTTModel model;

	public TTTControl(TTTModel model) {
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton e = (JButton) event.getSource();
		int pos = new Integer(e.getName()).intValue();
		model.set(pos);
	}

}
