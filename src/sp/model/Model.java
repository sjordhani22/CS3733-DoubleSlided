package sp.model;

import java.awt.Color;

//This is the top-level entity that has access to all other entities 
public class Model {

	Tile tiles[] = new Tile[9];
	int moveCount = 0;
  
	/*
	 * Constructor 
	 */  
	public Model() {
  
		//Here we are instantiating the initial configuration of the board 
		
		tiles[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);  
		tiles[1] = new Tile(4, 1, false, new Location(1, 0), Color.gray);
		tiles[2] = new Tile(3, 2, false, new Location(2, 0), Color.black);
		tiles[3] = new Tile(2, 3, false, new Location(0, 1), Color.gray);
		tiles[4] = new Tile(1, 4, false, new Location(1, 1), Color.gray);
		tiles[5] = new Tile(2, 3, false, new Location(2, 1), Color.black);
		tiles[6] = new Tile(3, 2, false, new Location(0, 2), Color.gray);
		tiles[7] = new Tile(4, 1, false, new Location(1, 2), Color.gray); 
		tiles[8] = new Tile(' ', ' ', false, new Location(2, 2), Color.yellow);  

	}

	/*
	 * This is the function that we will use in flipController that return the tile with the given number 
	 */
	public Tile getTile(int j) {
		return tiles[j];
	}

	/*
	 * Function returns the row for the given tile 
	 */
	public int getRow(Tile t) {
		return t.location.row;
	}

	/*
	 * Function return the column for the given tile 
	 */
	public int getCol(Tile t) {
		return t.location.col;
	}

	/*
	 * Function gives model access to get the up value 
	 */
	public int getUp(Tile t) {
		return t.up;
	}

	/*
	 * Function gives model access to get the down value 
	 */
	public int getDown(Tile t) {
		return t.down;
	}

	/*
	 * Function gives model access to get the flipped value 
	 */
	public boolean getFlipped(Tile t) {
		return t.flipped;
	}

	/*
	 * Function gives model access to get the Location
	 */
	public Location getLocation(Tile t) {
		return t.location;
	}

	/*
	 * Function gives model access to get the color  
	 */
	public Color getColor(Tile t) {
		return t.tileColor;
	}


	/*
	 * Function will be used in flipController in order to tell the program which tile is in this current location
	 */
	public int thisTile(Location loc) {  
		
		for(int i = 0; i <= 8; i++) {
			if(tiles[i].location.row == loc.row && tiles[i].location.col == loc.col) {
				return i;  
			}
		}    
		return 100;
}
	
	/*
	 * This function will return the moveCount that keeps track of the moves done so far in the game 
	 */
	public int movesDone() {
		return this.moveCount;
	}
	
	/*
	 * This function will update the counter by 1
	 */
	public void incrementCounter() {
		this.moveCount += 1;
	}
	
	/*
	 * This function will reset the counter 
	 */
	public void resetCount() {
		this.moveCount = 0;
	}

}

