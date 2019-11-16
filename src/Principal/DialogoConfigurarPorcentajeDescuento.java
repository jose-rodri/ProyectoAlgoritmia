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

public class DialogoConfigurarPorcentajeDescuento extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt1a10;
	private JTextField txt11a20;
	private JTextField txt21a30;
	private JTextField txt30;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarPorcentajeDescuento dialog = new DialogoConfigurarPorcentajeDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarPorcentajeDescuento() {
		setTitle("Configurar porcentaje de descuento");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblA = new JLabel("1 a 10");
			lblA.setBounds(22, 80, 61, 16);
			contentPanel.add(lblA);
		}
		{
			JLabel lblA_1 = new JLabel("11 a 20");
			lblA_1.setBounds(22, 123, 61, 16);
			contentPanel.add(lblA_1);
		}
		{
			JLabel lblA_2 = new JLabel("21 a 30");
			lblA_2.setBounds(22, 162, 61, 16);
			contentPanel.add(lblA_2);
		}
		{
			JLabel lblMsDe = new JLabel("más de 30");
			lblMsDe.setBounds(22, 204, 76, 16);
			contentPanel.add(lblMsDe);
		}
		{
			txt1a10 = new JTextField();
			txt1a10.setBounds(108, 80, 110, 26);
			contentPanel.add(txt1a10);
			txt1a10.setColumns(10);
		}
		{
			txt11a20 = new JTextField();
			txt11a20.setBounds(108, 123, 110, 26);
			contentPanel.add(txt11a20);
			txt11a20.setColumns(10);
		}
		{
			txt21a30 = new JTextField();
			txt21a30.setBounds(108, 162, 110, 26);
			contentPanel.add(txt21a30);
			txt21a30.setColumns(10);
		}
		{
			txt30 = new JTextField();
			txt30.setBounds(108, 204, 110, 26);
			contentPanel.add(txt30);
			txt30.setColumns(10);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(228, 80, 61, 16);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(228, 123, 61, 16);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(228, 162, 61, 16);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("%");
			label.setBounds(228, 204, 61, 16);
			contentPanel.add(label);
		}
		{
			btnAceptar = new JButton("Actualizar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(299, 80, 117, 29);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cerrar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(299, 198, 117, 29);
			contentPanel.add(btnCancelar);
		}
		
		
		PANEL_PRINCIPAL objCibertico = new PANEL_PRINCIPAL();
		txt1a10.setText(""+objCibertico.porcentaje1);
		txt11a20.setText(""+objCibertico.porcentaje2);
		txt21a30.setText(""+objCibertico.porcentaje3);
		txt30.setText(""+objCibertico.porcentaje4);
		
		JLabel lblActualizarDescuento = new JLabel("ACTUALIZAR DESCUENTO");
		lblActualizarDescuento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblActualizarDescuento.setBounds(125, 28, 195, 26);
		contentPanel.add(lblActualizarDescuento);
		
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
		validarTexto();
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	
	void validarTexto(){
		
		 if(PANEL_PRINCIPAL.validarTexto(txt1a10, 3) ==0)
			 JOptionPane.showMessageDialog(this, "Porcentaje 1 a 10: no es un dato valido." );
		else if (PANEL_PRINCIPAL.validarTexto(txt11a20, 3) ==0)
			 JOptionPane.showMessageDialog(this, "Porcentaje 11 a 20: no es un dato valido." );
		else if (PANEL_PRINCIPAL.validarTexto(txt21a30, 3) ==0)
			 JOptionPane.showMessageDialog(this, "Porcentaje 21 a 30: no es un dato valido." );
		else if (PANEL_PRINCIPAL.validarTexto(txt30, 3) ==0)
			 JOptionPane.showMessageDialog(this, "Porcentaje 30 : no es un dato valido." );
		else
			 
		PANEL_PRINCIPAL.porcentaje1 = Double.parseDouble(txt1a10.getText());
		 PANEL_PRINCIPAL.porcentaje2 =Double.parseDouble(txt11a20.getText());
		 PANEL_PRINCIPAL.porcentaje3 = Double.parseDouble(txt21a30.getText());
		 PANEL_PRINCIPAL.porcentaje4 =Double.parseDouble(txt30.getText());
		 dispose();
	}
}
