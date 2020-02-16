package sp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import sp.controller.QuitController;  
import sp.model.Model;
import sp.view.DoubleSlidedApplication;

public class Launcher {
	public static void main(String[] args) {
		
		Model m = new Model();
		
		DoubleSlidedApplication dsa = new DoubleSlidedApplication(m);
		dsa.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				new QuitController(dsa).process();
			}
		});
		dsa.setVisible(true);
		}
}  

