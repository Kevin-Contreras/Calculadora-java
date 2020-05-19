
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
class ingresoManualPotencia extends JFrame {
	public ingresoManualPotencia(String matriz){
		setSize(500,500);
		PanelPotencia paneltraspuestadeterminante = new PanelPotencia(matriz);
		add(paneltraspuestadeterminante);
		setTitle("INGRESO MANUEAL POTENCIA");
	
	}
}
class PanelPotencia extends JPanel  implements ActionListener{
	JLabel titulo = new JLabel("CALCULO DE LA INVERSA");
	JLabel tituloPotencia = new JLabel("POTENCIA");
	static JTextField valorPotencia = new JTextField();
	 JButton calcular = new JButton("CALCULAR");
	 JLabel resultadoTexto = new JLabel("RESULTADO:");
	 JTextField valorResultado = new JTextField();
	 static JTextField[][] matrizVieja;
		double [][] matriz;
		double  [][]matriz2;

	 JLabel tras = new JLabel("RESULTADO:");
	 static int click = 0;
	int u = 0;
	int x=0;
	int y = 0;
	public PanelPotencia(String valor1){
		int valor1int = Integer.parseInt(valor1);
		setLayout(null);
		titulo.setBounds(20, 0, 300, 30);
		tituloPotencia.setBounds(20, 20, 100, 30);
		valorPotencia.setBounds(100, 25, 50, 25);
		add(calcular);
		add(tras);
		add(titulo);
		add(valorResultado);
		add(tituloPotencia);
		add(valorPotencia);
		click = valor1int;
		 matrizVieja = new  JTextField[valor1int][valor1int];
		 matriz = new double[valor1int][valor1int];
		 matriz2 = new double[valor1int][valor1int];

		 
		setLayout(null);
		
		for(int a =0; a<valor1int; ++a){
			y+=60;
			x =0;
			for(int k =0; k<valor1int; ++k){
				x+=60;
				matrizVieja[a][k]= new JTextField(200);
				matrizVieja[a][k].setBounds(x,y,40,30);
				calcular.setBounds(20, 125+y, 100, 30);
				add(matrizVieja[a][k]);
				
			}
		}
		calcular.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		String Obtener= valorPotencia.getText();
		double obternerdoble = Double.parseDouble(Obtener);
		for(int i =0; i<click;i++){
			for(int j =0; j<click;j++){
			String texto =	matrizVieja[i][j].getText();
			double textoParseado = Double.parseDouble(texto);
			matriz[i][j]= textoParseado;
			}
		}
		
			multiplicarMatrices(matriz,matriz);
		
		
	

			}
	public static double[][] multiplicarMatrices(double matrizA[][], double matrizB[][]) {
		String Obtener = valorPotencia.getText();
		double obternerdoble = Double.parseDouble(Obtener);
	    double matrizResultado[][] = new double[(int) obternerdoble][(int)obternerdoble];
	    double matrizResultados[][] = new double[click][click];
	    for (int j = 0; j <obternerdoble; j++){
	    	for (int k=0;k<obternerdoble;k++) {
	    		 matrizResultado[j][k]=1;
	    	}
	    }
            
	    
	   
	    for (int i = 0; i < click; i++) {
	        for (int j = 0; j <click; j++) {
	            for (int k=0;k<click;k++) {
	            
	            	
	                matrizResultado[j][k]*= (matrizA[k][j]);
	                matrizResultados[i][j]+= (matrizResultado[i][j]); 
	                   
	            }
	            System.out.println();
	            String o = String.valueOf(matrizResultados[i][j]);
	            matrizVieja[i][j].setText(o);
	          
	        }

	    }
	    

	    return matrizResultado;
	}
}