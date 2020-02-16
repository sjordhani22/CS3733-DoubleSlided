package sp.model;

import java.awt.Color;

public class Tile {

	public int up;
	public int down;
	boolean flipped;
	Location location;
	Color tileColor;  

	/*
	 * Constructor 
	 */
	public Tile(int up, int down, boolean flipped, Location location, Color tileColor) {
		this.up = up;
		this.down = down;  
		this.flipped = flipped;
		this.location = location;
		this.tileColor = tileColor;
	}
	/*
	 * This is a setter for the location attribute with a given location as a parameter
	 */
	public void setLocation(Location loc) {
		location = loc;
	}
	  
	/*
	 * This is the getter for the up value of a tile
	 */
	public int getUp() {
		return this.up;
	}
	
	/*
	 * This is the setter for the up value with a given up value as a parameter
	 */
	public void setUpVal(int upVal) {
		up = upVal;
	}

	/*
	 * This is the getter for location
	 */
	public Location getLocation() {
		return location;
	}
  
	/*
	 * This is the setter for color with a given color as a parameter 
	 */
	public void setColor(Color color) {
		tileColor = color;
	}

	/*
	 * This is the getter for color 
	 */
	public Color getColor() {
		return tileColor;
	}

	/*
	 * This function will determine the color of the digit on the tile 
	 * If the tile is BLACK the digit will be white 
	 * If the tile is GRAY the digit will be black 
	 */
	public Color digitColor() {
		Color digColor = null;
		if (tileColor == Color.gray) {
			digColor = Color.black;
		} else {
			if (tileColor == Color.black) {
				digColor = Color.white;
			}

		}
		return digColor;
	}

	/*
	 * This will determine what the visible digit is on the tile
	 * It will always be the up value for the tile unless it is the empty tile on the board 
	 */
	public int visibleDigit() {
		if (up == ' ' || down == ' ') {
			return 0;
		} else {
			return up;
		}
	}
	
	/*
	 * This function will determine if the tile is flipped or not 
	 */
	public boolean isFlipped() {
		if (flipped) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * This function will take a Tile as a parameter and will return the same tile in the flipped postion 
	 */
	public Tile flipTile(Tile t) {

		int iniUp = t.up;
		int iniDown = t.down; 
		//We will set up to be down because we are always displaying the up value of the tile
		t.up = 5 - iniUp;
		t.down = 5 - iniDown;
		//We will update the flipped status 
		t.flipped = !flipped;
		//Location will remain the same   
		t.location = location;
		//And we will update the color of the tile
		if (t.tileColor == Color.black) {
			t.tileColor = Color.gray;
		} else if (t.tileColor == Color.gray) {
			t.tileColor = Color.black;
		} else if (t.tileColor == Color.yellow) {
			t.tileColor = Color.yellow;
		}
		return t;
	}
	
	/*
	 * This function is used in resetController to set a postion of the board to the tile with the given parameters 
	 */
	public void setInitial(Location loc, Color c, int num) {
	this.setUpVal(num);
	this.setLocation(loc);
	this.setColor(c);  
	}

}
