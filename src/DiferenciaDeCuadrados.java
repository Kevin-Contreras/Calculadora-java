import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Date;

class Diferenciadecuadrados  extends JFrame{
	public Diferenciadecuadrados(){
		setSize(360,380);
		PanelBinomios panelbinomio = new PanelBinomios();
		add(panelbinomio);
		setTitle("DIFERENCIA DE CUADRADOS");

	}
}
class PanelBinomios extends JPanel implements ActionListener{
	static String fecha = "";
	static String operacion = "";
	static String concatenarRespuesta ="";
	
	JLabel sumadiferenciatexto = new JLabel("DIFERENCIA DE CUADRADOS");
	JLabel parentecis = new JLabel("( ");
	JTextField valor1 = new JTextField(20);
	JLabel A = new JLabel("A^2)-(");
	JTextField valor3 = new JTextField(20);
	JLabel B = new JLabel("B^2)");
	//--------------------- VARIABLES RESULTADO--------------------
	JLabel resultadoTexto = new JLabel("RESULTADO");
	JLabel parentecis2 = new JLabel("( ");
	JTextField valor4 = new JTextField(20);
	JLabel Asin = new JLabel("A+");
		JTextField valor5 = new JTextField(20);
	JLabel Bpar = new JLabel("B)");
	//----------------------------------
	JLabel parentecis3 = new JLabel("( ");
	JTextField valor6 = new JTextField(20);
	JLabel Amenos = new JLabel("A-");
		JTextField valor7 = new JTextField(20);
	JLabel Bmayor = new JLabel("B)");
	JButton guardar = new JButton("GUARDAR RESULTADO");
	JButton calcular = new JButton("CAULCULAR");
	 double valor1parseado= 0;
	public PanelBinomios(){
		setLayout(null);
		sumadiferenciatexto.setBounds(20, 20, 250, 20);
		parentecis.setBounds(60,65,40,40);
		valor1.setBounds(70,70,30,30);
		A.setBounds(100,75,70,20);
		valor3.setBounds(140,70,30,30);
		B.setBounds(170,75,30,20);
		add(sumadiferenciatexto);
		add(parentecis);
		add(valor1);
		add(A);
		add(valor3);
		add(B);
		//------------------------RESULTADOS---------------------
		resultadoTexto.setBounds(20, 150, 200, 20);
		parentecis2.setBounds(60,210,10,20);
		valor4.setBounds(70,205,30,30);
		Asin.setBounds(100,210,30,20);
		valor5.setBounds(115,205,30,30);
		Bpar.setBounds(145,210,30,20);
		parentecis3.setBounds(175,210,10,20);
		valor6.setBounds(180,205,30,30);
		Amenos.setBounds(210,210,30,20);
		valor7.setBounds(225,205,30,30);
		Bmayor.setBounds(255,210,30,20);
		calcular.setBounds(20,300 , 130, 30);
		guardar.setBounds(160,300 , 180, 30);
		add(resultadoTexto);
		add(parentecis2);
		add(valor4);
		add(Asin);
		add(valor5);
		add(Bpar);
		add(parentecis3);
		add(valor6);
		add(Amenos);
		add(valor7);
		add(Bmayor);
		add(calcular);
		add(guardar);
		//----------------------------LOGICA-------------------------------
		
		calcular.addActionListener(this);
		
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
			String resultadoString = String.valueOf(resultado);
			String resultadoString1 = String.valueOf(resultados);
		valor4.setText(resultadoString);
		valor5.setText(resultadoString1);
		valor6.setText(resultadoString);
		valor7.setText(resultadoString1);
		System.out.println(resultado);
		System.out.println(resultados);
		GuardarDiferenciaCuadrados n = new GuardarDiferenciaCuadrados(valor4.getText(),valor5.getText());
		guardar.addActionListener(n);
		operacion = "("+valor1.getText()+"A^2)-("+valor3.getText()+"B^2)";
		concatenarRespuesta ="("+  valor4.getText()+"A+" +valor5.getText() + "B)"+"("+  valor4.getText()+"A-" +valor5.getText() + "B)";
	}
	public static String guardar (){
		String guardarcon ="";
	
		guardarcon += concatenarRespuesta+"                                                     "+operacion+ "                                                                        "+fecha+",";
		return guardarcon;
	}
}
class GuardarDiferenciaCuadrados extends JPanel implements ActionListener{
	String valor4 ="";
	String valor5 ="";
	int g =0;
	
	public GuardarDiferenciaCuadrados(String valor1,String valor2){
		valor4 = valor1;
		valor5=valor2;
		
		
	}
	 public void actionPerformed(ActionEvent e){
		if(g<1){
			String guardarResultado ="("+  valor4+"A+" +valor5 + "B)"+"("+  valor4+"A-" +valor5 + "B)";
			String guardado = guardarResultado;
			 System.out.println(guardado);
			 g++;
		 }
		
	 }
}