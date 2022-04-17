package at.ac.htlinn.design_pattern.command.game_undo_redo;

public class Figur {
	public void vor(int meter) {
		System.out.println("Figur bewegt sich " + meter + "nach vor");
	}

	public void links(int grad) {
		System.out.println("Figur bewegt sich " + grad + "nach links");
	}

	public void rechts(int grad) {
		System.out.println("Figur bewegt sich " + grad + "nach rechts");
	}

	public void zurueck(int meter) {
		System.out.println("Figur bewegt sich " + meter + "zurueck");
	}
}
