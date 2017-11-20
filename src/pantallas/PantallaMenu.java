package pantallas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.Consulta;
import model.Usuario;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

/**
 * Genera la pantalla del menu donde se podran elegir las diferentes opciones de la aplicacion
 * @author v130003
 *
 */

public class PantallaMenu extends JFrame {
	
	private JPanel contentPane;
	private PantallaDificultad difi;

	public PantallaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1406, 695);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(620, 60, 183, 127);
		contentPane.add(lblNewLabel);

		JButton btnJugar = new JButton("Jugar");
		btnJugar.setBounds(636, 262, 111, 23);
		contentPane.add(btnJugar);
		btnJugar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				difi = new PantallaDificultad();
				difi.setVisible(true);
				dispose();

			}
		});

		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(636, 332, 111, 23);
		contentPane.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				PantallaPerfil perfil = new PantallaPerfil();
				perfil.setVisible(true);
				dispose();

			}
		});

		JButton btnRanking = new JButton("Ranking");
		btnRanking.setBounds(636, 405, 111, 23);
		contentPane.add(btnRanking);
		btnRanking.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				PantallaRanking log = new PantallaRanking();
				log.setVisible(true);
				dispose();

			}
		});

		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.setBounds(636, 472, 111, 23);
		contentPane.add(btnDesconectar);
		btnDesconectar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				PantallaLogin log = new PantallaLogin();
				Consulta bd = new Consulta();
				bd.logout(log.me.getNick());
				log.setVisible(true);
				dispose();

			}
		});

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("earth-lights.jpg")));
		label.setBounds(10, 11, 1360, 634);
		contentPane.add(label);
	}
}
