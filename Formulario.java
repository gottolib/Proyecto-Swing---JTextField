import javax.swing.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener{

	private JLabel usuario, contraseña;
	private JTextField us, pw;
	private JButton b1;
	private String nombre,contra;
	
	public Formulario ()
	{
		setLayout (null);
		usuario = new JLabel ("Usuario: ");
		usuario.setBounds(1,1,100,50);
		add(usuario);
		setLayout (null);
		contraseña = new JLabel ("Contraseña: ");
		contraseña.setBounds(1,52,100,50);
		add(contraseña);
		us = new JTextField ();
		us.setBounds(105,1,100,50);
	    add(us);
	    pw = new JTextField ();
		pw.setBounds(105,52,100,50);
	    add(pw);
	    b1 = new JButton("Ingresar");
	    b1.setBounds(200,200,100,70);
	    add(b1);
	    b1.addActionListener(this);
	    
	}
	public void actionPerformed (ActionEvent e)
	{

		if (e.getSource () == b1)
		{
			nombre = us.getText();
			contra = pw.getText();
		
		}
		if("juan".equals(nombre) && "asd123".equals(contra))
		{
			setTitle ("Correcto");
		}
		else
		{
			setTitle ("Incorrecto");
		}
       

	}
	
	public static void main (String []ar)
	{
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,450,345);
		formulario1.setVisible(true);
	}

}
