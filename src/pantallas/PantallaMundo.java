package pantallas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.Consulta;
import maps.Mapa;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

/**
 * Genera la pantalla donde elegir el continente donde jugar
 * @author v130003
 *
 */
public class PantallaMundo extends JFrame {

	private JPanel contentPane;
	private int dificultad;
	public static int idPartida;

	public PantallaMundo() {

		this.dificultad = dificultad;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1399, 810);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnEuropa = new JButton("Europa");
		btnEuropa.setBounds(597, 227, 89, 23);
		contentPane.add(btnEuropa);
		btnEuropa.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((idPartida = dameID()) != -1){
					Mapa map = new Mapa(1);
					dispose();
				}	

			}
		});

		JButton btnAmericadelNorte = new JButton("America del norte");
		btnAmericadelNorte.setBounds(114, 227, 196, 23);
		contentPane.add(btnAmericadelNorte);
		btnAmericadelNorte.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((idPartida = dameID()) != -1){
					Mapa map = new Mapa(2);
					dispose();
				}

			}
		});

		JButton btnAmericaCentral = new JButton("America central");
		btnAmericaCentral.setBounds(128, 367, 155, 23);
		contentPane.add(btnAmericaCentral);
		btnAmericaCentral.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((idPartida = dameID()) != -1){
					Mapa map = new Mapa(3);
					dispose();
				}

			}
		});

		JButton btnAmericaDelSur = new JButton("America del sur");
		btnAmericaDelSur.setBounds(242, 511, 160, 23);
		contentPane.add(btnAmericaDelSur);
		btnAmericaDelSur.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((idPartida = dameID()) != -1){
					Mapa map = new Mapa(4);
					dispose();
				}
				//
			}
		});

		JButton btnAfrica = new JButton("Africa");
		btnAfrica.setBounds(597, 405, 89, 23);
		contentPane.add(btnAfrica);
		btnAfrica.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((idPartida = dameID()) != -1){
					Mapa map = new Mapa(5);
					dispose();
				}

			}
		});

		JButton btnAsia = new JButton("Asia");
		btnAsia.setBounds(874, 227, 89, 23);
		contentPane.add(btnAsia);
		btnAsia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((idPartida = dameID()) != -1){
					Mapa map = new Mapa(6);
					dispose();
				}

			}
		});

		JButton btnOceania = new JButton("Oceania");
		btnOceania.setBounds(1066, 558, 89, 23);
		contentPane.add(btnOceania);
		btnOceania.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((idPartida = dameID()) != -1){
					Mapa map = new Mapa(7);
					dispose();
				}

			}
		});

		JLabel lblNewLabel_1 = new JLabel("Selecciona un continente para jugar");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(483, 31, 542, 44);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("mundo.jpg")));
		lblNewLabel.setBounds(10, 11, 1362, 810);
		contentPane.add(lblNewLabel);
	}
	/**
	 * Obtenemos el id del jugador para la futura inserccion de la puntuacion
	 * @return
	 */
	private int dameID(){
		Consulta bd = new Consulta();
		return bd.crearPartida(PantallaLogin.me.getNick());	
	}


}
