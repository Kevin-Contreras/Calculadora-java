
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Date;
class Coseno extends JFrame{
	public Coseno(){
		setSize(350,325);
		Panelcoseno panelseno = new Panelcoseno();
		add(panelseno);
		setTitle("COSENO");
	}
}
class Panelcoseno extends JPanel implements ActionListener{
	static String fecha = "";

	static String concatenarRespuesta = "";
	static String operacion ="";
	JLabel tituloSeno = new JLabel("COSENO");
	JLabel sin = new JLabel("cos(");
	JTextField valorSeno = new JTextField(10);
	JLabel parentesis = new JLabel(")");
	JComboBox opciones = new JComboBox();
	//--------------TEXTO Y BOTONES RESULTADOS---------------
	JLabel resultadoTexto = new JLabel("RESULTADO:");
	JTextField resultadoventana = new JTextField(10);
	JButton calcular = new JButton("CALCULAR");
	JButton guardar = new JButton("GUARDAR RESULTADO");
	public Panelcoseno(){
		setLayout(null);
		opciones.addItem("GRADOS");
		opciones.addItem("RADIANES");
		tituloSeno.setBounds(20, 20, 80, 20);
		sin.setBounds(40, 70, 40, 20);
		valorSeno.setBounds(65, 65, 30, 30);
		parentesis.setBounds(95, 70, 20, 20);
		opciones.setBounds(150, 70, 100, 20);
		add(tituloSeno);
		add(sin);
		add(valorSeno);
		add(parentesis);
		add(opciones);
		//---------------------------RESULTADOS-----------------------
		resultadoTexto.setBounds(20, 190, 100, 20);
		resultadoventana.setBounds(100, 190, 100, 20);
		calcular.setBounds(200, 190, 100, 20);
		guardar.setBounds(20, 220, 170, 30);
		add(resultadoTexto);
		add(resultadoventana);
		add(calcular);
		add(guardar);
		calcular.addActionListener(this);
		//-----------------------------LOGICA -------------------------
			 
		 
	}
	 public void actionPerformed(ActionEvent e){
		 Date fecha1 = new Date();
			fecha = fecha1.toString();
		 String senoParseado="";
		 if(opciones.getSelectedItem()== "GRADOS"){
			 int signo =0;
				double seno =0;
				int k =0;
				int u =0;
				double conversion =0;
				double dividendo = 0;
				double divisor =0;
				Double grado2 = Double.parseDouble(valorSeno.getText());
				 conversion = grado2 *(3.1416/180);
				 for(int i =0; i<=100;++i){
					 dividendo=1;
					 for( k =0;k<2*i;++k){
						 dividendo*=conversion;
					 }
					 divisor =1;
					 for( u=1;u<=2*i;++u){
						 divisor =divisor*u;
					 }
					 if(i%2==0){
						 signo = 1;
					 }else{
						 signo = -1;
					 }
					 seno += (dividendo/divisor)*signo; 
				 }
				 senoParseado = String.valueOf(seno);
				 resultadoventana.setText(senoParseado);
		 }else {
			 int signo =0;
				double seno =0;
				int k =0;
				int u =0;
				double conversion =0;
				double dividendo = 0;
				double divisor =0;
				Double grado2 = Double.parseDouble(valorSeno.getText());
				double conversionRadianes = grado2*(180/3.1416); 
				 conversion = conversionRadianes *(3.1416/180);
				 for(int i =0; i<=40;++i){
					 dividendo=1;
					 for( k =0;k<2*i;++k){
						 dividendo*=grado2;
					 }
					 divisor =1;
					 for( u=1;u<=2*i;++u){
						 divisor =divisor*u;
					 }
					 if(i%2==0){
						 signo = 1;
					 }else{
						 signo = -1;
					 }
					 seno += (dividendo/divisor)*signo; 
				 }
				 senoParseado = String.valueOf(seno);
				 resultadoventana.setText(senoParseado);
		 }
		 Guardarcoseno guardarcoseno = new Guardarcoseno(senoParseado);
		 guardar.addActionListener(guardarcoseno);
		 operacion = "cos("+valorSeno.getText()+")";
		 concatenarRespuesta = resultadoventana.getText();
	 }	 
	 public static String guardar (){
			String guardarcon ="";
			guardarcon += concatenarRespuesta+"                                                     "+operacion+ "                                                                        "+fecha+",";
			return guardarcon;
		}	
}
class Guardarcoseno extends JPanel implements ActionListener{
	String coseno1 ="";
	int g=0;
	public Guardarcoseno(String coseno){
		coseno1 = coseno;
	}
	 public void actionPerformed(ActionEvent e){
		 if(g<1){
			 String guardado = coseno1;
			 System.out.println(guardado);	
			 g++;
		 }
		
	 }
}