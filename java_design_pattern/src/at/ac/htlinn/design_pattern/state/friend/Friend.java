package at.ac.htlinn.design_pattern.state.friend;

/**
 * @author albert This would be a solution WITHOUT using a State Pattern Too
 *         much if or switch, too much extension necessary when adding a new
 *         state
 */
public class Friend {
	enum STATE {
		NEUTRAL, ANGRY, FRIENDLY
	}

	private STATE currentState;

	public void talk() {
		switch (currentState) {
		case NEUTRAL:
			// Neutral specific behaviour
			System.out.println("Hi");
			break;
		case ANGRY:
			System.out.println("GRRR!!");
			break;
		case FRIENDLY:
			System.out.println("Hihi!!");
		}
	}

	public void givePresent() {
		switch (currentState) {
		case NEUTRAL:
			System.out.println("Hihi :-)");
			currentState = STATE.FRIENDLY; // State switched!
			break;
		case ANGRY:
			System.out.println("ok!!");
			currentState = STATE.NEUTRAL;
			break;
		case FRIENDLY:
			System.out.println("Hihi!!");
		}
	}

	public void annoy() {
		switch (currentState) {
		case NEUTRAL:
			System.out.println("hmm getting angry :-)");
			currentState = STATE.ANGRY; // State switched!
			break;
		case ANGRY:
			System.out.println("GRRR!! - still angry");
			break;
		case FRIENDLY:
			System.out.println("hmm getting angry :-)");
			currentState = STATE.ANGRY; // State switched!
		}
	}
}
