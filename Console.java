package consoleGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Console extends JPanel{
	
	public GameMain gm = new GameMain();
	private DrawText drawText;
	
	// Start at 200
	private int blinkBoxX = 200;
	// Start at 300
	private int blinkBoxY = 300;
	// Width and Height Stay the same
	private int blinkBoxWidth = 12;
	private int blinkBoxHeight = 19;
	
	/**
	 * Generaated WOW!
	 * 
	 */
	
	private static final long serialVersionUID = -6494835447206019533L;
	
	public Console() {
		this.drawText = new DrawText(this);
		setBackground(gm.getPlayerBackColor());
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		this.drawText.draw(g2);
		g2.fillRect(blinkBoxX, blinkBoxY, blinkBoxWidth, blinkBoxHeight);
	}

}
