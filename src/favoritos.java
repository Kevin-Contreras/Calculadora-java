import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class favoritos extends JFrame {
public favoritos (){
	setSize(1200,700);
	PanelFavoritos panel = new PanelFavoritos();
	add(panel);
	setTitle("FAVORITOS");

}
}

class PanelFavoritos extends JPanel {
	String cap ="";
	JLabel como = new JLabel();
	JLabel resultado = new JLabel("RESULTADO");
	JLabel operacion = new JLabel("OPERACION");
	JLabel Fecha  = new JLabel("FECHA");
	String todos="";
	public PanelFavoritos(){
		setLayout(null);
		resultado.setBounds(200, 30, 100, 15);
		operacion.setBounds(450, 30, 100, 15);
		Fecha.setBounds(800, 30, 100, 15);
		add(resultado);
		add(operacion);
		add(Fecha);
	String diferencia = PanelSumaResta.guardar();
	String panel = PanelArco.guardar();
	String ecuacion = CristalEcuacion.guardar();
	String calculadora = Toda.guardar();
	String binomio = PanelBinomio.guardar();
	String binimiocuadrado = PanelBinomios.guardar();
	String seno = PanelSeno.guardar();
	String coseno = Panelcoseno.guardar();
	String tangente = PanelTangente.guardar();
	String sumariman = PanelSumaRiman.guardar();


	todos = calculadora+ecuacion+binomio+binimiocuadrado+seno+coseno+tangente+diferencia+panel+sumariman;
	JLabel[] texto;
	String[] arreglo =todos.split("\\,");
	int i=0;
	texto = new JLabel[arreglo.length];
	JPanel [] pa = new JPanel[arreglo.length];
	Color []colores;
	Color colors[] = {Color.red, Color.green, Color.yellow};
    
	
	int y =0;
	int u =0;
		for(String nue : arreglo){
			setLayout(null);
			pa [i] = new JPanel();
			texto[i] = new JLabel(nue);
			texto[i].setBounds(0, y+=00, 1000, 10);
			pa[i].setBounds(20, y+=50, 1100, 40);
			if(u<3){
				pa[i].setBackground(colors[i]);
				
				++u;
			}
			
			pa[i].add(texto[i]);
			add(pa[i]);
			i++;
		}
	
		
			}
	
	
	
}
