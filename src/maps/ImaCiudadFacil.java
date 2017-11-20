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

public class ImaCiudadFacil extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1 = new JLabel("");
	private JLabel lbl2 = new JLabel("");
	private JLabel lbl3 = new JLabel("");

	public ImaCiudadFacil() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 1045);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);



		JButton btnResolver = new JButton("Resolver");
		btnResolver.setBounds(403, 33, 89, 23);
		contentPane.add(btnResolver);
		btnResolver.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});

		lbl1.setBounds(10, 76, 913, 280);
		contentPane.add(lbl1);


		lbl2.setBounds(10, 382, 913, 280);
		contentPane.add(lbl2);


		lbl3.setBounds(10, 703, 913, 280);
		contentPane.add(lbl3);
	}

	public void setIcon1(ImageIcon img) {
		this.lbl1.setIcon(img);
	}

	public void setIcon2(ImageIcon img) {
		this.lbl2.setIcon(img);
	}

	public void setIcon3(ImageIcon img) {
		this.lbl3.setIcon(img);
	}
}

