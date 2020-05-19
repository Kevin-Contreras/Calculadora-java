import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class CasosIntegracion extends JFrame{
public CasosIntegracion(){
	setBounds(300,180,750,400);
	setTitle("CASOS DE INTEGRACION");
	PanelCasosIntegral panel = new PanelCasosIntegral ();
	add(panel);
	
}
}
class PanelCasosIntegral extends JPanel implements ActionListener{
	JButton siguiente = new JButton(">");
	JButton atras = new JButton("<");
	int aumenta = 0;
	JLabel titulo = new JLabel ("METODO DE INTEGRACION POR SUSTITUCION");
	JLabel definicion = new JLabel (" El método de integración por sustitución o cambio de variable se basa en la derivada de la función compuesta. ");
	JLabel definicion2 = new JLabel(" este método de integración consiste en la aplicación de un cambio de variable para simplificar el integrando.");
	JLabel formula = new JLabel("FORMULA:  ∫ ƒ(x) dx = ∫ f(g(t))g′(t) dt");
	JLabel tituloejemplo = new JLabel("EJEMPLO");
	JLabel titulo1 = new JLabel("calcular la integral de:");
	JLabel titulo2 = new JLabel(" ∫sen(2x)dx ");
	JLabel titulo3 = new JLabel("se sustituye 2x por U luego se obtiene la derivada du = 2dx se pasa a dividir el 2 dx = du/2");
	JLabel titulo4 = new JLabel("el dx se sustituye en la integral y ya todo en terminos de U se procede ha hacer la intergral luego se sustituye U por x ");
	JLabel titulo5 = new JLabel("2x = u => du = 2 dx => dx = du/2 =>  ∫sen(u)du/2 =>  (-1/2)cos(u) =>f(x)= (-1/2)cos(2x)+c");
	public	PanelCasosIntegral(){
		setLayout(null);
		siguiente.setBounds(400, 300, 150, 25);
		atras.setBounds(150, 300, 150, 25);
		siguiente.addActionListener(this);
		atras.addActionListener(this);
		add(siguiente);
		add(atras);
		titulo.setBounds(20, 20, 500, 10);
		definicion.setBounds(20, 60, 700, 10);
		definicion2.setBounds(20, 75, 700, 10);
		formula.setBounds(20, 105, 600, 15);
		tituloejemplo.setBounds(20, 125, 100, 10);
		titulo1.setBounds(20, 160, 150, 15);
		titulo2.setBounds(20, 190, 100, 15);
		titulo3.setBounds(20, 220, 700, 15);
		titulo4.setBounds(20, 235, 700, 15);
		titulo5.setBounds(20, 265, 700, 15);
		add(titulo);
		add(definicion);
		add(definicion2);
		add(formula);
		add(tituloejemplo);
		add(titulo1);
		add(titulo2);
		add(titulo3);
		add(titulo4);
		add(titulo5);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == siguiente){
				switch(aumenta){
				case 0 : 
				titulo.setText("METODO DE INTEGRACION POR PARTES");
				definicion.setText("Integración por parte. El método de integración por partes permite calcular");
				definicion2.setText("la integral de un producto de dos funciones aplicando la fórmula");
				formula.setText("FORMULA: ∫ f(x) g'(x)dx = f(x) g(x) − ∫ f'(x) g(x)dx");
				tituloejemplo.setText("EJEMPLO");
				titulo2.setText("f(x) = ln(x)");
				titulo3.setText("Sean u = ln(x) y v' = 1. Derivando e integrando, respectivamente, se obtiene u' = 1/x y v = x. Como f(x) = u·v'");
				titulo4.setText("aplicando la fórmula de integración por partes, se tiene que la integral de f(x) es x·ln(x) - x + C.");
				titulo5.setText("u = ln(x) y v' = 1 =>u' = 1/x y v = x =>f(x) = u·v'=> f(x) = x·ln(x) - x + C");
					break;
				case 1 : 
					titulo.setText("METODO DE INTEGRACION POR CAMBIO DE VARIABLE");
					definicion.setText("Existen varios métodos de integración, consistiendo todos ellos en reducir la integral buscada a una integral ya conocida");
					definicion2.setText("como por ejemplo una de las de la tabla, ó bien reducirla a una integral más sencilla");
					formula.setText("FORMULA: ∫ ƒ(x) dx = ∫ f(g(t))g′(t) dt");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y = 3*x^2 + 5x");
					titulo3.setText("se sustituye 3x por U luego se obtiene la derivada du = 3dx se pasa a dividir el 3 dx = du/3");
					titulo4.setText("el dx se sustituye en la integral y ya todo en terminos de U se procede ha hacer la intergral luego se sustituye U por x ");
					titulo5.setText("3x = u => du = 3 dx => dx = du/3 =>  ∫sen(u)du/3 =>  (-1/3)cos(u) =>f(x)= (-1/3)cos(3x)+c");
						break;

				}
				aumenta+=1;
				
				if(aumenta>1){
					aumenta = 2;
				}
		}else if(e.getSource()==atras){
			System.out.println(aumenta);
			
				switch(aumenta){
				case 1 :
					titulo.setText("METODO DE INTEGRACION POR SUSTITUCION");
					definicion.setText("l método de integración por sustitución o cambio de variable se basa en la derivada de la función compuesta.");
					definicion2.setText("este método de integración consiste en la aplicación de un cambio de variable para simplificar el integrando.");
					formula.setText("FORMULA: ∫ ƒ(x) dx = ∫ f(g(t))g′(t) dt");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y = 2*x^2 + 5x");
					titulo3.setText("se sustituye 2x por U luego se obtiene la derivada du = 2dx se pasa a dividir el 2 dx = du/2");
					titulo4.setText("el dx se sustituye en la integral y ya todo en terminos de U se procede ha hacer la intergral luego se sustituye U por x ");
					titulo5.setText("2x = u => du = 2 dx => dx = du/2 =>  ∫sen(u)du/2 =>  (-1/2)cos(u) =>f(x)= (-1/2)cos(2x)+c");
					
						break;
					case 2 : 
						titulo.setText("METODO DE INTEGRACION POR PARTES");
						definicion.setText("Integración por parte. El método de integración por partes permite calcular");
						definicion2.setText("la integral de un producto de dos funciones aplicando la fórmula");
						formula.setText("FORMULA: ∫ f(x) g'(x)dx = f(x) g(x) − ∫ f'(x) g(x)dx");
						tituloejemplo.setText("EJEMPLO");
						titulo2.setText("f(x) = ln(x)");
						titulo3.setText("Sean u = ln(x) y v' = 1. Derivando e integrando, respectivamente, se obtiene u' = 1/x y v = x. Como f(x) = u·v'");
						titulo4.setText("aplicando la fórmula de integración por partes, se tiene que la integral de f(x) es x·ln(x) - x + C.");
						titulo5.setText("u = ln(x) y v' = 1 =>u' = 1/x y v = x =>f(x) = u·v'=> f(x) = x·ln(x) - x + C");
				}
				aumenta -=1;
				if(aumenta<0){
					aumenta =1 ;
				}
		}
	
		
	}	
}
