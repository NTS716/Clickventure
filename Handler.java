import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Handler implements ActionListener {
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == Frame.clickButton) {
			Frame.damageIndicator.setVisible(false);
			// check if it's a critical hit or not
			if (Clickventure.rollForCrit(Clickventure.critChance) == 1) {
				//if it is, deal critDamage
				Clickventure.clicks += Clickventure.clickPower * Clickventure.critPower;
				Frame.damageIndicator.setText("+" + Clickventure.clickPower * Clickventure.critPower);
				Frame.damageIndicator.setForeground(Color.RED);
			}

			else {
				//otherwise, deal normal damage
				Clickventure.clicks += Clickventure.clickPower;
				Frame.damageIndicator.setText("+" + Clickventure.clickPower);
				Frame.damageIndicator.setForeground(Color.GREEN);
			}
			Frame.damageIndicator.setSize(Frame.damageIndicator.getPreferredSize());
			Clickventure.setDamageIndicatorPos();
			Frame.damageIndicator.setVisible(true);
		}
	}
}
