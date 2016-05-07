import java.awt.*;

import javax.swing.*;


public class FondoMadera2 extends JPanel
{
	private static final long serialVersionUID = 1L;
	Image fondo;
	String path = "src/images/";
	
	public FondoMadera2()
	{
		fondo = new ImageIcon(path+"mesamadera.jpg").getImage();
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
	}
}
