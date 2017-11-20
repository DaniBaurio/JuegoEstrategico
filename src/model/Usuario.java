package model;

/**
 * Clase Usuario
 * @author v130298 && u120398
 */

public class Usuario {
	
	private String nick;
	private String nombre_usuario;
	private String pass;
	private String pais;
	private String email;
	
	public Usuario () {
		
	}
	
	public Usuario (String nick, String nombre_usuario, String pass, String pais, String email) {
		this.nick = nick;
		this.nombre_usuario = nombre_usuario;
		this.pass= pass;
		this.pais = pais;
		this.email = email;
	}

	public String getNick() {
		return nick;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public String getPass() {
		return pass;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPais() {
		return pais;
	}

}
