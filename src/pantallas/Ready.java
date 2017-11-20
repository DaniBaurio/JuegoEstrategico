package pantallas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 * Genera la pantalla de carga, para advertir al jugador de que empieza la partida
 * @author v130003
 *
 */
public class Ready extends JFrame {

	private JPanel contentPane;
	private Timer t;
	private ActionListener al;

	public Ready() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblpreparado = new JLabel("¿PREPARADO?");
		lblpreparado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		lblpreparado.setForeground(new Color(0, 0, 0));
		lblpreparado.setBounds(576, 79, 442, 138);
		contentPane.add(lblpreparado);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.BLACK);
		progressBar.setForeground(new Color(51, 153, 255));
		progressBar.setBounds(657, 345, 263, 50);
		contentPane.add(progressBar);

		al = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae){
				if(progressBar.getMaximum() == progressBar.getValue()){
					t.stop();
					dispose();

				}else{
					progressBar.setValue(progressBar.getValue()+10);
				}

			}
		};

		t = new Timer(500,al);
		t.start();


	}
}


