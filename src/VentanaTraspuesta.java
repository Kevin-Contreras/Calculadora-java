
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class VentanaTraspuesta extends JFrame implements ActionListener {
	JLabel label = new JLabel("TAMA�O DEL SISTEMA");
	JTextField dimension = new JTextField(20);
	JButton tama�o = new JButton("INGRESO MANUAL");
	JButton analisis = new JButton("ANALISIS DE DATOS");
public VentanaTraspuesta(){
		this.setSize(500,190);
		 setLayout(null);
			label.setBounds(110, 30, 150, 10);
			dimension.setBounds(250, 25, 80, 25);
			tama�o.setBounds(70, 80, 150, 25);
			analisis.setBounds(240, 80, 150, 25);
			add(label);
			add(dimension);
			add(tama�o);
			add(analisis);
			tama�o.addActionListener(this);
			analisis.addActionListener(this);
	}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==tama�o){
		ingresoManual ingreso = new ingresoManual(dimension.getText());
		ingreso.setVisible(true);
		this.setVisible(false);
	}else if(e.getSource()==analisis){
		Analisis analisisn = new Analisis(dimension.getText());
		analisisn.setVisible(true);
		this.setVisible(false);
	}
}
	
}
