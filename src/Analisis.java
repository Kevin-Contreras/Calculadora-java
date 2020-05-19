import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Analisis extends JFrame implements ActionListener {
	JLabel label = new JLabel("CALCULO DE TRASPUESTA");
	JTextField datos = new JTextField(20);
	JButton resultado = new JButton("RESULTADO");
	JLabel resultadoTexto = new JLabel("RESULTADO");
	JTextField valorResultado = new JTextField(20);
	String valorDado = "";
 public Analisis(String analisis){
	 setTitle("ANALISIS TRASPUESTA");
	 valorDado = analisis;
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
int parseado = Integer.parseInt(valorDado);
int parseado2 = Integer.parseInt(valorDado);
int n = 0;
int z =0;
String j = "";
String matriz = datos.getText();
 String separadas [] = matriz.split("\\,");
 int parseados= parseado*parseado;
 for(int k =0;k<parseado;++k){
	 z++;
	 for(int i =0;i<parseado;++i){
			String m = separadas[n];
			j +=m+","; 
			valorResultado.setText(j);
			n += parseado2;
			
			
		 }
	 n=0;
	 n+=z;
	
	
	 
 }

}
	
}