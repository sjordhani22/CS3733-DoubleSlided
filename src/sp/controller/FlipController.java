package sp.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApplication;

public class FlipController extends MouseAdapter {
	Model model;
	DoubleSlidedApplication app;

	public FlipController(DoubleSlidedApplication app, Model m) {
		this.app = app;
		this.model = m;  
	}  

	@Override
	public void mousePressed(MouseEvent me) {  
		// System.out.println(me.getPoint());
		// System.out.println(model.getLocation(t));
		// System.out.println(model.getCol(model.getTile(model.thisTile(new Location
		// (me.getX() / 100, me.getY() / 100)))));
		// System.out.println(model.getRow(model.getTile(model.thisTile(new Location
		// (me.getX() / 100, me.getY() / 100)))));
		//System.out.println(model.thisTile(new Location (currX, currY)));


		//This will get the x and y coordinates for the tile that the user clicks on 
		int currX = (me.getX() / 100);  
		int currY = (me.getY() / 100);

		// FIRST ROW
		// Checks to see if user clicks on top left tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 0 && me.getX() <= 100 && me.getY() >= 0 && me.getY() <= 100) {
			//This tile can only move to the right and under 
			int rX = (me.getX() + 100) / 100;
			int rY = (me.getY() / 100);
			int loX = (me.getX() / 100);
			int loY = (me.getY() + 100) / 100;
			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborR = model.getTile(model.thisTile(new Location(rX, rY)));
			Tile neighborLo = model.getTile(model.thisTile(new Location(loX, loY)));

			if (neighborR.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborR.getLocation());
				neighborR.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborLo.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLo.getLocation());
				neighborLo.setLocation(new Location(currX, currY));
				model.incrementCounter();
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {

			}

