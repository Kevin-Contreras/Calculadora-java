
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class DatosAnaliticosPotencia extends JFrame implements ActionListener {
	JLabel label = new JLabel("CALCULO DE DETERMINANTE");
	JTextField datos = new JTextField(20);
	JButton resultado = new JButton("RESULTADO");
	JLabel resultadoTexto = new JLabel("RESULTADO");
	static JTextField valorResultado = new JTextField(20);
	JLabel potenciaTitulo = new JLabel("POTENCIA");
	JTextField valorPotencia = new JTextField(20);
	String valorDado = "";
	String guardar [][];
	double us [][];
	String[] nose;
	int r =0;
	int p=0;
	int g=0;
 public DatosAnaliticosPotencia(String analisis){
	 valorDado = analisis;
	 int valorInt2 = Integer.parseInt(valorDado);
	 nose = new  String [valorInt2*valorInt2];
	 guardar = new  String [valorInt2][valorInt2];
	 us = new double [valorInt2][valorInt2];
		setSize(500,250);
		 setLayout(null);
			label.setBounds(30, 30, 300, 10);
			datos.setBounds(30, 70, 250, 25);
			potenciaTitulo.setBounds(300, 70, 100, 10);
			valorPotencia.setBounds(370, 65, 50, 25);
			resultadoTexto.setBounds(30, 130, 150, 25);
			valorResultado .setBounds(110, 130, 150, 25);
			resultado.setBounds(50, 180, 150, 25);
			 
		
			add(label);
			add(datos);
			add(resultado);
			add(resultadoTexto);
			add(resultado);
			add(valorResultado);
			add(valorPotencia);
			add(potenciaTitulo);
			resultado.addActionListener(this);
			
	}
public void actionPerformed(ActionEvent e){
	p=0;
	int valorInt = Integer.parseInt(valorDado);
	String spolit[] = datos.getText().split("\\,");
	for(String uno:spolit){
		nose[p]=uno;
		++p;
	}
	int ñ = 0;
	for(int h = 0; h<valorInt;h++){
		for(int w =0;w<valorInt;w++){
			guardar[h][w] = nose[ñ];
			ñ++;
			String matrizn =guardar[h][w];
			double doble = Double.parseDouble(matrizn);
			us[h][w]= doble;
		}
	}
	multiplicarMatrices(us,us);
}
public static double[][] multiplicarMatrices(double matrizA[][], double matrizB[][]) {

    double matrizResultado[][] = new double[matrizA.length][matrizA.length];
    double matrizResultados[][] = new double[matrizA.length][matrizA.length];
    for (int j = 0; j <matrizA.length; j++){
    	for (int k=0;k<matrizA.length;k++) {
    		 matrizResultado[j][k]=1;
    	}
    }
        
    
    String po="";
    for (int i = 0; i < matrizA.length; i++) {
        for (int j = 0; j <matrizA.length; j++) {
            for (int k=0;k<matrizA.length;k++) {
            
            	
                matrizResultado[j][k]*= (matrizA[k][j]);
                matrizResultados[i][j]+= (matrizResultado[i][j]); 
                   
            }
            System.out.println();
            String o = String.valueOf(matrizResultados[i][j]);
            po+=o+",";
            valorResultado.setText(po);
          
        }

    }
    

    return matrizResultado;
}
}
