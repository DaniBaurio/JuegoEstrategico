package maps;

import com.teamdev.jxmaps.Map;
import com.teamdev.jxmaps.MapMouseEvent;
import com.teamdev.jxmaps.MapOptions;
import com.teamdev.jxmaps.MapTypeControlOptions;
import com.teamdev.jxmaps.MapTypeId;
import com.teamdev.jxmaps.Marker;
import com.teamdev.jxmaps.MouseEvent;
import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.swing.MapView;
import pantallas.PantallaDificultad;
import pantallas.Ready;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Genera el juego para el dicho continente del nombre de la clase, en esta se genera, las pantallas para visualizar las imagenes, una pantalla de carga, 
 * y el mapa para elegir la posicion
 * @author v130003
 *
 */

public class JuegoAfrica extends MapView {

	private Distancia dist = new Distancia();
	private ImaCiudadFacil ima;
	private ImaCiudadMedio imaMedio;
	private ImaCiudadDificil imaDificil;
	private Timer t;
	private ActionListener al;

	public JuegoAfrica() {

		JFrame frame = new JFrame("Map Integration");
		JButton button_2 = new JButton("");
		button_2.setText("Resolver");
		JButton atras = new JButton("");
		atras.setText("Volver a ver las imagenes");
		frame.add(button_2, BorderLayout.NORTH);
		frame.add(atras, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(this, BorderLayout.CENTER);
		frame.setSize(700, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		if (PantallaDificultad.dificultad == 1){
			ima = new ImaCiudadFacil();
			ima.setLocationRelativeTo(null);
			ima.setVisible(true);
		}
		else if(PantallaDificultad.dificultad == 2){
			imaMedio = new ImaCiudadMedio();
			imaMedio.setLocationRelativeTo(null);
			imaMedio.setVisible(true);
		}
		else if(PantallaDificultad.dificultad == 3){
			imaDificil = new ImaCiudadDificil();
			imaDificil.setLocationRelativeTo(null);
			imaDificil.setVisible(true);
		}
		Ready let = new Ready();
		let.setVisible(true);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setMaximum(350);
		al = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae){
				if(progressBar.getMaximum() == progressBar.getValue()){
					t.stop();
					frame.dispose();
					if (PantallaDificultad.dificultad == 1){
						ima.dispose();
					}
					else if(PantallaDificultad.dificultad == 2){

						imaMedio.dispose();
					}
					else if(PantallaDificultad.dificultad == 3){

						imaDificil.dispose();
					}

					MapaResultadoAfrica nuevo = new MapaResultadoAfrica(dist);	

				}else{
					progressBar.setValue(progressBar.getValue()+10);
				}

			}
		};

		t = new Timer(1000,al);
		t.start();

		atras.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ima.setVisible(true);
			}
		});

		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t.stop();
				dist.calculaDistancia(dist);
				frame.dispose();
				MapaResultadoAfrica nuevo = new MapaResultadoAfrica(dist);	
			}
		});

		setOnMapReadyHandler(new MapReadyHandler() {
			@Override
			public void onMapReady(MapStatus status) {
				
				if (status == MapStatus.MAP_STATUS_OK) {
				
					Ciudad ciu =  Mapa.afri.generaCiudad();
					if (PantallaDificultad.dificultad == 1){
						ima.setIcon1(ciu.getImg1());
						ima.setIcon2(ciu.getImg2());
						ima.setIcon3(ciu.getImg3());
					}
					else if(PantallaDificultad.dificultad == 2){
						imaMedio.setIcon1(ciu.getImg1());
						imaMedio.setIcon2(ciu.getImg2());

					}
					else if(PantallaDificultad.dificultad == 3){
						imaDificil.setIcon1(ciu.getImg1());
					}

					final Map map = getMap();
					MapTypeId tipo = new MapTypeId("");
					MapTypeId [] array = {tipo.SATELLITE};
					map.setMapTypeId(tipo.SATELLITE);

					MapOptions options = new MapOptions();
					options. setOverviewMapControl(false);
					
					MapTypeControlOptions controlOptions = new MapTypeControlOptions();
					controlOptions.setMapTypeIds(array);
					
					options.setMapTypeControlOptions(controlOptions);
					options.setStreetViewControl(false);
					map.setOptions(options);
					map.setCenter(new LatLng(5.5488909115821095, 24.08203125));
					map.setZoom(3.0);

					Marker marker = new Marker(map);
					marker.setVisible(true);

					Marker marker2 = new Marker(map);
					marker2.setPosition(ciu.getCoordenadas());
					marker2.setVisible(false);
					dist.setCiudadObj(ciu);

					map.addEventListener("click", new MapMouseEvent() {
						@Override
						public void onEvent(MouseEvent mouseEvent) {

							marker.setPosition(mouseEvent.latLng());
							dist.setJugador(marker.getPosition());
							dist.calculaDistancia(dist);

							marker.addEventListener("click", new MapMouseEvent() {
								@Override
								public void onEvent(MouseEvent mouseEvent) {
									marker.remove();
									dist.setDist(0);

								}
							});
						}

					});


				}
			}

		});



	}




}