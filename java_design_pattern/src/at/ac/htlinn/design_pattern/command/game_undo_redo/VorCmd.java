package at.ac.htlinn.design_pattern.command.game_undo_redo;

public class VorCmd implements CommandInterface {

	private Figur f;
	private int meter;

	public VorCmd(Figur f, int meter) {
		this.f = f;
		this.meter = meter;
	}

	@Override
	public void ausfuehren() {
		f.vor(meter);
	}

	@Override
	public void rueckgaengig() {
		f.vor(-meter);
	}

}
