package model;

/**
 * Clase Ranking
 * @author v130298 && u120398
 */

public class Ranking {


	private String nick;
	private int puntuacion;

	public Ranking () {	
	}

	public Ranking (String nick, int puntuacion) {
		this.nick = nick;
		this.puntuacion = puntuacion;

	}

	public String getNick() {
		return nick;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
}
