
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ingresoManualdeterminante extends JFrame {
	public ingresoManualdeterminante(String matriz){
		setSize(500,500);
		PanelTraspuestadeterminante paneltraspuestadeterminante = new PanelTraspuestadeterminante(matriz);
		add(paneltraspuestadeterminante);
		setTitle("INGRESO MANUAL DETERMINANTE");
	}
}
class PanelTraspuestadeterminante extends JPanel  implements ActionListener{
	JLabel titulo = new JLabel("CALCULO LA DETERMINANTE");
	 JButton calcular = new JButton("CALCULAR");
	 JLabel resultadoTexto = new JLabel("RESULTADO:");
	 JTextField valorResultado = new JTextField();

	 JTextField[][] matrizVieja;
		double [][] us;
	 JLabel tras = new JLabel("RESULTADO:");
	 int click = 0;
	int u = 0;
	public PanelTraspuestadeterminante(String valor1){
		
		int valor1int = Integer.parseInt(valor1);
		setLayout(null);
		titulo.setBounds(20, 0, 300, 30);
		

		add(calcular);
		add(tras);
		add(titulo);
		add(valorResultado);
		click = valor1int;
		 matrizVieja = new  JTextField[valor1int][valor1int];
		 us = new double[valor1int][valor1int];
		setLayout(null);
		int x=0;
		int y = 0;
		for(int a =0; a<valor1int; ++a){
			y+=50;
			x =0;
			for(int k =0; k<valor1int; ++k){
				x+=50;
				matrizVieja[k][a]= new JTextField();
				matrizVieja[k][a].setBounds(x,y,30,30);
				calcular.setBounds(20, 120+y, 100, 30);
				tras.setBounds(20, 80+y, 100, 10);
				valorResultado.setBounds(110, 70+y, 130, 30);
				add(matrizVieja[k][a]);
				
			}
		}
		calcular.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		
		for(int c =0; c<click; ++c){
			
			for(int qw =0; qw<click; ++qw){
				
			String matrizn =matrizVieja[c][qw].getText();
			double doble = Double.parseDouble(matrizn);
				us[c][qw]= doble;
				
			}

		}
		Cmatrices determi = new Cmatrices();
	String 	respuesta = String.valueOf(determi.Determinante(1, us)); 
		valorResultado.setText(respuesta);
		
		
	
	}
	class Cmatrices extends JPanel{
		//metodo que calcule la matriz
		public double Determinante(int i , double [][]matriz){
			if(matriz.length==2){
				double deter = matriz[0][0]*matriz[1][1]-matriz[0][1]*matriz[1][0];
				return deter;
			}else{
				double deter = 0;
				for(int j=0;j<matriz.length;j++){
					int suma = j+i;
					if(suma%2==0){
						double  [][] temp= this.SubMatriz(i,j,matriz);
						deter = deter+1*matriz[i][j]*this.Determinante(i,temp);	
					}else{
						double  [][] temp= this.SubMatriz(i,j,matriz);
						deter = deter-1*matriz[i][j]*this.Determinante(i,temp);
					}
					
				}
				return deter;
			}
			
		}
		//calculo submatriz y eliminando i,j
		private double[][] SubMatriz(int i,int j,double [][] matriz)
		{
			double [][]temp=new double[matriz.length-1][matriz.length-1];
			int count1 =0;
			int count2 =0;
			for(int k =0; k<matriz.length;k++){
				if(k!=i){
					count2 =0;
					for(int l =0; l<matriz.length;l++){
						if(l!=j){
							temp[count1][count2]= matriz[k][l];
							count2++;
						}
					}
					count1++;
				}
				
			}
			return temp;
		}
	}
	}

