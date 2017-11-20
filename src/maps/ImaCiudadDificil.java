package maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Genera la pantalla en la que se visualizaran las imagenes de la ciudad generada en x turno
 * @author v130003
 *
 */

public class ImaCiudadDificil extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1 = new JLabel("");

	public ImaCiudadDificil() {


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JButton btnResolver = new JButton("Resolver");
		btnResolver.setBounds(415, 58, 89, 23);
		contentPane.add(btnResolver);

		lbl1.setBounds(10, 105, 913, 469);
		contentPane.add(lbl1);
		btnResolver.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
	}

	public void setIcon1(ImageIcon img) {
		this.lbl1.setIcon(img);
	}
}
