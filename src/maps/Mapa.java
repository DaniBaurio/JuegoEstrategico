package maps;

import africa.CiudadesAfrica;
import americaCentral.CiudadesAmericaC;
import americaNorte.CiudadesAmericaN;
import americaSur.CiudadesAmericaS;
import asia.CiudadesAsia;
import europa.CiudadesEuropa;
import experto.CiudadesExperto;
import oceania.CiudadesOceania;

/**
 * Clase encargada de empezar la partida y el continente seleccionado para jugar
 * 
 * @author v130003
 *
 */

public class Mapa {

	private int continente;

	public static Puntuacion puntos;
	public static CiudadesEuropa eu;
	public static CiudadesAfrica afri;
	public static CiudadesAmericaC central;
	public static CiudadesAmericaN norte;
	public static CiudadesAmericaS sur;
	public static CiudadesAsia asia;
	public static CiudadesOceania ocea;
	public static CiudadesExperto expert;
	public static int turno;

	public Mapa(int continente){

		this.continente = continente;

		if(this.continente == 1){
			eu = new CiudadesEuropa();
			puntos = new Puntuacion();
			turno = 0;
			JuegoEU sample = new JuegoEU();
		}
		else if(this.continente == 2){
			norte = new CiudadesAmericaN();
			puntos = new Puntuacion();
			turno = 0;
			JuegoAmericaN sample = new JuegoAmericaN();

		}else if(this.continente == 3){
			central = new CiudadesAmericaC();
			puntos = new Puntuacion();
			turno = 0;
			JuegoAmericaC sample = new JuegoAmericaC();

		}else if(this.continente == 4){
			sur = new CiudadesAmericaS();
			puntos = new Puntuacion();
			turno = 0;
			JuegoAmericaS sample = new JuegoAmericaS();

		}else if(this.continente == 5){
			afri = new CiudadesAfrica();
			puntos = new Puntuacion();
			turno = 0;
			JuegoAfrica sample = new JuegoAfrica();

		}else if(this.continente == 6){
			asia = new CiudadesAsia();
			puntos = new Puntuacion();
			turno = 0;
			JuegoAsia sample = new JuegoAsia();

		}else if(this.continente == 7){
			ocea = new CiudadesOceania();
			puntos = new Puntuacion();
			turno = 0;
			JuegoOceania sample = new JuegoOceania();
		}

	}  
	public Mapa(){
		expert= new CiudadesExperto();
		puntos = new Puntuacion();
		turno = 0;
		JuegoExperto sample = new JuegoExperto();

	}
}


