import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EjemploFlowLayout extends JFrame implements ActionListener{
    
	JButton boton1, boton2, boton3, boton4, boton5;
	FlowLayout miFlowLayout;
    
	public EjemploFlowLayout(){
        
		//Instancia un objeto FlowLayout object alineado al centro y con una separacion de 3px en horizonal y vertical
		miFlowLayout = new FlowLayout(FlowLayout.CENTER,3,3);
        
		//Uso este FlowLayout para que sea el controlador de posicionamiento de mi objeto JFrame
		setLayout(miFlowLayout);
        
		//Creo 5 botones y los añado a mi objeto JFrame
		boton1 = new JButton("Botón 1");
		boton2 = new JButton("Botón 2");
		boton3 = new JButton("Botón 3");
		boton4 = new JButton("Botón 4");
		boton5 = new JButton("Botón 5");
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
        
		//Añado los botones al ActionListener
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);

	}
    
	public static void main( String args[] ) {
        
		EjemploFlowLayout formulario = new EjemploFlowLayout();
		formulario.setSize(250,150);
		formulario.setTitle("Ejemplo de FlowLayout");
		formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
		formulario.setVisible(true);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Al hacer clic en un botón, añado 5px de espacio horizontal y vertical entre botones
		miFlowLayout.setHgap(miFlowLayout.getHgap() + 5);
		miFlowLayout.setVgap(miFlowLayout.getVgap() + 5);
		//Fijo el nuevo layout al formulario
		setLayout(miFlowLayout);
		//Valido el formulario para asegurarme de que se actualiza en pantalla
		validate();
        
	}

}
