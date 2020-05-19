import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class principal {

	public static void main(String[] args) {
		Pantallas pantallas = new Pantallas();

	}
}
class Pantallas extends JFrame{
	public Pantallas(){
		setExtendedState(Frame.MAXIMIZED_BOTH);
		CristalPrincipales cristalPrincipal = new CristalPrincipales();
		add(cristalPrincipal);
		setVisible(true);
		setTitle("VENTANA PRINCIPAL");

	}
}
class CristalPrincipales extends JPanel implements ActionListener{
	JLabel aritmetica = new JLabel("ARITMETICA");
	JButton calculadora = new JButton("CALCULADORA");
	JLabel algebra = new JLabel("ALGEBRA");
	JLabel ecuaciones = new JLabel("ECUACIONES");
	JButton cuadratica = new JButton("ECUACION CUADRATICA");
	JButton sistema = new JButton("SISTEMA DE ECUACIONES");
	JLabel factorizacion= new JLabel("FACTORIZACION");
	JButton binomioCuadrado = new JButton("BINOMIO CUADRADO");
	JButton diferenciadecuadrados = new JButton("DIFERENCIA DE CUADRADOS");
	JButton sumaydiferenciadecubosboton= new JButton("SUMA Y DIFERENCIA DE CUBOS");
	JLabel trigonometriatexto= new JLabel ("TRIGONOMERIA");
	JLabel funcionesTrigonometricas = new JLabel ("FUNCIONES TRIGONOMETRICAS");
	JButton BotonSeno = new JButton("SENO");
	JButton BotonCoseno = new JButton("COSENO");
	JButton BotonTangente = new JButton("TANGENTE");
	JLabel angulosTitulo = new JLabel("ANGULOS");
	JButton longuitud = new JButton("LONGUITUD DE ARCO");
	JLabel calculoTexto = new JLabel("CALCULO");
	JLabel CalculoDiferencialTitulo = new JLabel("CALCULO DIFERENCIAL");
	JButton BotonDerivacion = new JButton("CASOS DE DERIVACION");
	JLabel CalculoIntegralTexto = new JLabel("CALCULO INTEGRAL");
	JButton integralCasos = new JButton("CASOS DE INTEGRACION");
	JButton SumatoriaRiman = new JButton("SUMA DE RIMANN");
	
	JLabel linealTexto = new JLabel("ALGEBRA LINEAL");
	JLabel operacionesCon = new JLabel("OPERACIONES CON MATRICES");
	JButton traspuestaboton = new JButton("TRASPUESTA");
	JButton inversaboton  = new JButton("INVERSA");
	JButton potenciaboton  = new JButton("POTENCIA");
	JButton determinanteboton  = new JButton("DETERMINANTE");
	JLabel operacionesEntre = new JLabel("OPERACIONES ENTRE MATRICES");
	JButton operacionesEntreBoton  = new JButton("OPERACIONES ENTRE MATRICES");
	
	JButton favoritos  = new JButton("FAVORITOS");
	JButton historial  = new JButton("HISTORIAL");
	
