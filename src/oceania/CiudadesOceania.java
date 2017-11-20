package oceania;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesOceania {

	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();

	/**
	 * Construccion de las ciudades en las que se podra jugar en el continente oceania
	 * E inserccion en un HashMap para su uso posterior
	 */

	public CiudadesOceania(){

		tabla = new HashMap<Integer, Ciudad>();

		Ciudad Canberra = new Ciudad("Canberra", new LatLng(-35.2809368,149.13000920000002),new ImageIcon(getClass().getResource("camberra1.jpg")), new ImageIcon((getClass().getResource("camberra2.jpg"))), new ImageIcon((getClass().getResource("camberra3.jpg"))));
		Ciudad Sidney = new Ciudad("Sidney",new LatLng(-33.8688197, 151.20929550000005),new ImageIcon(getClass().getResource("sidney1.jpg")), new ImageIcon(getClass().getResource("sidney2.jpg")), new ImageIcon(getClass().getResource("sidney3.jpg")));
		Ciudad Melbourne = new Ciudad("Melbourne",new LatLng(-37.8136276,144.96305759999996),new ImageIcon(getClass().getResource("melbourne1.jpg")), new ImageIcon(getClass().getResource("melbourne2.jpg")), new ImageIcon(getClass().getResource("melbourne3.jpg")));
		Ciudad Brisbane = new Ciudad("Brisbane", new LatLng(-27.4697707, 153.02512350000006),new ImageIcon(getClass().getResource("Brisbane1.jpg")), new ImageIcon(getClass().getResource("brisbane2.jpg")), new ImageIcon(getClass().getResource("brisbane3.jpg")));
		Ciudad Perth = new Ciudad("Perth",new LatLng(-31.9505269,115.86045719999993),new ImageIcon(getClass().getResource("Perth1.jpeg")), new ImageIcon(getClass().getResource("perth2.jpg")), new ImageIcon(getClass().getResource("perth3.jpg")));
		Ciudad Suva = new Ciudad("Suva",new LatLng(-18.1248086,178.4500789),new ImageIcon(getClass().getResource("suva1.jpg")), new ImageIcon(getClass().getResource("suva2.jpg")), new ImageIcon(getClass().getResource("suva3.jpg")));
		Ciudad Nadi = new Ciudad("Nadi",new LatLng(-17.7765356, 177.43562270000007),new ImageIcon(getClass().getResource("nadi1.jpg")), new ImageIcon(getClass().getResource("nadi2.jpg")), new ImageIcon(getClass().getResource("nadi3.jpg")) );
		Ciudad Labasa = new Ciudad("Labasa",new LatLng(-16.4307926, 179.3629995),new ImageIcon(getClass().getResource("labasa1.jpg")), new ImageIcon(getClass().getResource("labasa2.jpg")), new ImageIcon(getClass().getResource("labasa3.png")));
		Ciudad Savusavu = new Ciudad("Savusavu",new LatLng(-16.7799114,179.33811049999997),new ImageIcon(getClass().getResource("savusavu1.jpg")), new ImageIcon(getClass().getResource("savusavu2.jpg")), new ImageIcon(getClass().getResource("savusavu3.jpg")));
		Ciudad Lautoka = new Ciudad("Lautoka",new LatLng(-17.6169957,177.45048880000002),new ImageIcon(getClass().getResource("lautoka1.jpg")), new ImageIcon(getClass().getResource("lautoka2.jpg")), new ImageIcon(getClass().getResource("lautoka3.jpg")));
		Ciudad Majuro = new Ciudad("Majuro",new LatLng(7.1164214,171.18577359999995),new ImageIcon(getClass().getResource("majuro1.jpg")), new ImageIcon(getClass().getResource("majuro2.jpg")), new ImageIcon(getClass().getResource("majuro3.jpg")));
		Ciudad Honiara = new Ciudad("Honiara",new LatLng(-9.4456381,159.97289990000002),new ImageIcon(getClass().getResource("honiara1.jpg")), new ImageIcon(getClass().getResource("honiara2.jpg")), new ImageIcon(getClass().getResource("honiara3.jpg")));
		Ciudad Gizo = new Ciudad("Gizo",new LatLng(-8.1058258, 156.83499860000006),new ImageIcon(getClass().getResource("gizo1.jpg")), new ImageIcon(getClass().getResource("gizo2.jpg")), new ImageIcon(getClass().getResource("gizo3.jpg")));
		Ciudad Buala = new Ciudad("Buala",new LatLng(-8.1662459, 159.6189829),new ImageIcon(getClass().getResource("buala1.jpg")), new ImageIcon(getClass().getResource("buala2.jpg")), new ImageIcon(getClass().getResource("buala3.jpg")));
		Ciudad Auki = new Ciudad("Auki",new LatLng(-8.7678593,160.69603059999997),new ImageIcon(getClass().getResource("auki1.jpg")), new ImageIcon(getClass().getResource("auki2.png")), new ImageIcon(getClass().getResource("auki3.jpg")));
		Ciudad Tarawa = new Ciudad("Tarawa",new LatLng(1.4518171, 172.97166170000003),new ImageIcon(getClass().getResource("tarawa1.jpg")), new ImageIcon(getClass().getResource("tarawa2.jpg")), new ImageIcon(getClass().getResource("tarawa3.jpg")));
		Ciudad Aiaki = new Ciudad("Aiaki",new LatLng(-1.916715, 175.609197),new ImageIcon(getClass().getResource("aiaki1.jpg")), new ImageIcon(getClass().getResource("aiaki2.jpg")), new ImageIcon(getClass().getResource("aiaki3.jpg")));
		Ciudad Bikenibeu = new Ciudad("Bikenibeu",new LatLng(1.364419, 173.12862900000005),new ImageIcon(getClass().getResource("Bikenibeu1.jpg")), new ImageIcon(getClass().getResource("Bikenibeu2.jpg")), new ImageIcon(getClass().getResource("Bikenibeu3.jpg")));
		Ciudad Taburao = new Ciudad("Tubarao",new LatLng(1.811076, 173.03945699999997),new ImageIcon(getClass().getResource("Tubarao1.jpg")), new ImageIcon(getClass().getResource("Tubarao2.jpg")), new ImageIcon(getClass().getResource("tubarao3.jpg")));
		Ciudad Palikir = new Ciudad("Palikir",new LatLng(6.9147118,158.16102739999997),new ImageIcon(getClass().getResource("Palikir1.jpg")), new ImageIcon(getClass().getResource("Palikir2.jpg")), new ImageIcon(getClass().getResource("Palikir3.jpg")));
		Ciudad Tafunsak = new Ciudad("Tafunsak",new LatLng(5.362419500000001,162.98444010000003),new ImageIcon(getClass().getResource("tafunsak1.png")), new ImageIcon(getClass().getResource("tafunsak2.png")), new ImageIcon(getClass().getResource("tafunsak3.jpg")));
		Ciudad Kolonia = new Ciudad("Kolonia",new LatLng(6.9610195, 158.2140339),new ImageIcon(getClass().getResource("kolonia1.jpg")), new ImageIcon(getClass().getResource("kolonia2.jpeg")), new ImageIcon(getClass().getResource("kolonia3.jpg")));
		Ciudad Tofol = new Ciudad("Tofol",new LatLng(5.3278987, 163.00805760000003),new ImageIcon(getClass().getResource("tofol1.jpg")), new ImageIcon(getClass().getResource("tofol2.jpg")), new ImageIcon(getClass().getResource("tofol3.jpg")));
		Ciudad Bugol = new Ciudad("Bugol",new LatLng(9.5147222,138.16194440000004),new ImageIcon(getClass().getResource("bugol1.jpg")), new ImageIcon(getClass().getResource("bugol2.jpg")), new ImageIcon(getClass().getResource("bugol3.jpg")));
		Ciudad Yaren = new Ciudad("Yaren",new LatLng(-0.5466856999999999,166.92109129999994),new ImageIcon(getClass().getResource("yaren1.jpg")), new ImageIcon(getClass().getResource("yaren2.jpg")), new ImageIcon(getClass().getResource("yaren3.jpg")));
		Ciudad Wellington = new Ciudad("Wellington",new LatLng(-41.2864603,174.77623600000004),new ImageIcon(getClass().getResource("wellington1.jpg")), new ImageIcon(getClass().getResource("wellington2.jpg")), new ImageIcon(getClass().getResource("Wellington3.jpg")));
		Ciudad Auckland = new Ciudad("Auckland",new LatLng(-36.8484597, 174.76333150000005),new ImageIcon(getClass().getResource("auckland1.jpg")), new ImageIcon(getClass().getResource("Auckland2.jpg")), new ImageIcon(getClass().getResource("Auckland3.jpg")));
		Ciudad Queenstown = new Ciudad("Queenstown",new LatLng(-45.0311622,168.66264350000006),new ImageIcon(getClass().getResource("Queenstown1.jpg")), new ImageIcon(getClass().getResource("Queenstown2.jpg")), new ImageIcon(getClass().getResource("Queenstown3.png")));
		Ciudad Dunedin = new Ciudad("Dunedin",new LatLng(-45.8787605, 170.5027976),new ImageIcon(getClass().getResource("Dunedin1.jpg")), new ImageIcon(getClass().getResource("Dunedin2.jpg")), new ImageIcon(getClass().getResource("Dunedin3.jpg")));
		Ciudad Rotorua = new Ciudad("Rotorua",new LatLng(-38.1368478,176.24974610000004),new ImageIcon(getClass().getResource("Rotorua1.jpg")), new ImageIcon(getClass().getResource("Rotorua2.jpg")), new ImageIcon(getClass().getResource("Rotorua3.jpg")));
		Ciudad Melekeok = new Ciudad("Melekeok",new LatLng(7.515028599999999,134.59725179999998),new ImageIcon(getClass().getResource("Melekeok1.jpg")), new ImageIcon(getClass().getResource("Melekeok2.jpg")), new ImageIcon(getClass().getResource("Melekeok3.png")));
		Ciudad Koror = new Ciudad("Koror",new LatLng(7.3410628,134.47715960000005),new ImageIcon(getClass().getResource("Koror1.jpg")), new ImageIcon(getClass().getResource("Koror2.jpg")), new ImageIcon(getClass().getResource("Koror3.jpg")));
		Ciudad Ollei = new Ciudad("Ollei",new LatLng(7.7185548,134.61194790000002),new ImageIcon(getClass().getResource("Ollei1.jpg")), new ImageIcon(getClass().getResource("Ollei2.jpg")), new ImageIcon(getClass().getResource("Ollei3.jpg")));
		Ciudad PuertoMoresby = new Ciudad("Puerto Moresby",new LatLng(-9.4780123,147.15065419999996),new ImageIcon(getClass().getResource("Port-Moresby1.jpg")), new ImageIcon(getClass().getResource("Port-Moresby2.jpg")), new ImageIcon(getClass().getResource("Port-Moresby3.png")));
		Ciudad Lae = new Ciudad("Lae",new LatLng(-6.7155252,146.999905), new ImageIcon(getClass().getResource("lae1.jpg")), new ImageIcon(getClass().getResource("lae2.jpg")), new ImageIcon(getClass().getResource("lae3.jpg")));
		Ciudad Mudang = new Ciudad("Mudang",new LatLng(-5.2218841,145.78563239999994),new ImageIcon(getClass().getResource("madang1.jpg")), new ImageIcon(getClass().getResource("madang2.jpg")), new ImageIcon(getClass().getResource("madang3.jpg")));
		Ciudad Goroka = new Ciudad("Goroka",new LatLng(-6.083477299999999,145.38626380000005),new ImageIcon(getClass().getResource("Goroka1.jpg")), new ImageIcon(getClass().getResource("Goroka2.jpg")), new ImageIcon(getClass().getResource("Goroka3.jpg")));
		Ciudad Rabaul = new Ciudad("Rabaul",new LatLng(-4.1999648,152.1644612),new ImageIcon(getClass().getResource("rabaul1.jpg")), new ImageIcon(getClass().getResource("Rabaul2.jpg")), new ImageIcon(getClass().getResource("Rabaul3.jpg")));
		Ciudad Apia = new Ciudad("Apia",new LatLng(-13.8506958,-171.7513551),new ImageIcon(getClass().getResource("Apia1.jpg")), new ImageIcon(getClass().getResource("Apia2.jpg")), new ImageIcon(getClass().getResource("Apia3.jpg")));
		Ciudad PagoPago = new Ciudad("Pago Pago",new LatLng(-14.2756319,-170.7020359),new ImageIcon(getClass().getResource("pagopago1.jpg")), new ImageIcon(getClass().getResource("pagopago2.jpg")), new ImageIcon(getClass().getResource("pagopago3.jpg")));
		Ciudad Falefa = new Ciudad("Falefa",new LatLng(-13.8875282, -171.58774570000003),new ImageIcon(getClass().getResource("falefa1.jpg")), new ImageIcon(getClass().getResource("falefa2.jpg")), new ImageIcon(getClass().getResource("falefa3.jpg")));
		Ciudad Tuasivi = new Ciudad("Tuasivi",new LatLng(-13.6705935,-172.1781613),new ImageIcon(getClass().getResource("tuasivi1.jpg")), new ImageIcon(getClass().getResource("tuasivi2.jpg")), new ImageIcon(getClass().getResource("tuasivi3.jpg")));
		Ciudad Salelologa = new Ciudad("Salelologa",new LatLng(-13.7380782,-172.2216538),new ImageIcon(getClass().getResource("Salelologa1.jpg")), new ImageIcon(getClass().getResource("Salelologa2.jpg")), new ImageIcon(getClass().getResource("Salelologa3.jpg")));
		Ciudad Dili = new Ciudad("Dili",new LatLng(-8.5568557, 125.56031430000007),new ImageIcon(getClass().getResource("dili1.jpg")), new ImageIcon(getClass().getResource("dili2.jpg")), new ImageIcon(getClass().getResource("dili3.jpg")));
		Ciudad Baucau = new Ciudad("Baucau",new LatLng(-8.4731006, 126.4553727),new ImageIcon(getClass().getResource("Baucau1.jpg")), new ImageIcon(getClass().getResource("Baucau2.jpg")), new ImageIcon(getClass().getResource("Baucau3.jpg")));
		Ciudad Lospalos = new Ciudad("Lospalos",new LatLng(-8.5207109, 127.00245330000007),new ImageIcon(getClass().getResource("Lospalos1.jpg")), new ImageIcon(getClass().getResource("Lospalos2.jpg")), new ImageIcon(getClass().getResource("Lospalos3.jpg")));
		Ciudad Suai = new Ciudad("Suai",new LatLng(-9.3294895,125.26978020000001),new ImageIcon(getClass().getResource("suai1.jpg")), new ImageIcon(getClass().getResource("suai2.jpg")), new ImageIcon(getClass().getResource("suai3.jpg")));
		Ciudad Nukualofa = new Ciudad("Nukualofa",new LatLng(-21.1393418,-175.204947),new ImageIcon(getClass().getResource("nujualofa1.jpg")), new ImageIcon(getClass().getResource("nukualofa2.jpg")), new ImageIcon(getClass().getResource("Nukualofa3.jpg")));
		Ciudad Tonga = new Ciudad("Tonga",new LatLng(-21.178986,-175.198242),new ImageIcon(getClass().getResource("tonga1.jpg")), new ImageIcon(getClass().getResource("tonga2.jpg")), new ImageIcon(getClass().getResource("tonga3.jpg")));
		Ciudad Kolonga = new Ciudad("Kolonga",new LatLng(-21.1280141,-175.06880190000004),new ImageIcon(getClass().getResource("kolonga1.png")), new ImageIcon(getClass().getResource("kolonga2.jpg")), new ImageIcon(getClass().getResource("kolonga3.png")));
		Ciudad Funafuti = new Ciudad("Funafuti",new LatLng(-8.5211471,179.19619260000002),new ImageIcon(getClass().getResource("funafuti1.jpg")), new ImageIcon(getClass().getResource("funafuti2.jpg")), new ImageIcon(getClass().getResource("funafuti3.jpg")));
		Ciudad Vaiaku = new Ciudad("Vaiaku",new LatLng(-8.5177353,179.2003509),new ImageIcon(getClass().getResource("vaiaku1.jpg")), new ImageIcon(getClass().getResource("vaiaku2.jpg")), new ImageIcon(getClass().getResource("vaiaku3.jpg")));
		Ciudad PortVila = new Ciudad("Port Vila",new LatLng(-17.7332512, 168.32732450000003),new ImageIcon(getClass().getResource("portvila1.jpg")), new ImageIcon(getClass().getResource("portvila2.png")), new ImageIcon(getClass().getResource("portvila3.jpg")));
		Ciudad Imeong = new Ciudad("Imeong",new LatLng(-16.1001798,167.41640630000006),new ImageIcon(getClass().getResource("Imeong1.jpg")), new ImageIcon(getClass().getResource("Imeong2.jpg")), new ImageIcon(getClass().getResource("Imeong3.jpg")));
		Ciudad Luganville =  new Ciudad("Luganville",new LatLng(-15.5064326,167.20027449999998),new ImageIcon(getClass().getResource("Luganville1.jpg")), new ImageIcon(getClass().getResource("Luganville2.jpg")), new ImageIcon(getClass().getResource("Luganville3.jpg")));

		tabla.put(1, Canberra); 
		tabla.put(2, Sidney);	
		tabla.put(3, Melbourne); 
		tabla.put(4, Brisbane); 
		tabla.put(5, Perth ); 
		tabla.put(6, Suva); 			
		tabla.put(7, Nadi); 
		tabla.put(8, Labasa); 
		tabla.put(9, Savusavu); 

		tabla.put(10, Lautoka);	
		tabla.put(11, Majuro); 
		tabla.put(12, Honiara); 
		tabla.put(13, Gizo); 
		tabla.put(14, Buala); 
		tabla.put(15, Auki);
		tabla.put(16, Tarawa);
		tabla.put(17, Aiaki); 
		tabla.put(18, Bikenibeu); 		
		tabla.put(19, Taburao);

		tabla.put(20, Palikir); 		
		tabla.put(21, Tafunsak);  
		tabla.put(22, Kolonia);  
		tabla.put(23, Tofol);  
		tabla.put(24, Bugol);  
		tabla.put(25, Yaren);  
		tabla.put(26, Wellington);  
		tabla.put(27, Auckland);  
		tabla.put(28, Queenstown);  
		tabla.put(29, Dunedin);  

		tabla.put(30, Rotorua);  
		tabla.put(31, Melekeok);  
		tabla.put(32, Koror);  
		tabla.put(33, Ollei);  
		tabla.put(34, PuertoMoresby);  
		tabla.put(35, Lae);  
		tabla.put(36, Mudang);  
		tabla.put(37, Goroka);  
		tabla.put(38, Rabaul);  

		tabla.put(39, Apia);  
		tabla.put(40, PagoPago);  
		tabla.put(41, Falefa);  
		tabla.put(42, Tuasivi);  
		tabla.put(43, Salelologa);  
		tabla.put(44, Dili);  
		tabla.put(45, Baucau);  
		tabla.put(46, Lospalos);  
		tabla.put(47, Suai);  
		tabla.put(48, Nukualofa);  

		tabla.put(49, Tonga);  
		tabla.put(50, Kolonga);  
		tabla.put(51, Funafuti);  
		tabla.put(52, Vaiaku);  
		tabla.put(53, PortVila);  
		tabla.put(54, Imeong);  
		tabla.put(55, Luganville);  

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

		int multiplicador = 54;
		HashMap<Integer, Ciudad> ciudades = Mapa.ocea.getTabla();

		double num = Math.random()*multiplicador;
		int n = (int)num;

		return ciudades.get(n);

	}



}
