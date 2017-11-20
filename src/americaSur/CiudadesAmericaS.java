package americaSur;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesAmericaS {

	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();

	/**
	 * Construccion de las ciudades en las que se podra jugar en el continente america del sur
	 * E inserccion en un HashMap para su uso posterior
	 */


	public CiudadesAmericaS(){

		tabla = new HashMap<Integer, Ciudad>();

		Ciudad BuenosAires = new Ciudad("Buenos Aires", new LatLng(-34.6036844,-58.381559100000004),new ImageIcon(getClass().getResource("Buenosaires1.jpg")), new ImageIcon(getClass().getResource("Buenosaires2.jpg")), new ImageIcon(getClass().getResource("Buenosaires3.jpg")));
		Ciudad Rosario = new Ciudad("Rosario",new LatLng(-32.9442426,-60.65053879999999),new ImageIcon(getClass().getResource("Rosario1.jpg")), new ImageIcon(getClass().getResource("Rosario2.jpg")), new ImageIcon(getClass().getResource("Rosario3.jpg")));
		Ciudad Cordoba = new Ciudad("Cordoba",new LatLng(-31.42008329999999,-64.18877609999998),new ImageIcon(getClass().getResource("Cordoba1.jpg")), new ImageIcon(getClass().getResource("Cordoba2.jpg")), new ImageIcon(getClass().getResource("Cordoba3.jpg")));
		Ciudad SantaFe = new Ciudad("Santa Fe", new LatLng(-31.6106578,-60.697294),new ImageIcon(getClass().getResource("Santafe1.jpg")), new ImageIcon(getClass().getResource("Santafe2.jpeg")), new ImageIcon(getClass().getResource("Santafe3.jpg")));
		Ciudad SanJuan	 = new Ciudad("San Juan	",new LatLng(-31.5287127,-68.53604029999997),new ImageIcon(getClass().getResource("Sanjuan1.jpeg")), new ImageIcon(getClass().getResource("Sanjuan2.jpg")), new ImageIcon(getClass().getResource("Sanjuan3.jpg")));
		Ciudad Mendoza = new Ciudad("Mendoza",new LatLng(-32.8894587,-68.84583859999998),new ImageIcon(getClass().getResource("Mendoza1.jpg")), new ImageIcon(getClass().getResource("Mendoza2.jpg")), new ImageIcon(getClass().getResource("Mendoza3.jpg")));
		Ciudad SanRafael = new Ciudad("San Rafael",new LatLng(-34.6128922,-68.3390622) ,new ImageIcon(getClass().getResource("Sanrafael1.jpg")), new ImageIcon(getClass().getResource("Sanrafael2.jpg")), new ImageIcon(getClass().getResource("Sanrafael3.jpg")));
		Ciudad RioGallegos = new Ciudad("Rio Gallegos",new LatLng(-51.6230485,-69.21682909999998),new ImageIcon(getClass().getResource("Riogallegos1.jpg")), new ImageIcon(getClass().getResource("Riogallegos2.jpg")), new ImageIcon(getClass().getResource("Riogallegos3.jpg")));
		Ciudad Salta = new Ciudad("Salta",new LatLng(-24.7821269,-65.42319759999998),new ImageIcon(getClass().getResource("Salta1.jpg")), new ImageIcon(getClass().getResource("Salta2.jpg")), new ImageIcon(getClass().getResource("Salta3.jpg")));
		Ciudad MardePlata = new Ciudad("Mar de Plata",new LatLng(-38.0054771,-57.54261059999999),new ImageIcon(getClass().getResource("Mardelplata1.jpg")), new ImageIcon(getClass().getResource("Mardelplata2.jpg")), new ImageIcon(getClass().getResource("Mardelplata3.jpg")));
		Ciudad Brasilia = new Ciudad("Brasilia",new LatLng(-15.7942287,-47.882165799999996),new ImageIcon(getClass().getResource("Brasilia1.jpg")), new ImageIcon(getClass().getResource("Brasilia2.jpg")), new ImageIcon(getClass().getResource("Brasilia3.jpg")));
		Ciudad RiodeJaneiro = new Ciudad("Rio de Janeiro",new LatLng(-22.9068467,-43.17289649999998),new ImageIcon(getClass().getResource("Riodejaneiro1.jpg")), new ImageIcon(getClass().getResource("Riodejaneiro2.jpg")), new ImageIcon(getClass().getResource("Riodejaneiro3.jpg")));
		Ciudad Fortaleza = new Ciudad("Fortaleza",new LatLng(-3.7319029,-38.52673930000003),new ImageIcon(getClass().getResource("Fortaleza1.jpg")), new ImageIcon(getClass().getResource("Fortaleza2.jpg")), new ImageIcon(getClass().getResource("Fortaleza3.jpg")));
		Ciudad Belen = new Ciudad("Belem",new LatLng(-1.4557794,-48.490196800000035),new ImageIcon(getClass().getResource("Belem1.jpg")), new ImageIcon(getClass().getResource("Belem2.jpg")), new ImageIcon(getClass().getResource("Belem3.jpg")));
		Ciudad Curitiba = new Ciudad("Curitiba",new LatLng(-25.4244287,-49.265381899999966),new ImageIcon(getClass().getResource("Curitiba1.jpg")), new ImageIcon(getClass().getResource("Curitiba2.jpg")), new ImageIcon(getClass().getResource("Curitiba3.jpg")));
		Ciudad SaoPaulo = new Ciudad("Sao Paulo",new LatLng(-23.5505199,-46.63330939999997),new ImageIcon(getClass().getResource("Saopaulo1.jpeg")), new ImageIcon(getClass().getResource("Saopaulo2.jpg")), new ImageIcon(getClass().getResource("Saopaulo3.jpg")));
		Ciudad Recife = new Ciudad("Recife",new LatLng(-8.0475622,-34.8769643),new ImageIcon(getClass().getResource("Recife1.jpg")), new ImageIcon(getClass().getResource("Recife2.jpg")), new ImageIcon(getClass().getResource("Recife3.jpg")));
		Ciudad BeloHorizonte = new Ciudad("Belo Horizonte",new LatLng(-19.9245018,-43.935237599999994),new ImageIcon(getClass().getResource("Belohorizonte1.jpg")), new ImageIcon(getClass().getResource("Belohorizonte2.jpg")), new ImageIcon(getClass().getResource("Belohorizonte3.jpg")));
		Ciudad PortoAlegre = new Ciudad("Porto Alegre",new LatLng(-30.0346471,-51.217658400000005),new ImageIcon(getClass().getResource("Portoalegre1.jpg")), new ImageIcon(getClass().getResource("Portoalegre2.jpg")), new ImageIcon(getClass().getResource("Portoalegre3.jpg")));
		Ciudad CampoGrande = new Ciudad("Campo Grande",new LatLng(-20.4697105,-54.620121100000006),new ImageIcon(getClass().getResource("Campogrande1.jpg")), new ImageIcon(getClass().getResource("Campogrande2.jpg")), new ImageIcon(getClass().getResource("Campogrande3.jpg")));
		Ciudad Sucre = new Ciudad("Sucre",new LatLng(-19.0195852,-65.26196149999998),new ImageIcon(getClass().getResource("Succre1.jpg")), new ImageIcon(getClass().getResource("Sucre2.jpg")), new ImageIcon(getClass().getResource("Sucre3.jpg")));
		Ciudad Lasantisimatrinidad = new Ciudad("La Santisima Trinidad",new LatLng(-14.8258317,-64.90002470000002),new ImageIcon(getClass().getResource("Lasantisimatrinidad1.jpg")), new ImageIcon(getClass().getResource("Lasantisimatrinidad2.jpg")), new ImageIcon(getClass().getResource("Lasantisimatrinidad3.jpg")));
		Ciudad Riberalta = new Ciudad("Riberalta",new LatLng(-11.0073376,-66.05824899999999),new ImageIcon(getClass().getResource("Riberalta1.jpg")), new ImageIcon(getClass().getResource("Riberalta2.jpg")), new ImageIcon(getClass().getResource("Riberalta3.jpg")));
		Ciudad Lapaz = new Ciudad("La Paz",new LatLng(-16.489689,-68.11929359999999),new ImageIcon(getClass().getResource("Lapaz1.jpg")), new ImageIcon(getClass().getResource("Lapaz2.jpg")), new ImageIcon(getClass().getResource("Lapaz3.jpg")));
		Ciudad Cochabamba = new Ciudad("Cochabamba",new LatLng(-17.4139766,-66.16532239999998),new ImageIcon(getClass().getResource("Cochabamba1.jpg")), new ImageIcon(getClass().getResource("Cochabamba2.jpeg")), new ImageIcon(getClass().getResource("Cochabamba3.jpg")));
		Ciudad SantaCruzdelaSierra = new Ciudad("Santa Cruz de la Sierra",new LatLng(-17.8145819,-63.15608529999997),new ImageIcon(getClass().getResource("Santacruzdelasierra1.jpg")), new ImageIcon(getClass().getResource("Santacruzdelasierra2.jpeg")), new ImageIcon(getClass().getResource("Santacruzdelasierra3.jpg")));
		Ciudad Potosi = new Ciudad("Potosi",new LatLng(-19.5722805,-65.75500629999999),new ImageIcon(getClass().getResource("Potosi1.jpg")), new ImageIcon(getClass().getResource("Potosi2.jpg")), new ImageIcon(getClass().getResource("Potosi3.jpg")));
		Ciudad Santiagodechile = new Ciudad("Santiago de chile",new LatLng(-33.4488897,-70.6692655),new ImageIcon(getClass().getResource("Santiagodechile1.jpg")), new ImageIcon(getClass().getResource("Santiagodechile2.jpg")), new ImageIcon(getClass().getResource("Santiagodechile3.jpg")));
		Ciudad Concepcion = new Ciudad("Concepcion",new LatLng(-36.8201352, -73.0443904),new ImageIcon(getClass().getResource("Concepcion1.jpg")), new ImageIcon(getClass().getResource("Concepcion2.jpg")), new ImageIcon(getClass().getResource("Concepcion3.jpeg")));
		Ciudad Temuco = new Ciudad("Temuco",new LatLng(-38.7359018,-72.59037390000003),new ImageIcon(getClass().getResource("Temuco1.jpg")), new ImageIcon(getClass().getResource("Temuco2.jpg")), new ImageIcon(getClass().getResource("Temuco3.jpg")));
		Ciudad LaSerena = new Ciudad("La Serena",new LatLng(-29.9026691,-71.25193739999997),new ImageIcon(getClass().getResource("Laserena1.jpg")), new ImageIcon(getClass().getResource("Laserena2.jpg")), new ImageIcon(getClass().getResource("Laserena3.jpg")));
		Ciudad Osorno = new Ciudad("Osorno",new LatLng(-40.5761897,-73.1149469),new ImageIcon(getClass().getResource("Osorno1.jpg")), new ImageIcon(getClass().getResource("Osorno2.jpg")), new ImageIcon(getClass().getResource("Osorno3.png")));
		Ciudad PuertoMontt = new Ciudad("Puerto Montt",new LatLng(-41.468917,-72.9411364),new ImageIcon(getClass().getResource("Puertomontt1.jpeg")), new ImageIcon(getClass().getResource("Puertomontt2.jpeg")), new ImageIcon(getClass().getResource("Puertomontt3.jpg")));
		Ciudad Arica = new Ciudad("Arica",new LatLng(-18.4782534,-70.31259879999999),new ImageIcon(getClass().getResource("Arica1.jpg")), new ImageIcon(getClass().getResource("Arica2.jpg")), new ImageIcon(getClass().getResource("Arica3.jpg")));
		Ciudad Antofagasta = new Ciudad("Antofagasta",new LatLng(-23.6509279,-70.39750219999996),new ImageIcon(getClass().getResource("Antofagasta1.jpg")), new ImageIcon(getClass().getResource("Antofagasta2.jpg")), new ImageIcon(getClass().getResource("Antofagasta3.jpg")));
		Ciudad Bogota = new Ciudad("Bogota",new LatLng(4.710988599999999,-74.072092),new ImageIcon(getClass().getResource("Bogota1.jpg")), new ImageIcon(getClass().getResource("Bogota2.jpg")), new ImageIcon(getClass().getResource("Bogota3.jpg")));
		Ciudad Madellin = new Ciudad("Medellin",new LatLng(6.244203,-75.58121189999997),new ImageIcon(getClass().getResource("Medellin1.jpg")), new ImageIcon(getClass().getResource("Medellin2.jpg")), new ImageIcon(getClass().getResource("Medellin3.jpg")));
		Ciudad Cali = new Ciudad("Cali",new LatLng(3.4516467, -76.5319854),new ImageIcon(getClass().getResource("Cali1.jpg")), new ImageIcon(getClass().getResource("Cali2.jpg")), new ImageIcon(getClass().getResource("Cali3.jpg")));
		Ciudad CartagenadeIndias = new Ciudad("Cartagena de Indias",new LatLng(10.3910485, -75.47942569999998),new ImageIcon(getClass().getResource("Cartagenadeindias1.jpg")), new ImageIcon(getClass().getResource("Cartagenadeindias2.jpg")), new ImageIcon(getClass().getResource("Cartagenadeindias3.jpg")));
		Ciudad Bucaramanga = new Ciudad("Bucaramanga",new LatLng(7.119349,-73.12274159999998),new ImageIcon(getClass().getResource("Bucaramanga1.jpg")), new ImageIcon(getClass().getResource("Bucaramanga2.jpg")), new ImageIcon(getClass().getResource("Bucaramanga3.jpg")));
		Ciudad Barranquilla = new Ciudad("Barranquilla",new LatLng(11.0041072,-74.80698129999996),new ImageIcon(getClass().getResource("Barranquilla1.jpg")), new ImageIcon(getClass().getResource("Barranquilla2.jpg")), new ImageIcon(getClass().getResource("Barranquilla3.png")));
		Ciudad Lamacarena = new Ciudad("La Macarena",new LatLng(2.181718,-73.78645),new ImageIcon(getClass().getResource("Lamacarena1.jpg")), new ImageIcon(getClass().getResource("Lamacarena2.jpg")), new ImageIcon(getClass().getResource("Lamacarena3.jpg")));
		Ciudad Quito = new Ciudad("Quito",new LatLng(-0.1806532, -78.46783820000002),new ImageIcon(getClass().getResource("Quito1.jpg")), new ImageIcon(getClass().getResource("Quito2.png")), new ImageIcon(getClass().getResource("Quito3.jpg")));
		Ciudad Guayaquil = new Ciudad("Guayaquil",new LatLng(-2.1709979, -79.92235920000002),new ImageIcon(getClass().getResource("Guayaquil1.jpg")), new ImageIcon(getClass().getResource("Guayaquil2.jpg")), new ImageIcon(getClass().getResource("Guayaquil3.jpg")));
		Ciudad Cuenca = new Ciudad("Cuenca",new LatLng(-2.9001285, -79.0058965),new ImageIcon(getClass().getResource("Cuenca1.jpg")), new ImageIcon(getClass().getResource("Cuenca2.jpg")), new ImageIcon(getClass().getResource("Cuenca3.jpg")));
		Ciudad Ambato = new Ciudad("Ambato",new LatLng(-1.2543408, -78.6228504),new ImageIcon(getClass().getResource("Ambato1.jpg")), new ImageIcon(getClass().getResource("Ambato2.jpg")), new ImageIcon(getClass().getResource("Ambato3.jpg")));
		Ciudad Manta = new Ciudad("Manta",new LatLng(-0.9676533,-80.70891010000003),new ImageIcon(getClass().getResource("Manta1.png")), new ImageIcon(getClass().getResource("Manta2.jpg")), new ImageIcon(getClass().getResource("Manta3.jpg")));
		Ciudad Esmeraldas = new Ciudad("Esmeraldas",new LatLng(0.9681789,-79.6517202),new ImageIcon(getClass().getResource("Esmeraldas1.jpg")), new ImageIcon(getClass().getResource("Esmeraldas2.jpg")), new ImageIcon(getClass().getResource("Esmeraldas3.jpg")));
		Ciudad Loja = new Ciudad("Loja",new LatLng(-4.0078909,-79.21127690000003),new ImageIcon(getClass().getResource("Loja1.jpg")), new ImageIcon(getClass().getResource("Loja2.jpg")), new ImageIcon(getClass().getResource("Loja3.jpg")));
		Ciudad Georgetown = new Ciudad("Georgetown",new LatLng(6.8012793,-58.1551255),new ImageIcon(getClass().getResource("Georgetown1.jpg")), new ImageIcon(getClass().getResource("Georgetown2.jpg")), new ImageIcon(getClass().getResource("Georgetown3.jpg")));
		Ciudad Aishalton = new Ciudad("Aishalton",new LatLng(2.516667,-59.25),new ImageIcon(getClass().getResource("Aishalton1.jpg")), new ImageIcon(getClass().getResource("Aishalton2.jpg")), new ImageIcon(getClass().getResource("Aishalton3.jpg")));
		Ciudad Arakaka = new Ciudad("Arakaka",new LatLng(7.626787999999999,-60.250710000000026),new ImageIcon(getClass().getResource("Arakaka1.jpg")), new ImageIcon(getClass().getResource("Arakaka2.jpg")), new ImageIcon(getClass().getResource("Arakaka3.jpg")));
		Ciudad Pubu = new Ciudad("Pubu",new LatLng(5.233333,-58.61666700000001),new ImageIcon(getClass().getResource("Pubu1.jpg")), new ImageIcon(getClass().getResource("Pubu2.jpg")), new ImageIcon(getClass().getResource("Pubu3.jpg")));
		Ciudad Cayena = new Ciudad("Cayena",new LatLng(4.92242,-52.313453100000004),new ImageIcon(getClass().getResource("Cayena1.jpg")), new ImageIcon(getClass().getResource("Cayena2.jpg")), new ImageIcon(getClass().getResource("Cayena3.jpg")));
		Ciudad Asuncion = new Ciudad("Asuncion",new LatLng(-25.2637399, -57.57592599999998),new ImageIcon(getClass().getResource("Asuncion1.jpg")), new ImageIcon(getClass().getResource("Asuncion2.jpg")), new ImageIcon(getClass().getResource("Asuncion3.jpg")));
		Ciudad Ciudaddeleste =  new Ciudad("Ciudad del este",new LatLng(-25.5085286, -54.675323100000014),new ImageIcon(getClass().getResource("Ciudaddeleste1.jpg")), new ImageIcon(getClass().getResource("Ciudaddeleste2.jpg")), new ImageIcon(getClass().getResource("Ciudaddeleste3.jpg")));
		Ciudad SanLorenzo = new Ciudad("San Lorenzo",new LatLng(-25.3446035, -57.51931059999998),new ImageIcon(getClass().getResource("Sanlorenzo1.jpg")), new ImageIcon(getClass().getResource("Sanlorenzo2.jpg")), new ImageIcon(getClass().getResource("Sanlorenzo3.jpg")));
		Ciudad Luque = new Ciudad("Luque",new LatLng(-25.2415033, -57.48535609999999),new ImageIcon(getClass().getResource("Luque1.jpg")), new ImageIcon(getClass().getResource("Luque2.jpg")), new ImageIcon(getClass().getResource("Luque3.jpg")));
		Ciudad Encarnacion = new Ciudad("Encarnacion",new LatLng(-27.2522918,-55.913586699999996),new ImageIcon(getClass().getResource("Encarnacion1.jpg")), new ImageIcon(getClass().getResource("Encarnacion2.jpg")), new ImageIcon(getClass().getResource("Encarnacion3.jpg")));
		Ciudad Lima = new Ciudad("Lima",new LatLng(-12.0463731, -77.042754),new ImageIcon(getClass().getResource("Lima1.jpg")), new ImageIcon(getClass().getResource("Lima2.jpg")), new ImageIcon(getClass().getResource("Lima3.jpg")));
		Ciudad Cuzco = new Ciudad("Cuzco",new LatLng(-13.53195, -71.96746259999998),new ImageIcon(getClass().getResource("Cusco1.jpg")), new ImageIcon(getClass().getResource("Cusco2.jpg")), new ImageIcon(getClass().getResource("Cusco3.jpg")));
		Ciudad Arequipa = new Ciudad("Arequipa",new LatLng(-16.4090474, -71.53745099999998),new ImageIcon(getClass().getResource("Arequipa1.png")), new ImageIcon(getClass().getResource("Arequipa2.jpeg")), new ImageIcon(getClass().getResource("Arequipa3.jpg")));
		Ciudad Trujillo = new Ciudad("Trujillo",new LatLng(-8.1090524, -79.0215336),new ImageIcon(getClass().getResource("Trujillo1.jpg")), new ImageIcon(getClass().getResource("Trujillo2.jpeg")), new ImageIcon(getClass().getResource("Trujillo3.jpg")));
		Ciudad Piura = new Ciudad("Piura",new LatLng(-5.1782884,-80.65488820000002),new ImageIcon(getClass().getResource("Piura1.jpg")), new ImageIcon(getClass().getResource("Piura2.jpeg")), new ImageIcon(getClass().getResource("Piura3.jpg")));
		Ciudad Iquitos = new Ciudad("Iquitos",new LatLng(-3.7436735,-73.2516326),new ImageIcon(getClass().getResource("Iquitos1.jpg")), new ImageIcon(getClass().getResource("Iquitos2.jpg")), new ImageIcon(getClass().getResource("Iquitos3.jpg")));
		Ciudad Paramaribo = new Ciudad("Paramaribo",new LatLng(5.8520355,-55.2038278),new ImageIcon(getClass().getResource("Paramaribo1.jpg")), new ImageIcon(getClass().getResource("Paramaribo2.jpg")), new ImageIcon(getClass().getResource("Paramaribo3.jpg")));
		Ciudad Kabelebo = new Ciudad("Kabelebo",new LatLng(4.4392129,-57.187319),new ImageIcon(getClass().getResource("Kelebo1.jpg")), new ImageIcon(getClass().getResource("Kelebo2.jpeg")), new ImageIcon(getClass().getResource("Kelebo3.jpg")));
		Ciudad Apetina = new Ciudad("Apetina",new LatLng(3.5151346,-55.05071570000001),new ImageIcon(getClass().getResource("Apetina1.jpg")), new ImageIcon(getClass().getResource("Apetina2.jpg")), new ImageIcon(getClass().getResource("Apetina3.jpg")));
		Ciudad Alopi = new Ciudad("Alopi",new LatLng(3.2460563,-55.52611430000002),new ImageIcon(getClass().getResource("Alopi1.jpg")), new ImageIcon(getClass().getResource("Alopi2.jpg")), new ImageIcon(getClass().getResource("Alopi3.jpg")));
		Ciudad Montevideo = new Ciudad("Montevideo",new LatLng(-34.9011127,-56.16453139999999),new ImageIcon(getClass().getResource("Montevideo1.jpg")), new ImageIcon(getClass().getResource("Montevideo2.jpg")), new ImageIcon(getClass().getResource("Montevideo3.jpg")));
		Ciudad Salto = new Ciudad("Salto",new LatLng(-31.3854988, -57.96007929999996),new ImageIcon(getClass().getResource("Salto1.jpg")), new ImageIcon(getClass().getResource("Salto2.jpg")), new ImageIcon(getClass().getResource("Salto3.jpg")));
		Ciudad Rivera = new Ciudad("Rivera",new LatLng(-30.9178625, -55.546903199999974),new ImageIcon(getClass().getResource("Rivera1.jpg")), new ImageIcon(getClass().getResource("Rivera2.jpg")), new ImageIcon(getClass().getResource("Rivera3.jpg")));
		Ciudad Puntadeleste = new Ciudad("Punta del este",new LatLng(-34.9368789,-54.92814959999998),new ImageIcon(getClass().getResource("Puntadeeste1.jpg")), new ImageIcon(getClass().getResource("Puntadeleste2.jpg")), new ImageIcon(getClass().getResource("Puntadeleste3.jpg")));
		Ciudad Caracas = new Ciudad("Caracas",new LatLng(10.4805937, -66.90360629999998),new ImageIcon(getClass().getResource("Caracas1.jpg")), new ImageIcon(getClass().getResource("Caracas2.jpg")), new ImageIcon(getClass().getResource("Caracas3.jpg")));
		Ciudad Maracaibo = new Ciudad("Maracaibo",new LatLng(10.6544509, -71.7147951),new ImageIcon(getClass().getResource("Maracaibo1.jpg")), new ImageIcon(getClass().getResource("Maracaibo2.jpg")), new ImageIcon(getClass().getResource("Maracaibo3.jpg")));
		Ciudad Valencia = new Ciudad("Valencia",new LatLng(10.1579312, -67.99721039999997),new ImageIcon(getClass().getResource("Valencia1.jpeg")), new ImageIcon(getClass().getResource("Valencia2.jpg")), new ImageIcon(getClass().getResource("Valencia3.jpg")));
		Ciudad Maracay = new Ciudad("Maracay",new LatLng(10.2441931,-67.60661640000001),new ImageIcon(getClass().getResource("Maracay1.jpg")), new ImageIcon(getClass().getResource("Maracay2.jpg")), new ImageIcon(getClass().getResource("Maracay3.jpeg")));
		Ciudad Barinas = new Ciudad("Barinas",new LatLng(8.6231498,-70.23710449999999),new ImageIcon(getClass().getResource("Barinas1.jpg")), new ImageIcon(getClass().getResource("Barinas2.jpeg")), new ImageIcon(getClass().getResource("Barinas3.jpg")));
		Ciudad Maturin = new Ciudad("Maturin",new LatLng(9.7333906,-63.19143170000001),new ImageIcon(getClass().getResource("Maturin1.jpeg")), new ImageIcon(getClass().getResource("Maturin2.jpg")), new ImageIcon(getClass().getResource("Maturin3.jpg")));
		Ciudad Puntofijo = new Ciudad("Punto fijo",new LatLng(11.711511,-70.18130180000003),new ImageIcon(getClass().getResource("Puntofijo1.jpg")), new ImageIcon(getClass().getResource("Puntofijo2.jpg")), new ImageIcon(getClass().getResource("Puntofijo3.jpg")));

		tabla.put(1, BuenosAires); 
		tabla.put(2, Rosario);	
		tabla.put(3, Cordoba); 
		tabla.put(4, SantaFe); 
		tabla.put(5, SanJuan); 
		tabla.put(6, Mendoza); 			
		tabla.put(7, SanRafael); 
		tabla.put(8, RioGallegos); 
		tabla.put(9, Salta); 

		tabla.put(10, MardePlata);	
		tabla.put(11, Brasilia); 
		tabla.put(12, RiodeJaneiro); 
		tabla.put(13, Fortaleza); 
		tabla.put(14, Belen); 
		tabla.put(15, Curitiba);
		tabla.put(16, SaoPaulo);
		tabla.put(17, Recife); 
		tabla.put(18, BeloHorizonte); 		
		tabla.put(19, PortoAlegre);			
		tabla.put(20, CampoGrande); 

		tabla.put(21, Sucre);  
		tabla.put(22, Lasantisimatrinidad);  
		tabla.put(23, Riberalta);  
		tabla.put(24, Lapaz);  
		tabla.put(25, Cochabamba);  
		tabla.put(26, SantaCruzdelaSierra);  
		tabla.put(27, Potosi);  
		tabla.put(28, Santiagodechile);  
		tabla.put(29, Concepcion);  

		tabla.put(30, Temuco);  
		tabla.put(31, LaSerena);  
		tabla.put(32, Osorno);  
		tabla.put(33, PuertoMontt);  
		tabla.put(34, Arica);  
		tabla.put(35, Antofagasta);  
		tabla.put(36, Bogota);  
		tabla.put(37, Madellin);  
		tabla.put(38, Cali);  
		tabla.put(39, CartagenadeIndias);  

		tabla.put(40, Bucaramanga);  
		tabla.put(41, Barranquilla);  
		tabla.put(42, Lamacarena);  
		tabla.put(43, Quito);  
		tabla.put(44, Guayaquil);  
		tabla.put(45, Cuenca);  
		tabla.put(46, Ambato);  
		tabla.put(47, Manta);  
		tabla.put(48, Esmeraldas);  
		tabla.put(49, Loja);  

		tabla.put(50, Georgetown);  
		tabla.put(51, Aishalton);  
		tabla.put(52, Arakaka);  
		tabla.put(53, Pubu);  
		tabla.put(54, Cayena);  
		tabla.put(55, Asuncion);  
		tabla.put(56, Ciudaddeleste);  
		tabla.put(57, SanLorenzo);  
		tabla.put(58, Luque);  
		tabla.put(59, Encarnacion);  

		tabla.put(60, Lima);  
		tabla.put(61, Cuzco);  
		tabla.put(62, Arequipa);  
		tabla.put(63, Trujillo);  
		tabla.put(64, Piura);  
		tabla.put(65, Iquitos);  
		tabla.put(66, Paramaribo);  
		tabla.put(67, Kabelebo);  
		tabla.put(68, Apetina);  
		tabla.put(69, Alopi);  

		tabla.put(70, Montevideo);  
		tabla.put(71, Salto);  
		tabla.put(72, Rivera);  
		tabla.put(73, Puntadeleste);  
		tabla.put(74, Caracas);  
		tabla.put(75, Maracaibo);  
		tabla.put(76, Valencia);  
		tabla.put(77, Maracay);  
		tabla.put(78, Barinas);  
		tabla.put(79, Maturin);  
		tabla.put(80, Puntofijo);  

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

		int multiplicador = 80;
		HashMap<Integer, Ciudad> ciudades = Mapa.sur.getTabla();

		double num = Math.random()*multiplicador;
		int n = (int)num;

		return ciudades.get(n);

	}



}
