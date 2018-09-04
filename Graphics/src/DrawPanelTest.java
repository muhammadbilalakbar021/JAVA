import javax.swing.Jframe;
public class DrawPanelTest {

	public static void main(String[] args) 
	{
		Drawpanel panel = new Drawpanel();
		Jframe application=new Jframe();
		
		application.setDefaultCloseOperation(JFrame,EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);
		
	}

}
