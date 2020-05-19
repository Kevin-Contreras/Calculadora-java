import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Date;
class Sumayrestadecubos extends JFrame{
	public Sumayrestadecubos(){
		setSize(500,500);
		PanelSumaResta resta = new PanelSumaResta();
		add(resta);
		setTitle("SUMA Y DIFERENCIA DE CUBOS");
	}
}
class PanelSumaResta extends JPanel implements ActionListener{
static String fecha ="";
	//------------------botones y textos------------------
	JLabel sumadiferenciatexto = new JLabel("SUMA Y DIFERENCIA DE CUBOS");
	JLabel parentecis = new JLabel("( ");
	JTextField valor1 = new JTextField(20);
	JLabel A = new JLabel("A^3)");
	JComboBox opciones = new JComboBox();
	JLabel parenticis2 = new JLabel ("(");
	JTextField valor3 = new JTextField(20);
	JLabel B = new JLabel("B^3)");
	//---------------- BOTONES Y TEXTOS RESULTADOS ------------------
	JLabel resultadoTexto = new JLabel("RESULTADO");
	JLabel parentecis2 = new JLabel("( ");
	JTextField valor4 = new JTextField(20);
	JLabel Asin = new JLabel("A");
	JTextField valorsigno = new JTextField(20);
	JTextField valor5 = new JTextField(20);
	JLabel Bpar = new JLabel("B)");
	JButton guardar = new JButton("GUARDAR RESULTADO");
	JButton calcular = new JButton("CAULCULAR");
	//-------------------------------------
	JLabel parentecisnose = new JLabel("( ");
	JTextField valor6 = new JTextField(20);
	JLabel Ares = new JLabel("A^2+");
	JTextField valor7 = new JTextField(20);
	JLabel AB = new JLabel("AB+");
	JTextField valor8 = new JTextField(20);
	JLabel Bres = new JLabel("B^2)");
	static String concatenarRespuesta="";
	static String operacion = "";
	//-----------------------------------
	public PanelSumaResta(){
		setLayout(null);
		sumadiferenciatexto.setBounds(20, 20, 250, 20);
		parentecis.setBounds(60,65,40,40);
		valor1.setBounds(70,70,30,30);
		A.setBounds(100,75,70,20);
		opciones.setBounds(170,70,50,30);
		 parenticis2.setBounds(240,70,30,30);
		valor3.setBounds(270,70,30,30);
		B.setBounds(300,75,30,20);
		opciones.addItem("+");
		opciones.addItem("-");
		add(sumadiferenciatexto);
		add(parentecis);
		add(valor1);
		add(A);
		add(opciones);
		add(parenticis2);
		add(valor3);
		add(B);
		
//-------------------------------
		resultadoTexto.setBounds(20, 150, 200, 20);
		parentecis2.setBounds(60,210,20,20);
		valor4.setBounds(80,205,30,30);
		Asin.setBounds(110,210,30,20);
		valorsigno.setBounds(140,205,30,30);
		valor5.setBounds(180,205,30,30);
		Bpar.setBounds(210,210,30,20);
		calcular.setBounds(20,300 , 130, 30);
		guardar.setBounds(200,300 , 200, 30);

		add(resultadoTexto);
		add(parentecis2);
		add(valor4);
		add(Asin);
		add(valorsigno);
		add(valor5);
		add(Bpar);
		add(calcular);
		add(guardar);
//----------------------------------
		parentecisnose.setBounds(240,210,30,20);
		valor6.setBounds(270,205,30,30);
		Ares.setBounds(300,210,30,20);
		valor7.setBounds(330,205,30,30);
		AB.setBounds(360,210,30,20);
		valor8.setBounds(390,205,30,30);
		Bres.setBounds(420,210,30,20);
		add(parentecisnose);
		add(valor6);
		add(Ares);
		add(valor7);
		add(AB);
		add(valor8);
		add(Bres);
//---------- EVENTOS----------
		calcular.addActionListener(this);
		
		
//-----------------------LOGICA-------------------------
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		Date fecha1 = new Date();
		fecha = fecha1.toString();
		double resultado = 0;
		double resultadoRaiz;
		double t =0;
		double resolviendo = 0;
		double iterar=0;
		double iterar1 =0;
		double raizene2=3;
		double r =0;
		double resultados =0;
		double raizne = Double.parseDouble(valor1.getText()) ;
		if(opciones.getSelectedItem()=="+"){
			if(valor1.getText().contains("-")){
				System.out.println("Math error");
			}
			else{
				for(t =1; iterar<1;t+=1 ){
					iterar = t*t;
					resultado = t - (iterar-raizne)/(raizene2*(iterar/t));
					for(int o =0; o<20;++o){
						double iterare =1;
						for(int h =0; h<raizene2;++h){
							iterare *= resultado;
						}
						resultado = resultado - (iterare-raizne)/(raizene2*(iterare/resultado));
						
					}
				}	
			}
	double raizne2 = Double.parseDouble(valor3.getText());
			if(valor3.getText().contains("-")){
				System.out.println("no existe el binomio");
			}
			else{
				for(r =1; iterar1<1;r+=1 ){
					iterar1 = r*r;
					resultados = r - (iterar1-raizne2)/(raizene2*(iterar1/r));
					for(int m =0; m<20;++m){
						double iterares =1;
						for(int w =0; w<raizene2;++w){
							iterares *= resultados;
						}
						resultados = resultados - (iterares-raizne2)/(raizene2*(iterares/resultados));
						
					}
				}	
			}
			double elevado = resultado*resultado;
			double elevado2 = resultados*resultados;
			double abd = resultado*resultados;
			String resultadoElevado = String.valueOf(elevado);
			String resultadoElevado2 = String.valueOf(elevado2);
			String resultadoString = String.valueOf(resultado);
			String resultadoString1 = String.valueOf(resultados);
			String abdString = String.valueOf(abd);
			
			valor4.setText(resultadoString);
			valorsigno.setText("+");
			valor5.setText(resultadoString1);
			valor6.setText(resultadoElevado);
			valor7.setText(abdString);
			valor8.setText(resultadoElevado2);
			Ares.setText("A^2-");

			
			
		}else{
			if(valor1.getText().contains("-")){
				System.out.println("Math error");
			}
			else{
				for(t =1; iterar<1;t+=1 ){
					iterar = t*t;
					resultado = t - (iterar-raizne)/(raizene2*(iterar/t));
					for(int o =0; o<20;++o){
						double iterare =1;
						for(int h =0; h<raizene2;++h){
							iterare *= resultado;
						}
						resultado = resultado - (iterare-raizne)/(raizene2*(iterare/resultado));
						
					}
				}	
			}
	double raizne2 = Double.parseDouble(valor3.getText());
			if(valor3.getText().contains("-")){
				System.out.println("no existe el binomio");
			}
			else{
				for(r =1; iterar1<1;r+=1 ){
					iterar1 = r*r;
					resultados = r - (iterar1-raizne2)/(raizene2*(iterar1/r));
					for(int m =0; m<20;++m){
						double iterares =1;
						for(int w =0; w<raizene2;++w){
							iterares *= resultados;
						}
						resultados = resultados - (iterares-raizne2)/(raizene2*(iterares/resultados));
						
					}
				}	
			}
			double elevado = resultado*resultado;
			double elevado2 = resultados*resultados;
			double abd = resultado*resultados;
			String resultadoElevado = String.valueOf(elevado);
			String resultadoElevado2 = String.valueOf(elevado2);
			String resultadoString = String.valueOf(resultado);
			String resultadoString1 = String.valueOf(resultados);
			String abdString = String.valueOf(abd);
			
			valor4.setText(resultadoString);
			valorsigno.setText("-");
			valor5.setText(resultadoString1);
			valor6.setText(resultadoElevado);
			valor7.setText(abdString);
			valor8.setText(resultadoElevado2);
			Ares.setText("A^2+");
		}
		GuardarDatos guardarDatos = new GuardarDatos(valor4.getText(),valor5.getText(),valor6.getText(),valor7.getText(),valor8.getText(),valorsigno.getText(),Ares.getText());
		guardar.addActionListener(guardarDatos);
		operacion = "("+valor1.getText()+"A^3)"+opciones.getSelectedItem()+"("+valor3.getText()+"B^3)";
		 concatenarRespuesta = "("+valor4.getText()+"A"+valorsigno.getText()+valor5.getText()+"B)"+"("+valor6.getText()+Ares.getText()+valor7.getText()+"AB+"+valor8.getText()+"B^2)";
		 
	}
	public static String guardar (){
		String guardarcon ="";
		
		guardarcon += concatenarRespuesta+"                                                     "+operacion+ "                                                                        "+fecha+",";
		return guardarcon;
	}
	
}
class GuardarDatos extends JPanel implements ActionListener {
	String valor32,valor71,valor8,valor9, valor10,valor11,valor12;
	int g =0;
	public GuardarDatos(String valor1,String valor2,String valor3,String valor4, String valor5,String valor6,String valor7){
		valor32 = valor1;
		valor71=valor2;
		valor8 = valor3;
		valor9=valor4;
		valor10=valor5;
		valor11=valor6;
		valor12=valor7;
		
		
	}
	public void actionPerformed(ActionEvent e){
		if(g<1){
			String concatenar = "("+valor32+"A"+valor11+valor71+"B)"+"("+valor8+valor12+valor9+"AB+"+valor10+"B^2)";
			System.out.println(concatenar);
			g++;
		}
		
	}
	
}