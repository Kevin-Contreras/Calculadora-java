import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class Pantalla extends JFrame{
	public Pantalla(){
		setBounds(500, 200, 450, 250);
		setVisible(true);
		CristalEcuacion cristalEcuacion = new CristalEcuacion();
		setTitle("ECUACION CUADRATICA");
		add(cristalEcuacion);
	} 
}
class CristalEcuacion extends JPanel implements ActionListener{
	//------------DECLARACION DE VARIABLES---------------
	Label label1 = new Label("ECUACION CUADRATICA");
	JTextField textoValor1 = new JTextField(10);
	Label label2 = new Label("x^2+");
	JTextField textoValor2 = new JTextField(10);
	Label label3 = new Label("x+");
	JTextField textoValor3 = new JTextField(10);
	Label resultadosLabel = new Label("RESULTADOS");
	Label x1 = new Label("x1");
	JTextField resultadostexto1 = new JTextField(10);
	Label x2 = new Label("x2");
	JTextField resultadostexto2 = new JTextField(10);
	JButton botonresultado = new JButton("CALCULAR");
	JButton guardar = new JButton("GUARDAR RESULTADO");
	String guardado1 = "";
	String guardado2="";
	static String guardadoTotal1 = "";
	static String guardadoTotal2 = "";
	static String operacion="";
	static String resultadoGuardado ="";
	static String fecha="";
	
	public CristalEcuacion(){
		
		setLayout(null);
		//----------------------------------------
		label1.setBounds(130,20,200,20);
		textoValor1.setBounds(130, 50, 30, 30);
		label2.setBounds(160, 50, 30, 40);
		textoValor2.setBounds(190, 50, 30, 30);
		label3.setBounds(220,50,20,40);
		textoValor3.setBounds(240, 50, 30, 30);
		//--------------RESULTADOS-----------------
		resultadosLabel.setBounds(50,100,90,20);
		x1.setBounds(50, 130, 20,20 );
		resultadostexto1.setBounds(80, 130, 150, 25);
		x2.setBounds(50, 160, 20,20 );
		resultadostexto2.setBounds(80, 160, 150, 25);
		botonresultado.setBounds(250, 130, 100,25);
		guardar.setBounds(250, 160, 170, 25);
		//----------------------------------------
		add(label1);
		add(textoValor1);
		add(label2);
		add(textoValor2);
		add(label3);
		add(textoValor3);
		add(resultadosLabel);
		add(x1);
		add(resultadostexto1);
		add(x2);
		add(resultadostexto2);
		add(botonresultado);
		add(guardar);
		//EVENTO CON EL BOTON
		botonresultado.addActionListener(this);
		guardar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		Date fecha2 = new Date();
		fecha = fecha2.toString();
		if(e.getSource()==botonresultado){
			String A = textoValor1.getText();
			String B = textoValor2.getText();
			String C = textoValor3.getText();
			double a = Double.parseDouble(A);
			double b = Double.parseDouble(B);
			double c = Double.parseDouble(C);
			double resultadoRaiz = (b*b-4*a*c);
			String resultadoraiz = String.valueOf(resultadoRaiz);
			double prueba=0;
			double u=0;
			double prueba1=0;
			double z =0;
			//----------------- formula general con el signo (+) ---------------------
			if(resultadoraiz.contains("-")){
				double general = (-b)/(2*a);
			String remplazado =	resultadoraiz.replace("-", "");
			double remplazadoParceado = Double.parseDouble(remplazado);
			for(u=0; prueba<remplazadoParceado;++u){
				prueba = u*u;
			}
			double raiz = (remplazadoParceado+prueba)/((u-1)*2);
			double raizAbajo = raiz/(2*a);
			String raizAbajo0 = String.valueOf(raizAbajo);
			if(raizAbajo0.contains("-")){
				String generalString = String.valueOf(general);
				String raizAbajoString = String.valueOf(raizAbajo);
				String formulaGeneralString = generalString+ raizAbajoString+"i";
				resultadostexto2.setText(formulaGeneralString);
				guardado1= formulaGeneralString;
			}else{
				String generalString = String.valueOf(general);
				String raizAbajoString = String.valueOf(raizAbajo);
				String formulaGeneralString = generalString+"+"+ raizAbajoString+"i";
				resultadostexto2.setText(formulaGeneralString);
				guardado1= formulaGeneralString;
		
			}
			
			
			}
			else{
				double general = (-b)/(2*a);
				for(u=0; prueba<resultadoRaiz;++u){
					prueba = u*u;
				}
				double raiz = (resultadoRaiz+prueba)/((u-1)*2);
				double raizAbajo = raiz/(2*a);
				double sumatotal = raizAbajo+general;
				String generalString = String.valueOf(sumatotal);
				resultadostexto2.setText(generalString);	
				guardado1= generalString;
				
			}
			//----------------------- formula general con el signo (-) ---------------------------
			
			if(resultadoraiz.contains("-")){
				double general = (-b)/(2*a);
			String remplazado2 =	resultadoraiz.replace("-", "");
			double remplazadoParceado = Double.parseDouble(remplazado2);
			for(z=0; prueba1<remplazadoParceado;++z){
				prueba1 = z*z;
			}
			double raiz = (remplazadoParceado+prueba1)/((z-1)*2);
			double raizAbajo = raiz/(2*a);
			String raizAbajocadena = String.valueOf(raizAbajo);
			if(raizAbajocadena.contains("-")){
				String generalString = String.valueOf(general);
				String raizAbajoString = String.valueOf(raizAbajo);
				String formulaGeneralString1 = generalString+raizAbajoString+"i";
				resultadostexto1.setText(formulaGeneralString1);
				guardado2= formulaGeneralString1;
				
				
			}else{
				String generalString = String.valueOf(general);
				String raizAbajoString = String.valueOf(raizAbajo);
				String formulaGeneralString1 = generalString+"+"+raizAbajoString+"i";
				resultadostexto1.setText(formulaGeneralString1);
				guardado2= formulaGeneralString1;
				
			}
			
			
			}
			else{
				double general = (-b)/(2*a);
				for(z=0; prueba1<resultadoRaiz;++z){
					prueba1 = z*z;
				}
				double raiz = (resultadoRaiz+prueba1)/((z-1)*2);
				double raizAbajo = raiz/(2*a);
				double sumatotal = general-raizAbajo ;
				String generalString2 = String.valueOf(sumatotal);
				resultadostexto1.setText(generalString2);
			
				guardado2= generalString2;
				

				
			}
		}else{
			guardadoTotal1=guardado1;
			guardadoTotal2=guardado2;
			
		}
		resultadoGuardado =  "x1:"+resultadostexto1.getText()+" "+"x2:"+resultadostexto2.getText();
		operacion = textoValor1.getText()+"x^2"+" + "+textoValor2.getText()+"x"+" + "+textoValor3.getText();
	
	}
	
	public static String guardar (){
		String guardarcon ="";
		guardarcon += resultadoGuardado+"                                                     "+operacion+ "                                                                        "+fecha+",";
		return guardarcon;
	}
}