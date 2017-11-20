package africa;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesAfrica {

	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();

	/**
	 * Construccion de las ciudades en las que se podra jugar en el continente africa
	 * E inserccion en un HashMap para su uso posterior
	 */

	public CiudadesAfrica(){

		tabla = new HashMap<Integer, Ciudad>();


		Ciudad Luanda = new Ciudad("Luanda", new LatLng(-8.839987599999999, 13.289436799999976),new ImageIcon(getClass().getResource("luanda1.jpg")), new ImageIcon(getClass().getResource("luanda2.jpg")), new ImageIcon(getClass().getResource("luanda3.jpg")));
		Ciudad Huambo = new Ciudad("Huambo",new LatLng(-12.7739761,15.746853500000043),new ImageIcon(getClass().getResource("Huambo1.jpg")), new ImageIcon(getClass().getResource("Huambo2.jpg")), new ImageIcon(getClass().getResource("Huambo3.jpg")));
		Ciudad Argel = new Ciudad("Argel", new LatLng(36.753768, 3.0587560999999823),new ImageIcon(getClass().getResource("argel1.jpg")), new ImageIcon(getClass().getResource("argel2.jpeg")), new ImageIcon(getClass().getResource("argel3.jpg")));
		Ciudad Constantina = new Ciudad("Constantina",new LatLng(36.360155,  6.642432999999983),new ImageIcon(getClass().getResource("constantina1.jpg")), new ImageIcon(getClass().getResource("constantina2.jpg")), new ImageIcon(getClass().getResource("constantina3.jpg")));
		Ciudad PortoNovo = new Ciudad("Porto-Novo",new LatLng(6.4968574, 2.6288523000000623),new ImageIcon(getClass().getResource("portonovo1.jpg")), new ImageIcon(getClass().getResource("portonovo2.jpg")), new ImageIcon(getClass().getResource("portonovo3.jpg")) );
		Ciudad Cotonu = new Ciudad("Cotonu",new LatLng(6.3702928, 2.3912361999999803),new ImageIcon(getClass().getResource("cotonu1.jpg")), new ImageIcon(getClass().getResource("cotonu2.jpg")), new ImageIcon(getClass().getResource("cotonu3.jpg")));
		Ciudad Gaborone = new Ciudad("Gaborone",new LatLng(-24.6282079, 25.92314710000005),new ImageIcon(getClass().getResource("Gaborone1.jpg")), new ImageIcon(getClass().getResource("Gaborone2.jpg")), new ImageIcon(getClass().getResource("Gaborone3.jpg")));
		Ciudad Maun = new Ciudad("Maun",new LatLng(-19.9952622,23.41807689999996),new ImageIcon(getClass().getResource("Maun1.jpg")), new ImageIcon(getClass().getResource("Maun2.jpg")), new ImageIcon(getClass().getResource("Maun3.jpg")));
		Ciudad Uagadugu = new Ciudad("Uagadugu",new LatLng(12.3714277, -1.5196602999999413),new ImageIcon(getClass().getResource("Uagadugu1.jpg")), new ImageIcon(getClass().getResource("Uagadugu2.jpg")), new ImageIcon(getClass().getResource("Uagadugu3.jpg")));
		Ciudad Banfora = new Ciudad("Banfora",new LatLng(10.6400163,-4.758804199999986),new ImageIcon(getClass().getResource("Banfora1.jpg")), new ImageIcon(getClass().getResource("Banfora2.jpg")), new ImageIcon(getClass().getResource("Banfora3.jpg")));
		Ciudad Buyumbura = new Ciudad("Bujumbura",new LatLng(-3.361378,29.359878200000026),new ImageIcon(getClass().getResource("Bujumbura1.jpg")), new ImageIcon(getClass().getResource("Bujumbura2.jpg")), new ImageIcon(getClass().getResource("Bujumbura3.jpg")));
		Ciudad Ngozi = new Ciudad("Ngozi",new LatLng(-2.9083521, 29.826549200000045),new ImageIcon(getClass().getResource("Ngozi1.jpg")), new ImageIcon(getClass().getResource("Ngozi2.jpg")), new ImageIcon(getClass().getResource("Ngozi3.jpg")));
		Ciudad Praia = new Ciudad("Praia",new LatLng(14.93305, -23.513326699999993),new ImageIcon(getClass().getResource("Praia1.jpg")), new ImageIcon(getClass().getResource("Praia2.jpg")), new ImageIcon(getClass().getResource("Praia3.jpg")));
		Ciudad RibeiraBrava = new Ciudad("Ribeira Brava",new LatLng(16.616129,	-24.296999899999946),new ImageIcon(getClass().getResource("Ribeira-Brava1.jpg")), new ImageIcon(getClass().getResource("Ribeira-Brava2.jpg")), new ImageIcon(getClass().getResource("Ribeira-Brava3.jpg")));
		Ciudad Yaunde = new Ciudad("Yaunde",new LatLng(3.8480325, 11.502075200000036),new ImageIcon(getClass().getResource("Yaunde1.jpg")), new ImageIcon(getClass().getResource("Yaunde2.jpg")), new ImageIcon(getClass().getResource("Yaunde3.jpg")));
		Ciudad Duala = new Ciudad("Duala",new LatLng(4.0510564, 9.767868700000008),new ImageIcon(getClass().getResource("Duala1.jpg")), new ImageIcon(getClass().getResource("Duala2.jpg")), new ImageIcon(getClass().getResource("Duala3.jpg")));
		Ciudad Yamena = new Ciudad("Yamena",new LatLng(12.1348457,15.055741500000067),new ImageIcon(getClass().getResource("Yamena1.jpg")), new ImageIcon(getClass().getResource("Yamena2.jpg")), new ImageIcon(getClass().getResource("Yamena3.jpg")));
		Ciudad Moundou = new Ciudad("Moundou",new LatLng(8.5914775, 16.075774899999942),new ImageIcon(getClass().getResource("Moundou1.jpg")), new ImageIcon(getClass().getResource("Moundou2.jpg")), new ImageIcon(getClass().getResource("Moundou3.jpg")));
		Ciudad Moroni = new Ciudad("Moroni",new LatLng(-11.7172157, 43.24731459999998),new ImageIcon(getClass().getResource("Moroni1.jpg")), new ImageIcon(getClass().getResource("Moroni2.jpg")), new ImageIcon(getClass().getResource("Moroni3.jpg")));
		Ciudad Mutsamudu = new Ciudad("Mutsamudu",new LatLng(-12.1695811,44.40047000000004),new ImageIcon(getClass().getResource("Mutsamudu1.jpg")), new ImageIcon(getClass().getResource("Mutsamudu2.jpg")), new ImageIcon(getClass().getResource("Mutsamudu3.jpg")));
		Ciudad Brazzaville = new Ciudad("Brazzaville",new LatLng(-4.2633597, 15.242885300000012),new ImageIcon(getClass().getResource("Brazzaville1.jpg")), new ImageIcon(getClass().getResource("Brazzaville2.jpg")), new ImageIcon(getClass().getResource("Brazzaville3.jpg")));
		Ciudad Kinsasa = new Ciudad("Kinshasa",new LatLng(-4.4419311, 15.266293099999984),new ImageIcon(getClass().getResource("Kinshasa1.jpg")), new ImageIcon(getClass().getResource("Kinshasa2.jpg")), new ImageIcon(getClass().getResource("Kinshasa3.jpg")));
		Ciudad Yamusukro = new Ciudad("Yamusukro",new LatLng(6.827622799999999,-5.289343300000041),new ImageIcon(getClass().getResource("Yamusukro1.jpg")), new ImageIcon(getClass().getResource("Yamusukro2.jpg")), new ImageIcon(getClass().getResource("Yamusukro3.jpg")));
		Ciudad Abiyan = new Ciudad("Abiyan",new LatLng(5.3599517,-4.008256299999971),new ImageIcon(getClass().getResource("Abiyan1.jpg")), new ImageIcon(getClass().getResource("Abiyan2.jpg")), new ImageIcon(getClass().getResource("Abiyan3.jpg")));
		Ciudad ElCairo = new Ciudad("El Cairo",new LatLng(30.0444196,31.23571160000006),new ImageIcon(getClass().getResource("El-Cairo1.jpg")), new ImageIcon(getClass().getResource("El-Cairo2.jpg")), new ImageIcon(getClass().getResource("El-Cairo3.jpg")));
		Ciudad Alejandria = new Ciudad("Alejandria",new LatLng(31.2000924, 29.91873869999995),new ImageIcon(getClass().getResource("Alejandria1.jpg")), new ImageIcon(getClass().getResource("Alejandria2.jpg")), new ImageIcon(getClass().getResource("Alejandria3.jpg")));
		Ciudad Asmara = new Ciudad("Asmara",new LatLng(15.3228767,38.92505170000004),new ImageIcon(getClass().getResource("Asmara1.jpg")), new ImageIcon(getClass().getResource("Asmara2.jpg")), new ImageIcon(getClass().getResource("Asmara3.jpg")));
		Ciudad AdisAbeba = new Ciudad("Adis Abeba",new LatLng(8.9806034,38.75776050000002),new ImageIcon(getClass().getResource("Adis-Abeba1.jpg")), new ImageIcon(getClass().getResource("Adis-Abeba2.jpg")), new ImageIcon(getClass().getResource("Adis-Abeba3.jpg")));
		Ciudad Gondar = new Ciudad("Gondar",new LatLng(12.6030181, 37.45213190000004),new ImageIcon(getClass().getResource("Gondar1.jpg")), new ImageIcon(getClass().getResource("Gondar2.jpg")), new ImageIcon(getClass().getResource("Gondar3.jpg")));
		Ciudad Libreville = new Ciudad("Libreville",new LatLng(0.4161976,9.467267600000014),new ImageIcon(getClass().getResource("Libreville1.jpg")), new ImageIcon(getClass().getResource("Libreville2.jpg")), new ImageIcon(getClass().getResource("Libreville3.jpg")));
		Ciudad PortGentil = new Ciudad("Port-Gentil",new LatLng(-0.7351025999999999,8.75913109999999),new ImageIcon(getClass().getResource("Port-Gentil1.jpg")), new ImageIcon(getClass().getResource("Port-Gentil2.jpg")), new ImageIcon(getClass().getResource("Port-Gentil3.jpg")));
		Ciudad Banjul = new Ciudad("Banjul",new LatLng(13.4548761,-16.579032299999994),new ImageIcon(getClass().getResource("Banjul1.jpg")), new ImageIcon(getClass().getResource("Banjul2.jpg")), new ImageIcon(getClass().getResource("Banjul3.jpg")));
		Ciudad Bakau = new Ciudad("Bakau",new LatLng(13.4794397, -16.670396299999993),new ImageIcon(getClass().getResource("Bakau1.jpg")), new ImageIcon(getClass().getResource("Bakau2.jpg")), new ImageIcon(getClass().getResource("Bakau3.jpg")));
		Ciudad Accra = new Ciudad("Accra",new LatLng(5.6037168, -0.18696439999996528),new ImageIcon(getClass().getResource("Accra1.jpeg")), new ImageIcon(getClass().getResource("Accra2.jpg")), new ImageIcon(getClass().getResource("Accra3.jpg")));
		Ciudad Kumasi = new Ciudad("Kumasi",new LatLng(6.6666004,-1.6162709000000177),new ImageIcon(getClass().getResource("Kumasi1.jpg")), new ImageIcon(getClass().getResource("Kumasi2.jpg")), new ImageIcon(getClass().getResource("Kumasi3.jpg")));
		Ciudad Malabo = new Ciudad("Malabo",new LatLng(3.7504118, 8.737103899999966),new ImageIcon(getClass().getResource("Malabo1.jpg")), new ImageIcon(getClass().getResource("Malabo2.jpg")), new ImageIcon(getClass().getResource("Malabo3.jpg")));
		Ciudad Bata = new Ciudad("Bata",new LatLng(1.8533177,9.779022700000041),new ImageIcon(getClass().getResource("Bata1.jpg")), new ImageIcon(getClass().getResource("Bata2.jpg")), new ImageIcon(getClass().getResource("Bata3.jpg")));
		Ciudad Conakri = new Ciudad("Conakry",new LatLng(9.641185499999999,-13.57840120000003),new ImageIcon(getClass().getResource("Conakry1.jpg")), new ImageIcon(getClass().getResource("Conakry2.jpg")), new ImageIcon(getClass().getResource("Conakry3.jpg")));
		Ciudad Bisau = new Ciudad("Bissau",new LatLng(11.8816553,-15.617794199999935),new ImageIcon(getClass().getResource("Bisau1.jpg")), new ImageIcon(getClass().getResource("Bisau2.jpg")), new ImageIcon(getClass().getResource("Bisau3.jpg")));
		Ciudad Nairobi = new Ciudad("Nairobi",new LatLng(-1.2920659,36.82194619999996),new ImageIcon(getClass().getResource("Nairobi1.jpg")), new ImageIcon(getClass().getResource("Nairobi2.jpg")), new ImageIcon(getClass().getResource("Nairobi3.jpg")));
		Ciudad Mombasa = new Ciudad("Mombasa",new LatLng(-4.0434771,39.6682065),new ImageIcon(getClass().getResource("Mombasa1.jpg")), new ImageIcon(getClass().getResource("Mombasa2.jpg")), new ImageIcon(getClass().getResource("Mombasa3.jpg")));
		Ciudad Maseru = new Ciudad("Maseru",new LatLng(-29.36321879999999,27.51436030000002),new ImageIcon(getClass().getResource("Maseru1.jpg")), new ImageIcon(getClass().getResource("Maseru2.jpg")), new ImageIcon(getClass().getResource("Maseru3.jpg")));
		Ciudad Teyateyaneng = new Ciudad("Teyateyaneng",new LatLng(-29.13958019999999,27.749065599999994),new ImageIcon(getClass().getResource("Teyateyaneng1.jpg")), new ImageIcon(getClass().getResource("Teyateyaneng2.jpg")), new ImageIcon(getClass().getResource("Teyateyaneng3.jpg")));
		Ciudad Monrovia = new Ciudad("Monrovia",new LatLng(6.2907432,-10.760523899999953),new ImageIcon(getClass().getResource("Monrovia1.jpg")), new ImageIcon(getClass().getResource("Monrovia2.jpg")), new ImageIcon(getClass().getResource("Monrovia3.jpg")));
		Ciudad Harper = new Ciudad("Harper",new LatLng(4.3759676,-7.700941599999965),new ImageIcon(getClass().getResource("Harper1.jpg")), new ImageIcon(getClass().getResource("Harper2.jpg")), new ImageIcon(getClass().getResource("Harper3.jpg")));
		Ciudad Tripoli = new Ciudad("Tripoli",new LatLng(32.8872094,13.191338299999984),new ImageIcon(getClass().getResource("Tripoli1.jpg")), new ImageIcon(getClass().getResource("Tripoli2.jpg")), new ImageIcon(getClass().getResource("Tripoli3.jpg")));
		Ciudad Bengasi = new Ciudad("Bengasi",new LatLng(32.0947711, 20.18791060000001),new ImageIcon(getClass().getResource("Bengasi1.jpg")), new ImageIcon(getClass().getResource("Bengasi2.jpg")), new ImageIcon(getClass().getResource("Bengasi3.jpg")));
		Ciudad Antananarivo = new Ciudad("Antananarivo",new LatLng(-18.8791902, 47.50790549999999),new ImageIcon(getClass().getResource("Antananarivo1.jpg")), new ImageIcon(getClass().getResource("Antananarivo2.jpg")), new ImageIcon(getClass().getResource("Antananarivo3.jpg")));
		Ciudad Antsiranana = new Ciudad("Antsiranana",new LatLng(-12.3231349,49.29428329999996),new ImageIcon(getClass().getResource("Antsiranana1.jpg")), new ImageIcon(getClass().getResource("Antsiranana2.jpg")), new ImageIcon(getClass().getResource("Antsiranana3.jpg")));
		Ciudad Lilongwe = new Ciudad("Lilongwe",new LatLng(-13.9626121,33.77411949999998),new ImageIcon(getClass().getResource("Lilongwe1.jpg")), new ImageIcon(getClass().getResource("Lilongwe2.jpg")), new ImageIcon(getClass().getResource("Lilongwe3.jpg")));
		Ciudad Blantyre = new Ciudad("Blantyre",new LatLng(-15.7666707,35.01678659999993),new ImageIcon(getClass().getResource("Blantyre1.jpg")), new ImageIcon(getClass().getResource("Blantyre2.jpg")), new ImageIcon(getClass().getResource("Blantyre3.jpg")));
		Ciudad Bamako = new Ciudad("Bamako",new LatLng(12.6392316,-8.002889200000027),new ImageIcon(getClass().getResource("Bamako1.jpg")), new ImageIcon(getClass().getResource("Bamako2.jpg")), new ImageIcon(getClass().getResource("Bamako3.jpg")));
		Ciudad Tombuctu = new Ciudad("Tombuctu",new LatLng(16.7665887,-3.002561499999956),new ImageIcon(getClass().getResource("Tombuctu1.jpg")), new ImageIcon(getClass().getResource("Tombuctu2.jpg")), new ImageIcon(getClass().getResource("Tombuctu3.jpg")));
		Ciudad Djenne = new Ciudad("Djenne",new LatLng(13.9053952,-4.555995400000029),new ImageIcon(getClass().getResource("Djenne1.jpg")), new ImageIcon(getClass().getResource("Djenne2.jpg")), new ImageIcon(getClass().getResource("Djenne3.jpg")));
		Ciudad Rabat = new Ciudad("Rabat",new LatLng(33.9715904,-6.849812899999961),new ImageIcon(getClass().getResource("Rabat1.jpg")), new ImageIcon(getClass().getResource("Rabat2.jpg")), new ImageIcon(getClass().getResource("Rabat3.jpg")));
		Ciudad Marrakech = new Ciudad("Marrakech",new LatLng(31.6294723,-7.981084499999952),new ImageIcon(getClass().getResource("Marrakech1.jpg")), new ImageIcon(getClass().getResource("Marrakech2.jpg")), new ImageIcon(getClass().getResource("Marrakech3.jpg")));
		Ciudad Casablanca = new Ciudad("Casablanca",new LatLng(33.5731104, -7.589843400000063),new ImageIcon(getClass().getResource("Casablanca1.jpg")), new ImageIcon(getClass().getResource("Casablanca2.jpg")), new ImageIcon(getClass().getResource("Casablanca3.jpg")));
		Ciudad Tanger = new Ciudad("Tanger",new LatLng(35.7594651,-5.833954299999959),new ImageIcon(getClass().getResource("Tanger1.jpg")), new ImageIcon(getClass().getResource("Tanger2.jpg")), new ImageIcon(getClass().getResource("Tanger3.jpg")));
		Ciudad PortLouis = new Ciudad("Port Louis",new LatLng(-20.1608912, 57.50122220000003),new ImageIcon(getClass().getResource("Port-Louis1.jpg")), new ImageIcon(getClass().getResource("Port-Louis2.jpg")), new ImageIcon(getClass().getResource("Port-Louis3.jpg")));
		Ciudad Nuakchot = new Ciudad("Nuakchot",new LatLng(18.0735299,-15.958237199999985),new ImageIcon(getClass().getResource("Nuakchot1.jpg")), new ImageIcon(getClass().getResource("Nuakchot2.jpg")), new ImageIcon(getClass().getResource("Nuakchot3.jpg")));
		Ciudad Nuadibu = new Ciudad("Nuadibu",new LatLng(20.9425179, -17.036227199999985),new ImageIcon(getClass().getResource("Nuadibu1.jpg")), new ImageIcon(getClass().getResource("Nuadibu2.jpg")), new ImageIcon(getClass().getResource("Nuadibu3.jpg")));
		Ciudad Maputo = new Ciudad("Maputo",new LatLng(-25.891968,32.605135099999984),new ImageIcon(getClass().getResource("Maputo1.jpg")), new ImageIcon(getClass().getResource("Maputo2.jpg")), new ImageIcon(getClass().getResource("Maputo3.jpg")));
		Ciudad Beira = new Ciudad("Beira",new LatLng(-19.7963816,34.884486700000025),new ImageIcon(getClass().getResource("Beira1.jpg")), new ImageIcon(getClass().getResource("Beira2.jpg")), new ImageIcon(getClass().getResource("Beira3.jpg")));
		Ciudad Windhoek = new Ciudad("Windhoek",new LatLng(-22.5608807,17.0657549),new ImageIcon(getClass().getResource("Windhoek1.jpg")), new ImageIcon(getClass().getResource("Windhoek2.jpg")), new ImageIcon(getClass().getResource("Windhoek3.jpg")));
		Ciudad WalvisBay = new Ciudad("Walvis Bay",new LatLng(-22.9389587,14.52474630000006),new ImageIcon(getClass().getResource("Walvis-Bay1.jpg")), new ImageIcon(getClass().getResource("Walvis-Bay2.jpg")), new ImageIcon(getClass().getResource("Walvis-Bay3.jpg")));
		Ciudad Niamey = new Ciudad("Niamey",new LatLng(13.5115963,2.1253854000000274),new ImageIcon(getClass().getResource("Niamey1.jpg")), new ImageIcon(getClass().getResource("Niamey2.jpg")), new ImageIcon(getClass().getResource("Niamey3.jpg")));
		Ciudad Zinder = new Ciudad("Zinder",new LatLng(13.8018124,8.985270000000014),new ImageIcon(getClass().getResource("Zinder1.jpg")), new ImageIcon(getClass().getResource("Zinder2.jpg")), new ImageIcon(getClass().getResource("Zinder3.jpg")));
		Ciudad Abuya = new Ciudad("Abuya",new LatLng(9.0764785,7.398574000000053),new ImageIcon(getClass().getResource("Abuya1.jpg")), new ImageIcon(getClass().getResource("Abuya2.jpg")), new ImageIcon(getClass().getResource("Abuya3.jpg")));
		Ciudad Lagos = new Ciudad("Lagos",new LatLng(6.5243793,3.379205700000057),new ImageIcon(getClass().getResource("Lagos1.jpg")), new ImageIcon(getClass().getResource("Lagos2.jpg")), new ImageIcon(getClass().getResource("Lagos3.jpg")));
		Ciudad Bangui = new Ciudad("Bangui",new LatLng(4.3946735, 18.558189900000002),new ImageIcon(getClass().getResource("Bangui1.jpg")), new ImageIcon(getClass().getResource("Bangui2.jpg")), new ImageIcon(getClass().getResource("Bangui3.jpg")));
		Ciudad Boali = new Ciudad("Boali",new LatLng(4.888773599999999,18.142866899999945),new ImageIcon(getClass().getResource("Boali1.jpg")), new ImageIcon(getClass().getResource("Boali2.jpg")), new ImageIcon(getClass().getResource("Boali3.jpg")));
		Ciudad Ludumbashi = new Ciudad("Lubumbashi",new LatLng(-11.6876026,27.502617399999963),new ImageIcon(getClass().getResource("Ludumbashi1.jpg")), new ImageIcon(getClass().getResource("Ludumbashi2.jpg")), new ImageIcon(getClass().getResource("Ludumbashi3.jpg")));
		Ciudad Kigali = new Ciudad("Kigali",new LatLng(-1.9705786, 30.10442880000005),new ImageIcon(getClass().getResource("Kigali1.jpg")), new ImageIcon(getClass().getResource("Kigali2.jpg")), new ImageIcon(getClass().getResource("Kigali3.jpg")));
		Ciudad Butare = new Ciudad("Butare",new LatLng(-2.6077503,29.736812800000052),new ImageIcon(getClass().getResource("Butare1.jpg")), new ImageIcon(getClass().getResource("Butare2.jpg")), new ImageIcon(getClass().getResource("Butare3.jpg")));
		Ciudad SantoTomas = new Ciudad("Santo Tomas",new LatLng(0.18636,6.613080999999966),new ImageIcon(getClass().getResource("Santo-Tome1.jpg")), new ImageIcon(getClass().getResource("Santo-Tome2.jpg")), new ImageIcon(getClass().getResource("Santo-Tome3.jpg")));
		Ciudad Dakar = new Ciudad("Dakar",new LatLng(14.7645042,-17.366028599999936),new ImageIcon(getClass().getResource("Dakar1.jpg")), new ImageIcon(getClass().getResource("Dakar2.jpg")), new ImageIcon(getClass().getResource("Dakar3.jpg")));
		Ciudad SaintLouis = new Ciudad("Saint Louis",new LatLng(16.0326307,-16.481816699999968),new ImageIcon(getClass().getResource("Saint-Louis1.jpg")), new ImageIcon(getClass().getResource("Saint-Louis2.jpg")), new ImageIcon(getClass().getResource("Saint-Louis3.jpg")));
		Ciudad Victoria = new Ciudad("Victoria",new LatLng(-4.619143,55.45131489999994),new ImageIcon(getClass().getResource("Victoria1.jpg")), new ImageIcon(getClass().getResource("Victoria2.jpg")), new ImageIcon(getClass().getResource("Victoria3.jpg")));
		Ciudad Freetown = new Ciudad("Freetown",new LatLng(8.4656765, -13.231722499999933),new ImageIcon(getClass().getResource("Freetown1.jpg")), new ImageIcon(getClass().getResource("Freetown2.jpg")), new ImageIcon(getClass().getResource("Freetown3.jpg")));
		Ciudad Mogadiscio = new Ciudad("Mogadiscio",new LatLng(2.0469343,45.31816230000004),new ImageIcon(getClass().getResource("Mogadiscio1.jpg")), new ImageIcon(getClass().getResource("Mogadiscio2.jpg")), new ImageIcon(getClass().getResource("Mogadiscio3.jpg")));
		Ciudad Kismaayo = new Ciudad("Kismayo",new LatLng(-0.3560455,42.54605730000003),new ImageIcon(getClass().getResource("Kismaayo1.jpg")), new ImageIcon(getClass().getResource("Kismaayo2.jpg")), new ImageIcon(getClass().getResource("Kismaayo3.jpg")));
		Ciudad Mbabane = new Ciudad("Mbabane",new LatLng(-26.3054482,31.136671500000034),new ImageIcon(getClass().getResource("Mbabane1.jpg")), new ImageIcon(getClass().getResource("Mbabane2.jpg")), new ImageIcon(getClass().getResource("Mbabane3.jpg")));
		Ciudad Pretoria = new Ciudad("Pretoria",new LatLng(-25.7478676,28.22927119999997),new ImageIcon(getClass().getResource("Pretoria1.jpg")), new ImageIcon(getClass().getResource("Pretoria2.jpg")), new ImageIcon(getClass().getResource("Pretoria3.jpg")));
		Ciudad CiudaddelCabo = new Ciudad("Ciudad del Cabo",new LatLng(-33.9248685, 18.424055299999964),new ImageIcon(getClass().getResource("Ciudad-del-Cabo1.jpg")), new ImageIcon(getClass().getResource("Ciudad-del-Cabo2.jpg")), new ImageIcon(getClass().getResource("Ciudad-del-Cabo3.jpg")));
		Ciudad Jartum = new Ciudad("Jartum",new LatLng(15.5006544,32.55989939999995),new ImageIcon(getClass().getResource("Jartum.jpg")), new ImageIcon(getClass().getResource("Jartum2.jpg")), new ImageIcon(getClass().getResource("Jartum3.jpg")));
		Ciudad PuertoSudan = new Ciudad("Puerto Sudan",new LatLng(19.5903471,37.19016160000001),new ImageIcon(getClass().getResource("Puerto-Sudan1.jpg")), new ImageIcon(getClass().getResource("Puerto-Sudan2.jpg")), new ImageIcon(getClass().getResource("Puerto-Sudan3.jpg")));
		Ciudad Yuba = new Ciudad("Yuba",new LatLng(4.859363, 31.571249999999964),new ImageIcon(getClass().getResource("Yuba1.jpg")), new ImageIcon(getClass().getResource("Yuba2.jpg")), new ImageIcon(getClass().getResource("Yuba3.jpg")));
		Ciudad Bor = new Ciudad("Bor",new LatLng(6.2132663,31.565542400000027),new ImageIcon(getClass().getResource("Bor1.jpg")), new ImageIcon(getClass().getResource("Bor2.jpg")), new ImageIcon(getClass().getResource("Bor3.jpg")));
		Ciudad Dodoma = new Ciudad("Dodoma",new LatLng(-6.162959000000001,35.75160690000007),new ImageIcon(getClass().getResource("Dodoma1.jpg")), new ImageIcon(getClass().getResource("Dodoma2.jpg")), new ImageIcon(getClass().getResource("Dodoma3.jpg")));
		Ciudad Dar = new Ciudad("Dar es-Salaam",new LatLng(-6.792354,39.20832840000003),new ImageIcon(getClass().getResource("Dar-es-Salam1.jpg")), new ImageIcon(getClass().getResource("Dar-es-Salam2.jpg")), new ImageIcon(getClass().getResource("Dar-es-Salam3.jpg")));
		Ciudad Lome = new Ciudad("Lome",new LatLng(6.1724969, 1.2313618000000588),new ImageIcon(getClass().getResource("Lome1.jpg")), new ImageIcon(getClass().getResource("Lome2.jpeg")), new ImageIcon(getClass().getResource("Lome3.jpg")));
		Ciudad Sokode = new Ciudad("Sokode",new LatLng(8.977983199999999,1.1448980999999776),new ImageIcon(getClass().getResource("Sokode1.jpg")), new ImageIcon(getClass().getResource("Sokode2.jpg")), new ImageIcon(getClass().getResource("Sokode3.jpg")));
		Ciudad Tunez = new Ciudad("Tunez",new LatLng(36.8064948,10.181531599999971),new ImageIcon(getClass().getResource("Tunez1.jpg")), new ImageIcon(getClass().getResource("Tunez2.jpg")), new ImageIcon(getClass().getResource("Tunez3.jpg")));
		Ciudad Kampala = new Ciudad("Kampala",new LatLng(0.3475964,32.582519700000034),new ImageIcon(getClass().getResource("Kampala1.jpg")), new ImageIcon(getClass().getResource("Kampala2.jpg")), new ImageIcon(getClass().getResource("Kampala3.jpg")));
		Ciudad FortPortal = new Ciudad("Fort Portal",new LatLng(0.6546257,30.28011659999993),new ImageIcon(getClass().getResource("Fort-Portal1.jpg")), new ImageIcon(getClass().getResource("Fort-Portal2.jpg")), new ImageIcon(getClass().getResource("Fort-Portal3.jpg")));
		Ciudad Yibuti = new Ciudad("Yibuti",new LatLng(11.5720765,43.145647499999995),new ImageIcon(getClass().getResource("Yibuti1.jpg")), new ImageIcon(getClass().getResource("Yibuti2.jpg")), new ImageIcon(getClass().getResource("Yibuti3.jpg")));
		Ciudad Lusaka = new Ciudad("Lusaka",new LatLng(-15.3875259,28.322816500000044),new ImageIcon(getClass().getResource("Lusaka1.jpg")), new ImageIcon(getClass().getResource("Lusaka2.jpg")), new ImageIcon(getClass().getResource("Lusaka3.jpg")));
		Ciudad Livingstone = new Ciudad("Livingstone",new LatLng(-17.8519791, 25.828515299999935),new ImageIcon(getClass().getResource("Livingstone1.jpg")), new ImageIcon(getClass().getResource("Livingstone2.jpg")), new ImageIcon(getClass().getResource("Livingstone3.jpg")));
		Ciudad Harare = new Ciudad("Harare",new LatLng(-17.8251657, 31.03350999999998),new ImageIcon(getClass().getResource("Harare1.jpg")), new ImageIcon(getClass().getResource("Harare2.jpg")), new ImageIcon(getClass().getResource("Harare3.jpg")));
		Ciudad Bulawayo = new Ciudad("Bulawayo",new LatLng(-20.1325066,28.626479000000018),new ImageIcon(getClass().getResource("Bulawayo1.jpg")), new ImageIcon(getClass().getResource("Bulawayo2.jpg")), new ImageIcon(getClass().getResource("Bulawayo3.jpg")));

		tabla.put(1, Luanda); 
		tabla.put(2, Huambo);	
		tabla.put(3, Argel); 
		tabla.put(4, Constantina); 			
		tabla.put(5, PortoNovo); 
		tabla.put(6, Cotonu); 
		tabla.put(7, Gaborone);	
		tabla.put(8, Maun); 
		tabla.put(9, Uagadugu); 
		tabla.put(10,Banfora); 

		tabla.put(11, Buyumbura); 		
		tabla.put(12, Ngozi);				
		tabla.put(13, Praia);  
		tabla.put(14, RibeiraBrava); 
		tabla.put(15, Yaunde);  
		tabla.put(16, Duala);  
		tabla.put(17, Yamena);  
		tabla.put(18, Moundou);  
		tabla.put(19, Moroni );  
		tabla.put(20, Mutsamudu);  

		tabla.put(21, Brazzaville);  
		tabla.put(22, Kinsasa);  
		tabla.put(23, Yamusukro);  
		tabla.put(24, Abiyan);  
		tabla.put(25, ElCairo);  
		tabla.put(26, Alejandria);  
		tabla.put(27, Asmara);  
		tabla.put(28, AdisAbeba);  
		tabla.put(29, Gondar);  
		tabla.put(30, Libreville);  

		tabla.put(31, PortGentil);  
		tabla.put(32, Banjul);  
		tabla.put(33, Bakau);  
		tabla.put(34, Accra);  
		tabla.put(35, Kumasi); 
		tabla.put(36, Malabo);  
		tabla.put(37, Bata);  
		tabla.put(38, Conakri);  
		tabla.put(39, Bisau);  

		tabla.put(40, Nairobi);  
		tabla.put(41, Mombasa);  
		tabla.put(42, Maseru);  
		tabla.put(43, Teyateyaneng);  
		tabla.put(44, Monrovia);  
		tabla.put(45, Harper);  
		tabla.put(46, Tripoli);  
		tabla.put(47, Bengasi);  
		tabla.put(48, Antananarivo);  
		tabla.put(49, Antsiranana);  
		tabla.put(50, Lilongwe);  

		tabla.put(51, Blantyre);  
		tabla.put(52, Bamako);  
		tabla.put(53, Tombuctu);  
		tabla.put(54, Djenne); 
		tabla.put(55, Rabat);  
		tabla.put(56, Marrakech);  
		tabla.put(57, Casablanca);  
		tabla.put(58, Tanger);  
		tabla.put(59, PortLouis);  
		tabla.put(60, Nuakchot);  

		tabla.put(61, Nuadibu);  
		tabla.put(62, Maputo);  
		tabla.put(63, Beira);  
		tabla.put(64, Windhoek);  
		tabla.put(65, WalvisBay);  
		tabla.put(66, Niamey);  
		tabla.put(67, Zinder);  
		tabla.put(68, Abuya);  
		tabla.put(69, Lagos);  

		tabla.put(70, Bangui);  
		tabla.put(71, Boali);  
		tabla.put(72, Ludumbashi);  
		tabla.put(73, Kigali);  
		tabla.put(74, Butare);  
		tabla.put(75, SantoTomas);  
		tabla.put(76, Dakar);  
		tabla.put(77, SaintLouis);  
		tabla.put(78, Victoria);  
		tabla.put(79, Freetown);  

		tabla.put(80, Mogadiscio);  
		tabla.put(81, Kismaayo);  
		tabla.put(82, Mbabane);  
		tabla.put(83, Pretoria);  
		tabla.put(84, CiudaddelCabo);  
		tabla.put(85, Jartum);  
		tabla.put(86, PuertoSudan);  
		tabla.put(87, Yuba);  
		tabla.put(88, Bor);  
		tabla.put(89, Dodoma);  
		tabla.put(90, Dar);  

		tabla.put(91, Lome);  
		tabla.put(92, Sokode); 
		tabla.put(93, Tunez);  
		tabla.put(94, Kampala); 
		tabla.put(95, FortPortal);  
		tabla.put(96, Yibuti);  
		tabla.put(97, Lusaka);  
		tabla.put(98, Livingstone); 
		tabla.put(99, Harare);  
		tabla.put(100, Bulawayo); 


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

		int multiplicador = 100;
		HashMap<Integer, Ciudad> ciudades = Mapa.afri.getTabla();

		double num = Math.random()*multiplicador;
		int n = (int)num;

		return ciudades.get(n);

	}



}
