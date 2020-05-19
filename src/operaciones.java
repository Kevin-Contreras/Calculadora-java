import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
class Operaciones extends JFrame{
	public Operaciones (String fila1, String columna1,String fila2, String columna2 ){
		int fila1int = Integer.parseInt(fila1);
		int columna1int = Integer.parseInt(columna1);
		int fila21int = Integer.parseInt(fila2);
		int columna21int = Integer.parseInt(columna2);
		setSize(600,600);
		 PaneloperacionesEntre panel = new PaneloperacionesEntre(fila1int,columna1int,fila21int,columna21int);
		 add(panel);
		 setTitle("OPERACIONES ENTRE DOS MATRICES");
	}
}
class PaneloperacionesEntre extends JPanel implements ActionListener{
	 JTextField[][] matriz1;
	 JTextField[][] matriz2;
	 double[][] resultado;
	 static JTextField [][] resultadoMatriz;
	 double [][] multiplicacion;
	 double [][] multiplicacion2;
	 static JTextField [][] nuevaMatriz;
	 JLabel mensaje = new JLabel("");
	 JLabel titulo = new JLabel("OPERACIONES ENTRE MATRICES");
	 JComboBox opciones = new JComboBox();
	 JButton calcular = new JButton("CALCULAR");
	 int y =0;
	 int x=0;
	 int fila1nueva=0;
	 int columnanueva1=0;
	 int fila2nueva=0;
	 int columnanueva2=0;
	public PaneloperacionesEntre(int fila1, int columna1,int fila2, int columna2){
		matriz1 = new  JTextField[fila1][columna1];
		matriz2 = new  JTextField[fila2][columna2];
		 multiplicacion= new double [fila1][columna1];
		 multiplicacion2= new double [fila2][columna2];
		fila1nueva = fila1;
		columnanueva1 = columna1;
		fila2nueva = fila2;
		columnanueva2 = columna2;
		
		for(int a =0; a<fila1; ++a){
			setLayout(null);
			y+=50;
			x =0;
			for(int k =0; k<columna1; ++k){
				x+=60;
				matriz1[a][k]= new JTextField();
				matriz1[a][k].setBounds(x,y,40,30);
				matriz1[a][k].setBackground(Color.yellow);
				
				add(matriz1[a][k]);
				
			}
		}
		opciones.addItem("+");
		opciones.addItem("-");
		opciones.addItem("X");
		opciones.setBounds(60, y+40, 50, 30);
		calcular.setBounds(60, y+120, 150, 30);
		mensaje.setBounds(60, y+100, 300, 30);
		titulo.setBounds(10, 10, 300, 10);
		add(opciones);
		add(calcular);
		add(titulo);
		calcular.addActionListener(this);
		y=0;
		int u = x;
		for(int a =0; a<fila2; ++a){
			
			setLayout(null);
			y+=50;
			for(int k =0; k<columna2; ++k){
				x+=60;
				matriz2[a][k]= new JTextField();
				matriz2[a][k].setBounds(x,y,40,30);
				matriz2[a][k].setBackground(Color.CYAN);
				add(matriz2[a][k]);
				
				u=0;
				
			}
			x-=60*columna2;
		}
		if(fila1nueva == fila2nueva && columnanueva1==columnanueva2){
			resultadoMatriz =new JTextField [fila1nueva][columnanueva1];
			for(int i=0;i<fila1nueva;++i){
				setLayout(null);
				y+=50;
				x =0;
				for(int k=0;k<columnanueva1;++k){
					x+=60;
					resultadoMatriz[i][k]= new JTextField();
					resultadoMatriz[i][k].setBounds(x+60,y+120,40,30);
					add(resultadoMatriz[i][k]);

				}
			}	
		}else{
			mensaje.setText("NO SE PUEDE SUMAR NI RESTAR LAS MATRICES");
			add(mensaje);
		}
		
	}
	public void actionPerformed(ActionEvent e){
		if(opciones.getSelectedItem()=="+"){
			if(matriz1.length == matriz2.length){
				resultado = new double [fila1nueva][columnanueva1];
				  
				for(int i=0;i<fila1nueva;++i){
					for(int k=0;k<columnanueva1;++k){
						
						double matriz1parseada = Double.parseDouble(matriz1[i][k].getText());
						double matriz1parseada2 = Double.parseDouble(matriz2[i][k].getText());
						resultado[i][k]=matriz1parseada+matriz1parseada2;
						String cadena = String.valueOf(resultado[i][k]);
						resultadoMatriz[i][k].setBackground(Color.green);
						resultadoMatriz[i][k].setText(cadena);
					}
				}
			}else{
				mensaje.setText("NO SE PUEDE SUMAR LAS MATRICES");
			
			}
		}else if(opciones.getSelectedItem()=="-"){
			if(matriz1.length == matriz2.length){
				resultado = new double [fila1nueva][columnanueva1];
				  
				for(int i=0;i<fila1nueva;++i){
					for(int k=0;k<columnanueva1;++k){
						
						double matriz1parseada = Double.parseDouble(matriz1[i][k].getText());
						double matriz1parseada2 = Double.parseDouble(matriz2[i][k].getText());
						resultado[i][k]=matriz1parseada-matriz1parseada2;
						resultadoMatriz[i][k].setBackground(Color.green);
						String cadena = String.valueOf(resultado[i][k]);
						resultadoMatriz[i][k].setText(cadena);
					}
				}
			}else{
				mensaje.setText("NO SE PUEDE RESTAR LAS MATRICES");
			}
		}else if(opciones.getSelectedItem()=="X"){
			if(columnanueva1==fila2nueva){
				for(int i=0;i<fila1nueva;i++){
					for(int k=0;k<columnanueva1;k++){
						double matriz1parseada = Double.parseDouble(matriz1[i][k].getText());
						multiplicacion[i][k]=matriz1parseada;
						
						
						
					}
				}
				for(int i=0;i<fila2nueva;i++){
					for(int k=0;k<columnanueva2;k++){
						double matriz1parseada2 = Double.parseDouble(matriz2[i][k].getText());
						multiplicacion2[i][k]=matriz1parseada2;
						
					}
				}
				multiplicarMatrices(multiplicacion,multiplicacion2);
			}else{
				mensaje.setText("NO SE PUEDE MULTIPLICAR LAS MATRICES");
			}
			
		}
	}
	public double[][] multiplicarMatrices(double matrizA[][], double matrizB[][]) {

	    double matrizResultado[][] = new double[matrizA.length][matrizB[0].length];
	     nuevaMatriz = new JTextField [matrizA.length][matrizB[0].length];
	    for (int i = 0; i < matrizA.length; i++) {
	    	setLayout(null);
			y+=50;
			x =0;
	        for (int j = 0; j < matrizB[0].length; j++) {
				x+=60;
	            for (int k=0;k<matrizA[0].length;k++) { 
	            	
	                matrizResultado[i][j]+= (matrizA[i][k] * matrizB[k][j]);   
					
	            }
	            System.out.println(matrizResultado[i][j]);
	            String cadena = String.valueOf(matrizResultado[i][j]);
				nuevaMatriz[i][j]= new JTextField();
				nuevaMatriz[i][j].setText(cadena);
				nuevaMatriz[i][j].setBounds(x+60,y+120,40,30);
				nuevaMatriz[i][j].setBackground(Color.orange);
				add(nuevaMatriz[i][j]);
	        }

	    }

	    return matrizResultado;
	}
}