import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
class CalculadoraBasica extends JFrame {
	public CalculadoraBasica(){
		setBounds(350,130,650,480);
		
		setTitle("CALCULADORA");
		PrincipalCristales principalcristal = new PrincipalCristales();
		add(principalcristal);
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image imagen = pantalla.getImage("./img/punto.png");
		setIconImage(imagen);
		
	} 
}
class PrincipalCristales extends JPanel{
	 public PrincipalCristales(){
		 Toda toda = new Toda ();
		 GridLayout maquetars = new GridLayout(0,1,0,0);
			toda.setLayout(maquetars);
			 add(toda);
		 setVisible(true);	 
	 }
}
class Toda extends JPanel{


	//botones
	JButton boton1 = new JButton("1");
	JButton boton2 = new JButton("2");
	JButton boton3 = new JButton("3");
	JButton botonsuma= new JButton("+");
	JButton boton4 = new JButton("4");
	JButton boton5 = new JButton("5");
	JButton boton6 = new JButton("6");
	JButton botonresta = new JButton("-");
	JButton boton7 = new JButton("7");
	JButton boton8 = new JButton("8");
	JButton boton9 = new JButton("9");
	JButton botonmulti = new JButton("x");
	JButton botonraizN = new JButton("raiz N");
	JButton boton0 = new JButton("0");
	JButton botonegativo = new JButton("(-)");
	JButton botondivision = new JButton("/");
	JButton botonexponente = new JButton("ex");
	JButton botonraiz = new JButton("raiz");
	JButton botonpartido = new JButton("1/x");
	JButton factorial = new JButton("!");
	JButton resultado = new JButton("resultado");
	JButton limpiar = new JButton("C");
	JButton guardar = new JButton("Guardar resultados");
	static String operacion = "";
 //clase caja de texto
	  static String resultadoGuardar = "";	
	  static String fecha ="";
	 class Texto extends JPanel implements ActionListener{
		JTextField textos = new JTextField(20);
		public Texto (){
		add(textos);
		}
		String operaciones = "";
		String signo;
		double exp2 = 0;
		double raizene2 = 0;
		String exp1="";
		String raizene="";
		String memoria1;
		String resultado1="";
		String guardarnuevo = "";
		public void actionPerformed(ActionEvent e){
		
			Object getw = e.getSource();
			if(getw== boton1){
				textos.setText(textos.getText()+1);
				operaciones+="1";
				
			}else if(getw==boton2){
				textos.setText(textos.getText()+"2");
				operaciones+="2";
			}else if(getw==boton3){
				textos.setText(textos.getText()+"3");
				operaciones+="3";
			}if(getw == botonsuma){
				if(!textos.getText().equals("")){
				 memoria1 = textos.getText();
				signo ="+";
				textos.setText("");
				}
			}else if(getw==boton4){
				textos.setText(textos.getText()+"4");
			}else if(getw==boton5){
				textos.setText(textos.getText()+"5");
			}else if(getw == boton6){
				textos.setText(textos.getText()+"6");
			}else if(getw==botonresta){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="-";
					textos.setText("");
					};
			}else if(getw==boton7){
				textos.setText(textos.getText()+"7");
			}else if(getw == boton8){
				textos.setText(textos.getText()+"8");
			}else if(getw==boton9){
				textos.setText(textos.getText()+"9");
			}else if(getw==botonmulti){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="*";
					textos.setText("");
					};
			}else if(getw == botonraizN){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="n";
					
					class RaizN extends JFrame implements ActionListener{
						JTextField textoExporaiz = new JTextField(50);
						public RaizN(){
							setBounds(300,200,200,100);
							setVisible(true);
							
							setLayout(null);
							JButton botonEx = new JButton("indice");
							botonEx.setBounds(10, 30, 100,20);
							textoExporaiz.setBounds(10, 0, 100, 20);
							add(botonEx);
							add(textoExporaiz);
							botonEx.addActionListener(this);
							
						}
						
						public void actionPerformed(ActionEvent e){
							Date fecha2 = new Date();
							fecha = fecha2.toString();
							raizene = textoExporaiz.getText();
							raizene2= Double.parseDouble(raizene);
							setVisible(false);
						}
					}
					RaizN raizn = new RaizN();
					}
					
			}else if(getw==boton0){
				textos.setText(textos.getText()+"0");
			}else if(getw==botonegativo){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="(-)";
					textos.setText("-"+ memoria1);
					}
			}else if(getw == botondivision){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="/";
					textos.setText("");
					}
			}else if(getw==botonexponente){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="^";
					class Exponente extends JFrame implements ActionListener{
						
						JTextField textoExpo = new JTextField(10);
						
						public Exponente(){
							setBounds(300,200,200,100);
							setVisible(true);
							
							setLayout(null);
							JButton botonEx = new JButton("exponente");
							botonEx.setBounds(10, 30, 100,20);
							textoExpo.setBounds(10, 0, 100, 20);
						
							
							add(botonEx);
							add(textoExpo);
							botonEx.addActionListener(this);
							
						}
						public void actionPerformed(ActionEvent e){
							exp1 = textoExpo.getText();
							exp2= Double.parseDouble(exp1);
							setVisible(false);
						}
					}
					Exponente exponente = new Exponente();
				}
			}else if(getw==botonraiz){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="√";
					}
			}else if(getw == botonpartido){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="1/";
					}
			}else if(getw == factorial){
				if(!textos.getText().equals("")){
					 memoria1 = textos.getText();
					signo ="!";
					}
			}else if(getw == resultado){
				
				String memoria2 = textos.getText();
				if(!memoria2.equals("")){
					resultado1 = calculadora(memoria2,memoria1,signo);
					textos.setText(resultado1);
				}
			}else if(getw == limpiar){
				textos.setText("");
			}else if(getw==guardar){
				this.guardarnuevo =" "+resultado1;
				System.out.print(guardarnuevo);
			}
			
		}
		public String calculadora(String memoria2,String memoria1,String signo){
			String respuesta = "";
			double resultado=0.0;
			if(signo.equals("+")){
				operacion = "suma"; 
				resultado = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);

			}else if (signo.equals("-")){
				operacion = "resta"; 
				resultado = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);
			}else if (signo.equals("*")){
				operacion = "multiplicacion";
				resultado = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);
			}else if (signo.equals("/")){
				operacion = "division";
				if(Double.parseDouble(memoria2)==0){
					 textos.setText("Math Error");
					 respuesta = textos.getText();
					 return respuesta;
				}else{
					resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);	
				}
				
				
			}else if(signo.equals("(-)")){
				operacion = "(-)";
				resultado =-(Double.parseDouble(memoria1));
			}else if(signo.equals("!")){
				operacion = "factorial";
				double facto =Double.parseDouble(memoria1);
				double fact = facto;
				double inte;
				double factori=1;
				for(inte=1; inte<=fact;++inte){
					factori*=inte;
				}
				resultado = factori; 
			}else if (signo.equals("^")){
				operacion = "exponente";
				double factoe =Double.parseDouble(memoria1);
				double factor = 1;
				for(double exp=0; exp<exp2;++exp){
					factor*=factoe;
				}
				resultado = factor;
			}else if(signo.equals("1/")){
				operacion = "inversa";

				double inversa1 = Double.parseDouble(memoria1) +  Double.parseDouble(memoria2);
				if(inversa1 == 0){
					textos.setText("Math Error");
					respuesta = textos.getText();
					return respuesta;
				}else{
					resultado =1/inversa1;	
				}
				
			}else if(signo.equals("√")){
				operacion = "raiz";
				int multi =1;
				double prueba=0;
				double u=0;
				double raiz = Double.parseDouble(memoria1) ;
				if(memoria1.contains("-")){
					textos.setText("Math Error");
					respuesta = textos.getText();
					return respuesta;
				}else{
					for(u=0; prueba<raiz-1;++u){
						prueba = u*u;
						
					}
					resultado = (raiz+prueba)/((u-1)*2);	
				}
				
			}else if(signo.equals("n")){
				operacion = "raiz n";
				double resultadoRaiz;
				double t =0;
				double resolviendo = 0;
				double iterar=0;
				double raizne = Double.parseDouble(memoria1) ;
				if(memoria1.contains("-")){
					textos.setText("Math Error");
					respuesta = textos.getText();
					return respuesta;
				}
				else{
					for(t =1; iterar<1;t+=1 ){
						iterar = t*t;
						resultado = t - (iterar-raizne)/(raizene2*(iterar/t));
						for(int o =0; o<20;++o){
							double iterare =1;
							for(int h =0; h<raizene2;++h){
								iterare *= resultado;
							}
							
							resultado = resultado - (iterare-raizne)/(raizene2*(iterare/resultado));
							
						}
					}	
				}
				
			}
			
			 respuesta = String.valueOf(resultado);
			 resultadoGuardar = textos.getText();
			return respuesta;
			
		}
		
				
	
	};


	//clase botones
	 class Buton extends JPanel {
		public Buton (){			
			add(boton1);add(boton2);add(boton3);add(botonsuma);
			add(boton4);add(boton5);add(boton6);add(botonresta);
			add(boton7);add(boton8);add(boton9);add(botonmulti);
			add(botonraizN);add(boton0);add(botonegativo);add(botondivision);
			add(botonexponente);add(botonraiz);add(botonpartido);add(factorial);
			add(resultado);add(limpiar);add(guardar);
			resultado.setBackground(Color.GREEN);
			 limpiar.setBackground(Color.RED);
			 guardar.setBackground(Color.CYAN);
		}
	}
		//constructoro todo
		public Toda (){
			Texto texto = new Texto();
			Buton botones = new Buton();
			add(texto);
			add(botones);
			GridLayout maquetar = new GridLayout(6,3,10,10);
			botones.setLayout(maquetar);
			//eventos botontes
			boton1.addActionListener(texto);
			boton2.addActionListener(texto);
			boton3.addActionListener(texto);
			botonsuma.addActionListener(texto);
			boton4.addActionListener(texto);
			boton5.addActionListener(texto);
			boton6.addActionListener(texto);
			botonresta.addActionListener(texto);
			boton7.addActionListener(texto);
			boton8.addActionListener(texto);
			boton9.addActionListener(texto);
			botonmulti.addActionListener(texto);
			botonraizN.addActionListener(texto);
			boton0.addActionListener(texto);
			botonegativo.addActionListener(texto);
			botondivision.addActionListener(texto);
			botonexponente.addActionListener(texto);
			botonraiz.addActionListener(texto);
			botonpartido.addActionListener(texto);
			factorial.addActionListener(texto);
			resultado.addActionListener(texto);
			limpiar.addActionListener(texto);
			guardar.addActionListener(texto);
		}
		public static  String guardar (){
			String guardarcon="";
			System.out.print("ds");
			System.out.println(fecha);
			System.out.println(resultadoGuardar);
			guardarcon +=  resultadoGuardar+"                                                     "+operacion+"                                                                        "+fecha+",";
				
		return guardarcon;	
	}	
		
}
	

		
		

