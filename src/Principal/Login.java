package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Principal.PANEL_PRINCIPAL;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 320, 350);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(317, 0, 266, 350);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Serif", Font.BOLD, 18));
		lblUsuario.setBounds(10, 111, 113, 14);
		panel_1.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Serif", Font.BOLD, 18));
		lblPassword.setBounds(10, 178, 113, 14);
		panel_1.add(lblPassword);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(133, 111, 86, 20);
		panel_1.add(txtusuario);
		txtusuario.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(133, 178, 86, 20);
		panel_1.add(txtpassword);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String usuario = txtusuario.getText();
			String password = new String(txtpassword.getPassword());
			
			if(usuario.equals("admin")&&password.equals("123")){
				JOptionPane.showMessageDialog(null, "DATOS CORRECTOS " );
				
				
					PANEL_PRINCIPAL dv;
					dv = new PANEL_PRINCIPAL();
					dv.setVisible(true);
					dispose();
				
			}else{
				JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS SON INCORRECTOS");
				
				
				
			}
				
			}
		});
		btnIngresar.setBounds(51, 256, 168, 23);
		panel_1.add(btnIngresar);
	}
}
