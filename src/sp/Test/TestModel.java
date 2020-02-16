package sp.Test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;

public class TestModel {
	Model m;
	Location here = new Location(0,0);
	Color black = Color.black;
	Tile blackTile = new Tile(1,2, false, here, black);
	
 
	  
	@Test   
	public void testGetRow() {  
		m = new Model();
		Tile tiles[] = new Tile[9];
		tiles[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);  
		tiles[1] = new Tile(4, 1, false, new Location(1, 0), Color.gray);
		tiles[2] = new Tile(3, 2, false, new Location(2, 0), Color.black);
		tiles[3] = new Tile(2, 3, false, new Location(0, 1), Color.gray);
		tiles[4] = new Tile(1, 4, false, new Location(1, 1), Color.gray); 
		tiles[5] = new Tile(2, 3, false, new Location(2, 1), Color.black);
		tiles[6] = new Tile(3, 2, false, new Location(0, 2), Color.gray);
		tiles[7] = new Tile(4, 1, false, new Location(1, 2), Color.gray);
		tiles[8] = new Tile(' ', ' ', false, new Location(2, 2), Color.yellow); 
		assertEquals(m.getRow(tiles[0]), 0);
		assertEquals(m.getTile(0).up, 1);
		assertEquals(m.getTile(1).digitColor(), Color.black);
	}
	
	@Test 
	public void testGetCol() {  
		m = new Model();
		Tile tiles[] = new Tile[9];
		tiles[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);  
		tiles[1] = new Tile(4, 1, false, new Location(1, 0), Color.gray);
		tiles[2] = new Tile(3, 2, false, new Location(2, 0), Color.black);
		tiles[3] = new Tile(2, 3, false, new Location(0, 1), Color.gray);
		tiles[4] = new Tile(1, 4, false, new Location(1, 1), Color.gray); 
		tiles[5] = new Tile(2, 3, false, new Location(2, 1), Color.black);
		tiles[6] = new Tile(3, 2, false, new Location(0, 2), Color.gray);
		tiles[7] = new Tile(4, 1, false, new Location(1, 2), Color.gray);
		tiles[8] = new Tile(' ', ' ', false, new Location(2, 2), Color.yellow); 
		assertEquals(m.getCol(tiles[0]), 0);
	}
	
	@Test 
	public void testGetUp() {  
		m = new Model();
		Tile tiles[] = new Tile[9];
		tiles[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);  
		tiles[1] = new Tile(4, 1, false, new Location(1, 0), Color.gray);
		tiles[2] = new Tile(3, 2, false, new Location(2, 0), Color.black);
		tiles[3] = new Tile(2, 3, false, new Location(0, 1), Color.gray);
		tiles[4] = new Tile(1, 4, false, new Location(1, 1), Color.gray); 
		tiles[5] = new Tile(2, 3, false, new Location(2, 1), Color.black);
		tiles[6] = new Tile(3, 2, false, new Location(0, 2), Color.gray);
		tiles[7] = new Tile(4, 1, false, new Location(1, 2), Color.gray);
		tiles[8] = new Tile(' ', ' ', false, new Location(2, 2), Color.yellow); 
		assertEquals(m.getUp(tiles[0]), 1);
	}
	
	@Test 
	public void testGetDown() {  
		m = new Model();
		Tile tiles[] = new Tile[9];
		tiles[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);  
		tiles[1] = new Tile(4, 1, false, new Location(1, 0), Color.gray);
		tiles[2] = new Tile(3, 2, false, new Location(2, 0), Color.black);
		tiles[3] = new Tile(2, 3, false, new Location(0, 1), Color.gray);
		tiles[4] = new Tile(1, 4, false, new Location(1, 1), Color.gray); 
		tiles[5] = new Tile(2, 3, false, new Location(2, 1), Color.black);
		tiles[6] = new Tile(3, 2, false, new Location(0, 2), Color.gray);
		tiles[7] = new Tile(4, 1, false, new Location(1, 2), Color.gray);
		tiles[8] = new Tile(' ', ' ', false, new Location(2, 2), Color.yellow); 
		assertEquals(m.getDown(tiles[0]), 4);
	}
	
	@Test 
	public void testGetLocation() {  
		m = new Model();
		Tile tiles[] = new Tile[9];
		tiles[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);  
		tiles[1] = new Tile(4, 1, false, new Location(1, 0), Color.gray);
		tiles[2] = new Tile(3, 2, false, new Location(2, 0), Color.black);
		tiles[3] = new Tile(2, 3, false, new Location(0, 1), Color.gray);
		tiles[4] = new Tile(1, 4, false, new Location(1, 1), Color.gray); 
		tiles[5] = new Tile(2, 3, false, new Location(2, 1), Color.black);
		tiles[6] = new Tile(3, 2, false, new Location(0, 2), Color.gray);
		tiles[7] = new Tile(4, 1, false, new Location(1, 2), Color.gray);
		tiles[8] = new Tile(' ', ' ', false, new Location(2, 2), Color.yellow); 
		assertEquals(m.getLocation(tiles[0]).row, 0);
		assertEquals(m.getLocation(tiles[0]).col, 0);
	}  
	
	@Test 
	public void testGetColor() {  
		m = new Model();
		Tile tiles[] = new Tile[9];
		tiles[0] = new Tile(1, 4, false, new Location(0, 0), Color.gray);  
		tiles[1] = new Tile(4, 1, false, new Location(1, 0), Color.gray);
		tiles[2] = new Tile(3, 2, false, new Location(2, 0), Color.black);
		tiles[3] = new Tile(2, 3, false, new Location(0, 1), Color.gray);
		tiles[4] = new Tile(1, 4, false, new Location(1, 1), Color.gray); 
		tiles[5] = new Tile(2, 3, false, new Location(2, 1), Color.black);
		tiles[6] = new Tile(3, 2, false, new Location(0, 2), Color.gray);
		tiles[7] = new Tile(4, 1, false, new Location(1, 2), Color.gray);
		tiles[8] = new Tile(' ', ' ', false, new Location(2, 2), Color.yellow); 
		assertEquals(m.getColor(tiles[0]), Color.gray);
		
	}
	 
	@Test 
	public void testIncrementAndMoves() {    
		m = new Model();  
		m.incrementCounter();
		assertEquals(m.movesDone(), 1);
	}
	
	
	@Test
	public void testReset() {
		m = new Model(); 
		int moves = 5;
		m.resetCount();
		assertEquals(m.movesDone(), 0);
		}  
	
	@Test 
	public void testGetFlipped() {  
		m = new Model();
		assertFalse(m.getFlipped(blackTile));
	}
	
	@Test  
	public void testThisTile() {
		Tile t = new Tile (' ', ' ', false, new Location(0,0),Color.yellow);
		Model m = new Model();
		t.setColor(Color.black);
		Location posTwo = new Location(1,0);
		assertEquals(m.thisTile(posTwo),1);
	}

}
