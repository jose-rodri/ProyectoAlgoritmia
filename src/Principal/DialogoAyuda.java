package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DialogoAyuda extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoAyuda dialog = new DialogoAyuda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAyuda() {
		setResizable(false);
		setModal(true);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(443, 0, 1, 271);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblEmpresaCibertico = new JLabel("Empresa CIBERTICO");
			lblEmpresaCibertico.setBounds(123, 18, 151, 16);
			contentPanel.add(lblEmpresaCibertico);
		}
		{
			JLabel lblResponsables = new JLabel("Responsables:");
			lblResponsables.setBounds(133, 51, 117, 16);
			contentPanel.add(lblResponsables);
		}
		{
			JLabel lblParedesTrejoJaime = new JLabel("Quispe Rodriguez José Leoncio");
			lblParedesTrejoJaime.setBounds(123, 93, 145, 16);
			contentPanel.add(lblParedesTrejoJaime);
		}
		{
			JLabel lblArceHuamnleninFroy = new JLabel("Gonzales Gonzales Liz Vanesa");
			lblArceHuamnleninFroy.setBounds(123, 121, 164, 16);
			contentPanel.add(lblArceHuamnleninFroy);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(133, 227, 117, 29);
			contentPanel.add(btnCerrar);
		}
		{
			JLabel lblResponsables_1 = new JLabel("RESPONSABLES");
			lblResponsables_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblResponsables_1.setBounds(133, 40, 156, 38);
			getContentPane().add(lblResponsables_1);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
