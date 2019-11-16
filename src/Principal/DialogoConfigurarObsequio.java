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
import java.awt.Font;

public class DialogoConfigurarObsequio extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcantidadpc;
	private JTextField txtobsequio;
	private JButton btnAceptar;
	PANEL_PRINCIPAL objCibertico = new PANEL_PRINCIPAL();
	private JButton btnCancelar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarObsequio dialog = new DialogoConfigurarObsequio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarObsequio() {
		setTitle("Configurar obsequio");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 470, 298);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadMinimaDe = new JLabel("Cantidad minima de PC adquiridas");
			lblCantidadMinimaDe.setBounds(6, 83, 228, 16);
			contentPanel.add(lblCantidadMinimaDe);
		}
		{
			JLabel lblObsequio = new JLabel("Obsequio");
			lblObsequio.setBounds(6, 161, 61, 16);
			contentPanel.add(lblObsequio);
		}
		{
			txtcantidadpc = new JTextField();
			txtcantidadpc.setBounds(244, 78, 100, 26);
			contentPanel.add(txtcantidadpc);
			txtcantidadpc.setColumns(10);
		}
		{
			txtobsequio = new JTextField();
			txtobsequio.setBounds(244, 156, 100, 26);
			contentPanel.add(txtobsequio);
			txtobsequio.setColumns(10);
		}
		{
			btnAceptar = new JButton("Actualizar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(354, 77, 100, 29);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(354, 155, 100, 29);
			contentPanel.add(btnCancelar);
		}
		
		txtobsequio.setText(objCibertico.obsequio);
		txtcantidadpc.setText(""+objCibertico.stockMinimo);
		{
			lblNewLabel = new JLabel("ACTUALIZAR OBSEQUIO");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(141, 27, 157, 16);
			contentPanel.add(lblNewLabel);
		}
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
		
			 if(PANEL_PRINCIPAL.validarTexto(txtobsequio, 2) ==0)
				 JOptionPane.showMessageDialog(this, "Obsequio: no es un dato valido." );
			else if (PANEL_PRINCIPAL.validarTexto(txtcantidadpc, 1) ==0)
				 JOptionPane.showMessageDialog(this, "Cantidad: no es un dato valido." );
	
			else
			{
				objCibertico.obsequio = txtobsequio.getText();
			 	objCibertico.stockMinimo = Integer.parseInt(txtcantidadpc.getText());
			 	 JOptionPane.showMessageDialog(this, "Registrado correctamente." );
			}
	
			}
	
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
