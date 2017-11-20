package experto;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesExperto {

	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();

	/**
	 * Construccion de las ciudades en las que se podra jugar en el modo experto
	 * E inserccion en un HashMap para su uso posterior
	 */

	public CiudadesExperto(){

		tabla = new HashMap<Integer, Ciudad>();
		Ciudad Dinant = new Ciudad("Dinant", new LatLng(50.26049399999999,4.9127456999999595),new ImageIcon(getClass().getResource("Dinant.jpg")));
		Ciudad CeskyKrumlov = new Ciudad("Cesky Krumlov",new LatLng(48.8127354, 14.317465699999957),new ImageIcon(getClass().getResource("CeskyKrumlov.jpg")));
		Ciudad Eze = new Ciudad("Eze",new LatLng(43.7278189, 7.361792000000037),new ImageIcon(getClass().getResource("Eze.jpg")));
		Ciudad Sintra = new Ciudad("Sintra", new LatLng(38.8029127, -9.38164949999998),new ImageIcon(getClass().getResource("Sintra.jpg")));
		Ciudad Bibury = new Ciudad("Bibury",new LatLng(51.7588076,-1.8307754999999588),new ImageIcon(getClass().getResource("Bibury.jpg")));
		Ciudad Bled = new Ciudad("Bled",new LatLng(46.3683266, 14.114579800000001) ,new ImageIcon(getClass().getResource("Bled.jpg")));
		Ciudad Marsaxlokk = new Ciudad("Marsaxlokk",new LatLng(35.8411699, 14.53930969999999),new ImageIcon(getClass().getResource("Marsaxlokk.jpg")));
		Ciudad Portree = new Ciudad("Portree",new LatLng(57.412474,-6.196023100000048),new ImageIcon(getClass().getResource("Portree.jpg")));
		Ciudad Manarola = new Ciudad("Manarola",new LatLng(44.1115594, 9.733893699999953),new ImageIcon(getClass().getResource("Manarola.jpg")));
		Ciudad Reine = new Ciudad("Reine",new LatLng(67.9323866, 13.088732899999968),new ImageIcon(getClass().getResource("Reine.jpg")));
		Ciudad Hallstatt = new Ciudad("Hallstatt",new LatLng(47.5622342, 13.649261700000011),new ImageIcon(getClass().getResource("Halstatt.jpg")));
		Ciudad Pucisca = new Ciudad("Pucisca",new LatLng(43.3283688, 16.747053600000072),new ImageIcon(getClass().getResource("Pucisca.jpg")));
		Ciudad Gruyeres = new Ciudad("Gruyeres",new LatLng(46.57775549999999,7.0624775),new ImageIcon(getClass().getResource("Gruyeres.jpg")));
		Ciudad Cochem = new Ciudad("Cochem",new LatLng(50.146944,7.166666999999961),new ImageIcon(getClass().getResource("Cochem.jpg")));
		Ciudad GarmischPartenkirchen = new Ciudad("Garmisch-Partenkirchen",new LatLng(47.4916945,11.095498399999997),new ImageIcon(getClass().getResource("GarmischPartenkirchen.jpg")));
		Ciudad Colmar = new Ciudad("Colmar",new LatLng(48.0793589, 7.358512000000019),new ImageIcon(getClass().getResource("Colmar.jpg")));
		Ciudad Portmagee = new Ciudad("Portmagee",new LatLng(51.8854295, -10.361940000000004),new ImageIcon(getClass().getResource("Portmagee.jpg")));
		Ciudad Tenby = new Ciudad("Tenby",new LatLng(51.672738, -4.703578999999991),new ImageIcon(getClass().getResource("Tenby.jpg")));
		Ciudad Goreme = new Ciudad("Goreme",new LatLng(38.643056, 34.828889000000004),new ImageIcon(getClass().getResource("Goreme.jpg")));
		Ciudad Albarracin = new Ciudad("Albarracin",new LatLng(40.4075581,-1.4438760000000457),new ImageIcon(getClass().getResource("Albarracin.jpg")));
		Ciudad Vestmannaeyjar = new Ciudad("Vestmannaeyjar",new LatLng(63.437679, -20.267321000000038),new ImageIcon(getClass().getResource("Vestmannaeyjar.jpg")));
		Ciudad Giethoorn = new Ciudad("Giethoorn",new LatLng(52.7401779, 6.077977899999951),new ImageIcon(getClass().getResource("Giethoorn.jpg")));
		Ciudad Annecy = new Ciudad("Annecy",new LatLng(45.899247, 6.129383999999959),new ImageIcon(getClass().getResource("Annecy.jpg")));
		Ciudad Positano = new Ciudad("Positano",new LatLng(40.6280528,14.484981199999993),new ImageIcon(getClass().getResource("Positano.jpg")));
		Ciudad SidiBouSaid = new Ciudad("Sidi Bou Said",new LatLng(36.8698325, 10.341369100000065),new ImageIcon(getClass().getResource("SidiBouSaid.jpg")));
		Ciudad Taxco = new Ciudad("Taxco",new LatLng(18.5565468, -99.60512059999996),new ImageIcon(getClass().getResource("Taxco.jpg")));
		Ciudad Oia = new Ciudad("Oia",new LatLng(36.4618199, 25.37531009999998),new ImageIcon(getClass().getResource("Oia.jpg")));
		Ciudad Shangrila = new Ciudad("Shangri-la",new LatLng(27.829743,99.70083599999998),new ImageIcon(getClass().getResource("Shangrila.jpg")));
		Ciudad Zanzibar = new Ciudad("Zanzibar",new LatLng(-6.165916999999999,39.20264099999997),new ImageIcon(getClass().getResource("Zanzibar.jpg")));
		Ciudad Hoain = new Ciudad("Hoi An",new LatLng(15.8800584, 108.3380469),new ImageIcon(getClass().getResource("Hoian.jpg")));
		Ciudad Suzhou = new Ciudad("Suzhou",new LatLng(31.298974, 120.58528899999999),new ImageIcon(getClass().getResource("Suzhou.jpg")));
		Ciudad Esauira = new Ciudad("Esauira",new LatLng(31.5084926,-9.759504099999958),new ImageIcon(getClass().getResource("essaouira.jpg")));
		Ciudad Alquezar = new Ciudad("Alquezar",new LatLng(42.172579, 0.0255818000000545),new ImageIcon(getClass().getResource("Alquezar.jpg")));
		Ciudad ColDelSacramento = new Ciudad("Col Del Sacramento",new LatLng(-34.4607189,-57.83390989999998),new ImageIcon(getClass().getResource("ColoniaDelSacramento.jpg")));
		Ciudad Bernal = new Ciudad("Bernal",new LatLng(20.7379323,-99.94231660000003),new ImageIcon(getClass().getResource("Berjal.jpg")));
		Ciudad Miyama = new Ciudad("Miyama",new LatLng(33.1524253,130.47472029999994),new ImageIcon(getClass().getResource("Miyama.jpg")));
		Ciudad Pueblito = new Ciudad("Pueblito",new LatLng(28.5983159,83.93106230000001),new ImageIcon(getClass().getResource("Pueblito.jpg")));
		Ciudad Leavenworth = new Ciudad("Leavenworth",new LatLng(47.5962326,-120.66147649999999),new ImageIcon(getClass().getResource("Leavenworth.jpg")));
		Ciudad Queenstown = new Ciudad("Queenstown",new LatLng(-45.0311622,168.66264350000006),new ImageIcon(getClass().getResource("Queenstown.jpg")));
		Ciudad Pucon = new Ciudad("Pucon",new LatLng(-39.2722541,-71.97762849999998),new ImageIcon(getClass().getResource("Pucon.jpg")));
		Ciudad Jiuzhaigou = new Ciudad("Jiuzhaigou",new LatLng(33.26004210000001,103.91859939999995),new ImageIcon(getClass().getResource("Jiuzhaigou.jpg")));
		Ciudad Camden = new Ciudad("Camden",new LatLng(44.2097928,-69.06478379999999),new ImageIcon(getClass().getResource("Dinant.jpg")));
		Ciudad MorrodeSaoPaulo = new Ciudad("Morro de Sao Paulo",new LatLng(-13.3802602,-38.912535700000035),new ImageIcon(getClass().getResource("MorrodeSaoPaulo.jpg")));
		Ciudad ByronBay = new Ciudad("Byron Bay",new LatLng(-28.6473671, 153.60197700000003),new ImageIcon(getClass().getResource("ByronBay.jpg")));
		Ciudad Shirakawa = new Ciudad("Shirakawa",new LatLng(36.2708062,136.89847829999997),new ImageIcon(getClass().getResource("Shirakawa.jpg")));
		Ciudad Ittoqqortoormiit = new Ciudad("Ittoqqortoormiit",new LatLng(70.48556909999999, -21.96287570000004),new ImageIcon(getClass().getResource("Ittoqqortoormiit.jpg")));
		Ciudad Luderitz = new Ciudad("Luderitz",new LatLng(-26.6420382,15.163908200000037),new ImageIcon(getClass().getResource("Luderitz.jpg")));
		Ciudad Zimbabwe  = new Ciudad("Zimbabwe ",new LatLng(-26.1041725,28.115236299999992),new ImageIcon(getClass().getResource("Zimbabwe.jpg")));
		Ciudad Varanasi  = new Ciudad("Varanasi ",new LatLng(25.3176452,82.97391440000001),new ImageIcon(getClass().getResource("Varanasi.jpg")));
		Ciudad SalardeUyuni  = new Ciudad("Salar de Uyuni",new LatLng(-20.1337772,-67.48913449999998),new ImageIcon(getClass().getResource("SalardeUyuni.jpg")));

		tabla.put(1, Dinant); 
		tabla.put(2, CeskyKrumlov);	
		tabla.put(3, Eze); 
		tabla.put(4, Sintra); 
		tabla.put(5, Bibury); 
		tabla.put(6, Bled); 			
		tabla.put(7, Marsaxlokk); 
		tabla.put(8, Portree); 
		tabla.put(9, Manarola); 

		tabla.put(10, Reine);	
		tabla.put(11, Hallstatt); 
		tabla.put(12, Pucisca); 
		tabla.put(13, Gruyeres); 
		tabla.put(14, Cochem); 
		tabla.put(15, GarmischPartenkirchen);
		tabla.put(16, Colmar);
		tabla.put(17, Portmagee); 

		tabla.put(18, Tenby); 		
		tabla.put(19, Goreme);			
		tabla.put(20, Albarracin); 		
		tabla.put(21, Vestmannaeyjar);  
		tabla.put(22, Giethoorn);  
		tabla.put(23, Annecy);  
		tabla.put(24, Positano);  
		tabla.put(25, SidiBouSaid);  
		tabla.put(26, Taxco);  
		tabla.put(27, Oia);  
		tabla.put(28, Shangrila);  
		tabla.put(29, Zanzibar);  

		tabla.put(30, Hoain);  
		tabla.put(31, Suzhou);  
		tabla.put(32, Esauira);  
		tabla.put(33, Alquezar);  
		tabla.put(34, ColDelSacramento);  
		tabla.put(35, Bernal);  
		tabla.put(36, Miyama);  
		tabla.put(37, Pueblito);  
		tabla.put(38, Leavenworth);  
		tabla.put(39, Queenstown);  

		tabla.put(40, Pucon);  
		tabla.put(41, Jiuzhaigou);  
		tabla.put(42, Camden);  
		tabla.put(43, MorrodeSaoPaulo);  
		tabla.put(44, ByronBay);  
		tabla.put(45, Shirakawa);  
		tabla.put(46, Ittoqqortoormiit);  
		tabla.put(47, Luderitz);
		tabla.put(48, Zimbabwe);
		tabla.put(49, Varanasi);
		tabla.put(50, SalardeUyuni);


	}
	/**
	 * Obtenemos la tabla con las ciudades a jugar
	 * @return
	 */
	public HashMap<Integer, Ciudad> getTabla() {
		return tabla;
	}
	/**
	 * Genera la ciudad aleatoriamente que aparecera en x turno del juego
	 * @return
	 */

	public Ciudad generaCiudad(){

		int multiplicador = 50;
		HashMap<Integer, Ciudad> ciudades = Mapa.expert.getTabla();

		double num = Math.random()*multiplicador;
		int n = (int)num;

		return ciudades.get(n);

	}



}