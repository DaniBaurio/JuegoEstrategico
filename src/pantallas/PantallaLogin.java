package pantallas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.Consulta;
import model.Usuario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

/**
 * Genera la pantalla login para el acceso a la aplicacion
 * @author v130003
 *
 */

public class PantallaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JButton conectar;
	private JPasswordField passwordField;

	static Usuario me;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaLogin frame = new PantallaLogin();
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
	final PantallaMenu ho = new PantallaMenu();
	final PantallaRegistro reg = new PantallaRegistro();

	public PantallaLogin() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1338, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel error = new JLabel("Error en los datos introducidos");
		error.setFont(new Font("Tahoma", Font.BOLD, 15));
		error.setForeground(Color.RED);
		error.setBackground(Color.RED);
		error.setBounds(545, 409, 262, 14);
		contentPane.add(error);
		error.setVisible(false);

		usuario = new JTextField();
		usuario.setBounds(655, 265, 200, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(655, 357, 200, 20);
		contentPane.add(passwordField);

		conectar = new JButton("Conectar");
		conectar.setBounds(615, 434, 89, 23);
		contentPane.add(conectar);
		conectar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String user = usuario.getText();
				char [] pass = passwordField.getPassword();
				Consulta bd = new Consulta();

				if (!bd.login(user, String.valueOf(pass))) {
					error.setVisible(true);
				}else {
					me = bd.consultarPerfil(user);
					ho.setVisible(true);
					dispose();
				}
			}
		});

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBackground(Color.WHITE);
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(557, 268, 61, 14);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Pass: ");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(559, 360, 200, 14);
		contentPane.add(lblContrasea);

		JLabel lblNewLabel = new JLabel("DISTANCE MAP");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD | Font.ITALIC, 69));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBounds(417, 130, 640, 73);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("¿No tienes cuenta?");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(508, 477, 156, 28);
		contentPane.add(lblNewLabel_1);

		JButton btnRegstrate = new JButton("Registrate");
		btnRegstrate.setBounds(680, 482, 110, 23);
		contentPane.add(btnRegstrate);
		btnRegstrate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				reg.setVisible(true);
				dispose();
			}
		});

		JLabel fondo = new JLabel("");
		fondo.setBackground(Color.BLACK);
		fondo.setIcon(new ImageIcon(getClass().getResource("earth-lights.jpg")));
		fondo.setBounds(10, -67, 1300, 800);
		contentPane.add(fondo);
	}
}

