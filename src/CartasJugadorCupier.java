import java.util.Vector;

import javax.swing.JOptionPane;

public class CartasJugadorCupier 
{
	Vector<Carta> cartasJugadorCupier = new Vector<Carta>(1,1);
	
	public CartasJugadorCupier()
	{
		
	}
	
	public void setCarta(Carta c)
	{
		cartasJugadorCupier.addElement(c);
	}
	
	public Carta getCarta(int i)
	{
		Carta c;
		c = cartasJugadorCupier.get(i);
		return c;
	}
	
	public int CalcularTotal()
	{

		int total = 0;
		for (int i = 0; i < cartasJugadorCupier.size(); i++) 
		{
			total += (cartasJugadorCupier.get(i)).getValorCarta();			
		}
		return total;
	}
	
	public int calcularTamano()
	{
		int tamano;
		tamano = cartasJugadorCupier.size();
		return tamano;
		
	}
	
	public void reiniciar()
	{
		cartasJugadorCupier.removeAllElements();
	}
	
	public void cambiarValorAs(int n)
	{
		Object[] valores = { " [1] Uno ", " [11] Once" }; 
		
		if(cartasJugadorCupier.get(n).getValorCarta() == 1)
		{
			if(JOptionPane.showOptionDialog(null, "Que valor Desea Asignar A La Carta", "BlackJack 21", 
					                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					                        cartasJugadorCupier.get(n).getImagenCarta(), 
					                        valores, valores[0]) == 0)
			{
				cartasJugadorCupier.get(n).setValorCarta(1);
			}
			else
			{
				cartasJugadorCupier.get(n).setValorCarta(11);
			}
		}
	}
}

