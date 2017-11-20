package maps;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import pantallas.PantallaDificultad;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Genera la pantalla en la que se visualizaran las imagenes de la ciudad generada en x turno
 * @author v130003
 *
 */


public class InfoExperto extends JFrame {

	private JPanel contentPane;

	public InfoExperto(PantallaDificultad menu) {
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

		JButton btnMeHeHecho = new JButton("Me he hecho caca");
		btnMeHeHecho.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnMeHeHecho.setBounds(106, 471, 199, 83);
		contentPane.add(btnMeHeHecho);
		btnMeHeHecho.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});

		JLabel lblMismoTiempo = new JLabel("4.- Mismo tiempo ");
		lblMismoTiempo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMismoTiempo.setBounds(234, 385, 396, 25);
		contentPane.add(lblMismoTiempo);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 865, 620);
		contentPane.add(lblNewLabel);


	}
}
