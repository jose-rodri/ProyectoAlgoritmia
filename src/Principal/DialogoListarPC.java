package Principal;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoListarPC extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnListar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoListarPC dialog = new DialogoListarPC();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoListarPC() {
		setResizable(false);
		setModal(true);
		setTitle("Listar PC");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 17, 404, 190);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(18, 232, 117, 29);
		contentPanel.add(btnListar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(271, 232, 117, 29);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
		
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		PANEL_PRINCIPAL objCibertico = new PANEL_PRINCIPAL();
		
		txtS.setText("LISTADO DE PC's \n\n");
		
		txtS.append("Marca : " + objCibertico.marca0  + "\n");
		txtS.append("Procesador : " + objCibertico.procesador0  + "\n");
		txtS.append("Memoria RAM : " + objCibertico.ram0 + "\n");
		txtS.append("stock : " + objCibertico.stock0 + "\n");
		txtS.append("Precio : " + objCibertico.precio0 + "\n\n");
		
		
		txtS.append("Procesador : " + objCibertico.procesador2  + "\n");
		txtS.append("Memoria RAM : " + objCibertico.ram2 + "\n");
		txtS.append("stock : " + objCibertico.stock2 + "\n");
		txtS.append("Precio : " + objCibertico.precio2 + "\n\n");
		
		txtS.append("Marca : " + objCibertico.marca3  + "\n");
		txtS.append("Procesador : " + objCibertico.procesador3  + "\n");
		txtS.append("Memoria RAM : " + objCibertico.ram3 + "\n"); 
		txtS.append("Marca : " + objCibertico.marca1  + "\n");
		txtS.append("Procesador : " + objCibertico.procesador1  + "\n");
		txtS.append("Memoria RAM : " + objCibertico.ram1 + "\n");
		txtS.append("stock : " + objCibertico.stock1 + "\n");
		txtS.append("Precio : " + objCibertico.precio1 + "\n\n");
		
		txtS.append("Marca : " + objCibertico.marca2  + "\n");
		txtS.append("stock : " + objCibertico.stock3 + "\n");
		txtS.append("Precio : " + objCibertico.precio4 + "\n\n");
		
		txtS.append("Marca : " + objCibertico.marca4  + "\n");
		txtS.append("Procesador : " + objCibertico.procesador4  + "\n");
		txtS.append("Memoria RAM : " + objCibertico.ram4 + "\n");
		txtS.append("stock : " + objCibertico.stock4 + "\n");
		txtS.append("Precio : " + objCibertico.precio4 + "\n\n");
		
		
		
		
	}
}
