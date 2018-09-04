import java.awt.Graphics;
import javax.swing.JPanel;

public class Drawpanel extends JPanel 
{
	public void paintComponenet(Graphics g)
	{
		super.paintComponent(g);
		int width=getWidth();
		int height=getHeight();
		
		g.drawLine(0, 0,width, height);
		g.drawLine(0,width, height,0);
	}
}
