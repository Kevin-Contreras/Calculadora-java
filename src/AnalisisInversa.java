
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class AnalisisInversa extends JFrame implements ActionListener {
	JLabel label = new JLabel("CALCULO DE INVERSA");
	JTextField datos = new JTextField(20);
	JButton resultado = new JButton("RESULTADO");
	JLabel resultadoTexto = new JLabel("RESULTADO");
	JTextField valorResultado = new JTextField(20);
	String valorDado = "";
	String guardar [][];
	 JTextField[][] matrizVieja;
	double us [][];
	double us2 [][];

	String[] nose;
	int r =0;
	int p=0;
	int g=0;
 public AnalisisInversa(String analisis){
	 setTitle("ANALISIS INVERSA");
	 valorDado = analisis;
	 int valorInt2 = Integer.parseInt(valorDado);
	 nose = new  String [valorInt2*valorInt2];
	 guardar = new  String [valorInt2][valorInt2];
	 matrizVieja = new  JTextField[valorInt2][valorInt2];
	 us = new double [valorInt2][valorInt2];
	 us2 = new double[valorInt2][valorInt2];
		setSize(500,250);
		 setLayout(null);
			label.setBounds(30, 30, 300, 10);
			datos.setBounds(30, 70, 250, 25);
			resultadoTexto.setBounds(30, 130, 150, 25);
			valorResultado .setBounds(110, 130, 150, 25);
			resultado.setBounds(50, 180, 150, 25);
			 
		
			add(label);
			add(datos);
			add(resultado);
			add(resultadoTexto);
			add(resultado);
			add(valorResultado);
			resultado.addActionListener(this);
			
	}
public void actionPerformed(ActionEvent e){
	p=0;
	int valorInt = Integer.parseInt(valorDado);
	String spolit[] = datos.getText().split("\\,");
	for(String uno: spolit){
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
			us2[h][w]=doble;
		}
		
	}
	CmatricesInversa determi = new CmatricesInversa();
	double determinante = determi.Determinante(1, us);
	double[][] Matadjunta = determi.adjuntaMatriz(us);
	double [][] MatTrans = determi.traspuestaMatriz(Matadjunta);
	String o = "";
	if(us.length==2){
			if(determinante==0){
			}else{
				
				us[0][0]=us[1][1];
				us[1][1]=us2[0][0];
				us[0][1]=-us[0][1];
				us[1][0]=-us[1][0];
				for(int i =0; i<us.length;++i){
					
					for(int j =0; j<us.length;++j){
						double v = us[i][j]/determinante;
						String z = String.valueOf(v);
						o+=z+",";
						valorResultado.setText(o);
					}
					

					System.out.println( );
				}
				
				
			}
	}else{
if(determinante ==0){
			
		}
		else {
			for(int i =0; i<MatTrans.length;++i){
				for(int j =0; j<MatTrans.length;++j){
					
					System.out.println( MatTrans[i][j]/determinante);
					double v = MatTrans[i][j]/determinante;
					String z = String.valueOf(v);
					o+=z+",";
					
				}
			}
			valorResultado.setText(o);
		}
	}		
		
		
	}
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

