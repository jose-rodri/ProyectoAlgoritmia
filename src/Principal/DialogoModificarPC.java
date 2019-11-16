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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoModificarPC extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtprecesador1;
	private JTextField txtram1;
	private JTextField txtstocks1;
	private JTextField txtprecio1;
	private JComboBox cbomarca1;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoModificarPC dialog = new DialogoModificarPC();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoModificarPC() {
		setTitle("Modificar Marca");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMarca = new JLabel("Marca");
			lblMarca.setBounds(17, 31, 61, 16);
			contentPanel.add(lblMarca);
		}
		{
			cbomarca1 = new JComboBox();
			cbomarca1.addActionListener(this);
			cbomarca1.setModel(new DefaultComboBoxModel(new String[] {"LG", "HP", "Lenovo", "Dell", "Acer"}));
			cbomarca1.setBounds(121, 27, 130, 27);
			contentPanel.add(cbomarca1);
		}
		{
			JLabel lblProcesador = new JLabel("Procesador");
			lblProcesador.setBounds(17, 80, 92, 16);
			contentPanel.add(lblProcesador);
		}
		{
			txtprecesador1 = new JTextField();
			txtprecesador1.setBounds(121, 75, 130, 26);
			contentPanel.add(txtprecesador1);
			txtprecesador1.setColumns(10);
		}
		{
			JLabel lblRam = new JLabel("RAM");
			lblRam.setBounds(17, 127, 61, 16);
			contentPanel.add(lblRam);
		}
		{
			txtram1 = new JTextField();
			txtram1.setBounds(121, 122, 130, 26);
			contentPanel.add(txtram1);
			txtram1.setColumns(10);
		}
		{
			JLabel lblStocks = new JLabel("Stocks");
			lblStocks.setBounds(17, 171, 61, 16);
			contentPanel.add(lblStocks);
		}
		{
			txtstocks1 = new JTextField();
			txtstocks1.setBounds(121, 166, 130, 26);
			contentPanel.add(txtstocks1);
			txtstocks1.setColumns(10);
		}
		{
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(17, 220, 61, 16);
			contentPanel.add(lblPrecio);
		}
		{
			txtprecio1 = new JTextField();
			txtprecio1.setBounds(121, 215, 130, 26);
			contentPanel.add(txtprecio1);
			txtprecio1.setColumns(10);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(310, 26, 117, 29);
			contentPanel.add(btnCerrar);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(310, 75, 117, 29);
			contentPanel.add(btnGrabar);
		}
		
		txtprecesador1.setText(PANEL_PRINCIPAL.procesador0);
		txtram1.setText(""+PANEL_PRINCIPAL.ram0);
		txtstocks1.setText(""+PANEL_PRINCIPAL.stock0);
		txtprecio1.setText(""+PANEL_PRINCIPAL.precio0);	
	
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cbomarca1) {
			actionPerformedCbomarca1(e);
		}
	}
	protected void actionPerformedCbomarca1(ActionEvent e) {
		if(cbomarca1.getSelectedIndex()==0){
			txtprecesador1.setText(PANEL_PRINCIPAL.procesador0);
			txtram1.setText(""+PANEL_PRINCIPAL.ram0);
			txtstocks1.setText(""+PANEL_PRINCIPAL.stock0);
			txtprecio1.setText(""+PANEL_PRINCIPAL.precio0);	
			
		}
		else if (cbomarca1.getSelectedIndex()==1){
			

			txtprecesador1.setText(PANEL_PRINCIPAL.procesador1);
			txtram1.setText(""+PANEL_PRINCIPAL.ram1);
			txtstocks1.setText(""+PANEL_PRINCIPAL.stock1);
			txtprecio1.setText(""+PANEL_PRINCIPAL.precio1);
		}
		else if (cbomarca1.getSelectedIndex()==2){
			

			txtprecesador1.setText(PANEL_PRINCIPAL.procesador2);
			txtram1.setText(""+PANEL_PRINCIPAL.ram2);
			txtstocks1.setText(""+PANEL_PRINCIPAL.stock2);
			txtprecio1.setText(""+PANEL_PRINCIPAL.precio2);
		}
		else if (cbomarca1.getSelectedIndex()==3){
			

			txtprecesador1.setText(PANEL_PRINCIPAL.procesador3);
			txtram1.setText(""+PANEL_PRINCIPAL.ram3);
			txtstocks1.setText(""+PANEL_PRINCIPAL.stock3);
			txtprecio1.setText(""+PANEL_PRINCIPAL.precio3);
		}
		else {
			

			txtprecesador1.setText(PANEL_PRINCIPAL.procesador4);
			txtram1.setText(""+PANEL_PRINCIPAL.ram4);
			txtstocks1.setText(""+PANEL_PRINCIPAL.stock4);
			txtprecio1.setText(""+PANEL_PRINCIPAL.precio4);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
		
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		
	
		 validarTexto();
	}
	
	int getMarca(){
		
		return cbomarca1.getSelectedIndex();
	}
	
	void validarTexto(){
		 if(PANEL_PRINCIPAL.validarTexto(txtstocks1, 1) ==0)
			 JOptionPane.showMessageDialog(this, "Stock: no es un dato valido." );
		else if (PANEL_PRINCIPAL.validarTexto(txtprecio1, 3) ==0)
			 JOptionPane.showMessageDialog(this, "Precio: no es un dato valido." );
		else if (PANEL_PRINCIPAL.validarTexto(txtprecesador1, 2) ==0)
			 JOptionPane.showMessageDialog(this, "Procesador: no es un dato valido." );
		else if (PANEL_PRINCIPAL.validarTexto(txtram1, 1) ==0)
			 JOptionPane.showMessageDialog(this, "Ram : no es un dato valido." );
		else{
			if(getMarca()==0){
				PANEL_PRINCIPAL.stock0=Integer.parseInt(txtstocks1.getText());
				PANEL_PRINCIPAL.precio0= Double.parseDouble(txtprecio1.getText());
				PANEL_PRINCIPAL.procesador0= txtprecesador1.getText();
				PANEL_PRINCIPAL.ram0 = Integer.parseInt(txtram1.getText());
			}else if (getMarca()==1){
				PANEL_PRINCIPAL.stock1=Integer.parseInt(txtstocks1.getText());

				PANEL_PRINCIPAL.precio1= Double.parseDouble(txtprecio1.getText());
				PANEL_PRINCIPAL.procesador1= txtprecesador1.getText();
				PANEL_PRINCIPAL.ram1 = Integer.parseInt(txtram1.getText());
			}else if (getMarca()==2){
				
				PANEL_PRINCIPAL.stock2=Integer.parseInt(txtstocks1.getText());
				PANEL_PRINCIPAL.precio2= Double.parseDouble(txtprecio1.getText());
				PANEL_PRINCIPAL.procesador2= txtprecesador1.getText();
				PANEL_PRINCIPAL.ram2 = Integer.parseInt(txtram1.getText());
			}else if (getMarca()==3){
				
				PANEL_PRINCIPAL.stock3=Integer.parseInt(txtstocks1.getText());
				PANEL_PRINCIPAL.precio3= Double.parseDouble(txtprecio1.getText());
				PANEL_PRINCIPAL.procesador3= txtprecesador1.getText();
				PANEL_PRINCIPAL.ram3 = Integer.parseInt(txtram1.getText());
			}else{
				PANEL_PRINCIPAL.stock4=Integer.parseInt(txtstocks1.getText());
				PANEL_PRINCIPAL.precio4= Double.parseDouble(txtprecio1.getText());
				PANEL_PRINCIPAL.procesador4= txtprecesador1.getText();
				PANEL_PRINCIPAL.ram4 = Integer.parseInt(txtram1.getText());
			}
		 JOptionPane.showMessageDialog(this, "Modificado correctamente" );
			dispose();
		}
	}
	
	
	
	
}
