package bd;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import model.Ranking;
import model.Usuario;

/**
 * Consultas a BD
 * @author v130298 && u120398
 *
 */

public class Consulta {

	/* Crea la conexion mySQL */
	private static Connection conexion() {
		Connection conexion = null;

		String servidor = "jdbc:mysql://localhost/practicaINGS2";
		String options = "useSSL=false&verifyServerCertificate=false&requireSSL=false";
		String usuario ="soft";
		String pwd ="murky";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion= DriverManager.getConnection(servidor + "?" + options, usuario, pwd);
		}
		catch(ClassNotFoundException ex){System.out.println("ERROR1");}
		catch(SQLException ex){System.out.println("ERROR2");}
		catch(Exception ex){System.out.println("ERROR3");}

		return conexion;
	}

	/* Crea un nuevo Usuario y lo anade en la base de datos */
	public boolean newUsuario (String nick, String pass, String nombre_usuario, String pais, String correo) {

		String consulta;
		Connection conexion = conexion();

		consulta = "insert into practicaINGS2.Usuarios (nick, nombre_usuario, contrasena, validado, logueado, pais, email, numCambiosInfo) values ('" + nick + "', '" + nombre_usuario +  "', '" + pass + "', '" + 0 +"', '" + 0 + "', '" + pais + "','"+ correo + "', '" + 0 + "')";
		try {
			conexion.createStatement().executeUpdate(consulta);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	/* Busca las credenciales de ese usuario para permitirle hacerle el login.
	 * Devuelve true si existe ese usuario con esa contrasena en la BD, false en caso contrario. */
	public static boolean login(String nick, String pass) {

		String [] consulta = new String [2];
		ResultSet result;

		/* Creamos conexion */
		Connection conexion = conexion();

		/* Comprobar password y validado */
		consulta[0] = "SELECT * FROM practicaINGS2.Usuarios WHERE nick = '" + nick + "'";

		try {
			PreparedStatement statment = conexion.prepareStatement(consulta[0]);
			result = statment.executeQuery();

			/* Comprobar si password correcta */

			result.next();
			if (result.getInt(4) == 0 && pass.equals(result.getString(3))){
				consulta[1] = "update practicaINGS2.Usuarios SET logueado = 1 where nick = '" + nick + "'";
				try {
					conexion.createStatement().executeUpdate(consulta[1]);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}

	/* 3. Logout(). Cerrar sesion
	 * Se pone a 0 los campos 'logueado' y 'numCambiosInfo' en la BD */
	public boolean logout (String nick) {

		String [] consulta = new String [2];

		/* Creamos conexion */
		Connection conexion = conexion();

		consulta[0] = "update practicaINGS2.Usuarios set Usuarios.numCambiosInfo = 0 where Usuarios.nick = '" + nick + "'";
		try {
			conexion.createStatement().executeUpdate(consulta[0]);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		consulta[1] = "update practicaINGS2.Usuarios set Usuarios.logueado = 0 where Usuarios.nick = '" + nick + "'";
		try {
			conexion.createStatement().executeUpdate(consulta[1]);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	/* 4. Modificar los campos 'pass', 'nombre' y 'pais' de un usuario.
	 * Si se ha modificado el perfil mas de 3 veces en la misma sesion -> No se modifica, return FALSE
	 * En caso contrario:
	 * 		Se modifican los campos con los valores pasados como argumentos con valor != null.
	 * 		Se incrementa en 1 el flag 'modificado' y se devuelve true */
	public boolean modifyUser (String nick, String pass, String nombre_usuario, String pais) {

		String [] consulta = new String [5];
		Connection conexion = conexion();
		ResultSet result;

		consulta[0] = "SELECT * FROM practicaINGS2.Usuarios WHERE nick = '" + nick + "'";
		try {
			PreparedStatement statment = conexion.prepareStatement(consulta[0]);
			result = statment.executeQuery();

			result.next();
			if (result.getInt(8) < 3){

				try {

					if(pass != null){
						consulta[1] = "update practicaINGS2.Usuarios set contrasena = '" + pass + "' where nick = '" + nick + "'";
						conexion.createStatement().executeUpdate(consulta[1]);
					}

					if(nombre_usuario != null){
						consulta[2] = "update practicaINGS2.Usuarios set nombre_usuario = '" + nombre_usuario + "' where nick = '" + nick + "'";
						conexion.createStatement().executeUpdate(consulta[2]);
					}

					if(pais != null){
						consulta[3] = "update practicaINGS2.Usuarios set pais = '" + pais + "' where Usuarios.nick = '" + nick + "'";
						conexion.createStatement().executeUpdate(consulta[3]);
					}

					consulta[4] = "update practicaINGS2.Usuarios set Usuarios.numCambiosInfo = Usuarios.numCambiosInfo + 1 where Usuarios.nick = '" + nick + "'";
					conexion.createStatement().executeUpdate(consulta[4]);

				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}

			else return false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	/* 5. Muestra el perfil del usuario */
	public Usuario consultarPerfil (String nick) {

		Connection conexion = conexion();
		ResultSet result;

		String consulta = "SELECT * FROM practicaINGS2.Usuarios WHERE nick = '" + nick + "'";
		try {
			PreparedStatement statment = conexion.prepareStatement(consulta);
			result = statment.executeQuery();
			result.next();
			Usuario res = new Usuario(result.getString(1), result.getString(2), result.getString(3), result.getString(6), result.getString(7));
			return res;

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*6. Crea una nueva partida, para el usuario nick. Anade la fecha actual*/
	public int crearPartida (String nick){
		int id = -1;
		String [] consulta = new String [2];
		Connection conexion = conexion();
		ResultSet result;

		Date fecha = new Date();
		int f = dameFecha(fecha);

		consulta[0] = "insert into practicaINGS2.partidas (jugador,fecha) values ('" + nick + "', '" + f + "')";
		try {
			conexion.createStatement().executeUpdate(consulta[0]);

			consulta[1] = "SELECT * FROM practicaINGS2.partidas WHERE jugador = '" + nick + "'";
			try {
				PreparedStatement statment = conexion.prepareStatement(consulta[1]);
				result = statment.executeQuery();
				while(result.next()){
					id = result.getInt(1);
				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();


		}



		return id;
	}




	/* 7. Anade puntuacion en turno actual. Para anadir puntuacion final 
	 * se le pasa turno == 6 y puntos = puntuacion final*/
	public boolean addPuntos (int id, int puntos, int turno){

		String [] consulta = new String [6];
		Connection conexion = conexion();

		try {

			if(turno == 1){
				consulta[0] = "update practicaINGS2.partidas set puntuacion1 = '" + puntos + "' where idPartida = '" + id + "'";
				conexion.createStatement().executeUpdate(consulta[0]);
			}

			if(turno == 2){
				consulta[1] = "update practicaINGS2.partidas set puntuacion2 = '" + puntos + "' where idPartida = '" + id + "'";
				conexion.createStatement().executeUpdate(consulta[1]);
			}

			if(turno == 3){
				consulta[2] = "update practicaINGS2.partidas set puntuacion3 = '" + puntos + "' where idPartida = '" + id + "'";
				conexion.createStatement().executeUpdate(consulta[2]);
			}

			if(turno == 4){
				consulta[3] = "update practicaINGS2.partidas set puntuacion4 = '" + puntos + "' where idPartida = '" + id + "'";
				conexion.createStatement().executeUpdate(consulta[3]);
			}

			if(turno == 5){
				consulta[4] = "update practicaINGS2.partidas set puntuacion5 = '" + puntos + "' where idPartida = '" + id + "'";
				conexion.createStatement().executeUpdate(consulta[4]);
			}

			if(turno == 6){
				consulta[5] = "update practicaINGS2.partidas set puntuacionTotal = (puntuacion1 + puntuacion2 + puntuacion3 + puntuacion4 + puntuacion5) where idPartida = '" + id + "'";
				conexion.createStatement().executeUpdate(consulta[5]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	/* 8. Ranking */
	public static ArrayList<Integer> rank (String nick, String filtrado){
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Date fecha = new Date();
		int f = dameFecha(fecha);
		Connection conexion = conexion();
		ResultSet result;

		if (filtrado.equals("semanal")){
			String consulta = "SELECT * FROM practicaINGS2.partidas WHERE jugador = '" + nick + "' && fecha > '" + (f - fecha.getDay()) + "'";
			try {
				PreparedStatement statment = conexion.prepareStatement(consulta);
				result = statment.executeQuery();

				while(result.next())
					lista.add(result.getInt(8));

				Collections.sort(lista);

			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(filtrado.equals("global")){
			String consulta = "SELECT * FROM practicaINGS2.partidas WHERE jugador = '" + nick + "'";
			try {
				PreparedStatement statment = conexion.prepareStatement(consulta);
				result = statment.executeQuery();

				while(result.next())
					lista.add(result.getInt(8));

				Collections.sort(lista);

			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

	/* Obtener fecha actual*/
	@SuppressWarnings("deprecation")
	private static int dameFecha(Date fecha) {
		Integer dia = fecha.getDate();
		Integer mes = fecha.getMonth()+1;
		Integer ano = fecha.getYear()+1900;
		return ano*10000 + mes*100 + dia;
	}

	public static void main (String [ ] args) {

		 Object[][] p = new Object [][]{{1,2,3}, {2,3,4}};
		
		System.out.print(p[1][2]);

	}
}
