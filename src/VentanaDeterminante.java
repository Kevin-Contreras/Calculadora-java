import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class VentanaDeterminante extends JFrame implements ActionListener {
	JLabel label = new JLabel("TAMA�O DEL SISTEMA");
	JTextField dimension = new JTextField(20);
	JButton tama�os = new JButton("INGRESO MANUAL");
	JButton analisis = new JButton("ANALISIS DE DATOS");
public VentanaDeterminante(){
	setTitle("VENTANA DETERMINANTE");
		this.setSize(500,190);
		 setLayout(null);
			label.setBounds(110, 30, 150, 10);
			dimension.setBounds(250, 25, 80, 25);
			tama�os.setBounds(70, 80, 150, 25);
			analisis.setBounds(240, 80, 150, 25);
			add(label);
			add(dimension);
			add(tama�os);
			add(analisis);
			tama�os.addActionListener(this);
			analisis.addActionListener(this);
	}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==tama�os){
		ingresoManualdeterminante ingresos = new ingresoManualdeterminante(dimension.getText());
		ingresos.setVisible(true);
		this.setVisible(false);
	}else if(e.getSource()==analisis){
		DatosAnaliticosDeter deter = new DatosAnaliticosDeter(dimension.getText());
		deter.setVisible(true);
		this.setVisible(false);
	}
}
	
}
