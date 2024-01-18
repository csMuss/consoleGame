package consoleGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawText {
	
	private Console console; // Reference to console
	
	public DrawText(Console console) {
        this.console = console;
    }

    @SuppressWarnings("static-access")
	public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(0, 0, console.gm.getScreenWidth(), 25);
        g2.setColor(Color.WHITE);
        g2.drawString("BRD OS", 0, 16);
    }
}
