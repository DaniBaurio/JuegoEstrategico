package maps;

import com.teamdev.jxmaps.LatLng;

public class Distancia {

	private Ciudad ciudadObj;
	private LatLng jugador;
	private double dist;

	/**
	 * Constructores de la clase necesarias para el juego
	 * @param ciudadObj
	 */
	public Distancia(Ciudad ciudadObj){

		this.ciudadObj = ciudadObj;
		this.dist = 0;
	}

	public Distancia(){

	}
	/**
	 * Obtencion de la distancia
	 * @return
	 */
	public double getDist() {
		return dist;
	}

	/**
	 * Poner la distancia al objeto
	 * @param dist
	 */

	public void setDist(double dist) {
		this.dist = dist;
	}
	/**
	 * Obtencion de la ciudad generada
	 * @return
	 */
	public Ciudad getCiudadObj() {
		return ciudadObj;
	}

	/**
	 * Obtencion de la situacion del jugador 
	 * @return
	 */
	public LatLng getJugador() {
		return jugador;
	}

	/**
	 * Poner la posicion del jugador
	 * @param jugador
	 */

	public void setJugador(LatLng jugador) {
		this.jugador = jugador;
	}

	/**
	 * Calcula la distancia a partir de la posicion de la ciudad generada y la posicion del jugador
	 * @param dist
	 * @return
	 */

	public Distancia calculaDistancia(Distancia dist){

		LatLng coor1 = dist.getCiudadObj().getCoordenadas();
		LatLng coor2 = dist.getJugador();

		double resultado = Math.sqrt(Math.pow((coor2.getLat() - coor1.getLat()), 2) + Math.pow((coor2.getLng() - coor1.getLng()), 2));

		dist.setDist(resultado);

		return dist;
	}

	/**
	 * Poner la ciudad objetivo
	 * @param ciudadObj
	 */

	public void setCiudadObj(Ciudad ciudadObj) {
		this.ciudadObj = ciudadObj;
	}

	/**
	 * Obtencion de la distancia
	 * @return
	 */
	public Distancia getDistancia(){
		return this;
	}


}
