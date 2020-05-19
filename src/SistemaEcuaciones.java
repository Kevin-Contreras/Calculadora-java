import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class VentanaTamañoSistema extends JFrame implements ActionListener{
	JLabel label = new JLabel("TAMAÑO DEL SISTEMA");
	JTextField dimension = new JTextField(20);
	JButton tamaño = new JButton("CONTINUAR");
	public VentanaTamañoSistema(){
		setTitle("VENTANA DE SISTEMA DE ECUACIONES");
		this.setSize(300,190);
		this.setVisible(true);
		
		 setLayout(null);
			label.setBounds(40, 30, 150, 10);
			dimension.setBounds(180, 25, 80, 25);
			tamaño.setBounds(70, 80, 150, 25);
			add(label);
			add(dimension);
			add(tamaño);
			tamaño.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		String tamañoMatriz = dimension.getText();
		setVisible(false);
		PrincipalSistema principalSistema = new PrincipalSistema(dimension.getText());
		principalSistema.setVisible(true);
		
		
	}
}
class PrincipalSistema extends JFrame{
	public PrincipalSistema(String numero2){
		setTitle("SISTEMA DE ECUACIONES");

		setBounds(400,100,500,500);
		PanelPrincipal panelprincipal = new PanelPrincipal( numero2);
		add(panelprincipal);
	}
}
class PanelPrincipal extends JPanel{
	public PanelPrincipal(String numero){
		int valor1int = Integer.parseInt(numero);
		JTextField[][] ecuaciones;
		JTextField[] resultadoTexto;
		JLabel[] resultadoLabel;
		JLabel tituloSistema = new JLabel("Sistema:");
		JTextField caja = new JTextField();
		JLabel xn = new JLabel("X");
		JTextField caja2 = new JTextField();
		JLabel resultadosTitulo = new JLabel("RESULTADOS");
		JButton calcular = new JButton("CALCULAR");
		JButton guardar = new JButton("GUARDAR RESULTADO");
		setLayout(null);
		caja.setText(numero);
		caja2.setText(numero);
		tituloSistema.setBounds(40, 10, 100, 10);
		caja.setBounds(120, 0, 30, 30);
		xn.setBounds(160, 10, 30, 10);
		caja2.setBounds(180, 0, 30, 30);
		resultadosTitulo.setBounds(40, 280, 100, 10);
		calcular.setBounds(250, 290, 100, 30);
		guardar.setBounds(250, 340, 170, 30);


		add(caja);
		add(guardar);
		add(calcular);
		add(caja2);
		add(tituloSistema);
		add(resultadosTitulo);
		add(xn);
		String abc[] = {"A","B","C","D","E","F","G","H","I","J","K"};
		JLabel[][] abcd ; 
		 JLabel tras = new JLabel("");
		 int click = 0;
		int u = 0;
		ecuaciones = new  JTextField[valor1int][valor1int];
		abcd = new  JLabel[valor1int][valor1int];
		resultadoTexto =  new   JTextField[valor1int];
		resultadoLabel= new  JLabel[valor1int];
		
		setLayout(null);
		int x=0;
		int y = 0;
		int letra =0;
		for(int i =0; i<valor1int; ++i){
			y+=50;
			x =0;
			letra =0;
			
			for(int k =0; k<valor1int; ++k){
				
				if(k>valor1int){
					
				}else{
					x+=50;
					letra=x+35;
					ecuaciones[k][i]= new JTextField();
					if(k==valor1int-1){
						abcd[k][i] = new JLabel(abc[k]+"=");
					}else{
						abcd[k][i] = new JLabel(abc[k]+"+"); 
					}
					ecuaciones[k][i].setBounds(x,y,30,30);
					abcd[k][i].setBounds(letra,y,30,30);
					add(ecuaciones[k][i]);
					add(abcd[k][i]);
					
				}
				
				
			}
			ecuaciones = new  JTextField[valor1int][valor1int+1];
			ecuaciones[i][valor1int]= new JTextField();
			ecuaciones[i][valor1int].setBounds(letra+20,y,30,30);
			add(ecuaciones[i][valor1int]);
			
		}
		int tu =0;
		for(int k =0; k<valor1int; ++k){
			tu+=50;
			resultadoTexto[k]= new JTextField();
			resultadoLabel[k]=new JLabel(abc[k]+":");
			resultadoTexto[k].setBounds(160, 250+tu, 60, 30);
			resultadoLabel[k].setBounds(140, 250+tu, 30, 30);
			add(resultadoTexto[k]);
			add(resultadoLabel[k]);
		}
		
	}
	
}
