package at.ac.htlinn.design_pattern.state.friend;

public class FriendlyState implements PersonState {
	private Friend friend;
		
	public FriendlyState(Friend friend) {
		this.friend = friend;
	}

	@Override
	public void talk() {
		System.out.println("Hihi!!");

	}

	@Override
	public void givePresent() {
		System.out.println("Hihi!!");

	}

	@Override
	public void annoy() {
		System.out.println("hmm getting angry :-)");
		friend.setState(new AngryState(friend));

	}

}
