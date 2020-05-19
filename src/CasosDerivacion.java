import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class CasosDerivacion extends JFrame{
public CasosDerivacion(){
	setBounds(300,180,750,400);
	setTitle("CASOS DE DERIVACION" );
	PanelCasos panel = new PanelCasos ();
	add(panel);
	
}
}
class PanelCasos extends JPanel implements ActionListener{
	JButton siguiente = new JButton(">");
	JButton atras = new JButton("<");
	int aumenta = 0;
	int menos=0;
	JLabel titulo = new JLabel ("DERIVADA DE UNA FUNCION DE GRADO N");
	JLabel definicion = new JLabel (" Una función potencial es aquella donde la x está elevada a un exponente. ");
	JLabel definicion2 = new JLabel("Para calcular su derivada, el exponente pasa a multiplicar a la x y se le resta 1 al exponente.");
	JLabel formula = new JLabel("FORMULA:  y'=nx^(n-1)");
	JLabel tituloejemplo = new JLabel("EJEMPLO");
	JLabel titulo1 = new JLabel("calcular la derivada de:");
	JLabel titulo2 = new JLabel("y = x^2");
	JLabel titulo3 = new JLabel("Pasamos el 2 multiplicando a la x y le restamos 1 al exponente:");
	JLabel titulo4 = new JLabel("y' = 2x^(1-1) = 2x");
	public	PanelCasos(){
		setLayout(null);
		siguiente.setBounds(400, 300, 150, 25);
		atras.setBounds(150, 300, 150, 25);
		siguiente.addActionListener(this);
		atras.addActionListener(this);
		add(siguiente);
		add(atras);
		titulo.setBounds(20, 20, 500, 10);
		definicion.setBounds(20, 60, 600, 10);
		definicion2.setBounds(20, 75, 600, 10);
		formula.setBounds(20, 105, 600, 15);
		tituloejemplo.setBounds(20, 125, 100, 10);
		titulo1.setBounds(20, 160, 150, 15);
		titulo2.setBounds(20, 190, 100, 15);
		titulo3.setBounds(20, 220, 700, 15);
		titulo4.setBounds(20, 250, 700, 15);
		add(titulo);
		add(definicion);
		add(definicion2);
		add(formula);
		add(tituloejemplo);
		add(titulo1);
		add(titulo2);
		add(titulo3);
		add(titulo4);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == siguiente){
				switch(aumenta){
				case 0 : 
				titulo.setText("DERIVADA DEL PRODUCTO DE UNA CONSTANTE POR UNA FUNCION");
				definicion.setText("La derivada del producto de una constante por una función.");
				definicion2.setText("es igual al producto de la constante por la derivada de la función");
				formula.setText("FORMULA: y'=n*ax^(n-1)");
				tituloejemplo.setText("EJEMPLO");
				titulo2.setText("y = 3*x^2");
				titulo3.setText("pasamos a multiplicar al exponente a 3 y le restamos 1 al exponente de x");
				titulo4.setText("y' = 3*2*x^(2-1)= 6x");
					break;
				case 1 : 
					titulo.setText("DERIVADA DE UNA SUMA");
					definicion.setText("La derivada del una suma es cuando dos funciones se estan sumando.");
					definicion2.setText("se deriva cada una por separado opteniedo la derivada de la funcion que estamos evaluando");
					formula.setText("FORMULA: y'=Σ(n*x^(n-1))");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y = 3*x^2 + 5x");
					titulo3.setText("pasamos a multiplicar al exponente a 3 y le restamos 1 al exponente de x, luego se obtiene la derivada de 5x que es 5");
					titulo4.setText("y' = 3*2*x^(2-1) + 5x^(1-1) = 6x+5");
						break;
				case 2 : 
					titulo.setText("DERIVADA DE UN PRODUCTO");
					definicion.setText("La derivada del producto de dos funciones es igual al primer.");
					definicion2.setText(" más el segundo factor por la derivada del primero.");
					formula.setText("FORMULA: f(x)=u'v+v'u");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y =(3*x^2)* 5x");
					titulo3.setText("u=3*x^2 y v = 5x se le saca la derivada a u que es 6x y se le saca la derivada a v que es 5.");
					titulo4.setText("y' = 3*2*x^(2-1) + 5x^(1-1) = 6x*5x+5*3x^2 = 30x^2+15x^2");
						break;
				case 3 : 
					titulo.setText("DERIVADA DE UN COCIENTE");
					definicion.setText("La derivada del cociente de dos funciones es igual a la derivada del numerador por el denominador ");
					definicion2.setText(" menos la derivada del denominador por el numerador, divididas por el cuadrado del denominador.");
					formula.setText("FORMULA: f(x)=(u'v-v'u)/v^2");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y =(3*x^2)/ 5x");
					titulo3.setText("u=3*x^2 y v = 5x se le saca la derivada a u que es 6x y se le saca la derivada a v que es 5.");
					titulo4.setText("y' = (3*2*x^(2-1) - 5x^(1-1))/(5x)^2 = (6x*5x-5*3x^2)/25x^2 = 15x^2/25x^2 = 3/5");
						break;
				case 4 : 
					titulo.setText("REGLA DE LA CADENA");
					definicion.setText("La regla de la cadena nos proporciona la derivada de la composición de funciones");
					definicion2.setText(" esta regla se utiliza cuando una funcion contiene a otra funcion que es derivable");
					formula.setText("FORMULA: f(g(x))=g'(x)*f'(g(x))");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("f(x)=sen(x^2)");
					titulo3.setText("se obtiene primero la derivada de g(x) = x^2 lugo se obtiene la derivada de f(x)=sen(x^2)");
					titulo4.setText("g'(x)= 2x, f(x) = 2x*cos(2x)  ");
						break;
				}
				aumenta+=1;
				
				if(aumenta>4){
					aumenta = 5;
				}
		}else if(e.getSource()==atras){
			System.out.println(aumenta);
			
				switch(aumenta){
				case 1 : 
					titulo.setText("DERIVADA DE UNA FUNCION DE GRADO N");
					definicion.setText("Una función potencial es aquella donde la x está elevada a un exponente.");
					definicion2.setText("Para calcular su derivada, el exponente pasa a multiplicar a la x y se le resta 1 al exponente.");
					formula.setText("FORMULA:  y'=nx^(n-1)");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y = x^2");
					titulo3.setText("Pasamos el 2 multiplicando a la x y le restamos 1 al exponente:");
					titulo4.setText("y' = 2x^(1-1) = 2x");
					break;
				case 2 : 
					titulo.setText("DERIVADA DEL PRODUCTO DE UNA CONSTANTE POR UNA FUNCION");
					definicion.setText("La derivada del producto de una constante por una función.");
					definicion2.setText("es igual al producto de la constante por la derivada de la función");
					formula.setText("FORMULA: y'=n*ax^(n-1)");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y = 3*x^2");
					titulo3.setText("pasamos a multiplicar al exponente a 3 y le restamos 1 al exponente de x");
					titulo4.setText("y' = 3*2*x^(2-1)= 6x");
					break;
				case 3 : 
					titulo.setText("DERIVADA DE UNA SUMA");
					definicion.setText("La derivada del una suma es cuando dos funciones se estan sumando.");
					definicion2.setText("se deriva cada una por separado opteniedo la derivada de la funcion que estamos evaluando");
					formula.setText("FORMULA: y'=Σ(n*x^(n-1))");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y = 3*x^2 + 5x");
					titulo3.setText("pasamos a multiplicar al exponente a 3 y le restamos 1 al exponente de x, luego se obtiene la derivada de 5x que es 5");
					titulo4.setText("y' = 3*2*x^(2-1) + 5x^(1-1) = 6x+5");
						break;
				case 4 : 
					titulo.setText("DERIVADA DE UN PRODUCTO");
					definicion.setText("La derivada del producto de dos funciones es igual al primer.");
					definicion2.setText(" más el segundo factor por la derivada del primero.");
					formula.setText("FORMULA: f(x)=u'v+v'u");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y =(3*x^2)* 5x");
					titulo3.setText("u=3*x^2 y v = 5x se le saca la derivada a u que es 6x y se le saca la derivada a v que es 5.");
					titulo4.setText("y' = 3*2*x^(2-1) + 5x^(1-1) = 6x*5x+5*3x^2 = 30x^2+15x^2");
						break;
				case 5 : 
					titulo.setText("DERIVADA DE UN COCIENTE");
					definicion.setText("La derivada del cociente de dos funciones es igual a la derivada del numerador por el denominador ");
					definicion2.setText(" menos la derivada del denominador por el numerador, divididas por el cuadrado del denominador.");
					formula.setText("FORMULA: f(x)=(u'v-v'u)/v^2");
					tituloejemplo.setText("EJEMPLO");
					titulo2.setText("y =(3*x^2)/ 5x");
					titulo3.setText("u=3*x^2 y v = 5x se le saca la derivada a u que es 6x y se le saca la derivada a v que es 5.");
					titulo4.setText("y' = (3*2*x^(2-1) - 5x^(1-1))/(5x)^2 = (6x*5x-5*3x^2)/25x^2 = 15x^2/25x^2 = 3/5");
						break;
				}
				aumenta -=1;
				if(aumenta<0){
					aumenta =1 ;
				}
		}
	
		
	}	
}
