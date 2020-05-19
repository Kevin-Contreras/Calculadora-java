import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Date;
class Seno extends JFrame{
	public Seno(){
		setSize(350,325);
		PanelSeno panelseno = new PanelSeno();
		add(panelseno);
		setTitle("SENO");

	}
}
class PanelSeno extends JPanel implements ActionListener{
	static String fecha = "";

	static String concatenarRespuesta = "";
	static String operacion ="";
	JLabel tituloSeno = new JLabel("SENO");
	JLabel sin = new JLabel("Sin(");
	JTextField valorSeno = new JTextField(10);
	JLabel parentesis = new JLabel(")");
	JComboBox opciones = new JComboBox();
	//--------------TEXTO Y BOTONES RESULTADOS---------------
	JLabel resultadoTexto = new JLabel("RESULTADO:");
	JTextField resultadoventana = new JTextField(10);
	JButton calcular = new JButton("CALCULAR");
	JButton guardar = new JButton("GUARDAR RESULTADO");
	public PanelSeno(){
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
		guardar.setBounds(20, 220, 180, 30);
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
		 String senoParseado = "";
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
					 for( k =0;k<2*i+1;++k){
						 dividendo*=conversion;
					 }
					 divisor =1;
					 for( u=1;u<=2*i+1;++u){
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
				 GuardarSeno guardarseno = new GuardarSeno(resultadoventana.getText());
				 guardar.addActionListener(guardarseno);
		 }else {
			 int signo =0;
			 String senoParseados="";
				double seno =0;
				int k =0;
				int u =0;
				double conversion =0;
				double dividendo = 0;
				double divisor =0;
				Double grado2 = Double.parseDouble(valorSeno.getText());
				double conversionRadianes = grado2*(180/3.1416); 
				 conversion = conversionRadianes *(3.1416/180);
				 for(int i =0; i<=100;++i){
					 dividendo=1;
					 for( k =0;k<2*i+1;++k){
						 dividendo*=conversion;
					 }
					 divisor =1;
					 for( u=1;u<=2*i+1;++u){
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
				 GuardarSeno guardarseno = new GuardarSeno(resultadoventana.getText());
				 guardar.addActionListener(guardarseno);	
		 }
		 
		 operacion = "seno("+valorSeno.getText()+")";
		 concatenarRespuesta = resultadoventana.getText();
					 
	 }
	 public static String guardar (){
			String guardarcon ="";
			guardarcon += concatenarRespuesta+"                                                     "+operacion+ "                                                                        "+fecha+",";
			return guardarcon;
		}
	 class GuardarSeno extends JPanel implements ActionListener{
			String seno1;	
			int g =0;
			public GuardarSeno(String senom){
				seno1 = senom;
			}
			 public void actionPerformed(ActionEvent e){
				if(g<1){
					 String guardado = seno1;
					 System.out.println(guardado);
					 g++;	 
				 }
				 
			 }
		}		
}
