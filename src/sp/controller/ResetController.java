package sp.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sp.model.Location;
import sp.model.Model;
import sp.view.DoubleSlidedApplication;

public class ResetController extends MouseAdapter {

	Model model;
	DoubleSlidedApplication app;


	public ResetController(Model m, DoubleSlidedApplication a) {
		this.model = m;
		this.app = a;
	}  


	public void mousePressed(MouseEvent me) {
		//This is the initial configuration for the game 
		//setInitial will find the tile with those attributes and put it in the correct postion 
		model.getTile(0).setInitial(new Location(0,0), Color.gray, 1);
		model.getTile(1).setInitial(new Location(1,0), Color.gray, 4);
		model.getTile(2).setInitial(new Location(2,0), Color.black, 3);
		model.getTile(3).setInitial(new Location(0,1), Color.gray, 2);
		model.getTile(4).setInitial(new Location(1,1), Color.gray, 1);
		model.getTile(5).setInitial(new Location(2,1), Color.black, 2);
		model.getTile(6).setInitial(new Location(0,2), Color.gray, 3);
		model.getTile(7).setInitial(new Location(1,2), Color.gray, 4);
		model.getTile(8).setInitial(new Location(2,2), Color.yellow, ' ');

		//We will reset the count and set the counter to be zero 
		model.resetCount();
		app.setCounterValue(String.valueOf(model.movesDone()));
		//And we will refresh the display
		app.repaint();
	

	}
}