	public CristalPrincipales(){
		setLayout(null);
		calculadora.setBounds(30,100, 130, 30);
		aritmetica.setBounds(20, 20, 100, 20);
		algebra.setBounds(220, 20, 70, 20);
		ecuaciones.setBounds(230, 50, 100, 20);
		cuadratica.setBounds(230, 100, 200, 30);
		sistema.setBounds(230, 140, 200, 30);
		factorizacion.setBounds(230, 180, 100, 20);
		binomioCuadrado.setBounds(230, 210, 210, 30);
		diferenciadecuadrados.setBounds(230, 250, 210, 30);
		sumaydiferenciadecubosboton.setBounds(230, 300, 210, 30);
		trigonometriatexto.setBounds(470,20,100,20);
		funcionesTrigonometricas.setBounds(470,50,200,20);
		BotonSeno.setBounds(480,100,100,30);
		BotonCoseno.setBounds(480,140,100,30);
		BotonTangente.setBounds(480,180,100,30);
		angulosTitulo.setBounds(470,220,80,30);
		longuitud.setBounds(480,260,180,30);
		calculoTexto.setBounds(690, 20, 100, 20);
		CalculoDiferencialTitulo.setBounds(700, 50, 200, 20);
		BotonDerivacion.setBounds(700, 90, 170, 30);
		CalculoIntegralTexto.setBounds(700, 130, 170, 30);
		integralCasos.setBounds(705, 160, 200, 30);
		SumatoriaRiman.setBounds(705, 200, 200, 30);
		
		linealTexto.setBounds(990, 20, 100, 20);
		operacionesCon.setBounds(1000, 50, 300, 20);
		traspuestaboton.setBounds(1000, 85, 150, 30);
		inversaboton.setBounds(1000, 125, 150, 30);
		potenciaboton.setBounds(1000, 165, 150, 30);
		determinanteboton.setBounds(1000, 205, 150, 30);
		operacionesEntre.setBounds(1000, 250, 300, 20);
		operacionesEntreBoton.setBounds(1000, 280, 250, 30);
		
		favoritos.setBounds(1000, 450, 100, 30);
		historial.setBounds(1150, 450, 100, 30);
		add(aritmetica);
		add(calculadora);
		add(algebra);
		add(ecuaciones);
		add(cuadratica);
		add(sistema);
		add(factorizacion);
		add(binomioCuadrado);
		add(diferenciadecuadrados);
		add(sumaydiferenciadecubosboton);
		add(trigonometriatexto);
		add(funcionesTrigonometricas);
		add(BotonSeno);
		add(BotonCoseno);
		add(BotonTangente);
		add(angulosTitulo);
		add(longuitud);
		add(calculoTexto);
		add(CalculoDiferencialTitulo);
		add(BotonDerivacion);
		add(CalculoIntegralTexto);
		add(integralCasos);
		add(SumatoriaRiman);
		
		add(linealTexto);
		add(operacionesCon);
		add(traspuestaboton);
		add(inversaboton);
		add(potenciaboton);
		add(determinanteboton);
		add(operacionesEntre);
		add(operacionesEntreBoton);
		
		add(favoritos);
		add(historial);
		//----------------EVENTOS-----------------
		calculadora.addActionListener(this);
		cuadratica.addActionListener(this);	
		sistema.addActionListener(this);
		binomioCuadrado.addActionListener(this);
		diferenciadecuadrados.addActionListener(this);
		sumaydiferenciadecubosboton.addActionListener(this);
		BotonSeno.addActionListener(this);
		BotonCoseno.addActionListener(this);
		BotonTangente.addActionListener(this);
		longuitud.addActionListener(this);
		BotonDerivacion.addActionListener(this);
		integralCasos.addActionListener(this);
		SumatoriaRiman.addActionListener(this);
		traspuestaboton.addActionListener(this);
		determinanteboton.addActionListener(this);
		inversaboton.addActionListener(this);
		potenciaboton.addActionListener(this);
		operacionesEntreBoton.addActionListener(this);
		favoritos.addActionListener(this);
		historial.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==calculadora){
			CalculadoraBasica calculadorahecha = new CalculadoraBasica();
			calculadorahecha.setVisible(true);
		}else if(e.getSource()== cuadratica){
			Pantalla pantalla = new Pantalla();
			pantalla.setVisible(true);
		}else if(e.getSource()== sistema){
			VentanaTamañoSistema ventanasistemas = new VentanaTamañoSistema();
			ventanasistemas.setVisible(true);
		}else if(e.getSource()==binomioCuadrado){
			BinomioCuadrado binomiocuadrado = new BinomioCuadrado();
		binomiocuadrado.setVisible(true);
		}else if(e.getSource()== diferenciadecuadrados){
			Diferenciadecuadrados diferencia = new Diferenciadecuadrados();
			
			diferencia.setVisible(true);
		}else if(e.getSource()==sumaydiferenciadecubosboton){
			Sumayrestadecubos sumaydiferencia = new Sumayrestadecubos();
			
			sumaydiferencia.setVisible(true);
		}else if(e.getSource()==BotonSeno){
			Seno seno = new Seno();
		
			seno.setVisible(true);
		}else if(e.getSource()==BotonCoseno){
			Coseno coseno  = new Coseno();
			
			coseno.setVisible(true);
		}else if(e.getSource()==BotonTangente){
			Tangente tangente  = new Tangente();
		
			tangente.setVisible(true);
		}else if(e.getSource()==longuitud){
			Longuitud arco  = new Longuitud();
			arco.setVisible(true);
		}else if(e.getSource()==BotonDerivacion){
			CasosDerivacion derivar  = new CasosDerivacion();
			derivar.setVisible(true);
		}else if(e.getSource()==integralCasos){
			CasosIntegracion integral  = new CasosIntegracion();
			integral.setVisible(true);
		}else if(e.getSource()==SumatoriaRiman){
			SumaDeRiman riman  = new SumaDeRiman();
			
			riman.setVisible(true);
		}else if(e.getSource()==traspuestaboton){
			VentanaTraspuesta ventana = new VentanaTraspuesta();
			ventana.setVisible(true);
		}else if(e.getSource()==determinanteboton){
			VentanaDeterminante ventana = new VentanaDeterminante();
			ventana.setVisible(true);
		}else if(e.getSource()==inversaboton){
			VentanaInversa ventana = new VentanaInversa();
			ventana.setVisible(true);
		}else if(e.getSource()==potenciaboton){
			VentanaPotencia ventana = new VentanaPotencia();
			ventana.setVisible(true);

		}else if(e.getSource()==operacionesEntreBoton){
			ventanaDimensiones nose = new ventanaDimensiones();
			nose.setVisible(true);
		}
		else if(e.getSource()==favoritos){
			favoritos favor = new favoritos();
			favor.setVisible(true);
		}else if(e.getSource()==historial){
			Historial favor = new Historial();
			favor.setVisible(true);
		}
		
	}
}