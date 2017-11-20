package europa;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesEuropa {

	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();

	/**
	 * Construccion de las ciudades en las que se podra jugar en el continente europa
	 * E inserccion en un HashMap para su uso posterior
	 */

	public CiudadesEuropa(){

		tabla = new HashMap<Integer, Ciudad>();	

		Ciudad tirana = new Ciudad("Tirana", new LatLng(41.3275459, 19.81869819999997),new ImageIcon(getClass().getResource("1tirana.jpg")), new ImageIcon(getClass().getResource("2tirana.jpg")), new ImageIcon(getClass().getResource("3tirana.jpg")));
		Ciudad durres = new Ciudad("Durres",new LatLng(41.3245904, 19.456468599999994),new ImageIcon(getClass().getResource("durres1.jpg")), new ImageIcon(getClass().getResource("durres2.jpg")), new ImageIcon(getClass().getResource("durres3.jpg")));
		Ciudad berrat = new Ciudad("Berrat",new LatLng(41.3245904, 19.456468599999994),new ImageIcon(getClass().getResource("berat1.jpg")), new ImageIcon(getClass().getResource("berat2.jpg")), new ImageIcon(getClass().getResource("berat3.jpg")));
		Ciudad gjirokastra = new Ciudad("Gjirokastra", new LatLng(40.0672874, 20.104522900000006), new ImageIcon(getClass().getResource("Gjirokastra1.jpg")), new ImageIcon(getClass().getResource("Gjirokastra2.jpg")), new ImageIcon(getClass().getResource("Gjirokastra3.jpg")));
		Ciudad berlin = new Ciudad("Berlin",new LatLng(52.52000659999999, 13.404953999999975), new ImageIcon(getClass().getResource("berlin1.jpg")), new ImageIcon(getClass().getResource("berlin2.jpg")), new ImageIcon(getClass().getResource("berlin3.jpg")));
		Ciudad munich = new Ciudad("Munich",new LatLng(48.1351253, 11.581980499999986), new ImageIcon(getClass().getResource("Munich1.jpg")), new ImageIcon(getClass().getResource("Munich2.jpg")), new ImageIcon(getClass().getResource("Munich3.jpg")));
		Ciudad colonia = new Ciudad("Colonia",new LatLng(50.937531, 6.960278600000038), new ImageIcon(getClass().getResource("Colonia1.jpg")), new ImageIcon(getClass().getResource("colonia2.jpg")), new ImageIcon(getClass().getResource("Colonia3.jpg")) );
		Ciudad hamburgo = new Ciudad("Hamburgo",new LatLng(53.5510846, 9.993681899999956), new ImageIcon(getClass().getResource("Hamburgo1.jpg")), new ImageIcon(getClass().getResource("Hamburgo2.jpg")), new ImageIcon(getClass().getResource("Hamburgo3.jpg")));
		Ciudad stuttgart = new Ciudad("Stuttgart",new LatLng(48.7758459, 9.182932100000016), new ImageIcon(getClass().getResource("Stuttgart1.jpg")), new ImageIcon(getClass().getResource("Stuttgart2.jpg")), new ImageIcon(getClass().getResource("Stuttgart3.jpg")));
		Ciudad andorra = new Ciudad("Andorra la Vieja",new LatLng(42.50631740000001, 1.521835499999952), new ImageIcon(getClass().getResource("andorra1.jpg")), new ImageIcon(getClass().getResource("andorra2.jpg")), new ImageIcon(getClass().getResource("andorra3.jpg")));
		Ciudad viena = new Ciudad("Viena",new LatLng(48.2081743, 16.37381890000006), new ImageIcon(getClass().getResource("Viena1.jpg")), new ImageIcon(getClass().getResource("Viena2.jpg")), new ImageIcon(getClass().getResource("Viena3.jpg")));
		Ciudad salzburgo = new Ciudad("Salzburgo",new LatLng(47.80949, 13.055010000000038), new ImageIcon(getClass().getResource("Salzburgo1.jpg")), new ImageIcon(getClass().getResource("Salzburgo2.jpeg")), new ImageIcon(getClass().getResource("Salzburgo3.jpg")));
		Ciudad innsbruck = new Ciudad("Innsbruck",new LatLng(47.2692124, 11.404102400000056), new ImageIcon(getClass().getResource("Innsbruck1.jpg")), new ImageIcon(getClass().getResource("Innsbruck2.jpg")), new ImageIcon(getClass().getResource("Innsbruck3.jpg")));
		Ciudad bruselas = new Ciudad("Bruselas",new LatLng(50.8503396, 4.351710300000036), new ImageIcon(getClass().getResource("Bruselas1.jpg")), new ImageIcon(getClass().getResource("Bruselas2.jpg")), new ImageIcon(getClass().getResource("Bruselas3.jpg")));
		Ciudad brujas = new Ciudad("Brujas",new LatLng(51.209348, 3.2246995000000425), new ImageIcon(getClass().getResource("Brujas1.jpg")), new ImageIcon(getClass().getResource("Brujas2.jpg")), new ImageIcon(getClass().getResource("Brujas3.jpg")));
		Ciudad lovaina = new Ciudad("Lovaina",new LatLng(50.8798438, 4.700517600000012), new ImageIcon(getClass().getResource("Lovaina1.jpg")), new ImageIcon(getClass().getResource("Lovaina2.jpg")), new ImageIcon(getClass().getResource("Lovaina3.jpg")));
		Ciudad minsk = new Ciudad("Minsk",new LatLng(53.90453979999999, 27.561524400000053), new ImageIcon(getClass().getResource("Minsk1.jpg")), new ImageIcon(getClass().getResource("Minsk2.jpg")), new ImageIcon(getClass().getResource("Minsk3.jpg")));
		Ciudad brest = new Ciudad("Brest",new LatLng(52.09762139999999, 23.734050300000035), new ImageIcon(getClass().getResource("Brest1.jpg")), new ImageIcon(getClass().getResource("Brest2.jpeg")), new ImageIcon(getClass().getResource("Brest3.jpg")));
		Ciudad gomel = new Ciudad("Gomel",new LatLng(52.4411761, 30.98784610000007), new ImageIcon(getClass().getResource("Gomel1.jpg")), new ImageIcon(getClass().getResource("Gomel2.jpg")), new ImageIcon(getClass().getResource("Gomel3.jpg")));
		Ciudad grodno = new Ciudad("Grodno",new LatLng(53.6693538, 23.813130600000022), new ImageIcon(getClass().getResource("Grodno1.jpg")), new ImageIcon(getClass().getResource("Grodno2.jpg")), new ImageIcon(getClass().getResource("Grodno3.jpg")));
		Ciudad sarajevo = new Ciudad("Sarajevo",new LatLng(43.8562586, 18.413076300000057), new ImageIcon(getClass().getResource("Sarajevo1.jpg")), new ImageIcon(getClass().getResource("Sarajevo2.jpg")), new ImageIcon(getClass().getResource("Sarajevo3.jpg")));
		Ciudad mostar = new Ciudad("Mostar",new LatLng(43.34377480000001, 17.80775779999999), new ImageIcon(getClass().getResource("Mostar1.jpg")), new ImageIcon(getClass().getResource("Mostar2.jpg")), new ImageIcon(getClass().getResource("Mostar3.jpg")));
		Ciudad tuzla = new Ciudad("Tuzla",new LatLng(44.53746109999999,18.673468700000058), new ImageIcon(getClass().getResource("Tuzla1.jpg")), new ImageIcon(getClass().getResource("Tuzla2.jpg")), new ImageIcon(getClass().getResource("Tuzla3.jpg")));
		Ciudad zenica = new Ciudad("Zenica",new LatLng(44.2034392,17.90774310000006), new ImageIcon(getClass().getResource("Zenica1.jpg")), new ImageIcon(getClass().getResource("Zenica2.jpg")), new ImageIcon(getClass().getResource("Zenica3.jpg")));
		Ciudad sofia = new Ciudad("Sofia",new LatLng(42.6977082,23.321867500000053), new ImageIcon(getClass().getResource("Sofia1.jpg")), new ImageIcon(getClass().getResource("Sofia2.jpg")), new ImageIcon(getClass().getResource("Sofia3.jpg")));
		Ciudad varna = new Ciudad("Varna",new LatLng(43.2140504,27.914733299999966), new ImageIcon(getClass().getResource("Varna1.jpg")), new ImageIcon(getClass().getResource("Varna2.jpg")), new ImageIcon(getClass().getResource("Varna3.jpg")));
		Ciudad burgas = new Ciudad("Burgas",new LatLng(42.50479259999999,27.462636100000054), new ImageIcon(getClass().getResource("Burgas1.jpg")), new ImageIcon(getClass().getResource("Burgas2.jpg")), new ImageIcon(getClass().getResource("Burgas3.jpg")));
		Ciudad ruse = new Ciudad("Ruse",new LatLng(43.83557130000001,25.96565540000006), new ImageIcon(getClass().getResource("Ruse1.jpg")), new ImageIcon(getClass().getResource("Ruse2.jpg")), new ImageIcon(getClass().getResource("Ruse3.jpg")));
		Ciudad nicosia = new Ciudad("Nicosia",new LatLng(35.1855659, 33.38227640000002), new ImageIcon(getClass().getResource("Nicosia1.jpg")), new ImageIcon(getClass().getResource("Nicosia2.jpg")), new ImageIcon(getClass().getResource("Nicosia3.jpg")));
		Ciudad limasol = new Ciudad("Limasol",new LatLng(34.7071301,33.022617399999945), new ImageIcon(getClass().getResource("Limasol1.jpg")), new ImageIcon(getClass().getResource("Limasol2.jpg")), new ImageIcon(getClass().getResource("Limasol3.jpg")));
		Ciudad zagreb = new Ciudad("Zagreb",new LatLng(45.8150108,15.981918899999982), new ImageIcon(getClass().getResource("zagreb1.jpg")), new ImageIcon(getClass().getResource("Zagreb2.jpg")), new ImageIcon(getClass().getResource("Zagreb3.jpg")));
		Ciudad split = new Ciudad("Split",new LatLng(43.5081323,16.440193499999964), new ImageIcon(getClass().getResource("Split1.jpg")), new ImageIcon(getClass().getResource("Split2.jpg")), new ImageIcon(getClass().getResource("Split3.jpg")));
		Ciudad dubrovnik = new Ciudad("Dubrovnik",new LatLng(42.65066059999999,18.09442379999996), new ImageIcon(getClass().getResource("Dubrovnik1.jpg")), new ImageIcon(getClass().getResource("Dubrovnik2.jpg")), new ImageIcon(getClass().getResource("Dubrovnik3.jpg")));
		Ciudad zadar = new Ciudad("Zadar",new LatLng(44.119371,15.231364799999938), new ImageIcon(getClass().getResource("Zadar1.jpg")), new ImageIcon(getClass().getResource("Zadar2.jpg")), new ImageIcon(getClass().getResource("Zadar3.jpg")));
		Ciudad pula = new Ciudad("Pula",new LatLng(44.8666232,13.849578800000018), new ImageIcon(getClass().getResource("Pula1.jpg")), new ImageIcon(getClass().getResource("Pula2.jpg")), new ImageIcon(getClass().getResource("Pula3.jpg")));
		Ciudad copenhague = new Ciudad("Copenhague",new LatLng(55.6760968,12.568337199999974), new ImageIcon(getClass().getResource("Copenhague1.jpg")), new ImageIcon(getClass().getResource("Copenhague2.jpg")), new ImageIcon(getClass().getResource("Copenhague3.jpeg")));
		Ciudad aarhus = new Ciudad("Aarhus",new LatLng(56.162939,10.203921000000037), new ImageIcon(getClass().getResource("Aarhus1.jpg")), new ImageIcon(getClass().getResource("Aarhus2.jpg")), new ImageIcon(getClass().getResource("Aarhus3.jpg")));
		Ciudad odense = new Ciudad("Odense",new LatLng(55.40375599999999,10.402370000000019), new ImageIcon(getClass().getResource("Odense1.jpg")), new ImageIcon(getClass().getResource("Odense2.jpg")), new ImageIcon(getClass().getResource("Odense3.jpg")));
		Ciudad aalborg = new Ciudad("Aalborg",new LatLng(57.0488195,9.921746999999982), new ImageIcon(getClass().getResource("Aalborg1.jpg")), new ImageIcon(getClass().getResource("Aalborg2.jpg")), new ImageIcon(getClass().getResource("Aalborg3.jpg")));
		Ciudad bratislava = new Ciudad("Bratislava",new LatLng(48.1485965,17.10774779999997), new ImageIcon(getClass().getResource("Bratislava1.jpg")), new ImageIcon(getClass().getResource("Bratislava2.jpg")), new ImageIcon(getClass().getResource("Bratislava3.jpg")));
		Ciudad kosice = new Ciudad("Kosice",new LatLng(48.7163857,21.26107460000003), new ImageIcon(getClass().getResource("Kosice1.jpg")), new ImageIcon(getClass().getResource("Kosice2.jpg")), new ImageIcon(getClass().getResource("Kosice3.jpg")));
		Ciudad liubliana = new Ciudad("Liubliana",new LatLng(46.0569465,14.505751499999974), new ImageIcon(getClass().getResource("Liubliana1.jpg")), new ImageIcon(getClass().getResource("Liubliana2.jpg")), new ImageIcon(getClass().getResource("Liubliana3.jpg")));
		Ciudad madrid = new Ciudad("Madrid",new LatLng(40.4167754,-3.7037901999999576), new ImageIcon(getClass().getResource("Madrid1.jpg")), new ImageIcon(getClass().getResource("Madrid2.jpg")), new ImageIcon(getClass().getResource("Madrid3.jpg")));
		Ciudad barcelona = new Ciudad("Barcelona",new LatLng(41.3850639,2.1734034999999494), new ImageIcon(getClass().getResource("Barcelona1.jpg")), new ImageIcon(getClass().getResource("Barcelona2.jpg")), new ImageIcon(getClass().getResource("Barcelona3.jpg")));
		Ciudad santiago = new Ciudad("Santiago de Compostela",new LatLng(42.8782132,-8.544844499999954), new ImageIcon(getClass().getResource("Santiago1.jpg")), new ImageIcon(getClass().getResource("santiago2.jpg")), new ImageIcon(getClass().getResource("Santiago3.jpg")));
		Ciudad granada = new Ciudad("Granada",new LatLng(37.1773363,-3.5985570999999936), new ImageIcon(getClass().getResource("Granada1.jpg")), new ImageIcon(getClass().getResource("Granada2.jpg")), new ImageIcon(getClass().getResource("Granada3.jpg")));
		Ciudad tallin = new Ciudad("Tallin",new LatLng(59.43696079999999,24.753574699999945), new ImageIcon(getClass().getResource("tallin1.jpg")), new ImageIcon(getClass().getResource("tallin2.jpg")), new ImageIcon(getClass().getResource("tallin3.jpg")));
		Ciudad helsinki = new Ciudad("Helsinki",new LatLng(60.16985569999999,24.93837910000002), new ImageIcon(getClass().getResource("Helsinki1.jpg")), new ImageIcon(getClass().getResource("Helsinki2.jpg")), new ImageIcon(getClass().getResource("Helsinki3.jpg")));
		Ciudad paris = new Ciudad("Paris",new LatLng(48.856614,2.3522219000000177), new ImageIcon(getClass().getResource("Paris1.jpg")), new ImageIcon(getClass().getResource("Paris2.jpg")), new ImageIcon(getClass().getResource("Paris3.jpg")));
		Ciudad marsella = new Ciudad("Marsella",new LatLng(43.296482,5.369779999999992), new ImageIcon(getClass().getResource("Marsella1.jpg")), new ImageIcon(getClass().getResource("Marsella2.jpeg")), new ImageIcon(getClass().getResource("Marsella3.jpg")));
		Ciudad lyon = new Ciudad("Lyon",new LatLng(45.764043,4.835658999999964), new ImageIcon(getClass().getResource("Lyon1.jpg")), new ImageIcon(getClass().getResource("Lyon2.png")), new ImageIcon(getClass().getResource("Lyon3.jpg")));
		Ciudad atenas = new Ciudad("Atenas",new LatLng(37.9838096,23.727538800000048), new ImageIcon(getClass().getResource("Atenas1.jpg")), new ImageIcon(getClass().getResource("Atenas2.jpg")), new ImageIcon(getClass().getResource("Atenas3.jpg")));
		Ciudad budapest = new Ciudad("Budapest",new LatLng(47.497912,19.04023499999994), new ImageIcon(getClass().getResource("budapest1.jpg")), new ImageIcon(getClass().getResource("budapest2.jpg")), new ImageIcon(getClass().getResource("budapest3.jpg")));
		Ciudad dublin = new Ciudad("Dublin",new LatLng(53.3498053,-6.260309699999993), new ImageIcon(getClass().getResource("Dublin1.jpg")), new ImageIcon(getClass().getResource("Dublin2.jpg")), new ImageIcon(getClass().getResource("Dublin3.jpg")));
		Ciudad cork = new Ciudad("Cork",new LatLng(51.8968917,-8.486315699999977), new ImageIcon(getClass().getResource("Cork1.jpg")), new ImageIcon(getClass().getResource("Cork2.jpg")), new ImageIcon(getClass().getResource("Cork3.jpg")));
		Ciudad reikiavik = new Ciudad("Reikiavik",new LatLng(64.12652059999999,-21.817439199999967), new ImageIcon(getClass().getResource("Reikiavik1.jpg")), new ImageIcon(getClass().getResource("Reikiavik2.jpg")), new ImageIcon(getClass().getResource("Reikiavik3.jpg")));
		Ciudad akireyri = new Ciudad("Akureyri",new LatLng(65.68849209999999,-18.12616939999998), new ImageIcon(getClass().getResource("Akureyri1.jpg")), new ImageIcon(getClass().getResource("Akureyri2.jpg")), new ImageIcon(getClass().getResource("Akureyri3.jpg")));
		Ciudad roma = new Ciudad("Roma",new LatLng(41.9027835,12.496365500000024), new ImageIcon(getClass().getResource("Roma1.jpg")), new ImageIcon(getClass().getResource("Roma2.jpg")), new ImageIcon(getClass().getResource("Roma3.jpg")));
		Ciudad florencia = new Ciudad("Florencia",new LatLng(43.7695604,11.25581360000001), new ImageIcon(getClass().getResource("Florencia1.jpg")), new ImageIcon(getClass().getResource("Florencia2.jpg")), new ImageIcon(getClass().getResource("Florencia3.jpg")));
		Ciudad venecia = new Ciudad("Venecia",new LatLng(45.4408474	,12.31551509999997), new ImageIcon(getClass().getResource("Venecia1.jpg")), new ImageIcon(getClass().getResource("Venecia2.jpg")), new ImageIcon(getClass().getResource("Venecia3.jpg")));
		Ciudad pristina = new Ciudad("Pristina",new LatLng(42.6629138,21.165502800000013), new ImageIcon(getClass().getResource("Pristina1.jpg")), new ImageIcon(getClass().getResource("Pristina2.jpg")), new ImageIcon(getClass().getResource("Pristina3.jpg")));
		Ciudad Riga = new Ciudad("Riga",new LatLng(56.9496487,24.105186499999945), new ImageIcon(getClass().getResource("Riga1.jpg")), new ImageIcon(getClass().getResource("Riga2.jpg")), new ImageIcon(getClass().getResource("Riga3.jpg")));
		Ciudad Jelgava = new Ciudad("Jelgava",new LatLng(56.6511091,23.721354099999985), new ImageIcon(getClass().getResource("Jelgava1.jpg")), new ImageIcon(getClass().getResource("Jelgava2.jpg")), new ImageIcon(getClass().getResource("Jelgava3.jpg")));
		Ciudad Vaduz = new Ciudad("Vaduz",new LatLng(47.1410303,9.520927700000016), new ImageIcon(getClass().getResource("Vaduz1.jpg")), new ImageIcon(getClass().getResource("Vaduz2.jpg")), new ImageIcon(getClass().getResource("Vaduz3.jpg")));
		Ciudad Vilna = new Ciudad("Vilna",new LatLng(54.6871555,25.279651400000034), new ImageIcon(getClass().getResource("Vilna1.jpg")), new ImageIcon(getClass().getResource("Vilna2.jpg")), new ImageIcon(getClass().getResource("Vilna3.jpg")));
		Ciudad Kaunas = new Ciudad("Kaunas",new LatLng(54.8985207,23.90359650000005), new ImageIcon(getClass().getResource("Kaunas1.jpg")), new ImageIcon(getClass().getResource("Kaunas2.jpg")), new ImageIcon(getClass().getResource("Kaunas3.jpg")));
		Ciudad Luxemburgo = new Ciudad("Luxemburgo",new LatLng(49.61162100000001,6.131934600000022), new ImageIcon(getClass().getResource("Luxemburgo1.jpg")), new ImageIcon(getClass().getResource("Luxemburgo2.jpg")), new ImageIcon(getClass().getResource("Luxemburgo3.jpg")));
		Ciudad Skopie = new Ciudad("Skopje",new LatLng(41.9973462,21.42799560000003), new ImageIcon(getClass().getResource("Skopie1.jpg")), new ImageIcon(getClass().getResource("Skopie2.jpg")), new ImageIcon(getClass().getResource("Skopie3.jpg")));
		Ciudad valeta = new Ciudad("La Valeta",new LatLng(35.8989085,14.514552800000047), new ImageIcon(getClass().getResource("La-Valeta1.jpg")), new ImageIcon(getClass().getResource("La-Valeta2.jpg")), new ImageIcon(getClass().getResource("La-Valeta3.jpg")));
		Ciudad Chisinau = new Ciudad("Chisinau",new LatLng(47.0104529,28.86381019999999), new ImageIcon(getClass().getResource("Chisinau1.jpg")), new ImageIcon(getClass().getResource("Chisinau2.jpg")), new ImageIcon(getClass().getResource("Chisinau3.jpg")));
		Ciudad Monaco = new Ciudad("Monaco",new LatLng(43.73841760000001,7.42461579999997), new ImageIcon(getClass().getResource("Monaco1.jpg")), new ImageIcon(getClass().getResource("Monaco2.jpg")), new ImageIcon(getClass().getResource("Monaco3.jpg")));
		Ciudad Podgorica = new Ciudad("Podgorica",new LatLng(42.4304196,19.259364199999936), new ImageIcon(getClass().getResource("Podgorica1.jpg")), new ImageIcon(getClass().getResource("Podgorica2.jpg")), new ImageIcon(getClass().getResource("Podgorica3.jpg")));
		Ciudad Oslo = new Ciudad("Oslo",new LatLng(59.9138688,	10.752245399999993), new ImageIcon(getClass().getResource("Oslo1.jpg")), new ImageIcon(getClass().getResource("Oslo2.jpg")), new ImageIcon(getClass().getResource("Oslo3.jpg")));
		Ciudad Bergen = new Ciudad("Bergen",new LatLng(60.39126279999999,5.32205440000007), new ImageIcon(getClass().getResource("Bergen1.jpg")), new ImageIcon(getClass().getResource("Bergen2.jpg")), new ImageIcon(getClass().getResource("Bergen3.jpg")));
		Ciudad Amsterdam = new Ciudad("Amsterdam",new LatLng(52.3702157,4.895167899999933), new ImageIcon(getClass().getResource("Amsterdam1.jpg")), new ImageIcon(getClass().getResource("Amsterdam2.jpg")), new ImageIcon(getClass().getResource("Amsterdam3.jpg")));
		Ciudad Utrecht = new Ciudad("Utrecht",new LatLng(52.09073739999999,5.121420100000023), new ImageIcon(getClass().getResource("Utrecht1.jpg")), new ImageIcon(getClass().getResource("Utrecht2.jpg")), new ImageIcon(getClass().getResource("Utrecht3.jpg")));
		Ciudad Varsovia = new Ciudad("Varsovia",new LatLng(52.2296756,21.012228700000037), new ImageIcon(getClass().getResource("Varsovia1.jpg")), new ImageIcon(getClass().getResource("Varsovia2.jpg")), new ImageIcon(getClass().getResource("Varsovia3.jpg")));
		Ciudad Cracovia = new Ciudad("Cracovia",new LatLng(50.06465009999999,19.94497990000002), new ImageIcon(getClass().getResource("Cracovia1.jpg")), new ImageIcon(getClass().getResource("Cracovia2.jpg")), new ImageIcon(getClass().getResource("Cracovia3.jpg")));
		Ciudad Lisboa = new Ciudad("Lisboa",new LatLng(38.7222524,	-9.139336599999979), new ImageIcon(getClass().getResource("Lisboa1.jpg")), new ImageIcon(getClass().getResource("Lisboa2.jpg")), new ImageIcon(getClass().getResource("Lisboa3.jpg")));
		Ciudad Oporto = new Ciudad("Oporto",new LatLng(41.1579438,-8.629105299999992), new ImageIcon(getClass().getResource("Oporto1.jpg")), new ImageIcon(getClass().getResource("Oporto2.jpg")), new ImageIcon(getClass().getResource("Oporto3.jpg")));
		Ciudad Londres = new Ciudad("Londres",new LatLng(51.5073509,-0.12775829999998223), new ImageIcon(getClass().getResource("Londres1.jpg")), new ImageIcon(getClass().getResource("Londres2.jpg")), new ImageIcon(getClass().getResource("Londres3.jpg")));
		Ciudad Manchester = new Ciudad("Manchester",new LatLng(53.4807593,-2.2426305000000184), new ImageIcon(getClass().getResource("Manchester1.jpg")), new ImageIcon(getClass().getResource("Manchester2.jpg")), new ImageIcon(getClass().getResource("Manchester3.jpg")));
		Ciudad Edimburgo = new Ciudad("Edimburgo",new LatLng(55.953252,-3.188266999999996), new ImageIcon(getClass().getResource("Edimburgo1.jpg")), new ImageIcon(getClass().getResource("Edimburgo2.jpg")), new ImageIcon(getClass().getResource("Edimburgo3.jpg")));
		Ciudad Praga = new Ciudad("Praga",new LatLng(50.0755381,14.43780049999998), new ImageIcon(getClass().getResource("Praga1.jpg")), new ImageIcon(getClass().getResource("Praga2.jpg")), new ImageIcon(getClass().getResource("Praga3.jpg")));
		Ciudad Brno = new Ciudad("Brno",new LatLng(49.1950602,16.606837100000007), new ImageIcon(getClass().getResource("Brno1.jpg")), new ImageIcon(getClass().getResource("Brno2.jpg")), new ImageIcon(getClass().getResource("Brno3.jpg")));
		Ciudad Bucarest = new Ciudad("Bucarest",new LatLng(44.4267674,26.102538399999958), new ImageIcon(getClass().getResource("Bucarest1.jpg")), new ImageIcon(getClass().getResource("Bucarest2.jpg")), new ImageIcon(getClass().getResource("Bucarest3.jpg")));
		Ciudad Brasov = new Ciudad("Brasov",new LatLng(45.6579755,25.601197700000057), new ImageIcon(getClass().getResource("Brasov1.jpg")), new ImageIcon(getClass().getResource("Brasov2.jpg")), new ImageIcon(getClass().getResource("Brasov3.jpg")));
		Ciudad Moscu = new Ciudad("Moscu",new LatLng(55.755826,37.617299900000035), new ImageIcon(getClass().getResource("Moscu1.jpg")), new ImageIcon(getClass().getResource("Moscu2.jpg")), new ImageIcon(getClass().getResource("Moscu3.jpg")));
		Ciudad petersburgo = new Ciudad("San Petersburgo",new LatLng(59.9342802	,30.335098600000038), new ImageIcon(getClass().getResource("San-Petesburgo1.jpg")), new ImageIcon(getClass().getResource("San-Petesburgo2.jpg")), new ImageIcon(getClass().getResource("San-Petesburgo3.jpg")));
		Ciudad Kazan = new Ciudad("Kazan",new LatLng(55.8304307,49.06608060000008), new ImageIcon(getClass().getResource("Kazan1.jpg")), new ImageIcon(getClass().getResource("Kazan2.jpg")), new ImageIcon(getClass().getResource("Kazan3.jpg")));
		Ciudad Sochi = new Ciudad("Sochi",new LatLng(43.60280789999999,39.7341543), new ImageIcon(getClass().getResource("Sochi1.jpg")), new ImageIcon(getClass().getResource("Sochi2.jpg")), new ImageIcon(getClass().getResource("Sochi3.jpg")));
		Ciudad marino = new Ciudad("San Marino",new LatLng(43.94236,12.457776999999965), new ImageIcon(getClass().getResource("San-Marino1.jpg")), new ImageIcon(getClass().getResource("San-Marino2.jpg")), new ImageIcon(getClass().getResource("San-Marino3.jpg")));
		Ciudad Belgrado = new Ciudad("Belgrado",new LatLng(44.786568,	20.44892159999995), new ImageIcon(getClass().getResource("Belgrado1.jpg")), new ImageIcon(getClass().getResource("Belgrado2.jpg")), new ImageIcon(getClass().getResource("Belgrado3.jpg")));
		Ciudad Estocolmo = new Ciudad("Estocolmo",new LatLng(59.32932349999999,18.068580800000063), new ImageIcon(getClass().getResource("Estocolmo1.jpg")), new ImageIcon(getClass().getResource("Estocolmo2.jpg")), new ImageIcon(getClass().getResource("Estocolmo3.jpg")));
		Ciudad Gotemburgo = new Ciudad("Gotemburgo",new LatLng(57.70887,11.974559999999997), new ImageIcon(getClass().getResource("Gotemburgo1.jpg")), new ImageIcon(getClass().getResource("Gotemburgo2.jpg")), new ImageIcon(getClass().getResource("Gotemburgo3.jpg")));
		Ciudad Berna = new Ciudad("Berna",new LatLng(46.9479739,7.447446799999966), new ImageIcon(getClass().getResource("Berna1.jpg")), new ImageIcon(getClass().getResource("Berna2.jpg")), new ImageIcon(getClass().getResource("Berna3.jpg")));
		Ciudad Zurich = new Ciudad("Zurich",new LatLng(47.3768866,8.541694000000007), new ImageIcon(getClass().getResource("Zurich1.jpg")), new ImageIcon(getClass().getResource("Zurich2.jpg")), new ImageIcon(getClass().getResource("Zurich3.jpg")));
		Ciudad Kiev = new Ciudad("Kiev",new LatLng(50.4501,30.523400000000038), new ImageIcon(getClass().getResource("Kiev1.jpeg")), new ImageIcon(getClass().getResource("Kiev2.jpg")), new ImageIcon(getClass().getResource("Kiev3.jpg")));
		Ciudad Odesa = new Ciudad("Odesa",new LatLng(46.482526,30.723309500000028), new ImageIcon(getClass().getResource("Odesa1.jpg")), new ImageIcon(getClass().getResource("Odesa2.jpg")), new ImageIcon(getClass().getResource("Odesa3.jpg")));
		Ciudad Vaticano = new Ciudad("Vaticano",new LatLng(41.902916,12.453389000000016), new ImageIcon(getClass().getResource("Vaticano1.jpg")), new ImageIcon(getClass().getResource("Vaticano2.jpg")), new ImageIcon(getClass().getResource("Vaticano3.jpg")));

		tabla.put(1, tirana); 
		tabla.put(2, durres);	
		tabla.put(3, berrat); 
		tabla.put(4, gjirokastra); 
		tabla.put(5, berlin ); 
		tabla.put(6, munich); 			
		tabla.put(7, colonia); 
		tabla.put(8, hamburgo); 
		tabla.put(9, stuttgart); 

		tabla.put(10, andorra);	
		tabla.put(11, viena); 
		tabla.put(12, salzburgo); 
		tabla.put(13, innsbruck); 
		tabla.put(14, bruselas); 
		tabla.put(15, brujas);
		tabla.put(16, lovaina);
		tabla.put(17, minsk); 

		tabla.put(18, brest); 		
		tabla.put(19, gomel);			
		tabla.put(20, grodno); 		
		tabla.put(21, sarajevo); 
		tabla.put(22, mostar);  
		tabla.put(23, tuzla);  
		tabla.put(24, zenica);  
		tabla.put(25, sofia);  
		tabla.put(26, varna);  
		tabla.put(27, burgas);  
		tabla.put(28, ruse);  
		tabla.put(29, nicosia);  

		tabla.put(30,limasol );  
		tabla.put(31, zagreb);  
		tabla.put(32, split);  
		tabla.put(33, dubrovnik);  
		tabla.put(34, zadar);  
		tabla.put(35, pula);  
		tabla.put(36, copenhague);  
		tabla.put(37, aarhus);  
		tabla.put(38, odense);  
		tabla.put(39, aalborg);  

		tabla.put(40, bratislava);  
		tabla.put(41, kosice);  
		tabla.put(42, liubliana);  
		tabla.put(43, madrid);  
		tabla.put(44, barcelona);  
		tabla.put(45, santiago);  
		tabla.put(46, granada);  
		tabla.put(47, tallin);  
		tabla.put(48, helsinki);  
		tabla.put(49, paris);  

		tabla.put(50, marsella);  
		tabla.put(51, lyon);  
		tabla.put(52, atenas);  
		tabla.put(53, budapest);  
		tabla.put(54, dublin);  
		tabla.put(55, cork);  
		tabla.put(56, reikiavik);  
		tabla.put(57, akireyri);  
		tabla.put(58, roma);  
		tabla.put(59, florencia);  

		tabla.put(60, venecia);  
		tabla.put(61, pristina);  
		tabla.put(62, Riga);  
		tabla.put(63, Jelgava);  
		tabla.put(64, Vaduz);  
		tabla.put(65, Vilna);  
		tabla.put(66, Kaunas);  
		tabla.put(67, Luxemburgo);  
		tabla.put(68, Skopie);  

		tabla.put(69, valeta);  
		tabla.put(70, Chisinau);  
		tabla.put(71, Monaco);  
		tabla.put(72, Podgorica);  
		tabla.put(73, Oslo);  
		tabla.put(74, Bergen);  
		tabla.put(75, Amsterdam);  
		tabla.put(76, Utrecht);  
		tabla.put(77, Varsovia);  
		tabla.put(78, Cracovia);  

		tabla.put(79, Lisboa);  
		tabla.put(80, Oporto);  
		tabla.put(81, Londres);  
		tabla.put(82, Manchester);  
		tabla.put(83, Edimburgo);  
		tabla.put(84, Praga);  
		tabla.put(85, Brno); 
		tabla.put(86, Bucarest);  
		tabla.put(87, Brasov);  
		tabla.put(88, Moscu);  

		tabla.put(89, petersburgo);  
		tabla.put(90, Kazan);  
		tabla.put(91, Sochi);  
		tabla.put(92, marino);  
		tabla.put(93, Belgrado);  
		tabla.put(94, Estocolmo);  
		tabla.put(95, Gotemburgo);  
		tabla.put(96, Berna);  
		tabla.put(97, Zurich);  
		tabla.put(98, Kiev);  
		tabla.put(99, Odesa);  
		tabla.put(109, Vaticano); 

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
		HashMap<Integer, Ciudad> ciudades = Mapa.eu.getTabla();

		double num = Math.random()*multiplicador;
		int n = (int)num;

		return ciudades.get(n);

	}



}
