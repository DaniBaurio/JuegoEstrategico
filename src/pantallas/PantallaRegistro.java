package pantallas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.Consulta;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

/**
 * Genera la pantalla para el registro del jugador
 * @author v130003
 *
 */

public class PantallaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField nick;
	private JTextField nombre;
	private JTextField pais;
	private JTextField correo;

	private JPasswordField pass;
	private String contNick;
	private String contNombre;
	private String contPais;
	private String contCorreo;
	private char[] contPass;

	public PantallaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);



		JLabel error = new JLabel("Error en los datos introducidos");
		error.setForeground(Color.RED);
		error.setFont(new Font("Tahoma", Font.BOLD, 15));
		error.setBounds(370, 489, 246, 14);
		contentPane.add(error);
		error.setVisible(false);

		JLabel lblNick = new JLabel("Nick:");
		lblNick.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNick.setForeground(Color.WHITE);
		lblNick.setBounds(257, 260, 46, 14);
		contentPane.add(lblNick);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(257, 304, 69, 14);
		contentPane.add(lblNombre);

		JLabel lblContrasea = new JLabel("Pass:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setBounds(258, 356, 87, 14);
		contentPane.add(lblContrasea);

		JLabel lblPas = new JLabel("Pais:");
		lblPas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPas.setForeground(Color.WHITE);
		lblPas.setBounds(256, 410, 46, 14);
		contentPane.add(lblPas);

		JLabel lblCorreoElectrnico = new JLabel("Correo electronico:");
		lblCorreoElectrnico.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreoElectrnico.setForeground(Color.WHITE);
		lblCorreoElectrnico.setBounds(256, 464, 135, 14);
		contentPane.add(lblCorreoElectrnico);

		nick = new JTextField();
		nick.setBounds(420, 258, 135, 20);
		contentPane.add(nick);
		nick.setColumns(10);

		nombre = new JTextField();
		nombre.setBounds(420, 302, 135, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);

		pass = new JPasswordField();
		pass.setBounds(420, 354, 135, 20);
		contentPane.add(pass);

		pais = new JTextField();
		pais.setColumns(10);
		pais.setBounds(420, 408, 135, 20);
		contentPane.add(pais);

		correo = new JTextField();
		correo.setColumns(10);
		correo.setBounds(420, 462, 135, 20);
		contentPane.add(correo);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(339, 508, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				PantallaLogin hola = new PantallaLogin();
				hola.setVisible(true);
				dispose();

			}
		});

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(530, 508, 89, 23);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contPass = pass.getPassword();
				contNombre = nombre.getText();
				contNick = nick.getText();
				contPais = pais.getText();
				contCorreo = correo.getText();
				Consulta bd = new Consulta();
				if(bd.newUsuario(contNick, String.valueOf(contPass), contNombre, contPais, contCorreo)){
					final PantallaLogin login = new PantallaLogin();
					login.setVisible(true);
					dispose();
				}
				else{
					error.setVisible(true);
				}

			}
		});

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(getClass().getResource("pinguino.png")));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(281, 23, 403, 226);
		contentPane.add(label_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("resgistro.jpg")));
		label.setBounds(10, 11, 971, 553);
		contentPane.add(label);
	}
}
