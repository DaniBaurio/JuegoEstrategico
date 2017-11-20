package maps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.teamdev.jxmaps.Map;
import com.teamdev.jxmaps.MapMouseEvent;
import com.teamdev.jxmaps.MapOptions;
import com.teamdev.jxmaps.MapTypeControlOptions;
import com.teamdev.jxmaps.MapTypeId;
import com.teamdev.jxmaps.Marker;
import com.teamdev.jxmaps.MouseEvent;

import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.InfoWindow;
import com.teamdev.jxmaps.LatLng;
import com.teamdev.jxmaps.swing.MapView;

import europa.CiudadesEuropa;
import pantallas.PantallaResultados;

/**
 * Genera la pantalla de la solucion donde se enseñara la posicion seleccionada por el jugador y la posicion de la ciudad objetivo
 * Tambien se enseñara el nombre de la ciudad para saber cual era
 * @author v130003
 *
 */

public class MapaResultadoEU extends MapView {


	public MapaResultadoEU(Distancia dist){


		Mapa.turno ++;


		if(Mapa.turno != 5){

			JFrame frame = new JFrame("Map Integration");
			JButton button_2 = new JButton("");
			button_2.setText("Avanzar");
			frame.add(button_2, BorderLayout.NORTH);
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.add(this, BorderLayout.CENTER);
			frame.setSize(700, 800);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			LatLng jugador = null;
			if (jugador == dist.getJugador()){
				Mapa.puntos.nullJugador(Mapa.turno);
			}else{
				dist.calculaDistancia(dist);
				Mapa.puntos.asignaPuntuacion(dist, Mapa.turno);
			}


			button_2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){

					frame.dispose();

					JuegoEU nuevo = new JuegoEU();
				}
			});
			setOnMapReadyHandler(new MapReadyHandler() {
				@Override
				public void onMapReady(MapStatus status) {
					if (status == MapStatus.MAP_STATUS_OK) {

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
						map.setCenter(dist.getCiudadObj().getCoordenadas());
						map.setZoom(3.0);

						Marker marker = new Marker(map);
						marker.setPosition(dist.getCiudadObj().getCoordenadas());
						marker.setVisible(true);
						final InfoWindow infoWindow = new InfoWindow(map);
						infoWindow.setContent("Ciudad buscada " + dist.getCiudadObj().getNombre());
						infoWindow.open(map, marker);

						Marker marker2 = new Marker(map);
						marker2.setPosition(dist.getJugador());
						marker2.setVisible(true);
						final InfoWindow infoWindow2 = new InfoWindow(map);
						infoWindow2.setContent("Posicion elegida");
						infoWindow2.open(map, marker2);


					}
				}

			});



		}else{

			JFrame frame = new JFrame("Map Integration");
			JButton button_2 = new JButton("");
			button_2.setText("Resultados Finales");
			button_2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					frame.dispose();
					PantallaResultados resul = new PantallaResultados();
					resul.setVisible(true);
				}
			});
			frame.add(button_2, BorderLayout.NORTH);
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.add(this, BorderLayout.CENTER);
			frame.setSize(700, 800);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			LatLng jugador = null;
			if (jugador == dist.getJugador()){
				Mapa.puntos.nullJugador(Mapa.turno);
			}else{
				dist.calculaDistancia(dist);
				Mapa.puntos.asignaPuntuacion(dist, Mapa.turno);
			}

			setOnMapReadyHandler(new MapReadyHandler() {
				@Override
				public void onMapReady(MapStatus status) {
					if (status == MapStatus.MAP_STATUS_OK) {

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
						map.setCenter(dist.getCiudadObj().getCoordenadas());
						map.setZoom(3.0);

						Marker marker = new Marker(map);
						marker.setPosition(dist.getCiudadObj().getCoordenadas());
						marker.setVisible(true);
						final InfoWindow infoWindow = new InfoWindow(map);
						infoWindow.setContent("Ciudad buscada " + dist.getCiudadObj().getNombre());
						infoWindow.open(map, marker);

						Marker marker2 = new Marker(map);
						marker2.setPosition(dist.getJugador());
						marker2.setVisible(true);
						final InfoWindow infoWindow2 = new InfoWindow(map);
						infoWindow2.setContent("Posicion elegida");
						infoWindow2.open(map, marker2);

					}
				}

			});

		}
	}







}