			app.repaint();
		}

		// Checks to see if user clicks on top middle tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 100 && me.getX() <= 200 && me.getY() >= 0 && me.getY() <= 100) {
			//This tile can only move to the right, left, and under 
			int rX = (me.getX() + 100) / 100;
			int rY = (me.getY() / 100);
			int loX = (me.getX() / 100);
			int loY = (me.getY() + 100) / 100;
			int leX = (me.getX() - 100) / 100;
			int leY = (me.getY() / 100);

			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborR = model.getTile(model.thisTile(new Location(rX, rY)));
			Tile neighborLo = model.getTile(model.thisTile(new Location(loX, loY)));
			Tile neighborLe = model.getTile(model.thisTile(new Location(leX, leY)));

			if (neighborR.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborR.getLocation());
				neighborR.setLocation(new Location(currX, currY));
	 //If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborLo.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLo.getLocation());
				neighborLo.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborLe.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLe.getLocation());
				neighborLe.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {
			}

			app.repaint();

		}
		// Checks to see if user clicks on top right tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 200 && me.getX() <= 300 && me.getY() >= 0 && me.getY() <= 100) {
			//This tile can only move to the left and under 
			int loX = (me.getX()) / 100;
			int loY = (me.getY() + 100) / 100;
			int leX = (me.getX() - 100) / 100;
			int leY = (me.getY()) / 100;

			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));

			Tile neighborLo = model.getTile(model.thisTile(new Location(loX, loY)));
			Tile neighborLe = model.getTile(model.thisTile(new Location(leX, leY)));

			if (neighborLo.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLo.getLocation());
				neighborLo.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborLe.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLe.getLocation());
				neighborLe.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {
			}

			app.repaint();
		}
		// Checks to see if user clicks on middle left tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 0 && me.getX() <= 100 && me.getY() >= 100 && me.getY() <= 200) {
			//This tile can only move to the right, above, and under 
			int upX = me.getX() / 100;
			int upY = (me.getY() - 100) / 100;
			int rX = (me.getX() + 100) / 100;
			int rY = (me.getY() / 100);
			int loX = (me.getX() / 100);
			int loY = (me.getY() + 100) / 100;
			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborUp = model.getTile(model.thisTile(new Location(upX, upY)));
			Tile neighborR = model.getTile(model.thisTile(new Location(rX, rY)));
			Tile neighborLo = model.getTile(model.thisTile(new Location(loX, loY)));

			if (neighborR.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborR.getLocation());
				neighborR.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborLo.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLo.getLocation());
				neighborLo.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborUp.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborUp.getLocation());
				neighborUp.setLocation(new Location(currX, currY));
	//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {
			}

			app.repaint();

		}

		// Checks to see if user clicks on the center tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 100 && me.getX() <= 200 && me.getY() >= 100 && me.getY() <= 200) {
			//This tile can move all four directions
			int leX = (me.getX() - 100) / 100;
			int leY = (me.getY() / 100);
			int upX = me.getX() / 100;
			int upY = (me.getY() - 100) / 100;
			int rX = (me.getX() + 100) / 100;
			int rY = (me.getY() / 100);
			int loX = (me.getX() / 100);
			int loY = (me.getY() + 100) / 100;
			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborL = model.getTile(model.thisTile(new Location(leX, leY)));
			Tile neighborUp = model.getTile(model.thisTile(new Location(upX, upY)));
			Tile neighborR = model.getTile(model.thisTile(new Location(rX, rY)));
			Tile neighborLo = model.getTile(model.thisTile(new Location(loX, loY)));

			if (neighborR.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborR.getLocation());
				neighborR.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborLo.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLo.getLocation());
				neighborLo.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborUp.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborUp.getLocation());
				neighborUp.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborL.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborL.getLocation());
				neighborL.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {
			}

			app.repaint();
		}
		// Checks to see if user clicks on the middle right tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 200 && me.getX() <= 300 && me.getY() >= 100 && me.getY() <= 200) {
			//This tile can only move to the left, up, and under 
			int leX = (me.getX() - 100) / 100;
			int leY = (me.getY() / 100);
			int upX = me.getX() / 100;
			int upY = (me.getY() - 100) / 100;
			int loX = (me.getX() / 100);
			int loY = (me.getY() + 100) / 100;
			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborL = model.getTile(model.thisTile(new Location(leX, leY)));
			Tile neighborUp = model.getTile(model.thisTile(new Location(upX, upY)));
			Tile neighborLo = model.getTile(model.thisTile(new Location(loX, loY)));

			if (neighborLo.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborLo.getLocation());
				neighborLo.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborUp.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborUp.getLocation());
				neighborUp.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborL.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborL.getLocation());
				neighborL.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {
			}

			app.repaint();
		}

		// Checks to see if user clicks on the bottom left tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 0 && me.getX() <= 100 && me.getY() >= 200 && me.getY() <= 300) {
			//This tile can only move to the right and up 
			int upX = me.getX() / 100;
			int upY = (me.getY() - 100) / 100;
			int rX = (me.getX() + 100) / 100;
			int rY = (me.getY() / 100);

			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborUp = model.getTile(model.thisTile(new Location(upX, upY)));
			Tile neighborR = model.getTile(model.thisTile(new Location(rX, rY)));

			if (neighborR.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborR.getLocation());
				neighborR.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborUp.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborUp.getLocation());
				neighborUp.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			}

			else {
			}

			app.repaint();
		}

		// Checks to see if user clicks on the bottom middle tile 
		// We will make tiles for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 100 && me.getX() <= 200 && me.getY() >= 200 && me.getY() <= 300) {
			//This tile can only move to the right, up, and left 
			int leX = (me.getX() - 100) / 100;
			int leY = (me.getY() / 100);
			int upX = me.getX() / 100;
			int upY = (me.getY() - 100) / 100;
			int rX = (me.getX() + 100) / 100;
			int rY = (me.getY() / 100);

			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborL = model.getTile(model.thisTile(new Location(leX, leY)));
			Tile neighborUp = model.getTile(model.thisTile(new Location(upX, upY)));
			Tile neighborR = model.getTile(model.thisTile(new Location(rX, rY)));

			if (neighborR.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborR.getLocation());
				neighborR.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();

			} else if (neighborUp.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborUp.getLocation());
				neighborUp.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborL.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborL.getLocation());
				neighborL.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {
			}

			app.repaint();
		}
		// Checks to see if user clicks on bottom right tile 
		// We will make a tile for the appropriate places the tile can move and then check if they are yellow 
		if (me.getX() >= 200 && me.getX() <= 300 && me.getY() >= 200 && me.getY() <= 300) {
			//This tile can only move to the left and up 
			int leX = (me.getX() - 100) / 100;
			int leY = (me.getY() / 100);
			int upX = me.getX() / 100;
			int upY = (me.getY() - 100) / 100;

			Tile currTile = model.getTile(model.thisTile(new Location(currX, currY)));
			Tile neighborL = model.getTile(model.thisTile(new Location(leX, leY)));
			Tile neighborUp = model.getTile(model.thisTile(new Location(upX, upY)));

			if (neighborUp.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborUp.getLocation());
				neighborUp.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else if (neighborL.getColor() == Color.yellow) {
				currTile.flipTile(currTile);
				currTile.setLocation(neighborL.getLocation());
				neighborL.setLocation(new Location(currX, currY));
				//If this is the valid move it will flip the tile change locations above and increment the counter below
				model.incrementCounter();
				app.setCounterValue(String.valueOf(model.movesDone()));
				app.repaint();
			} else {
			}

			app.repaint();
		}

	}

	/*
	 * public boolean nearEmpty(MouseEvent me) { if((Math.floor((me.getX()/100)) +
	 * Math.floor((me.getY()/100))) + 1 == (model.getRow(model.getTile(8)) +
	 * model.getCol(model.getTile(8))) || (Math.floor((me.getX()/100)) +
	 * Math.floor((me.getY()/100))) - 1 == (model.getRow(model.getTile(8)) +
	 * model.getCol(model.getTile(8)))){ return true; } else return false; }
	 */

	/*
	 * public void switchPos(MouseEvent me, int tileNum) {
	 * 
	 * Tile click = model.getTile(thisTile(me)); Tile empty = model.getTile(8);
	 * 
	 * //tile that was clicked switches location with the empty tile
	 * click.setLocation(model.getLocation(model.getTile(8)));
	 * empty.setLocation(model.getLocation(model.getTile(tileNum))); app.repaint();
	 * }
	 * 
	 */

}
