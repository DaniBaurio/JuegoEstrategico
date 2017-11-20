package pantallas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import maps.Mapa;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Pantalla al finalizar la partida donde se muestra la puntuacion al jugador
 * @author v130003
 *
 */

public class PantallaResultados extends JFrame {

	private JPanel contentPane;

	public PantallaResultados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblPuntuacinObtenida = new JLabel("         Puntuacion obtenida");
		lblPuntuacinObtenida.setFont(new Font("Sylfaen", Font.ITALIC, 93));
		contentPane.add(lblPuntuacinObtenida, BorderLayout.NORTH);

		JLabel lblA = new JLabel("                 " + Mapa.puntos.puntuacionTotal());
		lblA.setFont(new Font("Tahoma", Font.ITALIC, 99));
		contentPane.add(lblA, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				PantallaMenu ho = new PantallaMenu();
				ho.setVisible(true);
				dispose();
			}
		});
	}

}
