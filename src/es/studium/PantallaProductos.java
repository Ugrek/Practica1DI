package es.studium;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class PantallaProductos extends Frame implements WindowListener, ActionListener
{
	
	private static final long serialVersionUID = 1L;
	
	JLabel art1 = new JLabel ("Bolígrafo");
	JLabel art2 = new JLabel ("Cuaderno");
	JLabel art3 = new JLabel ("Agenda Escolar");
	JLabel pre1 = new JLabel ("1,50");
	JLabel pre2 = new JLabel ("3,00");
	JLabel pre3 = new JLabel ("5,00");
	JLabel add1 = new JLabel ("0");
	JLabel add2 = new JLabel ("0");
	JLabel add3 = new JLabel ("0");
	JButton anadir1 = new JButton ("Añadir");
	JButton anadir2 = new JButton ("Añadir");
	JButton anadir3 = new JButton ("Añadir");
	JLabel blan = new JLabel ("");
	JButton comprar = new JButton ("Comprar");
	
	public PantallaProductos()
	{
		setLayout(new GridLayout(4,4));
		setTitle("Selección de articulos");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		addWindowListener(this);
		add(art1);
		add(pre1);
		add(add1);
		add(anadir1);
		anadir1.addActionListener(this);
		add(art2);
		add(pre2);
		add(add2);
		add(anadir2);
		anadir2.addActionListener(this);
		add(art3);
		add(pre3);
		add(add3);
		add(anadir3);
		anadir3.addActionListener(this);
		add(blan);
		add(comprar);
	}
		
	
	public static void main(String[] args)
	{
		new PantallaProductos();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if (anadir1.equals(ae.getSource()))
		{
			add1.setText("1");
		}
	}

	public void windowActivated(WindowEvent arg0)
	{
		
	}

	public void windowClosed(WindowEvent arg0)
	{
		
	}

	public void windowClosing(WindowEvent arg0)
	{
		setVisible(false);
	}

	public void windowDeactivated(WindowEvent arg0)
	{
		
	}


	public void windowDeiconified(WindowEvent arg0)
	{
		
	}



	public void windowIconified(WindowEvent arg0)
	{
		
	}


	public void windowOpened(WindowEvent arg0)
	{
		
	}

}
