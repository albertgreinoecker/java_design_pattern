package at.ac.htlinn.design_pattern.command.game_undo_redo;

public class MainGame {
	public static void main(String[] args) {
		CommandRecorder cmd = new CommandRecorder();

		Figur f1 = new Figur();

		VorCmd cmd1 = new VorCmd(f1, 10);
		cmd.ausfuehren(cmd1);

		LinksCmd cmd2 = new LinksCmd(f1, 90);
		cmd.ausfuehren(cmd2);

		cmd.undo();
		cmd.redo();
		cmd.undo();
		cmd.undo();
		cmd.undo();
	}
}
