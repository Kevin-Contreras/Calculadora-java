import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Date;
class BinomioCuadrado extends JFrame{
	public BinomioCuadrado(){
		setSize(350,380);
		PanelBinomio panelbinomio = new PanelBinomio();
		add(panelbinomio);
		setTitle("BINOMIO CUADRADO");
	}
}
class PanelBinomio extends JPanel implements ActionListener{
	static String fecha ="";
	static String concatenarRespuesta = "";
	static String operacion = "";
	JLabel sumadiferenciatexto = new JLabel("SUMA Y DIFERENCIA DE CUBOS");
	JLabel parentecis = new JLabel("( ");
	JTextField valor1 = new JTextField(20);
	JLabel A = new JLabel("A^2+");
	JTextField valor2 = new JTextField(20);
	JLabel AB = new JLabel("AB+");
	JTextField valor3 = new JTextField(20);
	JLabel B = new JLabel("B^2)");
	//--------------------- VARIABLES RESULTADO--------------------
	JLabel resultadoTexto = new JLabel("RESULTADO");
	JLabel parentecis2 = new JLabel("( ");
	JTextField valor4 = new JTextField(20);
	JLabel Asin = new JLabel("A");
	JTextField valorsigno = new JTextField(20);
	JTextField valor5 = new JTextField(20);
	JLabel Bpar = new JLabel("B)^2");
	JButton guardar = new JButton("GUARDAR RESULTADO");
	JButton calcular = new JButton("CAULCULAR");
	 double valor1parseado= 0;
	public PanelBinomio(){
		setLayout(null);
		sumadiferenciatexto.setBounds(20, 20, 250, 20);
		parentecis.setBounds(60,65,40,40);
		valor1.setBounds(70,70,30,30);
		A.setBounds(100,75,30,20);
		valor2.setBounds(135,70,30,30);
		AB.setBounds(165,75,30,20);
		valor3.setBounds(195,70,30,30);
		B.setBounds(225,75,30,20);
		add(sumadiferenciatexto);
		add(parentecis);
		add(valor1);
		add(A);
		add(valor2);
		add(AB);
		add(valor3);
		add(B);
		//------------------------RESULTADOS---------------------
		resultadoTexto.setBounds(20, 150, 200, 20);
		parentecis2.setBounds(60,210,20,20);
		valor4.setBounds(80,205,30,30);
		Asin.setBounds(110,210,30,20);
		valorsigno.setBounds(140,205,30,30);
		valor5.setBounds(180,205,30,30);
		Bpar.setBounds(210,210,30,20);
		calcular.setBounds(20,300 , 130, 30);
		guardar.setBounds(160,300 , 170, 30);
		add(resultadoTexto);
		add(parentecis2);
		add(valor4);
		add(Asin);
		add(valorsigno);
		add(valor5);
		add(Bpar);
		add(calcular);
		add(guardar);
		//----------------------------LOGICA-------------------------------
		
		calcular.addActionListener(this);
		guardar.addActionListener(this);
		
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
		double raizene2=2;
		double r =0;
		double resultados =0;
		String guardarResultado = "";
		double raizne = Double.parseDouble(valor1.getText()) ;
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
			
			
		if(resultado*resultados*2 == Double.parseDouble(valor2.getText().replace("-", ""))){
			String resultadoString = String.valueOf(resultado);
			valor4.setText(resultadoString);
			String resultadoString1 = String.valueOf(resultados);
			valor5.setText(resultadoString1);
			if(valor2.getText().contains("-")){
				valorsigno.setText("-");
			}else{
				valorsigno.setText("+");
			}
			GuardarBinomioCuadrado guardarBinomio = new GuardarBinomioCuadrado(valor4.getText(),valorsigno.getText(),valor5.getText());
			guardar.addActionListener(guardarBinomio);
		}else{
			
		}
		System.out.println(resultado);
		System.out.println(resultados);
		concatenarRespuesta= "("+ valor1.getText()+"A^2+"+valor2.getText()+"AB"+" + "+valor3.getText()+"B^2)";
		operacion ="("+  valor4.getText()+"A" + valorsigno.getText()+valor5.getText() + "B)^2";
	}
	public static String guardar (){
		String guardarcon ="";
		guardarcon +=  operacion+"                                               "+concatenarRespuesta+"                                                                        "+fecha+",";
		return guardarcon;
	}
}
class GuardarBinomioCuadrado extends JPanel implements ActionListener{
	String valor4 ="";
	String valorsigno ="";
	String valor5 ="";
	int g =0;
	
	public GuardarBinomioCuadrado(String valor1,String valor2,String valor3){
		valor4 = valor1;
		valorsigno=valor2;
		valor5=valor3;
		
	}
	 public void actionPerformed(ActionEvent e){
		if(g<1){
			String guardarResultado ="("+  valor4+"A" + valorsigno+valor5 + "B)^2";
			String guardado = guardarResultado;
			 System.out.println(guardado);
			 g++;
		 }
		
	 }
}