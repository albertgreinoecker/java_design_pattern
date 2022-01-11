package at.ac.htlinn.design_pattern.observer.ttt_mvc;

public class TTTGame {

	/**
	 * Entry point for the TTT-Game
	 */
	public static void main(String[] args) {
		TTTModel model = new TTTModel();
		TTTControl control = new TTTControl(model);
		TTTView view = new TTTView(model, control);
		view.setSize(600, 600);
		view.setVisible(true);

		TTTLogger logger = new TTTLogger(model);
		logger.setSize(600, 600);
		logger.setVisible(true);
	}
}
