package consoleGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Console extends JPanel{
	
	private GameMain gm = new GameMain();
	private DrawText drawText;
	
	/**
	 * Generaated WOW!
	 * 
	 */
	
	private static final long serialVersionUID = -6494835447206019533L;
	
	public Console() {
		setBackground(gm.getPlayerBackColor());
		setBackground(Color.BLACK);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
	}

}
