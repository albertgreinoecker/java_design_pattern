package at.ac.htlinn.design_pattern.observer.ttt_mvc;

public class TTTMessage {
	enum ACTIONS {
		NOTIFY, CELL_SET, FIELD_OCCUPIED, WON, FIELD_FULL
	};

	ACTIONS action;
	int pos;

	public TTTMessage(ACTIONS action) {
		this(action, 0);
	}

	public TTTMessage(ACTIONS action, int pos) {
		this.action = action;
		this.pos = pos;
	}

	public ACTIONS getAction() {
		return action;
	}

	public void setAction(ACTIONS action) {
		this.action = action;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	@Override
	public String toString() {
		return "ACTION:" + action + "| POS:" + pos;
	}

}
