package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DialogoConfigurarStocks extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtTStock;
	private JButton btnCancelar;
	JComboBox cboMarca ;
	PANEL_PRINCIPAL objCibertico = new PANEL_PRINCIPAL();
	private JButton btnAceptar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarStocks dialog = new DialogoConfigurarStocks();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarStocks() {
		setResizable(false);
		setModal(true);
		setTitle("Configurar Stocks");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			cboMarca = new JComboBox();
			cboMarca.addActionListener(this);
			cboMarca.setModel(new DefaultComboBoxModel(new String[] {"LG", "HP", "Lenovo", "Dell", "Acer"}));
			cboMarca.setBounds(125, 103, 124, 27);
			contentPanel.add(cboMarca);
		}
		{
			txtTStock = new JTextField();
			txtTStock.setBounds(125, 156, 130, 26);
			contentPanel.add(txtTStock);
			txtTStock.setColumns(10);
		}
		{
			JLabel lblMarca = new JLabel("Marca");
			lblMarca.setBounds(45, 113, 61, 16);
			contentPanel.add(lblMarca);
		}
		{
			JLabel lblTotalStocks = new JLabel("Total Stocks");
			lblTotalStocks.setBounds(43, 166, 72, 16);
			contentPanel.add(lblTotalStocks);
		}
		{
			btnAceptar = new JButton("Actualizar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(317, 103, 117, 29);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cerrar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(317, 157, 117, 29);
			contentPanel.add(btnCancelar);
		}
		
		txtTStock.setText(""+objCibertico.stock0);
		{
			lblNewLabel = new JLabel("Actualizar stock actual");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(151, 31, 161, 27);
			contentPanel.add(lblNewLabel);
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboMarca) {
			actionPerformedCboMarca(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		 if(PANEL_PRINCIPAL.validarTexto(txtTStock, 1) ==0)
		 {
			 JOptionPane.showMessageDialog(this, "Stock: no es un dato valido." );
		 }
		 else
		 {
		if(getMarca() == 0){
			
			objCibertico.stock0 = Integer.parseInt(txtTStock.getText());
		}else if(getMarca() == 1){
			objCibertico.stock1 = Integer.parseInt(txtTStock.getText());
		}else if(getMarca() == 2){
			objCibertico.stock2 = Integer.parseInt(txtTStock.getText());
		}else if(getMarca() == 3){
			objCibertico.stock3 = Integer.parseInt(txtTStock.getText());
		}else{
			objCibertico.stock4 = Integer.parseInt(txtTStock.getText());
		}
	}
	}
	int getMarca(){
		return cboMarca.getSelectedIndex();
	}
	protected void actionPerformedCboMarca(ActionEvent e) {
		
		if(getMarca() == 0){
			txtTStock.setText(""+objCibertico.stock0);
		}else if(getMarca() == 1){
			txtTStock.setText(""+objCibertico.stock1);
		}else if(getMarca() == 2){
			txtTStock.setText(""+objCibertico.stock2);
		}else if(getMarca() == 3){
			txtTStock.setText(""+objCibertico.stock3);
		}else{
			txtTStock.setText(""+objCibertico.stock4);
		}
	
	}
}
