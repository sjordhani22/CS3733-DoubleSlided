package sp.Test;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;

import org.junit.Test;

import sp.controller.FlipController;
import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;
import sp.view.DoubleSlidedApplication;

public class TestFlipController {

 
	
	@Test
	public void test() {
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
		MouseEvent click;
		MouseEvent clickTwo;
		MouseEvent clickThree;
		MouseEvent clickFour;
		MouseEvent clickFive;
		MouseEvent clickSix;
		MouseEvent clickSeven;
		MouseEvent clickEight;
		MouseEvent clickNine;
		MouseEvent clickTen;
		Model m = new Model();
		DoubleSlidedApplication app = new DoubleSlidedApplication(m);
		FlipController flip = new FlipController(app, m);
		
		click = new MouseEvent(app, MouseEvent.MOUSE_CLICKED,   
				System.currentTimeMillis(), 0, 150, 250, 1, false);
		clickTwo = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 50, 250, 1, false);
		clickThree = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 50, 150, 1, false);
		clickFour = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 50, 50, 1, false);
		clickFive = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 150, 50, 1, false);
		clickSix = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 250, 50, 1, false);
		clickSeven = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 250, 150, 1, false);
		clickEight = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 150, 150, 1, false);
		clickNine = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 50, 150, 1, false);
		clickTen = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 50, 250, 1, false);
		MouseEvent clickBR = new MouseEvent(app, MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 0, 250, 250, 1, false);
		MouseEvent thisOne = click;  
		assertEquals(thisOne, click);  
		flip.mousePressed(click);
		assertEquals(m.getLocation(m.getTile(8)).row, 1);
		assertEquals(m.getLocation(m.getTile(8)).col, 2);
		flip.mousePressed(clickTwo);
		assertEquals(m.getLocation(m.getTile(8)).row, 0);
		assertEquals(m.getLocation(m.getTile(8)).col, 2);
		flip.mousePressed(clickThree);
		assertEquals(m.getLocation(m.getTile(8)).row, 0);
		assertEquals(m.getLocation(m.getTile(8)).col, 1);
		flip.mousePressed(clickFour);
		assertEquals(m.getLocation(m.getTile(8)).row, 0);
		assertEquals(m.getLocation(m.getTile(8)).col, 0);
		flip.mousePressed(clickFive);
		assertEquals(m.getLocation(m.getTile(8)).row, 1);
		assertEquals(m.getLocation(m.getTile(8)).col, 0);
		flip.mousePressed(clickSix);
		assertEquals(m.getLocation(m.getTile(8)).row, 2);
		assertEquals(m.getLocation(m.getTile(8)).col, 0);
		flip.mousePressed(clickSeven);
		assertEquals(m.getLocation(m.getTile(8)).row, 2);
		assertEquals(m.getLocation(m.getTile(8)).col, 1);
		flip.mousePressed(clickEight);
		assertEquals(m.getLocation(m.getTile(8)).row, 1);
		assertEquals(m.getLocation(m.getTile(8)).col, 1);
		flip.mousePressed(clickNine);
		assertEquals(m.getLocation(m.getTile(8)).row, 0);
		assertEquals(m.getLocation(m.getTile(8)).col, 1);
		flip.mousePressed(clickTen);
		assertEquals(m.getLocation(m.getTile(8)).row, 0);  
		assertEquals(m.getLocation(m.getTile(8)).col, 2);
		flip.mousePressed(click);
		assertEquals(m.getLocation(m.getTile(8)).row, 1);  
		assertEquals(m.getLocation(m.getTile(8)).col, 2);
		flip.mousePressed(clickEight);
		assertEquals(m.getLocation(m.getTile(8)).row, 1);  
		assertEquals(m.getLocation(m.getTile(8)).col, 1);
		flip.mousePressed(clickSeven);
		assertEquals(m.getLocation(m.getTile(8)).row, 2);    
		assertEquals(m.getLocation(m.getTile(8)).col, 1);
		flip.mousePressed(clickSeven);
		assertEquals(m.getLocation(m.getTile(8)).row, 2);  
		assertEquals(m.getLocation(m.getTile(8)).col, 1);
		flip.mousePressed(clickBR);
		assertEquals(m.getLocation(m.getTile(8)).row, 2);  
		assertEquals(m.getLocation(m.getTile(8)).col, 2);
		
		
		
  
		assertNotEquals(click, clickTwo);
	}

	
}
