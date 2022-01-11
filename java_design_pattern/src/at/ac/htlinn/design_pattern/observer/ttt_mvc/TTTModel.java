package at.ac.htlinn.design_pattern.observer.ttt_mvc;

import java.util.Observable;

public class TTTModel extends Observable {
	int player; // 0 oder 1

	TTTField field;

	public TTTModel() {
		this.field = new TTTField();
		this.player = 0;
	}

	public int getPlayer() {
		return player;
	}

	public void set(int pos) {
		boolean ok = field.set(pos, player == 0 ? TTTField.CELL.O : TTTField.CELL.X);
		if (ok) {
			setChanged();
			notifyObservers(new TTTMessage(TTTMessage.ACTIONS.CELL_SET, pos));
			next();
		} else {
			setChanged();
			notifyObservers(new TTTMessage(TTTMessage.ACTIONS.FIELD_OCCUPIED, pos));
		}

		if (field.won()) {
			setChanged();
			notifyObservers(new TTTMessage(TTTMessage.ACTIONS.WON));

		} else if (field.full()) {
			setChanged();
			notifyObservers(new TTTMessage(TTTMessage.ACTIONS.FIELD_FULL));
		}

	}

	public void next() {
		player = (player + 1) % 2;
	}

	public TTTModel(TTTField field) {
		this.field = field;
	}

}
