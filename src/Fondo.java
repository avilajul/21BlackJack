import java.awt.*;
import javax.swing.*;

public class Fondo extends JPanel
{
	private static final long serialVersionUID = 1L;
	Image fondo;
	String path = "src/images/";
	
	public Fondo()
	{
		fondo = new ImageIcon(path+"mesa.gif").getImage();
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
	}
}
