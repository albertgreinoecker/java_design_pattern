package at.ac.htlinn.design_pattern.state.friend;

public class AngryState implements PersonState {

	private Friend friend;
	
	public AngryState(Friend friend) {
		this.friend = friend;
	}
	
	@Override
	public void talk() {
		System.out.println("GRRR!!");

	}

	@Override
	public void givePresent() {
		System.out.println("ok!!");
		friend.setState(new NeutralState(friend));

	}

	@Override
	public void annoy() {
		// TODO Auto-generated method stub

	}

}
