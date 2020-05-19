import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Date;
public class Tangente extends JFrame{
 public Tangente (){
	 setSize(350,325);
		PanelTangente panelTangente = new PanelTangente();
		add(panelTangente);
		setTitle("TANGENTE");

 }
}
class PanelTangente extends JPanel implements ActionListener{
	static String fecha ="";
	static String concatenarRespuesta = "";
	static String operacion ="";
	JLabel tituloSeno = new JLabel("TANGENTE");
	JLabel sin = new JLabel("tan(");
	JTextField valorSeno = new JTextField(10);
	JLabel parentesis = new JLabel(")");
	JComboBox opciones = new JComboBox();
	//--------------TEXTO Y BOTONES RESULTADOS---------------
	JLabel resultadoTexto = new JLabel("RESULTADO:");
	JTextField resultadoventana = new JTextField(10);
	JButton calcular = new JButton("CALCULAR");
	JButton guardar = new JButton("GUARDAR RESULTADO");
	public PanelTangente(){
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
		//----------------------------LOGICA---------------------
		
} 
	public void actionPerformed(ActionEvent e){
		Date fecha1 = new Date();
		fecha = fecha1.toString();
		String tangenteConvertida="";
		int signo =0;
		double seno =0;
		double coseno =0;
		int k =0;
		int u =0;
		double conversion =0;
		double dividendo = 0;
		double divisor =0;
		//DECLARACION DE VARIABLES
		
			if(opciones.getSelectedItem()== "GRADOS"){
				String grados = valorSeno.getText();
				
				int grado2 = Integer.parseInt(grados);
				 conversion = grado2 *(3.14159265359/180);
				//------------------------COSENO-----------------------
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
					 coseno += (dividendo/divisor)*signo; 
				 }
				 //-------------------COSENO----------------------
			
				 //--------------------SENO--------------------------
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
				 
				 //----------------------SENO------------------------------
				 //------------------TANGENTE----------------------------
				 double tangente = seno/coseno;
				tangenteConvertida = String.valueOf(tangente);
				 resultadoventana.setText(tangenteConvertida);	
			}else{
				String grados = valorSeno.getText();
				int grado2 = Integer.parseInt(grados);
				double conversionRadianes = grado2*(180/3.1416); 
				 conversion = conversionRadianes *(3.14159265359/180);
				//------------------------COSENO-----------------------
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
					 coseno += (dividendo/divisor)*signo; 
				 }
				 //-------------------COSENO----------------------
			
				 //--------------------SENO--------------------------
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
				 
				 //----------------------SENO------------------------------
				 //------------------TANGENTE----------------------------
				 double tangente = seno/coseno;
				 tangenteConvertida = String.valueOf(tangente);
				 resultadoventana.setText(tangenteConvertida);
			}	
			GuardarTangente guardartangente = new GuardarTangente(tangenteConvertida);
			 guardar.addActionListener(guardartangente);
			 operacion = "tan("+valorSeno.getText()+")";
			 concatenarRespuesta = resultadoventana.getText();
	}
	 public static String guardar (){
			String guardarcon ="";
			guardarcon += concatenarRespuesta+"                                                     "+operacion+ "                                                                        "+fecha+",";
			return guardarcon;
		}	
}
class GuardarTangente extends JPanel implements ActionListener{
	String tangente1 ="";
	String guardado="";
	int g =0;
	public GuardarTangente(String tangente){
		tangente1 = tangente;
		this.guardado = "";
	}
	 public void actionPerformed(ActionEvent e){
		if(g<1){
			guardado = tangente1;
			 
			 g++;
		 }
		
	 }
}