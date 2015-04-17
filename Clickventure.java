import java.util.Random;
import javax.swing.JFrame;

class Clickventure {
		
	// initialize some variables
	public static int clicks = 0;
	public static int clickPower = 1;
	public static int critChance = 25;
	public static int critPower = 3;

	public static int rollForCrit(int critChance)
	{
		Random rand = new Random();
		return rand.nextInt(critChance) + 1;
	}

	public static void setDamageIndicatorPos()
	{
		Random rand = new Random();
		int xPos = rand.nextInt(300) + 150;
		int yPos = rand.nextInt(200) + 75;
		Frame.damageIndicator.setLocation(xPos, yPos);
	}

	public static void main(String[] args)
	{
		// create an instance of my Frame class
		Frame frame = new Frame();
		// allow the window to be closed with the "x"
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set the size of the window
		frame.setSize(600, 400);
		// make the window visible
		frame.setVisible(true);
		// prevent the user from resizing the window
		frame.setResizable(false);

		// game loop
		while (true) {

			Frame.clickCounter.setText("Clicks: " + clicks);
			Frame.clickCounter.setSize(Frame.clickCounter.getPreferredSize());
		}
	}
}
