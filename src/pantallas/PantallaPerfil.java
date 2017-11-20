package pantallas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import bd.Consulta;
import model.Usuario;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

/**
 * Genera la pantalla donde el jugador podra ver y cambiar sus datos
 * @author v130003
 *
 */

public class PantallaPerfil extends JFrame {

	private JPanel contentPane;
	private JTextField nick;
	private JTextField nombre;
	private JTextField pais;
	private JTextField correo;
	private JPasswordField passwordField;

	public PantallaPerfil() {

		Consulta bd = new Consulta();		
		Usuario yo = bd.consultarPerfil(PantallaLogin.me.getNick());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDatosCambiadosCorrectamente = new JLabel("Datos cambiados correctamente");
		lblDatosCambiadosCorrectamente.setForeground(Color.GREEN);
		lblDatosCambiadosCorrectamente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatosCambiadosCorrectamente.setBounds(298, 525, 261, 14);
		contentPane.add(lblDatosCambiadosCorrectamente);
		lblDatosCambiadosCorrectamente.setVisible(false);

		JLabel lblErrorAlModificar = new JLabel("Error al modificar ");
		lblErrorAlModificar.setForeground(Color.RED);
		lblErrorAlModificar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblErrorAlModificar.setBounds(345, 525, 183, 14);
		contentPane.add(lblErrorAlModificar);
		lblErrorAlModificar.setVisible(false);

		JLabel lblTusDatos = new JLabel("Tus Datos");
		lblTusDatos.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblTusDatos.setBackground(Color.YELLOW);
		lblTusDatos.setForeground(Color.YELLOW);
		lblTusDatos.setBounds(260, 45, 346, 100);
		contentPane.add(lblTusDatos);

		JLabel lblNick = new JLabel("Nick");
		lblNick.setForeground(Color.WHITE);
		lblNick.setBackground(Color.WHITE);
		lblNick.setBounds(260, 213, 46, 14);
		contentPane.add(lblNick);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(260, 260, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblPais = new JLabel("Pais");
		lblPais.setForeground(Color.WHITE);
		lblPais.setBounds(260, 315, 46, 14);
		contentPane.add(lblPais);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setBounds(260, 364, 46, 14);
		contentPane.add(lblCorreo);

		JLabel lblPass = new JLabel("Pass");
		lblPass.setForeground(Color.WHITE);
		lblPass.setBounds(260, 407, 46, 14);
		contentPane.add(lblPass);

		nick = new JTextField();
		nick.setBounds(360, 210, 200, 20);
		contentPane.add(nick);
		nick.setColumns(10);
		nick.setEditable(false);
		nick.setText(yo.getNick());

		nombre = new JTextField();
		nombre.setBounds(360, 257, 200, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		nombre.setEditable(false);
		nombre.setText(yo.getNombre_usuario());

		pais = new JTextField();
		pais.setBounds(360, 312, 200, 20);
		contentPane.add(pais);
		pais.setColumns(10);
		pais.setEditable(false);
		pais.setText(yo.getPais());

		correo = new JTextField();
		correo.setBounds(360, 361, 200, 20);
		contentPane.add(correo);
		correo.setColumns(10);
		correo.setEditable(false);
		correo.setText(yo.getEmail());

		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(240, 436, 112, 23);
		contentPane.add(btnAtras);
		btnAtras.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				PantallaMenu menu = new PantallaMenu();
				menu.setVisible(true);
				dispose();

			}
		});

		passwordField = new JPasswordField();
		passwordField.setBounds(360, 404, 200, 20);
		contentPane.add(passwordField);
		passwordField.setEditable(false);
		passwordField.setText(yo.getPass());

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(345, 491, 112, 23);
		contentPane.add(btnConfirmar);
		btnConfirmar.setVisible(false);
		btnConfirmar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(bd.modifyUser(nick.getText(), String.valueOf(passwordField.getPassword()), nombre.getText(), pais.getText())) {

					Consulta bd1 = new Consulta();		
					Usuario yo1 = bd1.consultarPerfil(PantallaLogin.me.getNick());
					nombre.setText(yo1.getNombre_usuario());
					pais.setText(yo1.getPais());
					passwordField.setText(yo.getPass());
					lblDatosCambiadosCorrectamente.setVisible(true);
					btnConfirmar.setVisible(false);
					nombre.setEditable(false);
					pais.setEditable(false);
					passwordField.setEditable(false);
				}
				else {

					lblErrorAlModificar.setVisible(true);
					lblDatosCambiadosCorrectamente.setVisible(false);
					nombre.setEditable(false);
					pais.setEditable(false);
					passwordField.setEditable(false);
				}

			}
		});

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(450, 436, 112, 23);
		contentPane.add(btnModificar);
		btnModificar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				nombre.setEditable(true);
				pais.setEditable(true);
				passwordField.setEditable(true);
				btnConfirmar.setVisible(true);

			}
		});




		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("espacio.jpg")));
		label.setBounds(10, 11, 800, 600);
		contentPane.add(label);
	}
}
