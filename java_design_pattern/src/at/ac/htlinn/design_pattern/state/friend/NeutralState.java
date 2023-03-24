package at.ac.htlinn.design_pattern.state.friend;

public class NeutralState implements PersonState {

	private Friend friend;
	
	
	public NeutralState(Friend friend) {
		this.friend = friend;
	}

	@Override
	public void talk() {
		System.out.println("Hi");

	}

	@Override
	public void givePresent() {
		System.out.println("Hihi :-)");
		friend.setState(new FriendlyState(friend)); 

	}

	@Override
	public void annoy() {
		System.out.println("hmm getting angry :-)");
		friend.setState(new AngryState(friend));

	}

}
