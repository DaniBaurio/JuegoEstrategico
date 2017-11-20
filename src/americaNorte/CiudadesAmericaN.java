package americaNorte;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesAmericaN {

	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();

	/**
	 * Construccion de las ciudades en las que se podra jugar en el continente america del norte
	 * E inserccion en un HashMap para su uso posterior
	 */

	public CiudadesAmericaN(){

		tabla = new HashMap<Integer, Ciudad>();

		Ciudad Ottawa = new Ciudad("Ottawa", new LatLng(45.4215296,-75.69719309999999), new ImageIcon(getClass().getResource("Ottawa1.jpg")), new ImageIcon(getClass().getResource("Ottawa2.jpg")), new ImageIcon(getClass().getResource("Ottawa3.jpg")));
		Ciudad Edmonton = new Ciudad("Edmonton",new LatLng(53.544389, -113.49092669999999), new ImageIcon(getClass().getResource("Edmonton1.jpg")), new ImageIcon(getClass().getResource("Edmonton2.jpg")), new ImageIcon(getClass().getResource("Edmonton3.jpg")));
		Ciudad Hamilton = new Ciudad("Hamilton",new LatLng(43.2557206, -79.87110239999998), new ImageIcon(getClass().getResource("Hamilton1.jpg")), new ImageIcon(getClass().getResource("Hamilton2.jpg")), new ImageIcon(getClass().getResource("Hamilton3.jpg")));
		Ciudad Winnipeg = new Ciudad("Winnipeg", new LatLng(49.895136, -97.13837439999998), new ImageIcon(getClass().getResource("Winnipeg1.jpg")), new ImageIcon(getClass().getResource("Winnipeg2.jpg")), new ImageIcon(getClass().getResource("Winnipeg3.jpg")));
		Ciudad Kitchener = new Ciudad("Kitchener",new LatLng(43.450301,-80.48319170000002), new ImageIcon(getClass().getResource("Kitchener1.jpg")), new ImageIcon(getClass().getResource("Kitchener2.jpg")), new ImageIcon(getClass().getResource("Kitchener3.jpg")));
		Ciudad London = new Ciudad("London",new LatLng(42.9849233,-81.2452768), new ImageIcon(getClass().getResource("London1.jpg")), new ImageIcon(getClass().getResource("London2.jpg")), new ImageIcon(getClass().getResource("London3.jpg")));
		Ciudad Victoria = new Ciudad("Victoria",new LatLng(48.4284207, -123.36564440000001) , new ImageIcon(getClass().getResource("Victoria1.jpg")), new ImageIcon(getClass().getResource("Victoria2.jpg")), new ImageIcon(getClass().getResource("Victoria3.jpg")));
		Ciudad StCatharines = new Ciudad("St. Catharines",new LatLng(43.1593745, -79.24686259999999), new ImageIcon(getClass().getResource("St.-Catharines1.jpg")), new ImageIcon(getClass().getResource("St.-Catharines2.jpg")), new ImageIcon(getClass().getResource("St.-Catharines3.jpg")));
		Ciudad Oshawa = new Ciudad("Oshawa",new LatLng(43.8970929, -78.86579119999999), new ImageIcon(getClass().getResource("Oshawa1.jpg")), new ImageIcon(getClass().getResource("Oshawa2.jpg")), new ImageIcon(getClass().getResource("Oshawa3.jpg")));
		Ciudad Windsor = new Ciudad("Windsor",new LatLng(42.3149367, -83.0363633), new ImageIcon(getClass().getResource("Windsor1.jpg")), new ImageIcon(getClass().getResource("Windsor2.jpg")), new ImageIcon(getClass().getResource("Windsor3.jpg")));
		Ciudad Halifax = new Ciudad("Halifax",new LatLng(44.64876350000001, -63.5752387), new ImageIcon(getClass().getResource("Halifax1.jpg")), new ImageIcon(getClass().getResource("Halifax2.jpg")), new ImageIcon(getClass().getResource("Halifax3.jpg")));
		Ciudad Saskatoon = new Ciudad("Saskatoon",new LatLng(52.1332144, -106.67004580000003), new ImageIcon(getClass().getResource("Saskatoon1.jpg")), new ImageIcon(getClass().getResource("Saskatoon2.jpg")), new ImageIcon(getClass().getResource("Saskatoon3.jpg")));
		Ciudad Barrie = new Ciudad("Barrie",new LatLng(44.38935559999999, -79.69033159999998), new ImageIcon(getClass().getResource("Ottawa1.jpg")), new ImageIcon(getClass().getResource("Ottawa2.jpg")), new ImageIcon(getClass().getResource("Ottawa3.jpg")));
		Ciudad Regina = new Ciudad("Regina",new LatLng(50.4452112, -104.61889429999997), new ImageIcon(getClass().getResource("Barrie1.jpg")), new ImageIcon(getClass().getResource("Barrie2.jpg")), new ImageIcon(getClass().getResource("Barrie3.jpg")));
		Ciudad SanJuan = new Ciudad("San Juan de Terranova",new LatLng(47.5615096,-52.712576799999965), new ImageIcon(getClass().getResource("San-Juan-de-Terranova1.jpg")), new ImageIcon(getClass().getResource("San-Juan-de-Terranova2.jpg")), new ImageIcon(getClass().getResource("San-Juan-de-Terranova3.jpg")));
		Ciudad Montreal = new Ciudad("Montreal",new LatLng(45.5016889, -73.56725599999999), new ImageIcon(getClass().getResource("Montreal1.jpg")), new ImageIcon(getClass().getResource("Montreal2.jpg")), new ImageIcon(getClass().getResource("Montreal3.jpg")));
		Ciudad Toronto = new Ciudad("Toronto",new LatLng(43.653226, -79.38318429999998), new ImageIcon(getClass().getResource("Toronto2.jpg")), new ImageIcon(getClass().getResource("Toronto2.jpg")), new ImageIcon(getClass().getResource("Ottawa3.jpg")));
		Ciudad Vancouver = new Ciudad("Vancouver",new LatLng(49.2827291,-123.12073750000002), new ImageIcon(getClass().getResource("Ottawa1.jpg")), new ImageIcon(getClass().getResource("Ottawa2.jpg")), new ImageIcon(getClass().getResource("Toronto3.jpg")));
		Ciudad Calgary = new Ciudad("Calgary",new LatLng(51.0486151,-114.0708459), new ImageIcon(getClass().getResource("Calgary1.jpg")), new ImageIcon(getClass().getResource("Calgary2.jpg")), new ImageIcon(getClass().getResource("Calgary3.jpg")));
		Ciudad Brantford = new Ciudad("Brantford",new LatLng(43.1393867,-80.2644254), new ImageIcon(getClass().getResource("Brantford1.jpg")), new ImageIcon(getClass().getResource("Brantford2.jpg")), new ImageIcon(getClass().getResource("Brantford3.jpg")));
		Ciudad Milton = new Ciudad("Milton",new LatLng(43.5182991,-79.8774042), new ImageIcon(getClass().getResource("Milton1.jpg")), new ImageIcon(getClass().getResource("Milton2.jpg")), new ImageIcon(getClass().getResource("Milton3.jpg")));
		Ciudad Waterloo = new Ciudad("Waterloo",new LatLng(43.4642578,-80.5204096), new ImageIcon(getClass().getResource("Waterloo1.jpg")), new ImageIcon(getClass().getResource("Waterloo2.jpg")), new ImageIcon(getClass().getResource("Waterloo3.jpg")));
		Ciudad Maple = new Ciudad("Maple",new LatLng(43.93694439999999,-80.64510489999998), new ImageIcon(getClass().getResource("Maple1.jpg")), new ImageIcon(getClass().getResource("Maple2.jpg")), new ImageIcon(getClass().getResource("Maple3.jpg")));
		Ciudad NorthYork = new Ciudad("North York",new LatLng(43.7615377,-79.4110794), new ImageIcon(getClass().getResource("North-York1.jpg")), new ImageIcon(getClass().getResource("North-York2.jpg")), new ImageIcon(getClass().getResource("North-York3.jpg")));
		Ciudad Washington = new Ciudad("Washington D.C",new LatLng(38.9071923,-77.03687070000001), new ImageIcon(getClass().getResource("Washington-D.-C.1.jpg")), new ImageIcon(getClass().getResource("Washington-D.-C.2.jpg")), new ImageIcon(getClass().getResource("Washington-D.-C.3.jpg")));
		Ciudad LosAngeles = new Ciudad("Los Angeles",new LatLng(34.0522342,-118.2436849), new ImageIcon(getClass().getResource("Los-Angeles1.jpg")), new ImageIcon(getClass().getResource("Los-Angeles2.jpg")), new ImageIcon(getClass().getResource("Los-Angeles3.jpg")));
		Ciudad Houston = new Ciudad("Houston",new LatLng(29.7604267, -95.3698028), new ImageIcon(getClass().getResource("Houston1.jpg")), new ImageIcon(getClass().getResource("Houston2.jpg")), new ImageIcon(getClass().getResource("Houston3.jpg")));
		Ciudad Chicago = new Ciudad("Chicago",new LatLng(41.8781136, -87.62979819999998), new ImageIcon(getClass().getResource("Chicago1.jpg")), new ImageIcon(getClass().getResource("Chicago2.jpg")), new ImageIcon(getClass().getResource("Chicago3.jpg")));
		Ciudad NuevaYork = new Ciudad("Nueva York",new LatLng(40.7127753, -74.0059728), new ImageIcon(getClass().getResource("Nueva-York1.jpg")), new ImageIcon(getClass().getResource("Nueva-York2.jpg")), new ImageIcon(getClass().getResource("Nueva-York3.jpg")));
		Ciudad LasVegas = new Ciudad("Las Vegas",new LatLng(36.1699412,-115.13982959999998), new ImageIcon(getClass().getResource("Las-Vegas1.jpg")), new ImageIcon(getClass().getResource("Las-Vegas2.jpg")), new ImageIcon(getClass().getResource("Las-Vegas3.jpg")));
		Ciudad SanFrancisco = new Ciudad("San Francisco",new LatLng(37.7749295, -122.41941550000001), new ImageIcon(getClass().getResource("San-Francisco1.jpg")), new ImageIcon(getClass().getResource("San-Francisco2.jpg")), new ImageIcon(getClass().getResource("San-Francisco3.jpg")));
		Ciudad SanDiego = new Ciudad("San Diego",new LatLng(32.715738,-117.16108380000003), new ImageIcon(getClass().getResource("San-Diego1.jpg")), new ImageIcon(getClass().getResource("San-Diego2.jpg")), new ImageIcon(getClass().getResource("San-Diego3.jpg")));
		Ciudad Honolulu = new Ciudad("Honolulu",new LatLng(21.3069444,-157.85833330000003), new ImageIcon(getClass().getResource("Honolulu1.jpg")), new ImageIcon(getClass().getResource("Honolulu2.jpg")), new ImageIcon(getClass().getResource("Honolulu3.jpg")));
		Ciudad Seattle = new Ciudad("Seattle",new LatLng(47.6062095,-122.3320708), new ImageIcon(getClass().getResource("Seattle1.jpg")), new ImageIcon(getClass().getResource("Seattle2.jpg")), new ImageIcon(getClass().getResource("Seattle3.jpg")));
		Ciudad Tampa = new Ciudad("Tampa",new LatLng(27.950575,-82.45717760000002), new ImageIcon(getClass().getResource("Tampa1.jpg")), new ImageIcon(getClass().getResource("Tampa2.jpg")), new ImageIcon(getClass().getResource("Tampa3.jpg")));
		Ciudad Miami = new Ciudad("Miami",new LatLng(25.7616798,-80.19179020000001), new ImageIcon(getClass().getResource("Miami1.jpg")), new ImageIcon(getClass().getResource("Miami2.jpg")), new ImageIcon(getClass().getResource("Miami3.jpg")));
		Ciudad Portland = new Ciudad("Portland",new LatLng(45.5230622,-122.67648150000002), new ImageIcon(getClass().getResource("Portland1.jpg")), new ImageIcon(getClass().getResource("Portland2.jpg")), new ImageIcon(getClass().getResource("Portland3.jpg")));
		Ciudad Oakland = new Ciudad("Oakland",new LatLng(37.8043637, -122.2711137), new ImageIcon(getClass().getResource("Oakland1.jpg")), new ImageIcon(getClass().getResource("Oakland2.jpg")), new ImageIcon(getClass().getResource("Oakland3.jpg")));
		Ciudad SaltLakeCity = new Ciudad("Salt Lake City",new LatLng(40.7607793, -111.89104739999999), new ImageIcon(getClass().getResource("Salt-Lake-City.jpg")), new ImageIcon(getClass().getResource("Salt-Lake-City2.jpg")), new ImageIcon(getClass().getResource("Salt-Lake-City3.jpg")));
		Ciudad Phoenix = new Ciudad("Phoenix",new LatLng(33.4483771, -112.07403729999999), new ImageIcon(getClass().getResource("Phoenix1.jpg")), new ImageIcon(getClass().getResource("Phoenix2.jpg")), new ImageIcon(getClass().getResource("Phoenix3.jpg")));
		Ciudad Oklahoma = new Ciudad("Oklahoma",new LatLng(35.0077519, -97.09287699999999), new ImageIcon(getClass().getResource("Oklahoma1.jpg")), new ImageIcon(getClass().getResource("Oklahoma2.jpg")), new ImageIcon(getClass().getResource("Oklahoma3.jpg")));
		Ciudad Montgomery = new Ciudad("Montgomery",new LatLng(32.3668052,-86.29996890000001), new ImageIcon(getClass().getResource("Montgomery1.jpg")), new ImageIcon(getClass().getResource("Montgomery2.jpg")), new ImageIcon(getClass().getResource("Montgomery3.jpg")));
		Ciudad Birmingham = new Ciudad("Birmingham",new LatLng(33.5206608,-86.80248999999998), new ImageIcon(getClass().getResource("Birmingham1.jpg")), new ImageIcon(getClass().getResource("Birmingham2.jpg")), new ImageIcon(getClass().getResource("Birmingham3.jpg")));
		Ciudad Denver = new Ciudad("Denver",new LatLng(39.7392358,-104.990251), new ImageIcon(getClass().getResource("Denver1.jpg")), new ImageIcon(getClass().getResource("Denver2.jpg")), new ImageIcon(getClass().getResource("Denver3.jpg")));
		Ciudad Dallas = new Ciudad("Dallas",new LatLng(32.7766642, -96.79698789999998), new ImageIcon(getClass().getResource("Dallas1.jpg")), new ImageIcon(getClass().getResource("Dallas2.jpg")), new ImageIcon(getClass().getResource("Dallas3.jpg")));
		Ciudad NewOrleands = new Ciudad("New Orleands",new LatLng(29.95106579999999,-90.0715323), new ImageIcon(getClass().getResource("New-Orleands1.jpg")), new ImageIcon(getClass().getResource("New-Orleands2.jpg")), new ImageIcon(getClass().getResource("New-Orleands3.jpg")));
		Ciudad Baltimore = new Ciudad("Baltimore",new LatLng(39.2903848,-76.61218930000001), new ImageIcon(getClass().getResource("Baltimore1.jpg")), new ImageIcon(getClass().getResource("Baltimore2.jpg")), new ImageIcon(getClass().getResource("Baltimore3.jpg")));
		Ciudad Cincinnati = new Ciudad("Cincinnati",new LatLng(39.1031182,-84.51201960000003), new ImageIcon(getClass().getResource("Cincinnati1.jpg")), new ImageIcon(getClass().getResource("Cincinnati2.jpg")), new ImageIcon(getClass().getResource("Cincinnati3.jpg")));
		Ciudad Juneau = new Ciudad("Juneau",new LatLng(58.3019444, -134.4197221), new ImageIcon(getClass().getResource("Juneau1.jpg")), new ImageIcon(getClass().getResource("Juneau2.jpg")), new ImageIcon(getClass().getResource("Juneau3.jpg")));
		Ciudad Anchorage = new Ciudad("Anchorage",new LatLng(61.2180556,-149.90027780000003), new ImageIcon(getClass().getResource("Anchorage1.jpg")), new ImageIcon(getClass().getResource("Anchorage2.jpg")), new ImageIcon(getClass().getResource("Anchorage3.jpg")));
		Ciudad Memphis = new Ciudad("Memphis",new LatLng(35.1495343, -90.0489801), new ImageIcon(getClass().getResource("Memphis1.jpg")), new ImageIcon(getClass().getResource("Memphis2.jpg")), new ImageIcon(getClass().getResource("Memphis3.jpg")));
		Ciudad Richmond = new Ciudad("Richmond",new LatLng(37.5407246,-77.4360481), new ImageIcon(getClass().getResource("Richmond1.jpg")), new ImageIcon(getClass().getResource("Richmond2.jpg")), new ImageIcon(getClass().getResource("Richmond3.jpg")));
		Ciudad Columbus = new Ciudad("Columbus",new LatLng(39.9611755,-82.99879420000002), new ImageIcon(getClass().getResource("Columbus1.jpg")), new ImageIcon(getClass().getResource("Columbus2.jpg")), new ImageIcon(getClass().getResource("Columbus3.jpg")));
		Ciudad Salem = new Ciudad("Salem",new LatLng(42.51954,-70.89671550000003), new ImageIcon(getClass().getResource("Salem1.jpg")), new ImageIcon(getClass().getResource("Salem2.jpg")), new ImageIcon(getClass().getResource("Salem3.jpg")));
		Ciudad JeffersonCity = new Ciudad("Jefferson City",new LatLng(38.57670170000001, -92.17351639999998), new ImageIcon(getClass().getResource("Jefferson-City1.jpg")), new ImageIcon(getClass().getResource("Jefferson-City2.jpg")), new ImageIcon(getClass().getResource("Jefferson-City3.jpg")));
		Ciudad KansasCity =  new Ciudad("Kansas City",new LatLng(39.114053,-94.6274636), new ImageIcon(getClass().getResource("Kansas-City1.jpg")), new ImageIcon(getClass().getResource("Kansas-City2.jpg")), new ImageIcon(getClass().getResource("Kansas-City3.jpg")));
		Ciudad Indianapolis = new Ciudad("Indianapolis",new LatLng(39.768403,-86.15806800000001), new ImageIcon(getClass().getResource("Indianapolis1.jpg")), new ImageIcon(getClass().getResource("Indianapolis2.jpg")), new ImageIcon(getClass().getResource("Indianapolis3.jpg")));
		Ciudad Milwaukee = new Ciudad("Milwaukee",new LatLng(43.0389025,-87.90647360000003), new ImageIcon(getClass().getResource("Milwaukee1.jpg")), new ImageIcon(getClass().getResource("Milwaukee2-copy-1.jpg")), new ImageIcon(getClass().getResource("Milwaukee3.jpg")));
		Ciudad Minneapolis = new Ciudad("Minneapolis",new LatLng(44.977753,-93.26501080000003), new ImageIcon(getClass().getResource("Minneapolis1.jpg")), new ImageIcon(getClass().getResource("Minneapolis2.jpg")), new ImageIcon(getClass().getResource("Minneapolis3.jpg")));
		Ciudad LittleRock = new Ciudad("Little Rock",new LatLng(34.7464809,-92.28959479999997), new ImageIcon(getClass().getResource("Little-Rock1.jpg")), new ImageIcon(getClass().getResource("Little-Rock2.jpg")), new ImageIcon(getClass().getResource("Little-Rock3.jpg")));
		Ciudad Detroit = new Ciudad("Detroit",new LatLng(42.331427, -83.0457538), new ImageIcon(getClass().getResource("Detroit1.jpg")), new ImageIcon(getClass().getResource("Detroit2.jpg")), new ImageIcon(getClass().getResource("Detroit3.jpg")));
		Ciudad Lincoln = new Ciudad("Lincoln",new LatLng(40.8257625, -96.6851982), new ImageIcon(getClass().getResource("Lincoln1.jpg")), new ImageIcon(getClass().getResource("Lincoln2.jpg")), new ImageIcon(getClass().getResource("Lincoln3.jpg")));
		Ciudad Omaha = new Ciudad("Omaha",new LatLng(41.2523634,-95.99798829999997), new ImageIcon(getClass().getResource("Omaha1.jpg")), new ImageIcon(getClass().getResource("Omaha2.jpg")), new ImageIcon(getClass().getResource("Omaha3.jpg")));
		Ciudad Cheyenne = new Ciudad("Cheyenne",new LatLng(41.1399814,-104.82024619999999), new ImageIcon(getClass().getResource("Cheyenne1.jpg")), new ImageIcon(getClass().getResource("Cheyenne2.jpg")), new ImageIcon(getClass().getResource("Cheyenne3.jpg")));
		Ciudad Pittsburgh = new Ciudad("Pittsburgh",new LatLng(40.44062479999999,-79.99588640000002), new ImageIcon(getClass().getResource("Pittsburgh1.jpg")), new ImageIcon(getClass().getResource("Pittsburgh2.jpg")), new ImageIcon(getClass().getResource("Pittsburgh3.jpg")));
		Ciudad SaintLouis = new Ciudad("Saint Louis",new LatLng(38.6270025,-90.1994042), new ImageIcon(getClass().getResource("Saint-Louis1.jpg")), new ImageIcon(getClass().getResource("Saint-Louis2.jpg")), new ImageIcon(getClass().getResource("Saint-Louis3.jpg")));
		Ciudad Cleveland = new Ciudad("Cleveland",new LatLng(41.49932, -81.69436050000002), new ImageIcon(getClass().getResource("Cleveland1.jpg")), new ImageIcon(getClass().getResource("Cleveland2.jpg")), new ImageIcon(getClass().getResource("Cleveland3.jpg")));
		Ciudad Boston = new Ciudad("Boston",new LatLng(42.3600825, -71.05888010000001), new ImageIcon(getClass().getResource("Boston1.jpg")), new ImageIcon(getClass().getResource("Boston2.jpg")), new ImageIcon(getClass().getResource("Boston3.jpg")));
		Ciudad Hartford = new Ciudad("Hartford",new LatLng(41.76371109999999, -72.68509319999998), new ImageIcon(getClass().getResource("Hartford1.jpg")), new ImageIcon(getClass().getResource("Hartford2.jpg")), new ImageIcon(getClass().getResource("Hartford3.jpg")));
		Ciudad Bridgeport = new Ciudad("Bridgeport",new LatLng(41.1865478,-73.19517669999999), new ImageIcon(getClass().getResource("Bridgeport1.jpg")), new ImageIcon(getClass().getResource("Bridgeport2.jpg")), new ImageIcon(getClass().getResource("Bridgeport3.jpg")));
		Ciudad Annapolis = new Ciudad("Annapolis",new LatLng(38.9784453,-76.49218289999999), new ImageIcon(getClass().getResource("Annapolis1.jpg")), new ImageIcon(getClass().getResource("Annapolis2.jpg")), new ImageIcon(getClass().getResource("Annapolis3.jpg")));
		Ciudad BatonRouge = new Ciudad("Baton Rouge",new LatLng(30.4582829,-91.1403196), new ImageIcon(getClass().getResource("Baton-Rouge1.jpg")), new ImageIcon(getClass().getResource("Baton-Rouge2.jpg")), new ImageIcon(getClass().getResource("Baton-Rouge3.jpg")));
		Ciudad Philadelphia = new Ciudad("Philadelphia",new LatLng(39.9525839,-75.16522150000003), new ImageIcon(getClass().getResource("Philadelphia1.jpg")), new ImageIcon(getClass().getResource("Philadelphia2.jpg")), new ImageIcon(getClass().getResource("Philadelphia3.jpg")));
		Ciudad Montpelier = new Ciudad("Montpellier",new LatLng(44.26005929999999, -72.57538690000001), new ImageIcon(getClass().getResource("Montpelier1.jpg")), new ImageIcon(getClass().getResource("Montpelier2.jpg")), new ImageIcon(getClass().getResource("Montpelier3.jpg")));
		Ciudad Burlington = new Ciudad("Burlington",new LatLng(44.4758825,-73.21207199999998), new ImageIcon(getClass().getResource("Burlington1.jpg")), new ImageIcon(getClass().getResource("Burlington2.jpg")), new ImageIcon(getClass().getResource("Burlington3.jpg")));
		Ciudad Jackson = new Ciudad("Jackson",new LatLng(32.2987573,-90.18481029999998), new ImageIcon(getClass().getResource("Jackson1.jpg")), new ImageIcon(getClass().getResource("Jackson2.jpg")), new ImageIcon(getClass().getResource("Jackson3.jpg")));
		Ciudad Dover = new Ciudad("Dover",new LatLng(39.158168,-75.52436820000003), new ImageIcon(getClass().getResource("Dover1.jpg")), new ImageIcon(getClass().getResource("Dover2.jpg")), new ImageIcon(getClass().getResource("Dover3.jpg")));
		Ciudad Wilmington = new Ciudad("Wilmington",new LatLng(39.7390721,-75.5397878), new ImageIcon(getClass().getResource("Wilmington1.jpg")), new ImageIcon(getClass().getResource("Wilmington2.jpg")), new ImageIcon(getClass().getResource("Wilmington3.jpg")));
		Ciudad Orlando = new Ciudad("Orlando",new LatLng(28.5383355, -81.37923649999999), new ImageIcon(getClass().getResource("Orlando1.jpg")), new ImageIcon(getClass().getResource("Orlando2.jpg")), new ImageIcon(getClass().getResource("Orlando3.jpg")));
		Ciudad Boise = new Ciudad("Boise",new LatLng(43.6187102,-116.21460680000001), new ImageIcon(getClass().getResource("Boise1.jpg")), new ImageIcon(getClass().getResource("Boise2.jpg")), new ImageIcon(getClass().getResource("Boise3.jpg")));
		Ciudad CarsonCity = new Ciudad("Carson City",new LatLng(39.1637984,-119.76740340000003), new ImageIcon(getClass().getResource("Carson-City1.jpg")), new ImageIcon(getClass().getResource("Carson-City2.jpg")), new ImageIcon(getClass().getResource("Carson-City3.jpg")));
		Ciudad Charlotte = new Ciudad("Charlotte",new LatLng(35.2270869,-80.84312669999997), new ImageIcon(getClass().getResource("Charlotte1.jpg")), new ImageIcon(getClass().getResource("Charlotte2.jpg")), new ImageIcon(getClass().getResource("Charlotte3.jpg")));
		Ciudad CiudadMexico = new Ciudad("Ciudad de Mexico",new LatLng(19.4326077,-99.13320799999997), new ImageIcon(getClass().getResource("Ciudad-de-Mexico1.jpg")), new ImageIcon(getClass().getResource("Ciudad-de-Mexico2.jpg")), new ImageIcon(getClass().getResource("Ciudad-de-Mexico3.jpg")));
		Ciudad PachicadeSoto = new Ciudad("Pachuca de Soto",new LatLng(20.1010608,-98.75913109999999), new ImageIcon(getClass().getResource("Pachica-de-Soto1.jpg")), new ImageIcon(getClass().getResource("Pachica-de-Soto2.jpg")), new ImageIcon(getClass().getResource("Pachica-de-Soto3.jpg")));
		Ciudad TuxtlaGutierrez = new Ciudad("Tuxtla Gutierrez",new LatLng(16.7516009,-93.1029939), new ImageIcon(getClass().getResource("Tuxtla-Gutierrez1.jpg")), new ImageIcon(getClass().getResource("Tuxtla-Gutierrez2.jpg")), new ImageIcon(getClass().getResource("Tuxtla-Gutierrez3.jpg")));
		Ciudad Durango = new Ciudad("Durango",new LatLng(24.0277202,-104.65317590000001), new ImageIcon(getClass().getResource("Durango1.jpg")), new ImageIcon(getClass().getResource("Durango2.jpg")), new ImageIcon(getClass().getResource("Durango3.jpg")));
		Ciudad Leon = new Ciudad("Leon",new LatLng(21.1250077,-101.68596049999996), new ImageIcon(getClass().getResource("Leon1.jpg")), new ImageIcon(getClass().getResource("Leon2.jpg")), new ImageIcon(getClass().getResource("Leon3.jpg")));
		Ciudad CiudadVictoria = new Ciudad("Ciudad Victoria",new LatLng(23.7369164,-99.14111539999999), new ImageIcon(getClass().getResource("Ciudad-Victoria1.jpg")), new ImageIcon(getClass().getResource("Ciudad-Victoria2.jpg")), new ImageIcon(getClass().getResource("Ciudad-Victoria3.jpg")));
		Ciudad Monterrey = new Ciudad("Monterrey",new LatLng(25.6866142,-100.3161126), new ImageIcon(getClass().getResource("Monterrey1.jpg")), new ImageIcon(getClass().getResource("Monterrey2.jpg")), new ImageIcon(getClass().getResource("Monterrey3.jpg")));
		Ciudad Pachuca = new Ciudad("Pachuca",new LatLng(20.1010608,-98.75913109999999), new ImageIcon(getClass().getResource("Pachuca1.jpg")), new ImageIcon(getClass().getResource("Pachuca2.jpg")), new ImageIcon(getClass().getResource("Pachuca3.jpg")));
		Ciudad CiudadJuarez = new Ciudad("Ciudad Juarez",new LatLng(31.6903638,-106.42454780000003), new ImageIcon(getClass().getResource("Ciudad-Juarez1.jpg")), new ImageIcon(getClass().getResource("Ciudad-Juarez2.jpg")), new ImageIcon(getClass().getResource("Ciudad-Juarez3.jpg")));
		Ciudad SantiagoQueretaro = new Ciudad("Santiago de Queretaro",new LatLng(20.5887932,-100.38988810000001), new ImageIcon(getClass().getResource("Santiago-de-Queretaro1.jpg")), new ImageIcon(getClass().getResource("Santiago-de-Queretaro2.jpg")), new ImageIcon(getClass().getResource("Santiago-de-Queretaro3.jpg")));
		Ciudad Zacatecas = new Ciudad("Zacatecas",new LatLng(22.7708555,-102.5832426), new ImageIcon(getClass().getResource("Zacatecas1.jpg")), new ImageIcon(getClass().getResource("Zacatecas2.jpg")), new ImageIcon(getClass().getResource("Zacatecas3.jpg")));
		Ciudad AguasCalientes = new Ciudad("AguasCalientes",new LatLng(21.8852562,-102.29156769999997), new ImageIcon(getClass().getResource("AguasCalientes1.jpg")), new ImageIcon(getClass().getResource("AguasCalientes2.jpg")), new ImageIcon(getClass().getResource("AguasCalientes3.jpg")));
		Ciudad SanLuisPotosi = new Ciudad("San Luis Potosi",new LatLng(22.1565651,-100.9854628), new ImageIcon(getClass().getResource("San-Luis-Potosi1.jpg")), new ImageIcon(getClass().getResource("San-Luis-Potosi2.jpg")), new ImageIcon(getClass().getResource("San-Luis-Potosi3.jpg")));



		tabla.put(1, Ottawa); 
		tabla.put(2, Edmonton);	
		tabla.put(3, Hamilton); 
		tabla.put(4, Winnipeg); 
		tabla.put(5, Kitchener); 
		tabla.put(6, London); 			
		tabla.put(7, Victoria); 
		tabla.put(8, StCatharines); 
		tabla.put(9, Oshawa); 

		tabla.put(10, Windsor);	
		tabla.put(11, Halifax); 
		tabla.put(12, Saskatoon); 
		tabla.put(13, Barrie); 
		tabla.put(14, Regina); 
		tabla.put(15, SanJuan);
		tabla.put(16, Montreal);
		tabla.put(17, Toronto); 
		tabla.put(18, Vancouver); 		
		tabla.put(19, Calgary);	
		
		tabla.put(20, Brantford); 
		tabla.put(21, Milton);  
		tabla.put(22, Waterloo);  
		tabla.put(23, Maple);  
		tabla.put(24, NorthYork);  
		tabla.put(25, Washington);  
		tabla.put(26, LosAngeles);  
		tabla.put(27, Houston);  
		tabla.put(28, Chicago);  
		tabla.put(29, NuevaYork);  

		tabla.put(30, LasVegas);  
		tabla.put(31, SanFrancisco);  
		tabla.put(32, SanDiego);  
		tabla.put(33, Honolulu);  
		tabla.put(34, Seattle);  
		tabla.put(35, Tampa);  
		tabla.put(36, Miami);  
		tabla.put(37, Portland);  
		tabla.put(38, Oakland);  
		tabla.put(39, SaltLakeCity);  

		tabla.put(40, Phoenix);  
		tabla.put(41, Oklahoma);  
		tabla.put(42, Montgomery);  
		tabla.put(43, Birmingham);  
		tabla.put(44, Denver);  
		tabla.put(45, Dallas);  
		tabla.put(46, NewOrleands);  
		tabla.put(47, Baltimore);  
		tabla.put(48, Cincinnati);  
		tabla.put(49, Juneau);  

		tabla.put(50, Anchorage);  
		tabla.put(51, Memphis);  
		tabla.put(52, Richmond);  
		tabla.put(53, Columbus);  
		tabla.put(54, Salem);  
		tabla.put(55, JeffersonCity);  
		tabla.put(56, KansasCity);  
		tabla.put(57, Indianapolis);  
		tabla.put(58, Milwaukee);  
		tabla.put(59, Minneapolis);  

		tabla.put(60, LittleRock);  
		tabla.put(61, Detroit);  
		tabla.put(62, Lincoln);  
		tabla.put(63, Omaha);  
		tabla.put(64, Cheyenne);  
		tabla.put(65, Pittsburgh);  
		tabla.put(66, SaintLouis);  
		tabla.put(67, Cleveland);  
		tabla.put(68, Boston);  
		tabla.put(69, Hartford);  

		tabla.put(70, Bridgeport);  
		tabla.put(71, Annapolis);  
		tabla.put(72, BatonRouge);  
		tabla.put(73, Philadelphia);  
		tabla.put(74, Montpelier);  
		tabla.put(75, Burlington);  
		tabla.put(76, Jackson);  
		tabla.put(77, Dover);  
		tabla.put(78, Wilmington);  
		tabla.put(79, Orlando);  

		tabla.put(80, Boise);  
		tabla.put(81, CarsonCity);  
		tabla.put(82, Charlotte);  
		tabla.put(83, CiudadMexico);  
		tabla.put(84, PachicadeSoto);  
		tabla.put(85, TuxtlaGutierrez);  
		tabla.put(86, Durango);  
		tabla.put(87, Leon);  
		tabla.put(88, CiudadVictoria);  
		tabla.put(89, Monterrey);  

		tabla.put(90, Pachuca);  
		tabla.put(91, CiudadJuarez);  
		tabla.put(92, SantiagoQueretaro);  
		tabla.put(93, Zacatecas);  
		tabla.put(94, AguasCalientes);  
		tabla.put(95, SanLuisPotosi);  

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

		int multiplicador = 95;
		HashMap<Integer, Ciudad> ciudades = Mapa.norte.getTabla();

		double num = Math.random()*multiplicador;
		int n = (int)num;

		return ciudades.get(n);

	}



}
