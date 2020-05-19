import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ingresoManualInversa extends JFrame {
	public ingresoManualInversa(String matriz){
		setSize(500,500);
		PanelTraspuestaInversa paneltraspuestadeterminante = new PanelTraspuestaInversa(matriz);
		add(paneltraspuestadeterminante);
		setTitle("INGRESO MANUAL INVERSA");

	
	}
}
class PanelTraspuestaInversa extends JPanel  implements ActionListener{
	JLabel titulo = new JLabel("CALCULO DE LA INVERSA");
	 JButton calcular = new JButton("CALCULAR");
	 JLabel resultadoTexto = new JLabel("RESULTADO:");
	 JTextField valorResultado = new JTextField();
	 JTextField[][] matrizVieja;
		double [][] us;
		double  [][]us2;

	 JLabel tras = new JLabel("RESULTADO:");
	 int click = 0;
	int u = 0;
	int x=0;
	int y = 0;
	public PanelTraspuestaInversa(String valor1){
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
		 us2 = new double[valor1int][valor1int];
		setLayout(null);
		
		for(int a =0; a<valor1int; ++a){
			y+=50;
			x =0;
			for(int k =0; k<valor1int; ++k){
				x+=60;
				matrizVieja[a][k]= new JTextField(200);
				matrizVieja[a][k].setBounds(x,y,40,30);
				calcular.setBounds(20, 125+y, 100, 30);
				add(matrizVieja[a][k]);
				setVisible(true);
				
			}
		}
		calcular.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		JLabel es = new JLabel("No existe inversa la determinante es 0");
		for(int c =0; c<click; ++c){
			
			for(int qw =0; qw<click; ++qw){
				
			String matrizn =matrizVieja[c][qw].getText();
			double doble = Double.parseDouble(matrizn);
				us[c][qw]= doble;
				us2[c][qw]=doble;
				setLayout(null);
				es.setBounds(10, y+60, 500, 10);	
				
				
				
			}

		}
		CmatricesInversa determi = new CmatricesInversa();
		double determinante = determi.Determinante(1, us);
		double[][] Matadjunta = determi.adjuntaMatriz(us);
		double [][] MatTrans = determi.traspuestaMatriz(Matadjunta);
		if(us.length==2){
			
				if(determinante==0){
					add(es);
					es.setText("LA DETERMINANTE NO EXISTE ");

				}else{
					es.setText("" );
					us[0][0]=us[1][1];
					us[1][1]=us2[0][0];
					us[0][1]=-us[0][1];
					us[1][0]=-us[1][0];
					for(int i =0; i<us.length;++i){
						
						for(int j =0; j<us.length;++j){
							double v = us[i][j]/determinante;
							String z = String.valueOf(v);
							matrizVieja[i][j].setText(z);

						}
						

						System.out.println( );
					}

					
				}
			
				if(determinante==0){
					add(es);
					es.setText("LA DETERMINANTE NO EXISTE ");

				}else{
					es.setText(" ");
					us[0][0]=us[1][1];
					us[1][1]=us2[0][0];
					us[0][1]=-us[0][1];
					us[1][0]=-us[1][0];
					for(int i =0; i<us.length;++i){
						
						for(int j =0; j<us.length;++j){
							double v = us[i][j]/determinante;
							String z = String.valueOf(v);
							matrizVieja[i][j].setText(z);

						}
						

						System.out.println( );
					}

					
				}
				
					
				
		}else{
			if(determinante ==0){
				add(es);
				es.setText("LA INVERSA NO EXISTE");
			}
			else {
				for(int i =0; i<MatTrans.length;++i){
					for(int j =0; j<MatTrans.length;++j){
						
						System.out.println( MatTrans[i][j]/determinante);
						double v = MatTrans[i][j]/determinante;
						String z = String.valueOf(v);
						matrizVieja[i][j].setText(z);
						 
					}
				}	
			}

		}
		setVisible(true);
	}
	class CmatricesInversa extends JPanel{
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
		public double [][] adjuntaMatriz(double [][]matriz){
			double [][] tempAdjunta = new double[matriz.length][matriz.length];
			for(int q =0; q<tempAdjunta.length;++q){
				for(int u =0; u<tempAdjunta.length;++u){
					double [][]temp = this.SubMatriz(q,u,matriz);
					int io = q+u;
					if(io%2==0){
						double elementoAdjunto = this.Determinante(0,temp);	
						tempAdjunta[q][u]=elementoAdjunto;
					}else{
						double elementoAdjunto = -this.Determinante(0,temp);
						tempAdjunta[q][u]=elementoAdjunto;
					}
					
					
				}
			}
			return tempAdjunta;
		}
		public double [][] traspuestaMatriz(double [][]matriz){
			double [][] temptranspuesta = new double[matriz.length][matriz.length];
			for(int i =0; i<temptranspuesta.length;++i){
				for(int j =0; j<temptranspuesta.length;++j){
					temptranspuesta[i][j]=matriz[j][i];
				}
			}
			return temptranspuesta;
		}
	}
	
	
	};

//METODO PARA CALCULAR LA ADJUNTA DE UNA MATRIZ
