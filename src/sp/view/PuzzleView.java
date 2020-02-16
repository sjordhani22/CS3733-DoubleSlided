package sp.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import sp.model.Location;
import sp.model.Model;
import sp.model.Tile;

public class PuzzleView extends JPanel {
	Model model = new Model();

	/**
	 * Create the panel.
	 */
	public PuzzleView(Model model) {
		this.model = model;
	}

	@Override
	public void paintComponent(Graphics g) {
		// Use this to chage the color
		// g.setColor(Color.magenta);
		// Use this to change the font
		g.setFont(new Font("Times New Roman", 50, 50));
		// g.drawString("Hello", 100, 100);  
		// Used to convert an int into a string so that you can print it out
		// g.drawString("" +18, 100, 100);

		if (model == null) {
			return;
		}

		for (int j = 0; j < 9; j++) {
			Tile t = model.getTile(j);
			int dig = t.visibleDigit();
			Location loc = t.getLocation();
			int x = 100 * loc.row;
			int y = 100 * loc.col;
			g.setColor(t.getColor());
			g.fillRect(x, y, 98, 98);
			g.setColor(t.digitColor());
			g.drawString("" + dig, x + 35, y + 70);

		}
	}
}
