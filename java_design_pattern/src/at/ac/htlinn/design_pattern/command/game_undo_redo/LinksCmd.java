package at.ac.htlinn.design_pattern.command.game_undo_redo;

public class LinksCmd implements CommandInterface {

	private Figur f;
	private int grad;

	public LinksCmd(Figur f, int grad) {
		this.f = f;
		this.grad = grad;
	}

	@Override
	public void ausfuehren() {
		f.links(grad);
	}

	@Override
	public void rueckgaengig() {
		f.rechts(grad);
	}

}
