import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Frame extends JFrame {

	public static String[] tabs;
	public static JComboBox<String> tabSelector; 
	public static JLabel clickCounter;
	public static JSeparator topSeparator;
	public static Font buttonFont;
	public static JButton clickButton;
	public static Font damageFont;
	public static JLabel damageIndicator;

	Frame()
	{
		// set the title of the window
		super("Clickventure");
		// set the layout manager
		setLayout(null);

		// create the array the tabSelector will use
		tabs = new String[1];
		// add the items to the array
		tabs[0] = "Main";
		// create the tabSelector using the tabs array
		tabSelector = new JComboBox<String>(tabs);
		// set the attributes of the tabSelecor
		tabSelector.setSize(100,25);
		tabSelector.setLocation(10,10);

		// create the clickCounter
		clickCounter = new JLabel("");
		// set the attributes of the clickCounter
		clickCounter.setLocation(125,15);

		// create the topSeparator
		topSeparator = new JSeparator();
		// set the attributes of the topSeparator
		topSeparator.setSize(585, 5);
		topSeparator.setLocation(5,40);	

		// create the font the clickButton will use
		buttonFont = new Font("Arial", Font.PLAIN, 45);
		// create the clickButton
		clickButton = new JButton("Click");
		//set the attributes of the clickButton
		clickButton.setSize(150,100);
		clickButton.setLocation(225,150);
		clickButton.setFont(buttonFont);
		clickButton.setFocusPainted(false);

		// create the font the damageIndicator will use
		damageFont = new Font("Arial", Font.BOLD, 20);
		// create the damageIndicator
		damageIndicator = new JLabel("");
		// set the attributes of the damageIndicator
		damageIndicator.setFont(damageFont);

		// add the components to the Frame
		add(tabSelector);	
		add(clickCounter);
		add(topSeparator);
		add(damageIndicator);
		add(clickButton);

		//add the Handler to the components
		clickButton.addActionListener(new Handler());
	}
}
