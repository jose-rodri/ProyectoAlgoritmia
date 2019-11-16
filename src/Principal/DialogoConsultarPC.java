package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;

public class DialogoConsultarPC extends JDialog implements ActionListener, KeyListener, ItemListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblMarca;
	private JLabel lblProcesador;
	private JLabel lblRam;
	private JLabel lblStock;
	private JLabel lblPrecio;
	private JComboBox cbomarca;
	private JButton btnCerrar;
	private JTextField txtprocesador;
	private JTextField txtram;
	private JTextField txtstocks;
	private JTextField txtprecio;
	private JLabel lblConsultarPcs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConsultarPC dialog = new DialogoConsultarPC();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConsultarPC() {
		setResizable(false);
		setModal(true);
		setTitle("Consultar PC");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 66, 76, 16);
		contentPanel.add(lblMarca);
		
		lblProcesador = new JLabel("Procesador");
		lblProcesador.setBounds(10, 111, 76, 16);
		contentPanel.add(lblProcesador);
		
		lblRam = new JLabel("RAM");
		lblRam.setBounds(10, 152, 76, 16);
		contentPanel.add(lblRam);
		
		lblStock = new JLabel("Stock");
		lblStock.setBounds(10, 194, 76, 16);
		contentPanel.add(lblStock);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 244, 76, 16);
		contentPanel.add(lblPrecio);
		
		cbomarca = new JComboBox();
		cbomarca.addItemListener(this);
		cbomarca.addKeyListener(this);
		cbomarca.setModel(new DefaultComboBoxModel(new String[] {"LG", "HP", "Lenovo", "Dell", "Acer"}));
		cbomarca.setBounds(107, 57, 130, 27);
		contentPanel.add(cbomarca);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(285, 56, 117, 29);
		contentPanel.add(btnCerrar);
		
		txtprocesador = new JTextField();
		txtprocesador.setEditable(false);
		txtprocesador.setBounds(107, 101, 130, 26);
		txtprocesador.setText(PANEL_PRINCIPAL.procesador0);
		contentPanel.add(txtprocesador);
		txtprocesador.setColumns(10);
		
		
		txtram = new JTextField();
		txtram.setEditable(false);
		txtram.setBounds(107, 142, 130, 26);
		txtram.setText(""+PANEL_PRINCIPAL.ram0);
		contentPanel.add(txtram);
		txtram.setColumns(10);
		
		txtstocks = new JTextField();
		txtstocks.setEditable(false);
		txtstocks.setBounds(107, 184, 130, 26);
		txtstocks.setText(""+PANEL_PRINCIPAL.stock0);
		contentPanel.add(txtstocks);
		txtstocks.setColumns(10);
		
		txtprecio = new JTextField();
		txtprecio.setEditable(false);
		txtprecio.setBounds(107, 234, 130, 26);
		txtprecio.setText(""+PANEL_PRINCIPAL.precio0);
		contentPanel.add(txtprecio);
		txtprecio.setColumns(10);
		
		lblConsultarPcs = new JLabel("Consultar PC's");
		lblConsultarPcs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConsultarPcs.setBounds(151, 11, 117, 27);
		contentPanel.add(lblConsultarPcs);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
		
		
	}
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == cbomarca) {
			keyPressedCbomarca(e);
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	
	public void keyTyped(KeyEvent e) {
	}
	
	protected void keyPressedCbomarca(KeyEvent e) {
		
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cbomarca) {
			itemStateChangedCbomarca(e);
		}
	}
	protected void itemStateChangedCbomarca(ItemEvent e) {
		if(cbomarca.getSelectedIndex()==0){
			txtprocesador.setText(PANEL_PRINCIPAL.procesador0);
			txtram.setText(""+PANEL_PRINCIPAL.ram0);
			txtstocks.setText(""+PANEL_PRINCIPAL.stock0);
			txtprecio.setText(""+PANEL_PRINCIPAL.precio0);	
			
		}
		else if (cbomarca.getSelectedIndex()==1){
			

			txtprocesador.setText(PANEL_PRINCIPAL.procesador1);
			txtram.setText(""+PANEL_PRINCIPAL.ram1);
			txtstocks.setText(""+PANEL_PRINCIPAL.stock1);
			txtprecio.setText(""+PANEL_PRINCIPAL.precio1);
		}
		else if (cbomarca.getSelectedIndex()==2){
			

			txtprocesador.setText(PANEL_PRINCIPAL.procesador2);
			txtram.setText(""+PANEL_PRINCIPAL.ram2);
			txtstocks.setText(""+PANEL_PRINCIPAL.stock2);
			txtprecio.setText(""+PANEL_PRINCIPAL.precio2);
		}
		else if (cbomarca.getSelectedIndex()==3){
			

			txtprocesador.setText(PANEL_PRINCIPAL.procesador3);
			txtram.setText(""+PANEL_PRINCIPAL.ram3);
			txtstocks.setText(""+PANEL_PRINCIPAL.stock3);
			txtprecio.setText(""+PANEL_PRINCIPAL.precio3);
		}
		else {
			

			txtprocesador.setText(PANEL_PRINCIPAL.procesador4);
			txtram.setText(""+PANEL_PRINCIPAL.ram4);
			txtstocks.setText(""+PANEL_PRINCIPAL.stock4);
			txtprecio.setText(""+PANEL_PRINCIPAL.precio4);
		}
	}
}
