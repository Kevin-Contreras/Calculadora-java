import java.awt.*;
import java.util.Date;

import javax.swing.*;

import java.awt.event.*;
 class Longuitud extends JFrame{
public Longuitud (){
	setSize(500,300);
	PanelArco arco = new PanelArco();
	setTitle("LONGUITUD DE ARCO");
	add(arco);
}
}
class PanelArco extends JPanel implements ActionListener{
	static String radangulo = ""; 
	static String radioDES ="";

	JLabel arcoTexto = new JLabel("LONGUITUD DE ARCO");
	JLabel angulo = new JLabel("ANGULO");
  JTextField valorAngulo = new JTextField(10);
	JLabel radiotexto = new JLabel("RADIO");
	JTextField valorRadio = new JTextField(10);
	JComboBox opciones = new JComboBox();
	//-------------------BOTONES Y TEXTO RESULTADO----------------------
	JLabel resultadoTexto = new JLabel("RESULTADO");
	JTextField valorResultado = new JTextField(10);
	JButton calcular = new JButton("CALCULAR");
	JButton guardarRes = new JButton("GUARDAR RESULTADO");
	JButton graficas = new JButton("GRAFICA");
	static String guardardos = "";
	static String cadenaLonguitudArcoR="";
	
	static double radian=0;
	static String fecha ="";
	
	public  PanelArco(){
		
		opciones.addItem("GRADOS");
		opciones.addItem("RADIAN");
		setLayout(null);
		arcoTexto.setBounds(20, 20, 150, 10);
		angulo.setBounds(30, 60, 50, 10);
		valorAngulo.setBounds(80, 55, 80, 25);
		radiotexto.setBounds(30, 100, 50, 10);
		valorRadio.setBounds(80, 95, 80, 25);
		opciones.setBounds(200, 55, 100, 25);
		add(arcoTexto);
		add(angulo);
		add(valorAngulo);
		add(radiotexto);
		add(valorRadio);
		add(opciones);
		//-----------------------RESULTADO------------------------
		resultadoTexto.setBounds(20, 160, 80, 10);
		valorResultado.setBounds(100, 150, 180, 25);
		calcular.setBounds(300, 150, 150, 25);
		guardarRes.setBounds(20, 200, 180, 25);
		add(resultadoTexto);
		add(valorResultado);
		add(calcular);
		add(guardarRes);
		//-------------------------EVENTOS-------------------
		calcular.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		Date fecha1 = new Date();
		fecha = fecha1.toString();
		String angulo = valorAngulo.getText();
		String radio = valorRadio.getText();
		
		//-----------convertidas a double---------------
	double anguloDouble = Double.parseDouble(angulo);
	double radioDouble = Double.parseDouble(radio);
	if(opciones.getSelectedItem()=="GRADOS"){
		double longuitudArcoGrados = 2*3.14159265359*radioDouble*(anguloDouble/360);
			String cadenaLonguitudArco = String.valueOf(longuitudArcoGrados);
			guardardos=cadenaLonguitudArco ;
		valorResultado.setText(cadenaLonguitudArco);
		PanelGrafic grafica = new PanelGrafic(longuitudArcoGrados,radioDouble,anguloDouble);
		grafica.setVisible(true);
		GuardarLonguitud guardarvalor = new GuardarLonguitud(cadenaLonguitudArco);
		guardarRes.addActionListener(guardarvalor);
	}else{
		 radian = anguloDouble*(180/3.14159265359);
		double longuitudArcoRadianes = radioDouble*anguloDouble;
		cadenaLonguitudArcoR = String.valueOf(longuitudArcoRadianes);
		valorResultado.setText(cadenaLonguitudArcoR);		
		PanelGrafic grafica = new PanelGrafic(longuitudArcoRadianes,radioDouble,radian);
		grafica.setVisible(true);
		GuardarLonguitud guardarvalor = new GuardarLonguitud(cadenaLonguitudArcoR);
		guardarRes.addActionListener(guardarvalor);
		guardardos+=cadenaLonguitudArcoR;
	}
	radangulo = valorAngulo.getText();
	radioDES = valorRadio.getText();
	}
	static String guardarcon="";
		public static String guardar (){
				System.out.print("ds");
				System.out.println(fecha);
				System.out.println(guardardos);
				guardarcon +=  guardardos+"                                                    "+"angulo: "+radangulo+" radio: "+radioDES+"                                                                        "+fecha+",";
					
			return guardarcon;	
		}		
	
}
//---------------------GRAFICA-----------------------
class PanelGrafic extends JFrame{
	int longuitud = 0;
	int radioarco = 0;
	int anguloArco = 0;
	
	public PanelGrafic (double valorL,double valorR,double valorA){
		longuitud = (int)valorL;
		radioarco =(int) valorR;
		anguloArco = (int)valorA;
		setSize(200,200);
		Panel2Grafic graficas = new Panel2Grafic();
		graficas.setVisible(true);
		setTitle("GRAFICA DE LA LONGUITUD DE ARCO");
		add(graficas);
	}
	class Panel2Grafic extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawArc(10, 10, radioarco,radioarco, 0, anguloArco);

		}
	}
}
class GuardarLonguitud extends JPanel implements ActionListener{
	String longuitudGuardar;	
	int g =0;
	String guardado="";
	
	 public void actionPerformed(ActionEvent e){
			if(g<1){
				this.guardado  = longuitudGuardar ;
				 g++;	
				 
			 
			 }
		 }
	public GuardarLonguitud(String longuitud){
		this.longuitudGuardar = longuitud ;
	}
	
}		


