package at.ac.htlinn.design_pattern.observer.ttt_mvc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TTTView extends JFrame implements Observer {
	private static final long serialVersionUID = 1L;
	TTTModel model;
	TTTControl control;
	JLabel feedBack = new JLabel();
	Container pf = new Container();

	JButton[] buttons = new JButton[9];

	public TTTView(TTTModel model, TTTControl control) throws HeadlessException {
		this.model = model;
		this.control = control;

		this.setLayout(new BorderLayout());

		pf.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("");
			buttons[i].addActionListener(control);
			buttons[i].setName(i + "");
			pf.add(buttons[i]);
		}

		this.add(pf, BorderLayout.CENTER);
		this.add(feedBack, BorderLayout.SOUTH);

		model.addObserver(this);
	}

	private void disableBtns() {
		for (JButton b : buttons) {
			b.setEnabled(false);
		}
	}

	@Override
	public void update(Observable obs, Object message) {
		TTTMessage msg = (TTTMessage) message;
		if (msg.getAction().equals(TTTMessage.ACTIONS.CELL_SET)) {
			buttons[msg.getPos()].setText(model.getPlayer() == 0 ? "O" : "X");
		} else if (msg.getAction().equals(TTTMessage.ACTIONS.FIELD_OCCUPIED)) {
			feedBack.setText("Das Feld " + msg.getPos() + " ist bereits belegt");
		} else if (msg.getAction().equals(TTTMessage.ACTIONS.WON)) {
			feedBack.setText("Spieler " + (model.getPlayer() == 0 ? "O" : "X") + " hat gewonnen");
			disableBtns();
		} else if (msg.getAction().equals(TTTMessage.ACTIONS.FIELD_FULL)) {
			feedBack.setText("Das Feld ist voll. Keiner hat gewonnen");
			disableBtns();
		}

	}

}
