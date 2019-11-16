package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DialogoVender extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcantidad;
	JComboBox cbomarca;
	PANEL_PRINCIPAL objCibertico = new PANEL_PRINCIPAL();
	private JTextField txtefectivo;
	private JButton btnVender;
	JTextArea txtS ;
	private JButton btnCerrar;
	
	public static int  contLG= 0;
	public static int contCLG =0;
	public static double acuLG =0;
	
	public static int  contHP= 0;
	public static int contCHP =0;
	public static double acuHP =0;

	public static int  contLE= 0;
	public static int contCLE =0;
	public static double acuLE =0;
	
	public static int  contDE= 0;
	public static int contCDE =0;
	public static double acuDE =0;
	
	public static int  contAC= 0;
	public static int contCAC =0;
	public static double acuAC =0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoVender dialog = new DialogoVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender() {
		setResizable(false);
		setModal(true);
		setTitle("Venta PC");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMarca = new JLabel("Marca");
			lblMarca.setBounds(16, 24, 61, 16);
			contentPanel.add(lblMarca);
		}
		{
			cbomarca = new JComboBox();
			cbomarca.setModel(new DefaultComboBoxModel(new String[] {"LG", "HP", "Lenovo", "Dell", "Acer"}));
			cbomarca.setBounds(77, 20, 118, 27);
			contentPanel.add(cbomarca);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setBounds(16, 52, 61, 16);
			contentPanel.add(lblCantidad);
		}
		{
			txtcantidad = new JTextField();
			txtcantidad.setBounds(77, 52, 118, 26);
			contentPanel.add(txtcantidad);
			txtcantidad.setColumns(10);
		}
		{
			JLabel lblEfectivo = new JLabel("Efectivo");
			lblEfectivo.setBounds(16, 80, 61, 16);
			contentPanel.add(lblEfectivo);
		}
		{
			txtefectivo = new JTextField();
			txtefectivo.setBounds(77, 80, 118, 26);
			contentPanel.add(txtefectivo);
			txtefectivo.setColumns(10);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setBounds(309, 19, 117, 29);
			contentPanel.add(btnVender);
		}
		{
			btnCerrar = new JButton("cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(309, 60, 117, 29);
			contentPanel.add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(16, 128, 406, 130);
			contentPanel.add(scrollPane);
			{
				 txtS = new JTextArea();
				 txtS.setEditable(false);
				scrollPane.setViewportView(txtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		int marca, cantidad, resta;
		String obsequio, ma;
		double icompra, idesc, ipagar, precio, vuelto, efectivo;
		
		marca = getMarca();
		cantidad = getCantidad();
		efectivo  = getEfectivo();
		
		
		 if(PANEL_PRINCIPAL.validarTexto(txtcantidad, 3) ==0)
			 JOptionPane.showMessageDialog(this, "Cantidad: no es un dato valido." );
		else if (PANEL_PRINCIPAL.validarTexto(txtefectivo, 3) ==0)
			 JOptionPane.showMessageDialog(this, "Efectivo : no es un dato valido." );
	
		else{
		
		if(getMarca()==0){
			precio = objCibertico.precio0;
			ma = objCibertico.marca0;
			resta = objCibertico.stock0 - cantidad;
			icompra = precio * cantidad;
			
			
			if (!(efectivo > icompra)){
				JOptionPane.showMessageDialog(this, "Efectivo insuficiente. Debe ingresar un valor mayor o igual que "+icompra+".");
				txtS.setText("");
				return;
			}else{
				contLG +=1;
				contCLG += cantidad;
				acuLG += icompra;
			}
			
			
			if(resta >=0){
				objCibertico.stock0 = resta;
				
			}else{
				JOptionPane.showMessageDialog(this, "Stock insuficiente. \nStock actual: "+objCibertico.stock0);
				txtS.setText("");
				return;
			}
		}else if(getMarca() == 1){
			precio = objCibertico.precio1;
			ma = objCibertico.marca1;
			resta = objCibertico.stock1 - cantidad;
			icompra = precio * cantidad;
			
			if (!(efectivo > icompra)){
				JOptionPane.showMessageDialog(this, "Efectivo insuficiente. Debe ingresar un valor mayor o igual que "+icompra+".");
				txtS.setText("");
				return;
			}else{
				contHP +=1;
				contCHP += cantidad;
				acuHP += icompra;
			}
			
			
			
			if(resta >=0){
				objCibertico.stock1 = resta;
				
			}else{
				JOptionPane.showMessageDialog(this, "Stock insuficiente. \nStock actual: "+objCibertico.stock1);
				txtS.setText("");
				return;
			}
			
		}else if(getMarca() == 2){
			precio = objCibertico.precio2;
			ma = objCibertico.marca2;
			resta = objCibertico.stock2 - cantidad;
			icompra = precio * cantidad;
			if (!(efectivo > icompra)){
				JOptionPane.showMessageDialog(this, "Efectivo insuficiente. Debe ingresar un valor mayor o igual que "+icompra+".");
				txtS.setText("");
				return;
			}else{
				contLE +=1;
				contCLE += cantidad;
				acuLE += icompra;
			}
			
			
			if(resta >=0){
				objCibertico.stock2 = resta;
				
			}else{
				JOptionPane.showMessageDialog(this, "Stock insuficiente. \nStock actual: "+objCibertico.stock2);
				txtS.setText("");
				return;
			}
		}else if(getMarca() == 3){
			precio = objCibertico.precio3;
			ma = objCibertico.marca3;
			resta = objCibertico.stock3 - cantidad;
			icompra = precio * cantidad;
			
			if (!(efectivo > icompra)){
				JOptionPane.showMessageDialog(this, "Efectivo insuficiente. Debe ingresar un valor mayor o igual que "+icompra+".");
				txtS.setText("");
				return;
			}else{
				contDE +=1;
				contCDE += cantidad;
				acuDE += icompra;
			}
			
			if(resta >=0){
				objCibertico.stock3 = resta;
				
			}else{
				JOptionPane.showMessageDialog(this, "Stock insuficiente. \nStock actual: "+objCibertico.stock3);
				txtS.setText("");
				return;
			}
		}else{
			precio = objCibertico.precio4;
			ma = objCibertico.marca4;
			resta = objCibertico.stock4 - cantidad;
			icompra = precio * cantidad;
			if (!(efectivo > icompra)){
				JOptionPane.showMessageDialog(this, "Efectivo insuficiente. Debe ingresar un valor mayor o igual que "+icompra+".");
				txtS.setText("");
				return;
			}else{
				contAC +=1;
				contCAC += cantidad;
				acuAC += icompra;
			}
			
			if(resta >=0){
				objCibertico.stock4 = resta;
				
			}else{
				JOptionPane.showMessageDialog(this, "Stock insuficiente. \nStock actual: "+objCibertico.stock4);
				txtS.setText("");
				return;
			}
		}
		
	
		
		if(cantidad >=1 && cantidad <=10){
			idesc = (icompra * objCibertico.porcentaje1)/100 ;
			
		}else if(cantidad >=11 && cantidad <=20){
			idesc = (icompra * objCibertico.porcentaje2) /100;
		}else if(cantidad >=21 && cantidad <=30){
			idesc =( icompra * objCibertico.porcentaje3) /100;
		}else{
			idesc = (icompra * objCibertico.porcentaje4)/100;
			
		}
		ipagar = icompra - idesc;
		
		if (cantidad >= objCibertico.cantidadMinimaVendida){
			obsequio = objCibertico.obsequio;
		}else {
			obsequio = "Nada";
		}
	
		vuelto = efectivo - ipagar;
		
		txtS.setText("RESULTADO : \n");
		txtS.append("Marca : " + ma + " \n " );
		txtS.append("Precio : " + precio  + " \n " );
		txtS.append("Obsequio : " + obsequio+ " \n " );
		txtS.append("Importe de compra : " + icompra+ " \n " );
		txtS.append("Importe de descuento : " + idesc+ " \n " );
		txtS.append("Importe de pago : " + ipagar+ " \n " );
		txtS.append("Vuelto : " + vuelto+ " \n " );
		}
	}
	//fin del boton
	int getMarca(){
		return cbomarca.getSelectedIndex();
	}
	
	int getCantidad(){
		
		return Integer.parseInt(txtcantidad.getText());
	}
	
	double getEfectivo(){
		
		return Double.parseDouble(txtefectivo.getText());
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	
	}
	
}
