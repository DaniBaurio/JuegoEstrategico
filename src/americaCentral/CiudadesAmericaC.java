package americaCentral;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesAmericaC {

	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();

	/**
	 * Construccion de las ciudades en las que se podra jugar en el continente america central
	 * E inserccion en un HashMap para su uso posterior
	 */

	public CiudadesAmericaC(){

		tabla = new HashMap<Integer, Ciudad>();

		Ciudad BigFalls = new Ciudad("Big Falls", new LatLng(16.2640141,-88.88628089999997), new ImageIcon(getClass().getResource("BigFalls1.jpg")), new ImageIcon(getClass().getResource("BigFalls3.jpg")), new ImageIcon(getClass().getResource("BigFalls2.jpg")));
		Ciudad SanJose = new Ciudad("SanJose",new LatLng(9.9280694, -84.09072459999999), new ImageIcon(getClass().getResource("SanJose1.jpg")), new ImageIcon(getClass().getResource("SanJose2.jpg")), new ImageIcon(getClass().getResource("SanJose3.jpg")));
		Ciudad Cartago = new Ciudad("Cartago",new LatLng(9.8638091, -83.91619349999996), new ImageIcon(getClass().getResource("Cartago1.jpg")), new ImageIcon(getClass().getResource("Cartago2.jpg")), new ImageIcon(getClass().getResource("Cartago3.jpg")));
		Ciudad Liberia = new Ciudad("Liberia", new LatLng(10.6345964, -85.44067469999999), new ImageIcon(getClass().getResource("Liberia1.jpg")), new ImageIcon(getClass().getResource("Liberia2.jpg")), new ImageIcon(getClass().getResource("Liberia3.jpg")));
		Ciudad Quesada = new Ciudad("Quesada",new LatLng(10.3270781, -84.43567059999998), new ImageIcon(getClass().getResource("Quesada1.jpg")), new ImageIcon(getClass().getResource("Quesada2.jpg")), new ImageIcon(getClass().getResource("Quesada3.jpg")));
		Ciudad Heredia = new Ciudad("Heredia",new LatLng(9.9981413,-84.11976429999999), new ImageIcon(getClass().getResource("Heredia1.jpg")), new ImageIcon(getClass().getResource("Heredia2.jpg")), new ImageIcon(getClass().getResource("Heredia3.jpg")));
		Ciudad LaHabana = new Ciudad("La Habana",new LatLng(23.1135925, -82.36659559999998) , new ImageIcon(getClass().getResource("LaHabana1.jpg")), new ImageIcon(getClass().getResource("LaHabana2.jpg")), new ImageIcon(getClass().getResource("LaHabana3.jpg")));
		Ciudad Santiagodecuba = new Ciudad("Santiago de cuba",new LatLng(20.01693, -75.83015369999998), new ImageIcon(getClass().getResource("SantiagodeCuba1.jpg")), new ImageIcon(getClass().getResource("SantiagodeCuba2.jpg")), new ImageIcon(getClass().getResource("SantiagodeCuba3.jpg")));
		Ciudad Cienfuegos = new Ciudad("Cienfuegos",new LatLng(22.1599753, -80.44377810000003), new ImageIcon(getClass().getResource("Cienfuegos1.jpg")), new ImageIcon(getClass().getResource("Cienfuegos2.jpg")), new ImageIcon(getClass().getResource("Cienfuegos3.jpg")));
		Ciudad Trinidad = new Ciudad("Trinidad",new LatLng(21.7960343,-79.98081430000002), new ImageIcon(getClass().getResource("Trinidad1.jpg")), new ImageIcon(getClass().getResource("Trinidad2.jpg")), new ImageIcon(getClass().getResource("Trinidad3.jpg")));
		Ciudad Roseau = new Ciudad("Roseau",new LatLng(15.3091676, -61.37935540000001), new ImageIcon(getClass().getResource("Roseau1.jpg")), new ImageIcon(getClass().getResource("Roseau2.jpg")), new ImageIcon(getClass().getResource("Roseau3.jpg")));
		Ciudad Portsmouth = new Ciudad("Portsmouth",new LatLng(15.5561791, -61.458140000000014), new ImageIcon(getClass().getResource("Portsmouth1.jpg")), new ImageIcon(getClass().getResource("Portsmouth2.jpg")), new ImageIcon(getClass().getResource("Portsmouth3.jpg")));
		Ciudad CastleBruce = new Ciudad("Castle Bruce",new LatLng(15.4418966, -61.25833520000003), new ImageIcon(getClass().getResource("CastleBurce1.jpg")), new ImageIcon(getClass().getResource("CastleBurce2.jpg")), new ImageIcon(getClass().getResource("CastleBurce3.jpg")));
		Ciudad Marigot = new Ciudad("Marigot",new LatLng(15.5368142, -61.28311500000001), new ImageIcon(getClass().getResource("Marigot1.jpg")), new ImageIcon(getClass().getResource("Marigot2.jpg")), new ImageIcon(getClass().getResource("Marigot3.jpg")));
		Ciudad GrandBay = new Ciudad("Grand Bay",new LatLng(15.2450638,-61.31810489999998), new ImageIcon(getClass().getResource("GrandBay1.jpg")), new ImageIcon(getClass().getResource("GrandBay2.jpg")), new ImageIcon(getClass().getResource("GrandBay3.jpg")));
		Ciudad SanSalvador = new Ciudad("San Salvador",new LatLng(13.6929403,-89.21819110000001), new ImageIcon(getClass().getResource("Sansalvador1.jpg")), new ImageIcon(getClass().getResource("Sansalvador2.jpg")), new ImageIcon(getClass().getResource("Sansalvador3.jpg")));
		Ciudad SantaTecla = new Ciudad("Santa Tecla",new LatLng(13.6757837,-89.2894733), new ImageIcon(getClass().getResource("Santatecla1.jpg")), new ImageIcon(getClass().getResource("Santatecla2.jpeg")), new ImageIcon(getClass().getResource("Santatecla3.jpg")));
		Ciudad SantaAna = new Ciudad("Santa Ana",new LatLng(13.9778279, -89.5639119), new ImageIcon(getClass().getResource("Santaana1.jpeg")), new ImageIcon(getClass().getResource("Santaana2.jpeg")), new ImageIcon(getClass().getResource("Santaana3.jpg")));
		Ciudad SaintJohn = new Ciudad("Saint John",new LatLng(17.1274104, -61.84677199999999), new ImageIcon(getClass().getResource("SaintJohn1.jpg")), new ImageIcon(getClass().getResource("SaintJohn2.jpg")), new ImageIcon(getClass().getResource("SaintJohn3.jpg")));
		Ciudad Codrington = new Ciudad("Codrington",new LatLng(17.6425736, -61.82044559999997), new ImageIcon(getClass().getResource("Codrington1.jpg")), new ImageIcon(getClass().getResource("Codrington2.jpg")), new ImageIcon(getClass().getResource("Codrington3.jpg")));
		Ciudad AllSaints = new Ciudad("All Saints",new LatLng(17.0626404, -61.791198699999995), new ImageIcon(getClass().getResource("Allsaints1.jpg")), new ImageIcon(getClass().getResource("Allsaints2.jpeg")), new ImageIcon(getClass().getResource("Allsaints3.jpg")));
		Ciudad OldRoad = new Ciudad("Old Road",new LatLng(17.0184029,-61.8453093), new ImageIcon(getClass().getResource("Oldroad1.jpg")), new ImageIcon(getClass().getResource("Oldroad2.jpg")), new ImageIcon(getClass().getResource("Oldroad3.jpg")));
		Ciudad Nasau = new Ciudad("Nasau",new LatLng(25.0479835, -77.355413), new ImageIcon(getClass().getResource("Nasau1.jpg")), new ImageIcon(getClass().getResource("Nasau2.jpg")), new ImageIcon(getClass().getResource("Nasau3.jpg")));
		Ciudad Freeport = new Ciudad("Freeport",new LatLng(26.5416093, -78.64554750000002), new ImageIcon(getClass().getResource("Freeport1.jpg")), new ImageIcon(getClass().getResource("Freeport2.jpg")), new ImageIcon(getClass().getResource("Freeport3.jpg")));
		Ciudad MarshHarbour = new Ciudad("Marsh Harbour",new LatLng(26.5241653, -77.09098089999998), new ImageIcon(getClass().getResource("MarshHarbour1.jpg")), new ImageIcon(getClass().getResource("MarshHarbour2.jpg")), new ImageIcon(getClass().getResource("MarshHarbour3.jpg")));
		Ciudad CoopersTown = new Ciudad("Coopers Town",new LatLng(26.8644215,-77.50604379999999), new ImageIcon(getClass().getResource("Cooperstown1.jpg")), new ImageIcon(getClass().getResource("Cooperstown2.jpg")), new ImageIcon(getClass().getResource("Cooperstown3.jpg")));
		Ciudad Bridgetown = new Ciudad("Bridgetown",new LatLng(13.0968511, -59.61448189999999), new ImageIcon(getClass().getResource("Bridgetown1.jpg")), new ImageIcon(getClass().getResource("Bridgetown2.jpg")), new ImageIcon(getClass().getResource("Bridgetown3.jpg")));
		Ciudad Holetown = new Ciudad("Holetown",new LatLng(13.1866602, -59.63050800000002), new ImageIcon(getClass().getResource("Holetown1.jpg")), new ImageIcon(getClass().getResource("Holetown2.jpg")), new ImageIcon(getClass().getResource("Holetown3.jpg")));
		Ciudad Speightstown = new Ciudad("Speightstown",new LatLng(13.253123, -59.637713399999996), new ImageIcon(getClass().getResource("Speightstown1.jpg")), new ImageIcon(getClass().getResource("Speightstown2.png")), new ImageIcon(getClass().getResource("Speightstown3.jpg")));
		Ciudad Oistins = new Ciudad("Oistins",new LatLng(13.0705904,-59.546954400000004), new ImageIcon(getClass().getResource("Ooistins1.jpg")), new ImageIcon(getClass().getResource("Oistins2.jpg")), new ImageIcon(getClass().getResource("Oistins3.jpg")));
		Ciudad Belmopan = new Ciudad("Belmopan",new LatLng(17.2510114,-88.75902009999999), new ImageIcon(getClass().getResource("Belmopan1.jpg")), new ImageIcon(getClass().getResource("Belmopan2.jpg")), new ImageIcon(getClass().getResource("Belmopan3.jpg")));
		Ciudad Dangriga = new Ciudad("Dangriga",new LatLng(16.969561, -88.231513), new ImageIcon(getClass().getResource("Dangriga1.jpg")), new ImageIcon(getClass().getResource("Dangriga2.jpg")), new ImageIcon(getClass().getResource("Dangriga3.jpeg")));
		Ciudad PuntaGorda = new Ciudad("Punta Gorda",new LatLng(16.098935, -88.8094906), new ImageIcon(getClass().getResource("PuntaGorda1.jpg")), new ImageIcon(getClass().getResource("PuntaGorda2.jpg")), new ImageIcon(getClass().getResource("PuntaGorda3.jpg")));
		Ciudad SanPedro = new Ciudad("San Pedro",new LatLng(17.9213664, -87.96109050000001), new ImageIcon(getClass().getResource("SanPedro1.jpg")), new ImageIcon(getClass().getResource("SanPedro2.jpg")), new ImageIcon(getClass().getResource("SanPedro3.jpg")));
		Ciudad SanMiguel = new Ciudad("San Miguel",new LatLng(13.4792922, -88.17791820000002), new ImageIcon(getClass().getResource("Sanmiguel1.jpg")), new ImageIcon(getClass().getResource("Sanmiguel2.jpg")), new ImageIcon(getClass().getResource("Sanmiguel3.jpg")));
		Ciudad Soyapango = new Ciudad("Soyapango",new LatLng(13.710045,-89.13725269999998), new ImageIcon(getClass().getResource("Soyapango1.jpg")), new ImageIcon(getClass().getResource("Soyapango2.jpg")), new ImageIcon(getClass().getResource("Soyapango3.jpg")));
		Ciudad SaintGeorge = new Ciudad("Saint George",new LatLng(12.0560975,-61.748799599999984), new ImageIcon(getClass().getResource("SaintGeorge1.jpg")), new ImageIcon(getClass().getResource("SaintGeorge2.jpg")), new ImageIcon(getClass().getResource("SaintGeorge3.jpeg")));
		Ciudad Guatemala = new Ciudad("Guatemala",new LatLng(14.6349149,-90.5068824), new ImageIcon(getClass().getResource("Guatemala1.jpg")), new ImageIcon(getClass().getResource("Guatemala2.jpg")), new ImageIcon(getClass().getResource("Guatemala3.jpeg")));
		Ciudad Culapa = new Ciudad("Culapa",new LatLng(14.2772042,-90.29722900000002), new ImageIcon(getClass().getResource("Culapa1.jpg")), new ImageIcon(getClass().getResource("Culapa2.jpeg")), new ImageIcon(getClass().getResource("Culapa3.jpg")));
		Ciudad Jalapa = new Ciudad("Jalapa",new LatLng(14.639109356399631,-89.99500622972846), new ImageIcon(getClass().getResource("Jalapa1.jpg")), new ImageIcon(getClass().getResource("Jalapa2.jpg")), new ImageIcon(getClass().getResource("Jalapa3.jpg")));
		Ciudad PuertoPrincipe = new Ciudad("Puerto Principe",new LatLng(18.594395,-72.30743259999997), new ImageIcon(getClass().getResource("Puertoprincipe1.jpg")), new ImageIcon(getClass().getResource("Puertoprincipe2.jpg")), new ImageIcon(getClass().getResource("Puertoprincipe3.png")));
		Ciudad CaboHaitiano = new Ciudad("Cabo Haitiano",new LatLng(19.7370362,-72.20676809999998), new ImageIcon(getClass().getResource("Cabohaitiano1.jpg")), new ImageIcon(getClass().getResource("Cabohaitiano2.jpg")), new ImageIcon(getClass().getResource("Cabohaitiano2.jpg")));
		Ciudad LosCayos = new Ciudad("Los Cayos",new LatLng(18.2042851,-73.7536695), new ImageIcon(getClass().getResource("Loscayos1.jpeg")), new ImageIcon(getClass().getResource("Loscayos2.jpg")), new ImageIcon(getClass().getResource("Loscayos3.jpg")));
		Ciudad Tegucigalpa = new Ciudad("Tegucigalpa",new LatLng(14.0722751,-87.192136), new ImageIcon(getClass().getResource("Tegucigalpa1.jpg")), new ImageIcon(getClass().getResource("Tegucigalpa2.jpg")), new ImageIcon(getClass().getResource("Tegucigalpa3.jpeg")));
		Ciudad LaCeiba = new Ciudad("La Ceiba",new LatLng(15.77711530213023,-86.78899582475424), new ImageIcon(getClass().getResource("Laceiba1.jpeg")), new ImageIcon(getClass().getResource("Laceiba2.jpg")), new ImageIcon(getClass().getResource("Laceiba3.jpg")));
		Ciudad SanPedroSula = new Ciudad("San Pedro Sula",new LatLng(15.501040088847503, -88.01472058519721), new ImageIcon(getClass().getResource("Sanpedrosula1.jpg")), new ImageIcon(getClass().getResource("Sanpedrosula2.jpg")), new ImageIcon(getClass().getResource("Sanpedrosula3.jpg")));
		Ciudad Kingston = new Ciudad("Kingston",new LatLng(18.0178743,-76.80990409999998), new ImageIcon(getClass().getResource("Kingston1.jpeg")), new ImageIcon(getClass().getResource("Kingston2.jpg")), new ImageIcon(getClass().getResource("Kingston3.jpeg")));
		Ciudad Managua = new Ciudad("Managua",new LatLng(12.1149926,-86.23617439999998), new ImageIcon(getClass().getResource("Managua1.jpg")), new ImageIcon(getClass().getResource("Managua2.jpeg")), new ImageIcon(getClass().getResource("Managua3.jpg")));
		Ciudad Granada = new Ciudad("Granada",new LatLng(11.9344073, -85.95600050000002), new ImageIcon(getClass().getResource("Granada1.jpg")), new ImageIcon(getClass().getResource("Granada2.jpg")), new ImageIcon(getClass().getResource("Granada3.jpg")));
		Ciudad Leon = new Ciudad("Leon",new LatLng(12.4315534, -86.8722146), new ImageIcon(getClass().getResource("Leon1.jpg")), new ImageIcon(getClass().getResource("Leon2.jpg")), new ImageIcon(getClass().getResource("Leon3.jpg")));
		Ciudad Matagalpa = new Ciudad("Matagalpa",new LatLng(12.9290069, -85.91512109999996), new ImageIcon(getClass().getResource("Matagalpa1.jpg")), new ImageIcon(getClass().getResource("Matagalpa2.jpg")), new ImageIcon(getClass().getResource("Matagalpa3.jpg")));
		Ciudad Panama = new Ciudad("Panama",new LatLng(8.9823792,	-79.51986959999999), new ImageIcon(getClass().getResource("Panama1.jpg")), new ImageIcon(getClass().getResource("Panama2.jpeg")), new ImageIcon(getClass().getResource("Panama3.jpg")));
		Ciudad David = new Ciudad("David",new LatLng(8.412015569166929, -82.43553854059428), new ImageIcon(getClass().getResource("David1.jpg")), new ImageIcon(getClass().getResource("David2.jpg")), new ImageIcon(getClass().getResource("David3.jpg")));
		Ciudad Pocri =  new Ciudad("Pocri",new LatLng(8.2573425,-80.56051109999999), new ImageIcon(getClass().getResource("Pocri1.jpg")), new ImageIcon(getClass().getResource("Pocri2.jpg")), new ImageIcon(getClass().getResource("Pocri3.jpg")));
		Ciudad SantoDomingo = new Ciudad("Santo Domingo",new LatLng(18.4860575, -69.9312117), new ImageIcon(getClass().getResource("Santodomingo1.jpg")), new ImageIcon(getClass().getResource("Santodomingo2.jpg")), new ImageIcon(getClass().getResource("Santodomingo3.jpg")));
		Ciudad Laromana = new Ciudad("La romana",new LatLng(18.4338645, -68.96588170000001), new ImageIcon(getClass().getResource("Laromana1.jpg")), new ImageIcon(getClass().getResource("Laromana2.jpg")), new ImageIcon(getClass().getResource("Laromana3.jpg")));
		Ciudad PuntaCana = new Ciudad("Punta Cana",new LatLng(18.5820101,-68.4054729), new ImageIcon(getClass().getResource("Puntacana1.jpg")), new ImageIcon(getClass().getResource("Puntacana2.jpg")), new ImageIcon(getClass().getResource("Puntacana3.jpg")));
		Ciudad Basseterre = new Ciudad("Basseterre",new LatLng(17.3026058,-62.71769240000003), new ImageIcon(getClass().getResource("Baseterre1.jpg")), new ImageIcon(getClass().getResource("Baseterre2.jpeg")), new ImageIcon(getClass().getResource("Baseterre3.jpg")));
		Ciudad Kingstown = new Ciudad("Kingstown",new LatLng(13.1600249,-61.22481570000002), new ImageIcon(getClass().getResource("Kingstown1.jpg")), new ImageIcon(getClass().getResource("Kingstown2.jpg")), new ImageIcon(getClass().getResource("Kingstown3.jpg")));
		Ciudad Castries = new Ciudad("Castries",new LatLng(14.0101094,-60.98746870000002), new ImageIcon(getClass().getResource("Castries1.jpg")), new ImageIcon(getClass().getResource("Castries2.jpg")), new ImageIcon(getClass().getResource("Castries3.jpg")));
		Ciudad PuertoEspana = new Ciudad("Puerto España",new LatLng(10.6549013,-61.50192559999999), new ImageIcon(getClass().getResource("Puertoespana1.jpg")), new ImageIcon(getClass().getResource("Puertoespana2.png")), new ImageIcon(getClass().getResource("Puertoespana3.jpg")));

		tabla.put(1, BigFalls); 
		tabla.put(2, SanJose);	
		tabla.put(3, Cartago); 
		tabla.put(4, Liberia); 
		tabla.put(5, Quesada ); 
		tabla.put(6, Heredia); 			
		tabla.put(7, LaHabana); 
		tabla.put(8, Santiagodecuba); 
		tabla.put(9, Cienfuegos); 
		tabla.put(10, Trinidad);
		
		tabla.put(11, Roseau); 
		tabla.put(12, Portsmouth); 
		tabla.put(13, CastleBruce); 
		tabla.put(14, Marigot); 
		tabla.put(15, GrandBay);
		tabla.put(16, SanSalvador);
		tabla.put(17, SantaTecla); 
		tabla.put(18, SantaAna); 		
		tabla.put(19, SaintJohn);			
		tabla.put(20, Codrington);
		
		tabla.put(21, AllSaints);  
		tabla.put(22, OldRoad);  
		tabla.put(23, Nasau);  
		tabla.put(24, Freeport);  
		tabla.put(25, MarshHarbour);  
		tabla.put(26, CoopersTown);  
		tabla.put(27, Bridgetown);  
		tabla.put(28, Holetown);  
		tabla.put(29, Speightstown);  
		tabla.put(30, Oistins);
		
		tabla.put(31, Belmopan);  
		tabla.put(32, Dangriga);  
		tabla.put(33, PuntaGorda);  
		tabla.put(34, SanPedro);  
		tabla.put(35, SanMiguel);  
		tabla.put(36, Soyapango);  
		tabla.put(37, SaintGeorge);  
		tabla.put(38, Guatemala);  
		tabla.put(39, Culapa);  
		tabla.put(40, Jalapa); 
		
		tabla.put(41, PuertoPrincipe);  
		tabla.put(42, CaboHaitiano);  
		tabla.put(43, LosCayos);  
		tabla.put(44, Tegucigalpa);  
		tabla.put(45, LaCeiba);  
		tabla.put(46, SanPedroSula);  
		tabla.put(47, Kingston);  
		tabla.put(48, Managua);  
		tabla.put(49, Granada);  
		tabla.put(50, Leon);  
		
		tabla.put(51, Matagalpa);  
		tabla.put(52, Panama);  
		tabla.put(53, David);  
		tabla.put(54, Pocri);  
		tabla.put(55, SantoDomingo);  
		tabla.put(56, Laromana);  
		tabla.put(57, PuntaCana);  
		tabla.put(58, Basseterre);  
		tabla.put(59, Kingstown);  
		tabla.put(60, Castries);  
		
		tabla.put(61, PuertoEspana);  

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

		int multiplicador = 61;
		HashMap<Integer, Ciudad> ciudades = Mapa.central.getTabla();

		double num = Math.random()*multiplicador;
		int n = (int)num;

		return ciudades.get(n);

	}



}
