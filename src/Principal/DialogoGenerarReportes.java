package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DialogoGenerarReportes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	PANEL_PRINCIPAL objCi = new PANEL_PRINCIPAL();
	DialogoVender objVe = new DialogoVender();
	JComboBox cbotiporeporte;
	double prom;
	int cont;
	JTextArea txtS;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoGenerarReportes dialog = new DialogoGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoGenerarReportes() {
		setTitle("Generar reportes");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 495, 324);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTipoDeReporte = new JLabel("Tipo de reporte");
			lblTipoDeReporte.setBounds(10, 56, 86, 16);
			contentPanel.add(lblTipoDeReporte);
		}
		{
			 cbotiporeporte = new JComboBox();
			 cbotiporeporte.addActionListener(this);
			cbotiporeporte.setModel(new DefaultComboBoxModel(new String[] {"VENTAS POR MARCA", "MARCAS CON VENTA \u00D3PTIMA", "MARCAS CUYOS STOCKS SUPERAN EL STOCK MINIMO", "PC\u2019S CON PRECIOS SUPERIORES AL PRECIO PROMEDIO", "PRECIO PROMEDIO, MENOR Y MAYOR"}));
			cbotiporeporte.setBounds(106, 51, 358, 27);
			contentPanel.add(cbotiporeporte);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(347, 11, 117, 29);
			contentPanel.add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(32, 92, 438, 181);
			contentPanel.add(scrollPane);
			{
				 txtS = new JTextArea();
				txtS.setEditable(false);
				scrollPane.setViewportView(txtS);
			}
			{
				lblNewLabel = new JLabel("REPORTE DE LAS PC's");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel.setBounds(124, 11, 176, 14);
				contentPanel.add(lblNewLabel);
			}
			prom =( PANEL_PRINCIPAL.precio0 + PANEL_PRINCIPAL.precio1 + PANEL_PRINCIPAL.precio2 + PANEL_PRINCIPAL.precio3 + PANEL_PRINCIPAL.precio4) /5;
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbotiporeporte) {
			actionPerformedCbotiporeporte(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
	}
	
	
	int getReporte(){
		return  cbotiporeporte.getSelectedIndex();
		
	}
	protected void actionPerformedCbotiporeporte(ActionEvent e) {
		
		int reporte;
		reporte = getReporte();
		
		Mostrar(reporte);
	}
	
	void Mostrar(int reporte){
		
			if (reporte == 0){
				
				txtS.setText("Venta por ");
				
				txtS.append("Marca : " + objCi.marca0 + " \n");
				txtS.append("Cantidad de ventas : " + objVe.contLG + " \n");
				txtS.append("Cantidad total de PC's vendidos : " + objVe.contCLG + " \n");
				txtS.append("Importe total acumulado : " +objVe.acuLG + " \n\n");
				
				
				txtS.append("Marca : " + objCi.marca1 + " \n");
				txtS.append("Cantidad de ventas : " + objVe.contHP + " \n");
				txtS.append("Cantidad total de PC's vendidos : " + objVe.contCHP + " \n");
				txtS.append("Importe total acumulado : " +objVe.acuHP + " \n\n");
				
				txtS.append("Marca : " + objCi.marca2 + " \n");
				txtS.append("Cantidad de ventas : " + objVe.contLE + " \n");
				txtS.append("Cantidad total de PC's vendidos : " + objVe.contCLE + " \n");
				txtS.append("Importe total acumulado : " +objVe.acuLE + " \n\n");
				
				txtS.append("Marca : " + objCi.marca3 + " \n");
				txtS.append("Cantidad de ventas : " + objVe.contDE + " \n");
				txtS.append("Cantidad total de PC's vendidos : " + objVe.contCDE + " \n");
				txtS.append("Importe total acumulado : " +objVe.acuDE + " \n\n");
				
				txtS.append("Marca : " + objCi.marca4 + " \n");
				txtS.append("Cantidad de ventas : " + objVe.contAC + " \n");
				txtS.append("Cantidad total de PC's vendidos : " + objVe.contCAC + " \n");
				txtS.append("Importe total acumulado : " +objVe.acuAC + " \n\n");
				
				
			}else if (reporte == 1){
				txtS.setText("MARCAS CON VENTA ÓPTIMA \n");
				
				if(objVe.contCLG >= PANEL_PRINCIPAL.cantidadOptimaVendida){
					txtS.append("Marca : " +PANEL_PRINCIPAL.marca0 + " \n" );
					txtS.append("Cantidad total de PC's vendidos : "+objVe.contCLG + " \n");
				}
				if(objVe.contCHP >= PANEL_PRINCIPAL.cantidadOptimaVendida){
					txtS.append("Marca : " +PANEL_PRINCIPAL.marca1 + " \n");
					txtS.append("Cantidad total de PC's vendidos : "+objVe.contCHP + " \n");
				}
				if(objVe.contCLE >= PANEL_PRINCIPAL.cantidadOptimaVendida){
					txtS.append("Marca : " +PANEL_PRINCIPAL.marca2 + " \n");
					txtS.append("Cantidad total de PC's vendidos : "+objVe.contCLE + " \n");
				}
				if(objVe.contCDE >= PANEL_PRINCIPAL.cantidadOptimaVendida){
					txtS.append("Marca : " +PANEL_PRINCIPAL.marca3 + " \n");
					txtS.append("Cantidad total de PC's vendidos : "+objVe.contCDE + " \n");
				}
				if(objVe.contCAC >= PANEL_PRINCIPAL.cantidadOptimaVendida){
					txtS.append("Marca : " +PANEL_PRINCIPAL.marca4 + " \n");
					txtS.append("Cantidad total de PC's vendidos : "+objVe.contCAC + " \n");
				} 
				
			}else if (reporte == 2){
				
				txtS.setText("MARCAS CUYOS STOCKS SUPERAN EL STOCK MINIMO \n");
				
				if(PANEL_PRINCIPAL.stock0 > PANEL_PRINCIPAL.stockMinimo){
					txtS.append(PANEL_PRINCIPAL.marca0 + " \n" );
					
				}
				if(PANEL_PRINCIPAL.stock1 > PANEL_PRINCIPAL.stockMinimo){
					txtS.append(PANEL_PRINCIPAL.marca1 + " \n");
					
				}
				if(PANEL_PRINCIPAL.stock2 > PANEL_PRINCIPAL.stockMinimo){
					txtS.append(PANEL_PRINCIPAL.marca2 + " \n");
					
				}
				if(PANEL_PRINCIPAL.stock3 > PANEL_PRINCIPAL.stockMinimo){
					txtS.append(PANEL_PRINCIPAL.marca3 + " \n");
					
				}
				if(PANEL_PRINCIPAL.stock4 > PANEL_PRINCIPAL.stockMinimo){
					txtS.append(PANEL_PRINCIPAL.marca4 + " \n");
					
				} 
				
				txtS.append("Stock Minimo : " + PANEL_PRINCIPAL.stockMinimo);
				
				
			}else if (reporte == 3){
				txtS.setText("PC'S CON PRECIOS SUPERIORES AL PRECIO PROMEDIO \n");
				
				
				if(PANEL_PRINCIPAL.precio0 > prom){
					txtS.append(PANEL_PRINCIPAL.marca0 + " \n" );
					cont +=1;
				}
				if(PANEL_PRINCIPAL.precio1 > prom){
					txtS.append(PANEL_PRINCIPAL.marca1 + " \n" );
					cont +=1;
				}
				if(PANEL_PRINCIPAL.precio2 > prom){
					txtS.append(PANEL_PRINCIPAL.marca2 + " \n" );
					cont +=1;
				}
				if(PANEL_PRINCIPAL.precio3 > prom){
					txtS.append(PANEL_PRINCIPAL.marca3 + " \n" );
					cont +=1;
				}
				if(PANEL_PRINCIPAL.precio4 > prom){
					txtS.append(PANEL_PRINCIPAL.marca4 + " \n" );
					cont +=1;
				}
				
				txtS.append("Precio promedio: S/. "+prom +" \n ");
				txtS.append("Número de PC's: "+cont +" \n ");
				
			}else  {
				txtS.setText("PRECIO PROMEDIO, MENOR Y MAYOR \n");
				
				double menor = PANEL_PRINCIPAL.precio0 ;
				double mayor = PANEL_PRINCIPAL.precio0;
				if(PANEL_PRINCIPAL.precio0 < menor){
					menor =PANEL_PRINCIPAL.precio0; 
				}
				if(PANEL_PRINCIPAL.precio1 < menor){
					menor =PANEL_PRINCIPAL.precio1; 
				}
				if(PANEL_PRINCIPAL.precio2 < menor){
					menor =PANEL_PRINCIPAL.precio2; 
				}
				if(PANEL_PRINCIPAL.precio3 < menor){
					menor =PANEL_PRINCIPAL.precio3; 
				}
				if(PANEL_PRINCIPAL.precio4 < menor){
					menor =PANEL_PRINCIPAL.precio4; 
				}
				
				if (PANEL_PRINCIPAL.precio0 > mayor){
					mayor =PANEL_PRINCIPAL.precio0; 
				}
				if (PANEL_PRINCIPAL.precio1 > mayor){
					mayor =PANEL_PRINCIPAL.precio1; 
				}
				if (PANEL_PRINCIPAL.precio2 > mayor){
					mayor =PANEL_PRINCIPAL.precio2; 
				}
				if (PANEL_PRINCIPAL.precio3 > mayor){
					mayor =PANEL_PRINCIPAL.precio3; 
				}
				if (PANEL_PRINCIPAL.precio4 > mayor){
					mayor =PANEL_PRINCIPAL.precio4; 
				}
				
				txtS.append("Precio promedio: S/. " + prom + " \n");
				txtS.append("Precio menor : S/. " +  menor + " \n");
				txtS.append("Precio mayor : S/. " + mayor  + " \n");
				
			}
	}
}

