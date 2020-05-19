import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
class ingresoManual extends JFrame {
	public ingresoManual(String matriz){
		setSize(400,400);
		PanelTraspuesta paneltraspuesta = new PanelTraspuesta(matriz);
		add(paneltraspuesta);
		setTitle("VENTANA TRASPUESTA");
	}
}
class PanelTraspuesta extends JPanel  implements ActionListener{
	JLabel titulo = new JLabel("CALCULO DE TRASPUESTA");
	 JButton calcular = new JButton("CALCULAR");
	 JTextField[][] matriz;
	 JLabel tras = new JLabel("");
	 int click = 0;
	int u = 0;
	public PanelTraspuesta(String valor1){
		int valor1int = Integer.parseInt(valor1);
		setLayout(null);
		titulo.setBounds(20, 0, 300, 30);
		calcular.setBounds(20, 300, 100, 30);
		tras.setBounds(20, 30, 100, 10);
		add(calcular);
		add(tras);
		add(titulo);
		click = valor1int;
		 matriz = new  JTextField[valor1int][valor1int];
		setLayout(null);
		int x=0;
		int y = 0;
		for(int i =0; i<valor1int; ++i){
			y+=50;
			x =0;
			for(int k =0; k<valor1int; ++k){
				x+=50;
				matriz[k][i]= new JTextField();
				matriz[k][i].setBounds(x,y,30,30);
				add(matriz[k][i]);
				
			}
		}
		calcular.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		
		if(u==0){
			setLayout(null);
			int x=0;
			int y = 0;
			for(int k =0; k<click; ++k){
				y+=50;
				x =0;
				for( int i =0; i<click; ++i){
					x+=50;
					matriz[k][i].setBounds(x,y,30,30);
					matriz[k][i].setText(matriz[k][i].getText());
					matriz[k][i].setBackground(Color.CYAN);
					tras.setText("TRASPUESTA");
					add(matriz[k][i]);	
				}
				
			}
			u++;
		}else if(u==1){
			setLayout(null);
			int x=0;
			int y = 0;
			for(int i =0; i<click; ++i){
				y+=50;
				x =0;
				for( int k =0; k<click; ++k){
					x+=50;
					matriz[k][i].setBounds(x,y,30,30);
					matriz[k][i].setText(matriz[k][i].getText());
					matriz[k][i].setBackground(Color.white);
					tras.setText("");
					add(matriz[k][i]);	
				}
				
			}
			u--;
		}
	
	}
}