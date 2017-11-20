package pantallas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import bd.Consulta;
import model.Ranking;
import model.Usuario;

import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Genera la pantalla y los filtros para visualizar el ranking
 * NO FUNCIONAL
 * @author v130003
 *
 */

public class PantallaRanking extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ArrayList r;
	private static String filtro = "global";

	public PantallaRanking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		JCheckBox chckbxEstaSemana = new JCheckBox("semanal");

		if(chckbxEstaSemana.isSelected()){
			filtro = "semanal";
		}

		JCheckBox chckbxEstaMes = new JCheckBox("mensual");
		if(chckbxEstaMes.isSelected()){
			filtro = "mensual";
		}


		JCheckBox chckbxEstaAo = new JCheckBox("anual");
		if(chckbxEstaAo.isSelected()){
			filtro = "anual";
		}


		JCheckBox chckbxTotales = new JCheckBox("Totales");
		if(chckbxTotales.isSelected()){
			filtro = "total";
		}


		JLabel lblRanking = new JLabel("RANKING");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblRanking.setForeground(Color.BLACK);

		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				PantallaMenu hola = new PantallaMenu();
				hola.setVisible(true);
				dispose();

			}
		});


		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(144)
										.addComponent(chckbxEstaSemana)
										.addGap(49)
										.addComponent(chckbxEstaMes, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
										.addGap(42)
										.addComponent(chckbxEstaAo, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
										.addGap(43)
										.addComponent(chckbxTotales, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(268)
										.addComponent(lblRanking))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(343)
										.addComponent(btnAtras, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(163)
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(207, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
						.addGap(33)
						.addComponent(lblRanking)
						.addGap(60)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxEstaSemana)
								.addComponent(chckbxTotales)
								.addComponent(chckbxEstaAo)
								.addComponent(chckbxEstaMes))
						.addGap(35)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
						.addGap(56)
						.addComponent(btnAtras)
						.addContainerGap(40, Short.MAX_VALUE))
				);
		/**
		 * Los datos que se saquen de la base de datos hay que introducirlos en la tabla. cambiando los nulls
		 * Por ejemplo Pep
		 */

		table = new JTable();

		if(filtro.equals("global")){
			Consulta bd = new Consulta();
			r = bd.rank (PantallaLogin.me.getNick(), filtro);

			Object [][] p = new Object[r.size()][3];

			for (int i = 0 ; i<r.size(); i++){

				p[i][0] = PantallaLogin.me.getNick();
				p[i][1] = r.get(i);

			}

			table.setModel(new DefaultTableModel(p,new String[] {"Nick", "Puntuacion", "Fecha"}
					));
			scrollPane.setViewportView(table);
			contentPane.setLayout(gl_contentPane);
		}
	}
}
