import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel efectivo, apuesta, jugador, cupier, mensajes, cartaTapadaJugador, cartaTapadaCupier; 
	JLabel carta2, carta3, carta4, carta5, carta6, carta7, carta8, carta9, carta10, carta11;
	JLabel cartaCup2, cartaCup3, cartaCup4, cartaCup5, cartaCup6, cartaCup7, cartaCup8, cartaCup9, cartaCup10, cartaCup11; 
	JTextField fieldEfectivo, fieldApuesta, fieldPuntajeJugador, fieldPuntajeCupier;
	JButton bRepartir, bOtraCarta, bSeguro, bOtroJuego, ficha1, ficha5, ficha10, ficha25, ficha50, ficha100;
	ImageIcon icoFicha1, icoFicha5, icoFicha10, icoFicha25, icoFicha50, icoFicha100, cTapada;
	String hasGanado = "Usted Es El Ganador!!!";
	String hasPerdido = "Has Perdido!!!";
	String path = "src/images/";
	JMenu inicio, integrantes;
	JMenuItem salir, quienesSomos;
	JMenuBar barraDeOpciones;
	JPanel pPrincipal1, pPrincipal2, pSub1Principal1, pSub2Principal1;
	Fondo f;
	FondoMadera f1;
	FondoMadera f2;
	Container contenedor = getContentPane();
	CartasJugadorCupier cardJugador = new CartasJugadorCupier(); 
	CartasJugadorCupier cardCupier = new CartasJugadorCupier();
	Baraja b = new Baraja();	
	
	public Interfaz()
	{
		super("Black Jack 21");
		contenedor.setLayout(null);
		
		f = new Fondo();
		f.setLayout(null);
		f1 = new FondoMadera();
		f1.setLayout(null);
		f2 = new FondoMadera();
		f2.setLayout(null);
		
		pPrincipal1 = new JPanel();
		pPrincipal1.setLayout(null);
		pPrincipal1.setBounds(0, 0, 250, 480);
		
		pPrincipal2 = new JPanel();
		pPrincipal2.setLayout(null);
		pPrincipal2.setBounds(250, 0, 700, 415);
	
		pSub1Principal1 = new JPanel();
		pSub1Principal1.setLayout(null);
		pSub1Principal1.setBounds(0, 0, 250, 200);
			
		pSub2Principal1 = new JPanel();
		pSub2Principal1.setLayout(null);
		pSub2Principal1.setBounds(0, 200, 280, 250);
		
		
		inicio = new JMenu("Inicio ");
		integrantes = new JMenu("Integrantes ");
		salir = new JMenuItem("Salir ");
		salir.addActionListener(this);
		salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		quienesSomos = new JMenuItem("Quienes Somos ");
		quienesSomos.addActionListener(this);
		quienesSomos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		barraDeOpciones = new JMenuBar();
		
		inicio.add(salir);
		integrantes.add(quienesSomos);
		barraDeOpciones.add(inicio);
		barraDeOpciones.add(integrantes);
		setJMenuBar(barraDeOpciones);
		
		efectivo = new JLabel("Efectivo");
		efectivo.setForeground(Color.WHITE);
		apuesta = new JLabel("Apuesta");
		apuesta.setForeground(Color.WHITE);
		jugador = new JLabel("Jugador");
		jugador.setForeground(Color.WHITE);
		cupier = new JLabel("Cupier");
		cupier.setForeground(Color.WHITE);
		mensajes = new JLabel("*** Haga Su Apuesta ***");
		mensajes.setForeground(Color.WHITE);
		
		carta2 = new JLabel();
		cartaCup2 = new JLabel();
		carta3 = new JLabel();
		cartaCup3 = new JLabel();
		carta4 = new JLabel();
		cartaCup4 = new JLabel();
		carta5 = new JLabel();
		cartaCup5 = new JLabel();
		carta6 = new JLabel();
		cartaCup6 = new JLabel();
		carta7 = new JLabel();
		cartaCup7 = new JLabel();
		carta8 = new JLabel();
		cartaCup8 = new JLabel();
		carta9 = new JLabel();
		cartaCup9 = new JLabel();
		carta10 = new JLabel();
		cartaCup10 = new JLabel();
		carta11 = new JLabel();
		cartaCup11 = new JLabel();
		cTapada = new ImageIcon(path+"tapada.png");
		cartaTapadaJugador = new JLabel(cTapada);
		cartaTapadaCupier = new JLabel(cTapada);
		
		fieldEfectivo = new JTextField("1500");
		fieldEfectivo.setEditable(false);
		fieldApuesta = new JTextField("0");
		fieldApuesta.setEditable(false);
		fieldPuntajeJugador = new JTextField("0");
		fieldPuntajeJugador.setEditable(false);
		fieldPuntajeCupier = new JTextField("0");
		fieldPuntajeCupier.setEditable(false);
		
		bOtraCarta = new JButton("Otra Carta");
		bOtraCarta.setEnabled(false);
		bOtraCarta.addActionListener(this);
		bRepartir = new JButton(" Repartir ");
		bRepartir.setEnabled(false);
		bRepartir.addActionListener(this);
		bSeguro = new JButton("Seguro");
		bSeguro.setEnabled(false);
		bSeguro.addActionListener(this);
		bOtroJuego = new JButton("Otro Juego");
		bOtroJuego.addActionListener(this);
		
		
		icoFicha1 = new ImageIcon(path+"m1.png");
		ficha1 = new JButton(icoFicha1);
		ficha1.addActionListener(this);
		icoFicha5 = new ImageIcon(path+"m5.png");
		ficha5 = new JButton(icoFicha5);
		ficha5.addActionListener(this);
		icoFicha10 = new ImageIcon(path+"m10.png");
		ficha10 = new JButton(icoFicha10);
		ficha10.addActionListener(this);
		icoFicha25 = new ImageIcon(path+"m25.png");
		ficha25 = new JButton(icoFicha25);
		ficha25.addActionListener(this);
		icoFicha50 = new ImageIcon(path+"m50.png");
		ficha50 = new JButton(icoFicha50);
		ficha50.addActionListener(this);
		icoFicha100 = new ImageIcon(path+"m100.png");
		ficha100  = new JButton(icoFicha100);
		ficha100.addActionListener(this);
		
		pSub1Principal1.add(efectivo);
		efectivo.setBounds(30, 30, 60, 30);
		pSub1Principal1.add(fieldEfectivo);
		fieldEfectivo.setBounds(30, 58, 60,30);
		pSub1Principal1.add(apuesta);
		apuesta.setBounds(30, 100, 60, 30);
		pSub1Principal1.add(fieldApuesta);
		fieldApuesta.setBounds(30, 128, 60,30);
		
		pSub2Principal1.add(ficha1);
		ficha1.setBounds(30, 50, 30, 30);
		pSub2Principal1.add(ficha5);
		ficha5.setBounds(100, 50, 30, 30);
		pSub2Principal1.add(ficha10);
		ficha10.setBounds(170, 50, 30, 30);
		pSub2Principal1.add(ficha25);
		ficha25.setBounds(30, 110, 30, 30);
		pSub2Principal1.add(ficha50);
		ficha50.setBounds(100, 110, 30, 30);
		pSub2Principal1.add(ficha100);
		ficha100.setBounds(170, 110, 30, 30);
		
		pSub1Principal1.add(f1);
		f1.setBounds(0, 0, 250, 200);
		pSub2Principal1.add(f2);
		f2.setBounds(0, 0, 250, 215);
		
		pPrincipal1.add(pSub1Principal1);
		pPrincipal1.add(pSub2Principal1);
		
		pPrincipal2.add(jugador);
		jugador.setBounds(210, 20, 300, 30);
		pPrincipal2.add(cartaTapadaJugador);
		cartaTapadaJugador.setBounds(200, 50, 71, 96);
		pPrincipal2.add(carta2);
		carta2.setBounds(185, 50, 71, 96);
		pPrincipal2.add(carta3);
		carta3.setBounds(170, 50, 71, 96);
		pPrincipal2.add(carta4);
		carta4.setBounds(155, 50, 71, 96);
		pPrincipal2.add(carta5);
		carta5.setBounds(140, 50, 71, 96);
		pPrincipal2.add(carta6);
		carta6.setBounds(125, 50, 71, 96);
		pPrincipal2.add(carta7);
		carta7.setBounds(110, 50, 71, 96);
		pPrincipal2.add(carta8);
		carta8.setBounds(95, 50, 71, 96);
		pPrincipal2.add(carta9);
		carta9.setBounds(80, 50, 71, 96);
		pPrincipal2.add(carta10);
		carta10.setBounds(65, 50, 71, 96);
		pPrincipal2.add(cupier);
		cupier.setBounds(510, 20, 300, 30);
		pPrincipal2.add(cartaTapadaCupier);
		cartaTapadaCupier.setBounds(500, 50, 71, 96);
		pPrincipal2.add(cartaCup2);
		cartaCup2.setBounds(485, 50, 71, 96);
		pPrincipal2.add(cartaCup3);
		cartaCup3.setBounds(470, 50, 71, 96);
		pPrincipal2.add(cartaCup4);
		cartaCup4.setBounds(455, 50, 71, 96);
		pPrincipal2.add(cartaCup5);
		cartaCup5.setBounds(440, 50, 71, 96);
		pPrincipal2.add(cartaCup6);
		cartaCup6.setBounds(425, 50, 71, 96);
		pPrincipal2.add(cartaCup7);
		cartaCup7.setBounds(410, 50, 71, 96);
		pPrincipal2.add(cartaCup8);
		cartaCup8.setBounds(395, 50, 71, 96);
		pPrincipal2.add(cartaCup9);
		cartaCup9.setBounds(380, 50, 71, 96);
		pPrincipal2.add(cartaCup10);
		cartaCup10.setBounds(365, 50, 71, 96);
		pPrincipal2.add(fieldPuntajeJugador);
		fieldPuntajeJugador.setBounds(220, 255, 30, 30);
		pPrincipal2.add(fieldPuntajeCupier);
		fieldPuntajeCupier.setBounds(520, 255, 30, 30);
		pPrincipal2.add(mensajes);
		mensajes.setBounds(310, 300, 300, 30);
		pPrincipal2.add(bRepartir);
		bRepartir.setBounds(150, 375, 100, 30);
		pPrincipal2.add(bOtraCarta);
		bOtraCarta.setBounds(260, 375, 110, 30);
		pPrincipal2.add(bSeguro);
		bSeguro.setBounds(375, 375, 100, 30);
		pPrincipal2.add(bOtroJuego);
		bOtroJuego.setBounds(480, 375, 110, 30);
		
		pPrincipal2.add(f);
		f.setBounds(0, 0, 754, 426);
		contenedor.add(pPrincipal1);
		contenedor.add(pPrincipal2);
		
		setSize(950, 465);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{	
		if(ae.getSource().equals(salir) )
		{
			System.exit(0);
		}		
		if(ae.getSource().equals(quienesSomos))
		{
			JOptionPane.showMessageDialog(null,	"OLIVER ZULUAGA MONSALVE -  200859325", "Quienes Somos", 1);
		}
		if(ae.getSource() == bRepartir)
		{
			ficha1.setEnabled(false);
			ficha5.setEnabled(false);
			ficha10.setEnabled(false);
			ficha25.setEnabled(false);
			ficha50.setEnabled(false);
			ficha100.setEnabled(false);
			bOtraCarta.setEnabled(true);
			bSeguro.setEnabled(true);
			bRepartir.setEnabled(false);
			bOtroJuego.setEnabled(true);
			
			cardCupier.setCarta(b.getCarta());
			if(cardCupier.getCarta(0).getValorCarta() == 1)
			{
				cardCupier.getCarta(0).setValorCarta(11);
			}	
			cartaTapadaCupier.setIcon(cardCupier.getCarta(0).getImagenCarta());
			fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
			
			cardJugador.setCarta(b.getCarta());
			if(cardJugador.getCarta(0).getValorCarta() == 1)
			{
				cardJugador.getCarta(0).setValorCarta(11);
			}
			cartaTapadaJugador.setIcon(cardJugador.getCarta(0).getImagenCarta());
			fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
	
			cardJugador.setCarta(b.getCarta());
			if(cardJugador.getCarta(1).getValorCarta() == 1)
			{
				cardJugador.getCarta(1).setValorCarta(11);
			}
			carta2.setIcon(cardJugador.getCarta(1).getImagenCarta());
			fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());	
			
			if(cardJugador.CalcularTotal() == 21)
			{
				hasGanado();
			}
			gameOver();
		}
		
		if(ae.getSource() == bOtraCarta)
		{
			bRepartir.setEnabled(false);
			int temp;
			temp = cardJugador.calcularTamano();
			switch (temp) 
			{
			case 2:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(2);
				carta3.setIcon(cardJugador.getCarta(2).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());				
				break;
			case 3:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(3);
				carta4.setIcon(cardJugador.getCarta(3).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;	
			case 4:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(4);
				carta5.setIcon(cardJugador.getCarta(4).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;	
			case 5:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(5);
				carta6.setIcon(cardJugador.getCarta(5).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;
			case 6:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(6);
				carta7.setIcon(cardJugador.getCarta(6).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;	
			case 7:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(7);
				carta8.setIcon(cardJugador.getCarta(7).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;
			case 8:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(8);
				carta9.setIcon(cardJugador.getCarta(8).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;
			case 9:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(9);
				carta10.setIcon(cardJugador.getCarta(9).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;	
			case 10:
				cardJugador.setCarta(b.getCarta());
				cardJugador.cambiarValorAs(10);
				carta11.setIcon(cardJugador.getCarta(10).getImagenCarta());
				fieldPuntajeJugador.setText(""+cardJugador.CalcularTotal());
				break;		
			default:
				break;
			}
			
			if(Integer.parseInt(fieldPuntajeJugador.getText()) == 21)
			{				
				hasGanado();				
			}
			
			if(Integer.parseInt(fieldPuntajeJugador.getText()) > 21)
			{
				hasPerdido();				
			}
			gameOver();
		}
		
		if(ae.getSource() == bSeguro)
		{
			bOtraCarta.setEnabled(false);			
			int temp;
						
			do
			{
			
			temp = cardCupier.calcularTamano();
							
				switch (temp) 
				{
				case 1:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(1);
					cartaCup2.setIcon(cardCupier.getCarta(1).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;
				case 2:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(2);
					cartaCup3.setIcon(cardCupier.getCarta(2).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;	
				case 3:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(3);
					cartaCup4.setIcon(cardCupier.getCarta(3).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;	
				case 4:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(4);
					cartaCup5.setIcon(cardCupier.getCarta(4).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;
				case 5:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(5);
					cartaCup6.setIcon(cardCupier.getCarta(5).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;	
				case 6:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(6);
					cartaCup7.setIcon(cardCupier.getCarta(6).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;
				case 7:
					cardCupier.setCarta(b.getCarta());
					
					cartaCup8.setIcon(cardCupier.getCarta(7).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					cambiarAsCup(7);
					break;
				case 8:
					cardCupier.setCarta(b.getCarta());
					cardCupier.cambiarValorAs(8);
					cartaCup9.setIcon(cardCupier.getCarta(8).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;	
				case 9:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(9);
					cartaCup10.setIcon(cardCupier.getCarta(9).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					break;
				case 10:
					cardCupier.setCarta(b.getCarta());
					cambiarAsCup(10);
					cartaCup11.setIcon(cardCupier.getCarta(10).getImagenCarta());
					fieldPuntajeCupier.setText(""+cardCupier.CalcularTotal());
					
					break;				
				}
			}
			while(Integer.parseInt(fieldPuntajeJugador.getText()) < 21 &&
					Integer.parseInt(fieldPuntajeJugador.getText()) >= Integer.parseInt(fieldPuntajeCupier.getText()));
			
			if(Integer.parseInt(fieldPuntajeJugador.getText()) > Integer.parseInt(fieldPuntajeCupier.getText()) ||
					Integer.parseInt(fieldPuntajeJugador.getText()) <= 21 && Integer.parseInt(fieldPuntajeCupier.getText()) > 21)
			{				
				hasGanado();
			}
			else
			{
				hasPerdido();
			}
			gameOver();
		}		
		if(ae.getSource() == ficha1){
			int valorFicha = 1;
			sumarFicha(valorFicha);
		}		
		if(ae.getSource() == ficha5){			
			int valorFicha = 5;
			sumarFicha(valorFicha);
		}		
		if(ae.getSource() == ficha10){
			int valorFicha = 10;
			sumarFicha(valorFicha);
		}		
		if(ae.getSource() == ficha25){
			int valorFicha = 25;
			sumarFicha(valorFicha);
		}		
		if(ae.getSource() == ficha50){
			int valorFicha = 50;
			sumarFicha(valorFicha);
		}		
		if(ae.getSource() == ficha100){
			int valorFicha = 100;
			sumarFicha(valorFicha);
		}
		if(ae.getSource() == bOtroJuego)
		{
			ficha1.setEnabled(true);
			ficha5.setEnabled(true);
			ficha10.setEnabled(true);
			ficha25.setEnabled(true);
			ficha50.setEnabled(true);
			ficha100.setEnabled(true);
			bRepartir.setEnabled(false);
			bOtroJuego.setEnabled(false);
			bOtraCarta.setEnabled(false);
			bSeguro.setEnabled(false);
			fieldApuesta.setText(""+0);
			fieldPuntajeCupier.setText(""+0);
			fieldPuntajeJugador.setText(""+0);
			mensajes.setText("*** Haga Su Apuesta ***");
			cartaTapadaCupier.setIcon(cTapada);
			cartaTapadaJugador.setIcon(cTapada);
			carta2.setIcon(null);
			carta3.setIcon(null);
			carta4.setIcon(null);
			carta5.setIcon(null);
			carta6.setIcon(null);
			carta7.setIcon(null);
			carta8.setIcon(null);
			carta9.setIcon(null);
			carta10.setIcon(null);
			carta11.setIcon(null);
			cartaCup2.setIcon(null);
			cartaCup3.setIcon(null);
			cartaCup4.setIcon(null);
			cartaCup5.setIcon(null);
			cartaCup6.setIcon(null);
			cartaCup7.setIcon(null);
			cartaCup8.setIcon(null);
			cartaCup9.setIcon(null);
			cartaCup10.setIcon(null);
			cartaCup11.setIcon(null);
			b.creaBaraja();
			cardJugador.reiniciar();
			cardCupier.reiniciar();
		}
	}
	
	public void cambiarAsCup(int n)
	{
		if(cardCupier.getCarta(n).getValorCarta() == 1)
		{
			if(Integer.parseInt(fieldPuntajeCupier.getText()) <= 10)
			{
				cardCupier.getCarta(n).setValorCarta(11);
			}
			else
			{
				cardCupier.getCarta(n).setValorCarta(1);
			}
		}
	}

	public void gameOver()
	{
		if(Integer.parseInt(fieldApuesta.getText()) == 0 && Integer.parseInt(fieldEfectivo.getText()) == 0)
		{
			JOptionPane.showMessageDialog(cartaTapadaJugador, "GAME OVER", "Black Jack 21", 0);
			System.exit(0);
		}
	}
	
	public void hasGanado()
	{
		mensajes.setText(hasGanado);
		int dineroGanado;
		dineroGanado = (Integer.parseInt(fieldApuesta.getText()) * 2) + Integer.parseInt(fieldEfectivo.getText());
		fieldEfectivo.setText(""+dineroGanado);
		fieldApuesta.setText("0");
		bSeguro.setEnabled(false);
		bOtraCarta.setEnabled(false);
	}
	
	public void hasPerdido()
	{
			mensajes.setText(hasPerdido);
			fieldApuesta.setText("0");
			bSeguro.setEnabled(false);
			bOtraCarta.setEnabled(false);
	}
	
	public void sumarFicha(int i)
	{
		int aux =  Integer.parseInt(fieldApuesta.getText());
		int aux2 = Integer.parseInt(fieldEfectivo.getText());
		int total = i + aux;
		int total2 = aux2 - i;
		
		bRepartir.setEnabled(true);
		if((aux2-i)<0)
		{
			fieldApuesta.setText(""+aux);
			fieldEfectivo.setText(""+aux2);
		}else 
		{
			fieldApuesta.setText(""+total);
			fieldEfectivo.setText(""+total2);
		}
	}
}