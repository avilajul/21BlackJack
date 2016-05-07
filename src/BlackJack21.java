import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class BlackJack21 
{
	static private String path = "src/images/";
	public static void main(String[] args) 
	{
		Interfaz interfaz = new Interfaz();
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz.setIconImage(new ImageIcon(path + "icono.gif").getImage());
	}

}
