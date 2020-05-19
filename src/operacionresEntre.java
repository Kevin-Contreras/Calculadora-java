import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
class ventanaDimensiones extends JFrame{
	public ventanaDimensiones(){
		setSize(400,400);
		PanelDimensiones panel = new PanelDimensiones();
		add(panel);
		setTitle("VENTANA DE OPERACIONES ENTRE DOS MATRICES");
	}
}

class PanelDimensiones extends JPanel implements ActionListener{
	JLabel fila1 = new JLabel("numero de filas primera matriz");
	JTextField valorfila1 = new JTextField();
	JLabel columnas1 = new JLabel("numero de columnas primera matriz");
	JTextField valorcolumna1 = new JTextField();
	JLabel fila2 = new JLabel("numero de filas segunda matriz");
	JTextField valorfila2 = new JTextField();
	JLabel columnas2 = new JLabel("numero de columnas segunda matriz");
	JTextField valorcolumna2 = new JTextField();
	JButton calcular = new JButton("CONTINUAR");
	public PanelDimensiones(){
		setLayout(null);
		fila1.setBounds(10, 20, 200, 15);
		valorfila1.setBounds(210,15, 30, 30);
		columnas1.setBounds(10, 60, 250, 15);
		valorcolumna1.setBounds(250,55, 30, 30);
		fila2.setBounds(10, 120, 200, 15);
		valorfila2.setBounds(210,115, 30, 30);
		columnas2.setBounds(10, 160, 250, 15);
		valorcolumna2.setBounds(250,160,30,30);
		calcular.setBounds(20,200,150,30);
		add(fila1);
		add(valorfila1);
		add(columnas1);
		add(valorcolumna1);
		add(fila2);
		add(valorfila2);
		add(columnas2);
		add(valorcolumna2);
		add(calcular);
		calcular.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		Operaciones operacion = new Operaciones(valorfila1.getText(),valorcolumna1.getText(),valorfila2.getText(),valorcolumna2.getText());
		operacion.setVisible(true);
	}
}
