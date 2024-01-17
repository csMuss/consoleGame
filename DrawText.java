package consoleGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawText {
	
	private Console console; // Reference to console
	
	public DrawText(Console console) {
        this.console = console;
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.black);
        g2.setColor(new Color(255, 191, 0));

    }
}
