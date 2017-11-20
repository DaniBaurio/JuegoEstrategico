package maps;

import bd.Consulta;
import pantallas.PantallaMundo;

/**
 * Clase para guardar las puntuaciones durante los diferentes turnos
 * @author v130003
 *
 */
public class Puntuacion {

	int turn1;
	int turn2;
	int turn3;
	int turn4;
	int turn5;

	public  Puntuacion(){

		this.turn1 = 0;
		this.turn2 = 0;
		this.turn3 = 0;
		this.turn4 = 0;
		this.turn5 = 0;
	}

	/**
	 * Calculo de la puntuacion total de la partida del jugador
	 * @return
	 */

	public int puntuacionTotal(){	
		int total = this.turn1 + this.turn2 + this.turn3 + this.turn4 + this.turn5;
		Consulta bd = new Consulta();
		bd.addPuntos(PantallaMundo.idPartida, total, 6);	
		return total;
	}

	/**
	 * Si al jugador se le acaba el tiempo, se le asigna la puntuacion maxima
	 */
	public void nullJugador(int contador){

		if ( contador == 1){
			this.turn1 = 100;
		}
		else if(contador == 2){
			this.turn2 = 100;
		}
		else if(contador == 3){
			this.turn3 = 100;
		}
		else if(contador == 4){
			this.turn4 = 100;
		}
		else{
			this.turn5 = 100;
		}
	}

	/**
	 * Asigna la puntuacion a la partida del jugador dependiendo de la distancia
	 * @param dist
	 * @param contador
	 */
	public void asignaPuntuacion(Distancia dist, int contador){

		double distancia = dist.getDist();

		if (contador == 1){

			if(distancia<= 5){
				this.turn1 = 0;
			}
			else if(5 < distancia && distancia <= 10){
				this.turn1 = 25;
			}
			else if(10 < distancia && distancia <= 15){
				this.turn1 = 50;
			}
			else if(15 < distancia && distancia <= 25){
				this.turn1 = 75;
			}
			else
				this.turn1 = 100;

			Consulta bd = new Consulta();
			bd.addPuntos(PantallaMundo.idPartida, this.turn1, contador);
		}
		else if (contador == 2){

			if(distancia<= 5){
				this.turn2 = 0;
			}
			else if(5 < distancia && distancia <= 10){
				this.turn2 = 25;
			}
			else if(10 < distancia && distancia <= 15){
				this.turn2 = 50;
			}
			else if(15 < distancia && distancia <= 25){
				this.turn2 = 75;
			}
			else
				this.turn2 = 100;

			Consulta bd = new Consulta();
			bd.addPuntos(PantallaMundo.idPartida, this.turn2, contador);

		}
		else if (contador == 3){

			if(distancia<= 5){
				this.turn3 = 0;
			}
			else if(5 < distancia && distancia <= 10){
				this.turn3 = 25;
			}
			else if(10 < distancia && distancia <= 15){
				this.turn3 = 50;
			}
			else if(15 < distancia && distancia <= 25){
				this.turn3 = 75;
			}
			else
				this.turn3 = 100;

			Consulta bd = new Consulta();
			bd.addPuntos(PantallaMundo.idPartida, this.turn3, contador);

		}
		else if (contador == 4){

			if(distancia<= 5){
				this.turn4 = 0;
			}
			else if(5 < distancia && distancia <= 10){
				this.turn4 = 25;
			}
			else if(10 < distancia && distancia <= 15){
				this.turn4 = 50;
			}
			else if(15 < distancia && distancia <= 25){
				this.turn4 = 75;
			}
			else
				this.turn4 = 100;

			Consulta bd = new Consulta();
			bd.addPuntos(PantallaMundo.idPartida, this.turn4, contador);
		}
		else if (contador == 5){

			if(distancia<= 5){
				this.turn5 = 0;
			}
			else if(5 < distancia && distancia <= 10){
				this.turn5 = 25;
			}
			else if(10 < distancia && distancia <= 15){
				this.turn5 = 50;
			}
			else if(15 < distancia && distancia <= 25){
				this.turn5 = 75;
			}
			else
				this.turn5 = 100;

			Consulta bd = new Consulta();
			bd.addPuntos(PantallaMundo.idPartida, this.turn5, contador);
		}
	}
}