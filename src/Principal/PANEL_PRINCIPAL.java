package Principal;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PANEL_PRINCIPAL extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarPc;
	private JMenuItem mntmModificarPc;
	private JMenuItem mntmListarPc;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnConfiguracin;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarStocks;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarStockMinimo;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDeTienda;
	
	
	
	// Datos miÌ�nimos dela primeraPC
	public static String marca0 = "LG";
	public static String procesador0 = "Intel core i7";
	public static int ram0 = 4;
	public static int stock0= 50;
	public static double precio0 = 3500.0;
	// Datos miÌ�nimos de la segunda PC
	public static String marca1 = "HP";
	public static String procesador1 = "AMD Athlon II X4";
	public static int ram1 = 8;
	public static int stock1 = 100;
	public static double precio1 = 2500.0;
	// Datos miÌ�nimos de la tercera PC
	public static String marca2 = "Lenovo";
	public static String procesador2 = "Intel core i5";
	public static int ram2= 8;
	public static int stock2 = 70;
	public static double precio2 = 3300.0;
	// Datos miÌ�nimos de la cuarta PC
	public static String marca3 = "Dell";
	public static String procesador3 = "Intel core i3";
	public static int ram3 = 4;
	public static int stock3 = 90;
	public static double precio3 = 2800.0;
	// Datos miÌ�nimos de la quinta PC
	public static String marca4 = "Acer";
	public static String procesador4 = "AMD Athlon II X2";
	public static int ram4 = 8;
	public static int stock4 = 50;
	public static double precio4 = 2100.0;
	// Porcentajes de descuento
	public static double porcentaje1 = 5.3; 
	public static double porcentaje2 = 6.5; public static double porcentaje3 = 8.4;
	public static double porcentaje4 = 9.5;
	// Cantidad oÌ�ptima de PC vendidos
	public static int cantidadOptimaVendida = 50;
	// Cantidad miÌ�nima de PC adquiridos para obtener el obsequio
	public static int cantidadMinimaVendida = 5;
	// Obsequio
	public static String obsequio = "Un Mouse"; // Stock minimo
	
	public static int stockMinimo = 30;
	private JMenu mnLogin;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// UIManager.setLookAndFeel();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try {
					PANEL_PRINCIPAL frame = new PANEL_PRINCIPAL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PANEL_PRINCIPAL() {
		setTitle("CIBER S.A.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		
	
		
		
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarPc = new JMenuItem("Consultar PC");
		mntmConsultarPc.addActionListener(this);
		mnMantenimiento.add(mntmConsultarPc);
		
		mntmModificarPc = new JMenuItem("Modificar PC");
		mntmModificarPc.addActionListener(this);
		mnMantenimiento.add(mntmModificarPc);
		
		mntmListarPc = new JMenuItem("Listar PC");
		mntmListarPc.addActionListener(this);
		mnMantenimiento.add(mntmListarPc);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reporte");
		mntmGenerarReportes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UNDEFINED, 0));
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		mntmConfigurarStocks = new JMenuItem("Configurar stocks");
		mntmConfigurarStocks.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarStocks);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		mntmConfigurarStockMinimo = new JMenuItem("Configurar stock minimo");
		mntmConfigurarStockMinimo.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarStockMinimo);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(e);
		}
		if (e.getSource() == mntmConfigurarStockMinimo) {
			actionPerformedMntmConfigurarStockMinimo(e);
		}
		if (e.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(e);
		}
		if (e.getSource() == mntmConfigurarStocks) {
			actionPerformedMntmConfigurarStocks(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListarPc) {
			actionPerformedMntmListarPc(e);
		}
		if (e.getSource() == mntmModificarPc) {
			actionPerformedMntmModificarPc(e);
		}
		if (e.getSource() == mntmConsultarPc) {
			actionPerformedMntmConsultarPc(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedMntmConsultarPc(ActionEvent e) {
		DialogoConsultarPC dc;
		dc = new DialogoConsultarPC();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
		
	}
	protected void actionPerformedMntmModificarPc(ActionEvent e) {
		DialogoModificarPC mp;
		mp = new DialogoModificarPC ();
		mp.setLocationRelativeTo(this);
		mp.setVisible(true);
		
		
	}
	protected void actionPerformedMntmListarPc(ActionEvent e) {
		
		try {
			

			DialogoListarPC lispc;
			lispc = new DialogoListarPC ();
			lispc.setLocationRelativeTo(this);
			lispc.setVisible(true);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.getMessage();
			
			
		}
		
		
	}

	protected void actionPerformedMntmVender(ActionEvent e) {
		DialogoVender dv;
		dv = new DialogoVender ();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
		
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		
		DialogoGenerarReportes dgr;
		dgr = new DialogoGenerarReportes();
		dgr.setLocationRelativeTo(this);
		dgr.setVisible(true);
		
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		
		DialogoConfigurarPorcentajeDescuento dcd;
		dcd = new DialogoConfigurarPorcentajeDescuento ();
		dcd.setLocationRelativeTo(this);
		dcd.setVisible(true);
		
	}
	protected void actionPerformedMntmConfigurarStocks(ActionEvent e) {
		DialogoConfigurarStocks dcs;
		dcs = new DialogoConfigurarStocks ();
		dcs.setLocationRelativeTo(this);
		dcs.setVisible(true);
		
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent e) {
		
		DialogoConfigurarObsequio dco;
		dco = new DialogoConfigurarObsequio ();
		dco.setLocationRelativeTo(this);
		dco.setVisible(true);
		
	}
	protected void actionPerformedMntmConfigurarStockMinimo(ActionEvent e) {
		
		DialogoConfigurarStockMinimo dsm;
		dsm = new DialogoConfigurarStockMinimo ();
		dsm.setLocationRelativeTo(this);
		dsm.setVisible(true);
		
		
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent e) {
		
		DialogoAyuda dc;
		dc = new DialogoAyuda ();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
		
	}
	
	public static int validarTexto(JTextField texto,int tipoDato){
		 
		
		if ( tipoDato == 1){
			try {
				int var=Integer.parseInt(texto.getText());
				if  (var <1){
					texto.setText("");
					return 0;
					
				}
				else 
					return 1;
				
			} catch (Exception e) {
				texto.setText("");
				return 0;
			}
		}
		
		else if(tipoDato == 2){
			try {
				
				if  (texto.getText().trim().length() == 0){
					texto.setText("");
					return  0;
				}
				else 
					  Integer.parseInt(texto.getText());
				texto.setText("");
					return 0;
			} catch (Exception e) {
				
				return 1;
			}
		}
		else 
		{
			try {
				double var=Double.parseDouble(texto.getText());
				if  (var  < 1){
					texto.setText("");
					return 0;
					}
				else 
					return 1;
			} catch (Exception e) {
				texto.setText("");
				return 0;
			}	
		}
			
		
			
	}
}

