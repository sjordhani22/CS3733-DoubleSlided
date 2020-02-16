package sp.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApplication;

public class WinLossController extends MouseAdapter {

	Model model;  
	DoubleSlidedApplication app;
	Tile[] winning = new Tile[9];

	public WinLossController(DoubleSlidedApplication app, Model m) {
		this.app = app;  
		this.model = m;
		
		//Here we will globally create an array of tiles that will represent the winning configuration of the board 
		//We create this globally because it will not change
		winning[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);
		winning[1] = new Tile(2, 3, false, new Location(1, 0), Color.gray);  
		winning[2] = new Tile(3, 2, false, new Location(2, 0), Color.gray);
		winning[3] = new Tile(4, 1, false, new Location(0, 1), Color.black);
		winning[4] = new Tile(' ', ' ', false, new Location(1, 1), Color.yellow);
		winning[5] = new Tile(4, 1, false, new Location(2, 1), Color.gray);
		winning[6] = new Tile(3, 2, false, new Location(0, 2), Color.black);
		winning[7] = new Tile(2, 3, false, new Location(1, 2), Color.black);
		winning[8] = new Tile(1, 4, false, new Location(2, 2), Color.black);
	}
	
	@Override
	/* This method is the built-in mousePressed function that will control the status of the game being played.
	 * It will check with every user move to see if the user has won, lost, or if they're still playing. 
	 */
	public void mousePressed(MouseEvent me) {
		// We will create a new array of tiles locally to update every time the user makes a move (clicks) 
		Tile[] current = new Tile[9];
		current[0] = model.getTile(model.thisTile(new Location(0, 0)));
		current[1] = model.getTile(model.thisTile(new Location(1, 0)));
		current[2] = model.getTile(model.thisTile(new Location(2, 0)));
		current[3] = model.getTile(model.thisTile(new Location(0, 1)));
		current[4] = model.getTile(model.thisTile(new Location(1, 1)));
		current[5] = model.getTile(model.thisTile(new Location(2, 1)));
		current[6] = model.getTile(model.thisTile(new Location(0, 2)));
		current[7] = model.getTile(model.thisTile(new Location(1, 2)));
		current[8] = model.getTile(model.thisTile(new Location(2, 2)));

		//Here we are comparing the winning configuration to our current configuration to see if the user has won
		if (sameTile(0, current) && sameTile(1, current) && sameTile(2, current) && sameTile(3, current)
				&& sameTile(4, current) && sameTile(5, current) && sameTile(6, current) && sameTile(7, current)
				&& sameTile(8, current)) {
			System.out.println("You won!!!!");
			//This will disable the panel once the user has won 
			app.setEnabled(false); 
		}
		//This is a helper function that will check to see if the user has lost (board is in losing configuration) 
		else if(hasLost(current)){
			System.out.println("You lost! Don't give up, quit the application and try again!");
			//This will disable the panel once the user has won 
			app.setEnabled(false);  

		}
		//If the user has not won or lost, this message will print to the console and they may keep playing 
		else 		
			System.out.println("Dont give up, keep going!");

	}

	/*
	 * This function will compare an array of tiles to the winning configuration to determine if the board is in a 
	 * winning state
	 * @param int x -- This is the number of the tile in the array we are checking 
	 * @param Tile [] current -- This is the array of tiles we are comparing to the winning array 
	 * @return boolean True if the states are the same 
	 * 					False other wise 
	 */
	public boolean sameTile(int x, Tile[] current) {
		//We only need to compare the up and color values between the tiles because we have already set the locations 
		//to be equal in the instantiation. Also there can be many different tiles in certain postions so as long 
		//as the tiles up and color match (visually) then the states are the same
		if (winning[x].getUp() == current[x].getUp() && winning[x].getColor() == current[x].getColor()) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * This function will determine if the current state of the board is in a losing configuration
	 * @param Tile[] current -- The array of tiles which we will check to see if it is in a losing state 
	 * @return boolean  True if the board state is in a losing configuration 
	 * 					False otherwise 
	 */
	public boolean hasLost(Tile[] current) {
		// These are counters for the up values in the current state 
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
	    
		for(int i = 0; i < 9; i++) {
			if(current[i].up == 1) {
				oneCount += 1;
			}
			else if(current[i].up == 2) {
				twoCount += 1;
			}
			else if(current[i].up == 3) {
				threeCount += 1;
			}
			else if(current[i].up == 4) {
				fourCount += 1;
			}
			
		}
		//The rules say if a player has 4 pieces of the same number on the board then they have lost 
		if(oneCount > 3 || twoCount > 3 || threeCount > 3 || fourCount > 3) {
			return true;
		}
		else return false;
		
	}

}
