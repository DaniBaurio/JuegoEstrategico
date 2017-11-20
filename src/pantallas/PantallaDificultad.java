package pantallas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import maps.Mapa;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
/**
 * Genera la pantalla para la eleccion de la dificultad de la partida 
 * @author v130003
 *
 */
public class PantallaDificultad extends JFrame {

	private JPanel contentPane;
	public static int dificultad;

	public PantallaDificultad() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Dificil");
		btnNewButton.setBounds(600, 429, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dificultad = 3;
				PantallaMundo ho = new PantallaMundo();
				ho.setVisible(true);
				dispose();
			}
		});

		JButton btnMedio = new JButton("Normal");
		btnMedio.setBounds(600, 360, 89, 23);
		contentPane.add(btnMedio);
		btnMedio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dificultad = 2;
				PantallaMundo ho = new PantallaMundo();
				ho.setVisible(true);
				dispose();
			}
		});

		JButton btnFacil = new JButton("Facil");
		btnFacil.setBounds(600, 298, 89, 23);
		contentPane.add(btnFacil);
		btnFacil.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dificultad = 1;
				PantallaMundo ho = new PantallaMundo();
				ho.setVisible(true);
				dispose();
			}
		});

		JButton btnNewButton_1 = new JButton("Experto");
		btnNewButton_1.setBounds(600, 498, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 901, 681);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);

				JLabel lblAtencinEstasEntrado = new JLabel("   ATENCION, estas entrado en el modo experto");
				lblAtencinEstasEntrado.setBounds(10, 33, 875, 43);
				lblAtencinEstasEntrado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
				contentPane.add(lblAtencinEstasEntrado);

				JLabel lblReglasDelModo = new JLabel("Reglas del modo experto");
				lblReglasDelModo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
				lblReglasDelModo.setBounds(273, 138, 272, 33);
				contentPane.add(lblReglasDelModo);

				JLabel lblPuedenSalir = new JLabel("1.- Pueden salir ciudades de todo el mundo");
				lblPuedenSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblPuedenSalir.setBounds(234, 246, 396, 25);
				contentPane.add(lblPuedenSalir);

				JLabel lblCiudadesNo = new JLabel("2.- Ciudades no incluidas en otros modos");
				lblCiudadesNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblCiudadesNo.setBounds(234, 293, 396, 25);
				contentPane.add(lblCiudadesNo);

				JLabel lblUnaSola = new JLabel("3.- Una sola imagen para identificar");
				lblUnaSola.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblUnaSola.setBounds(234, 338, 396, 25);
				contentPane.add(lblUnaSola);

				JButton btnAdelante = new JButton("Adelante");
				btnAdelante.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
				btnAdelante.setBounds(546, 471, 199, 83);
				contentPane.add(btnAdelante);
				btnAdelante.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						Mapa map = new Mapa();
						dispose();
					}
				});

				JButton btnMeHeHecho = new JButton("Volver");
				btnMeHeHecho.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
				btnMeHeHecho.setBounds(106, 471, 199, 83);
				contentPane.add(btnMeHeHecho);
				btnMeHeHecho.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						PantallaDificultad menu = new PantallaDificultad();
						menu.setVisible(true);
						dispose();
					}
				});

				JLabel lblMismoTiempo = new JLabel("4.- Mismo tiempo ");
				lblMismoTiempo.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblMismoTiempo.setBounds(234, 385, 396, 25);
				contentPane.add(lblMismoTiempo);

				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(10, 11, 875, 620);
				contentPane.add(lblNewLabel);


			}

		});

		JLabel lblMenu = new JLabel("SELECCIONA DIFICULTAD");
		lblMenu.setFont(new Font("Microsoft Himalaya", Font.BOLD, 68));
		lblMenu.setForeground(Color.YELLOW);
		lblMenu.setBounds(325, 225, 750, 57);
		contentPane.add(lblMenu);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("earth-lights.jpg")));
		lblNewLabel.setBounds(0, 0, 1300, 650);
		contentPane.add(lblNewLabel);
	}

}
