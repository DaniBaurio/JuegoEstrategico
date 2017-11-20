package maps;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

public class Ciudad {



	private String nombre;
	private LatLng coordenadas;
	private ImageIcon img1;
	private ImageIcon img2;
	private ImageIcon img3;

	/**
	 * Constructores para generar las ciudades del juego
	 * @param nombre
	 * @param coordenadas
	 * @param img1
	 * @param img2
	 * @param img3
	 */

	public Ciudad(String nombre, LatLng coordenadas, ImageIcon img1, ImageIcon img2, ImageIcon img3){

		this.nombre = nombre;
		this.coordenadas = coordenadas;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
	}

	public Ciudad(String nombre, LatLng coordenadas, ImageIcon img1, ImageIcon img2){

		this.nombre = nombre;
		this.coordenadas = coordenadas;
		this.img1 = img1;
		this.img2 = img2;
	}

	public Ciudad(String nombre, LatLng coordenadas, ImageIcon img1){

		this.nombre = nombre;
		this.coordenadas = coordenadas;
		this.img1 = img1;
	}

	public Ciudad(String nombre, LatLng coordenadas){
		this.nombre = nombre;
		this.coordenadas = coordenadas;
	}

	public Ciudad(){

	}
	/**
	 * Obtenemos el nombre de la ciudad generada
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Obtenemos las coordenadas de la ciudad generada
	 * @return
	 */
	public LatLng getCoordenadas() {
		return coordenadas;
	}
	/**
	 * Ponemos nombre a la ciudad
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Ponemos coordenadas a la ciudad
	 * @param coordenadas
	 */
	public void setCoordenadas(LatLng coordenadas) {
		this.coordenadas = coordenadas;
	}

	/**
	 * Obtencion de las imagenes de la ciudad generada
	 * @return
	 */
	public ImageIcon getImg1() {
		return img1;
	}

	public ImageIcon getImg2() {
		return img2;
	}

	public ImageIcon getImg3() {
		return img3;
	}

}
