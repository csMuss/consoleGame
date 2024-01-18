package consoleGame;

import java.awt.Color;

import javax.swing.JFrame;

public class GameMain {

	private static final int SCREEN_WIDTH = 800;
	private static final int SCREEN_HEIGHT = 600;
	
	// Defualt is black
	private Color playerBackColor = Color.BLACK;
	// Defualt is white
	private Color playerForeColor = Color.BLACK;
	
	public static void main(String args[]) {

		createJFrame();
		
	}
	
	private static void createJFrame() {
		JFrame frame = new JFrame("Console");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setResizable(false);
		// Adding a physics object
		Console con = new Console();
	    // DrawInfoText drawText = new DrawInfoText(physDemo);
		// Need new way of adding to frame, there can only be one.
		frame.add(con);
		frame.setVisible(true);
	}
	
	public Color getPlayerBackColor() {
		return playerBackColor;
	}
	
	public void setPlayerBackColor(Color newColor) {
		playerBackColor = newColor;
	}
	
	public Color getPlayerForeColor() {
		return playerForeColor;
	}
	
	public void setPlayerForeColor(Color newColor) {
		playerForeColor = newColor;
	}

}
