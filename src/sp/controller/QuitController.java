package sp.controller;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class QuitController {


	JFrame app;

	public QuitController(JFrame app) {

		this.app = app;

	}

	public void process() {
		int c = JOptionPane.showConfirmDialog(app, "Would you like to exit the application?");
		if (c == JOptionPane.OK_OPTION) {
			app.setVisible(false);
			app.dispose();
		}
	}
}

