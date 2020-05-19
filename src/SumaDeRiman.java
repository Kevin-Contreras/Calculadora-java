import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Date;
public class SumaDeRiman extends JFrame {
public SumaDeRiman(){
	setSize(400,340);
	PanelSumaRiman suma = new PanelSumaRiman();
	setTitle("SUMA DE RIMANN");
	add(suma);
}
}
class PanelSumaRiman extends JPanel implements ActionListener{
	static String fecha = "";
	static String concatenarRespuesta = "";
	static String operacion ="";
	JLabel titulo = new JLabel("SUMATORIA DE RIMANN");
	 JLabel	limiteinferior = new JLabel("LIMITE INFERIOR");
	 JTextField valorInferior = new JTextField(10);
	 JLabel limiteSuperior = new JLabel("LIMITE SUPERIOR");
	 JTextField valorSuperior = new JTextField(10);
	 JLabel funcion = new JLabel("FUNCION:");
	 JComboBox opciones = new JComboBox();
	 JLabel diferencial = new JLabel("DIFERENCIAL");
	 JButton Calcular = new JButton("CALCULAR");
	 JTextField valorDiferencial = new JTextField(10);
	 JLabel resultadoTexto = new JLabel("RESULTADO:");
	 JTextField valorResultado = new JTextField(10);
	 JButton Guardar  = new JButton("GUARDAR RESULTADO");
	 public PanelSumaRiman(){
		 opciones.addItem("CUADRATICA");
		 opciones.addItem("CUBICA");
		 opciones.addItem("EXPONENCIAL");
		 setLayout(null);
		 titulo.setBounds(20, 20, 150, 10);
		 limiteinferior.setBounds(20, 40, 150, 10);
		 valorInferior.setBounds(175, 40, 150, 25);
		 limiteSuperior.setBounds(20, 80, 150, 10);
		 valorSuperior.setBounds(175, 80, 150, 25);
		 funcion.setBounds(20, 120, 150, 10);
		 opciones.setBounds(175, 120, 150, 25);
		 diferencial.setBounds(20, 160, 150, 10);
		 valorDiferencial.setBounds(175, 160, 150, 25);
		 resultadoTexto.setBounds(20, 190, 150, 10);
		 valorResultado.setBounds(175, 190, 150, 25);
		 Calcular.setBounds(20, 220, 150, 25);
		 Guardar.setBounds(180, 220, 170, 25);
		 
		add(titulo);
		add(limiteinferior);
		add(valorInferior);
		add(limiteSuperior);
		add(valorSuperior);
		add(funcion);
		add(opciones);
		add(diferencial);
		add(valorDiferencial);
		add(resultadoTexto);
		add(valorResultado);
		add(Calcular);
		add(Guardar);
		//-------------------EVENTOS--------------
		Calcular.addActionListener(this);
		
		
	 }
	 public void actionPerformed(ActionEvent e){
		 Date fecha1 = new Date();
			fecha = fecha1.toString();
		//------------------- LOGICA---------------
		 double inferior = Double.parseDouble(valorInferior.getText());
		 double superior = Double.parseDouble(valorSuperior.getText());
		 double formula =0;
		 double diferencialdouble= Double.parseDouble(valorDiferencial.getText()); 
		 if(opciones.getSelectedItem()== "CUADRATICA"){
			 double rectangulos = (superior-inferior)/diferencialdouble;
			 for(double u =1; u<rectangulos;++u){
				  formula += (inferior+u*diferencialdouble)*(inferior+u*diferencialdouble)*diferencialdouble;
				  
			 }
			 String formulaString = String.valueOf(formula);
			 valorResultado.setText(formulaString);
		
		 }else if(opciones.getSelectedItem()== "CUBICA"){
			 double rectangulos = (superior-inferior)/diferencialdouble;
			 for(double u =1; u<rectangulos;++u){
				  formula += (inferior+u*diferencialdouble)*(inferior+u*diferencialdouble)*(inferior+u*diferencialdouble)*diferencialdouble;
				  
			 }
			 String formulaString = String.valueOf(formula);
			 valorResultado.setText(formulaString);
		 }else if(opciones.getSelectedItem()== "EXPONENCIAL"){
			 double exponencial =1;
			 double rectangulos = (superior-inferior)/diferencialdouble;
			 double u =1;
			 double k=0;
			 
			 for(u=1; u<rectangulos-1;++u){ 
			 }
			 for(k = 0;k<(inferior+u*diferencialdouble);++k){ 
				 exponencial *= 2.71828; 
			 }
			 double ex = exponencial-3;  
			 String formulaString = String.valueOf(exponencial);
			 valorResultado.setText(formulaString);
			 GuardarRiman riman = new GuardarRiman(formulaString);
			 Guardar.addActionListener(riman);
		 }
		 operacion = "inf: "+valorInferior.getText()+" sup: "+valorSuperior.getText()+" fun: "+opciones.getSelectedItem()+" dif: "+valorDiferencial.getText();
		 concatenarRespuesta=valorResultado.getText();
		 
	 }
	 public static String guardar (){
			String guardarcon ="";
			guardarcon += concatenarRespuesta+"                                                     "+operacion+ "                                                                        "+fecha+",";
			return guardarcon;
		}	
}
class GuardarRiman extends JPanel implements ActionListener{
	String sima;	
	int g =0;
	public GuardarRiman(String rimansuma){
		sima = rimansuma;
	}
	 public void actionPerformed(ActionEvent e){
		if(g<1){
			 String guardado = sima;
			 System.out.println(guardado);
			 g++;	 
		 }
		 
	 }
}		
