import javax.swing.*;


public class Carta 
{
	private int valorCarta;
	private ImageIcon imagenCarta;
	String path = "src/images/";
	
	Carta(int valorCarta, int i)
	{
		this.valorCarta = valorCarta;
		this.imagenCarta = new ImageIcon(path+valorCarta+"-"+i+".png");
	}

	public int getValorCarta() 
	{
		return valorCarta;
	}
	
	public void setValorCarta(int valorCarta) 
	{
		this.valorCarta = valorCarta;
	}
	
	public ImageIcon getImagenCarta() 
	{
		return imagenCarta;
	}
	
}
