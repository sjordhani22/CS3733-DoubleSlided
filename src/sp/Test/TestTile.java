package sp.Test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;

public class TestTile {

	public Model m;
	Tile empty = new Tile(' ', ' ', false, null, null);
	Tile test = new Tile(1, 1, false, null, null);
	Location here = new Location(0, 0);
	Color black = Color.black;
	Color gray = Color.gray;
	Tile blackTile = new Tile(1, 2, false, here, black);
	Tile grayTile = new Tile(2, 1, true, here, gray);

	@Test
	public void testUp() {
		Model m;

		test.up = 2;
		assertEquals(test.up, 2);
	}

	@Test
	public void testDown() {
		Model m;
		test.down = 2;
		assertEquals(test.down, 2);
	}

	@Test
	public void testLocation() {
		Model m;
		test.setLocation(here);
		assertEquals(test.getLocation(), here);
	}

	@Test
	public void testColor() {
		Model m;
		test.setColor(black);
		assertEquals(test.getColor(), black);
	}

	@Test
	public void testSetUp() {
		Model m;
		test.setUpVal(4);
		assertEquals(test.up, 4);
	}

	@Test
	public void testNullDigColor() {
		Model m;
		assertEquals(test.digitColor(), null);
	}

	@Test
	public void testWhiteDigColor() {
		Model m;
		assertEquals(blackTile.digitColor(), Color.white);
	}

	@Test
	public void testBlackDigColor() {
		Model m;
		assertEquals(grayTile.digitColor(), Color.black);
	}

	@Test
	public void testEmptyVisibleDig() {
		Model m;
		assertEquals(empty.visibleDigit(), 0);
	}

	@Test
	public void testVisibleDig() {
		Model m;
		assertEquals(test.visibleDigit(), 1);
	}

	@Test
	public void testFlipped() {
		Model m;
		assertEquals(blackTile.isFlipped(), false);
	}
  
	@Test
	public void testNotFlipped() {
		Model m;
		assertEquals(grayTile.isFlipped(), true);
	}

	@Test
	public void testFlipTile() {
		Tile t = new Tile(1, 4, false, new Location(0, 0), Color.black);

		t.flipTile(t);
		assertEquals(t.getUp(), 4);
		assertEquals(t.down, 1);
		assertEquals(t.isFlipped(), true);
		assertEquals(t.getLocation().row, 0);
		assertEquals(t.getLocation().col, 0);
		assertEquals(t.getColor(), Color.gray);
		t.flipTile(t);
		assertEquals(t.getUp(), 1);
		assertEquals(t.down, 4);
		assertEquals(t.isFlipped(), false);
		assertEquals(t.getLocation().row, 0);
		assertEquals(t.getLocation().col, 0);
		assertEquals(t.getColor(), Color.black);
		t.setColor(Color.yellow);
		t.flipTile(t);
		assertEquals(t.getColor(), Color.yellow);
	}

}
