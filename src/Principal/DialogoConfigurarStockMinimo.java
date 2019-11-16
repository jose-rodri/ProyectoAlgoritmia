package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConfigurarStockMinimo extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcantidadoptimapc;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarStockMinimo dialog = new DialogoConfigurarStockMinimo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarStockMinimo() {
		setResizable(false);
		setModal(true);
		setTitle("Configurar cantidad óptima de PC vendidas");
		setBounds(100, 100, 454, 212);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadptimaDe = new JLabel("Cantidad óptima de PC vendidas");
			lblCantidadptimaDe.setBounds(26, 46, 173, 16);
			contentPanel.add(lblCantidadptimaDe);
		}
		{
			txtcantidadoptimapc = new JTextField();
			txtcantidadoptimapc.setBounds(209, 41, 54, 26);
			contentPanel.add(txtcantidadoptimapc);
			txtcantidadoptimapc.setColumns(10);
		}
		{
			btnAceptar = new JButton("Actualizar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(317, 40, 117, 29);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cerrar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(317, 115, 117, 29);
			contentPanel.add(btnCancelar);
		}
		PANEL_PRINCIPAL  objCibertico = new PANEL_PRINCIPAL();
		txtcantidadoptimapc.setText(""+objCibertico.cantidadOptimaVendida);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		 if(PANEL_PRINCIPAL.validarTexto(txtcantidadoptimapc, 1) ==0)
			 JOptionPane.showMessageDialog(this, "Cantidad optima: no es un dato valido." );

		else{
		PANEL_PRINCIPAL  objCibertico = new PANEL_PRINCIPAL();
		objCibertico.cantidadOptimaVendida = Integer.parseInt(txtcantidadoptimapc.getText());
		JOptionPane.showMessageDialog(this, "Registrado correctamente." );
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
