
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class Historial extends JFrame {
public Historial (){
	setSize(1200,700);
	PanelHistorial panel = new PanelHistorial();
	add(panel);
	setTitle("HISTORIAL");

}
}

class PanelHistorial extends JPanel {
	String cap ="";
	JLabel como = new JLabel();
	JLabel resultado = new JLabel("RESULTADO");
	JLabel operacion = new JLabel("OPERACION");
	JLabel Fecha  = new JLabel("FECHA");
	String todos="";
	public PanelHistorial(){
		setLayout(null);
		resultado.setBounds(200, 30, 100, 15);
		operacion.setBounds(450, 30, 100, 15);
		Fecha.setBounds(800, 30, 100, 15);
		add(resultado);
		add(operacion);
		add(Fecha);
	String coseno = Panelcoseno.guardar();
	String tangente = PanelTangente.guardar();
	String sumariman = PanelSumaRiman.guardar();
	String diferencia = PanelSumaResta.guardar();
	String panel = PanelArco.guardar();
	String binimiocuadrado = PanelBinomios.guardar();
	String ecuacion = CristalEcuacion.guardar();
	String calculadora = Toda.guardar();
	String binomio = PanelBinomio.guardar();
	String seno = PanelSeno.guardar();



	todos = calculadora+ecuacion+sumariman+binomio+diferencia+seno+coseno+binimiocuadrado+tangente+panel;
	JLabel[] texto;
	String[] arreglo =todos.split("\\,");
	int i=0;
	texto = new JLabel[arreglo.length];
	JPanel [] pa = new JPanel[arreglo.length];
    
	
	int y =0;
	int u =0;
		for(String nue : arreglo){
			setLayout(null);
			pa [i] = new JPanel();
			texto[i] = new JLabel(nue);
			texto[i].setBounds(0, y+=00, 1000, 10);
			pa[i].setBounds(20, y+=50, 1100, 40);
			
				pa[i].setBackground(Color.CYAN);
			
			pa[i].add(texto[i]);
			add(pa[i]);
			i++;
		}
	
		
			}
	
	
	
}
