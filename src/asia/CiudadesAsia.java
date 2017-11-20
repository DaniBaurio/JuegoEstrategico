package asia;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.teamdev.jxmaps.LatLng;

import maps.Ciudad;
import maps.Mapa;

public class CiudadesAsia {
	
	private HashMap<Integer, Ciudad> tabla = new HashMap<Integer, Ciudad>();
	
	/**
	 * Construccion de las ciudades en las que se podra jugar en el continente asia
	 * E inserccion en un HashMap para su uso posterior
	 */
	
	public CiudadesAsia(){
		
		tabla = new HashMap<Integer, Ciudad>();
		
		Ciudad Kabul = new Ciudad("Kabul", new LatLng(34.5553494, 69.20748600000002),new ImageIcon(getClass().getResource("Kabul1.jpg")), new ImageIcon(getClass().getResource("Kabul2.jpg")), new ImageIcon(getClass().getResource("Kabul2.jpg")));
		Ciudad Kandahar = new Ciudad("Kandahar",new LatLng(31.628871,65.73717490000001),new ImageIcon(getClass().getResource("Kandahar1.jpg")), new ImageIcon(getClass().getResource("Kandahar2.jpg")), new ImageIcon(getClass().getResource("Kandahar3.jpg")));
		Ciudad Riad = new Ciudad("Riad", new LatLng(24.7135517,46.67529569999999),new ImageIcon(getClass().getResource("Riad1.jpg")), new ImageIcon(getClass().getResource("Riad2.jpg")), new ImageIcon(getClass().getResource("Riad3.jpg")));
		Ciudad Yiida = new Ciudad("Yeda",new LatLng(21.2854067,39.23755069999993),new ImageIcon(getClass().getResource("Yiida1.jpg")), new ImageIcon(getClass().getResource("Yiida2.jpg")), new ImageIcon(getClass().getResource("Yiida3.jpg")));
		Ciudad Erevan = new Ciudad("Erevan",new LatLng(40.1791857,44.499102900000025),new ImageIcon(getClass().getResource("Erevan1.jpg")), new ImageIcon(getClass().getResource("Erevan2.jpg")), new ImageIcon(getClass().getResource("Erevan3.jpg")));
		Ciudad Artashat = new Ciudad("Artashat",new LatLng(39.9535181,44.55197820000001) ,new ImageIcon(getClass().getResource("Artashat1.jpg")), new ImageIcon(getClass().getResource("Artashat2.jpg")), new ImageIcon(getClass().getResource("Artashat3.jpg")));
		Ciudad Baku = new Ciudad("Baku",new LatLng(40.40926169999999, 49.86709240000005),new ImageIcon(getClass().getResource("Baku1.jpg")), new ImageIcon(getClass().getResource("Baku2.jpg")), new ImageIcon(getClass().getResource("Baku3.jpg")));
		Ciudad Ganya = new Ciudad("Ganja",new LatLng(40.6878581, 46.37233130000004),new ImageIcon(getClass().getResource("Ganya1.jpg")), new ImageIcon(getClass().getResource("Ganya2.jpg")), new ImageIcon(getClass().getResource("Ganya3.jpg")));
		Ciudad Daca = new Ciudad("Daca",new LatLng(23.810332, 90.41251809999994),new ImageIcon(getClass().getResource("Daca1.jpg")), new ImageIcon(getClass().getResource("Daca2.jpg")), new ImageIcon(getClass().getResource("Daca3.jpg")));
		Ciudad Chittagong = new Ciudad("Chittagong",new LatLng(22.3475365, 91.81233240000006),new ImageIcon(getClass().getResource("Chittagong1.jpg")), new ImageIcon(getClass().getResource("Chittagong2.jpg")), new ImageIcon(getClass().getResource("Chittagong3.jpg")));
		Ciudad Riffa = new Ciudad("Riffa",new LatLng(26.1226062, 50.53426200000001),new ImageIcon(getClass().getResource("Riffa1.jpg")), new ImageIcon(getClass().getResource("Riffa2.jpg")), new ImageIcon(getClass().getResource("Riffa3.jpg")));
		Ciudad Naipyido = new Ciudad("Naipyido",new LatLng(19.7633057,96.07851040000003),new ImageIcon(getClass().getResource("Naipyido1.jpg")), new ImageIcon(getClass().getResource("Naipyido2.jpg")), new ImageIcon(getClass().getResource("Naipyido3.jpg")));
		Ciudad Rangun = new Ciudad("Rangun",new LatLng(16.8660694, 96.19513200000006),new ImageIcon(getClass().getResource("Rangun1.jpg")), new ImageIcon(getClass().getResource("Rangun2.jpg")), new ImageIcon(getClass().getResource("Rangun3.jpg")));
		Ciudad Bandar = new Ciudad("Bandar Seri Begawan",new LatLng(4.903052199999999, 114.93982099999994),new ImageIcon(getClass().getResource("Bandar-Seri-Begawan1.jpg")), new ImageIcon(getClass().getResource("Bandar-Seri-Begawan2.jpg")), new ImageIcon(getClass().getResource("Bandar-Seri-Begawan3.jpg")));
		Ciudad Thimphu = new Ciudad("Thimphu",new LatLng(27.4727924,89.63928629999998),new ImageIcon(getClass().getResource("Thimphu1.jpg")), new ImageIcon(getClass().getResource("Thimphu2.jpg")), new ImageIcon(getClass().getResource("Thimphu3.jpg")));
		Ciudad Paro = new Ciudad("Paro",new LatLng(27.428684, 89.41636540000002),new ImageIcon(getClass().getResource("Paro1.jpg")), new ImageIcon(getClass().getResource("Paro2.jpg")), new ImageIcon(getClass().getResource("Paro3.jpg")));
		Ciudad NomPen = new Ciudad("Nom Pen",new LatLng(11.5448729, 104.89216680000004),new ImageIcon(getClass().getResource("Nom-Pen1.jpg")), new ImageIcon(getClass().getResource("Nom-Pen2.jpg")), new ImageIcon(getClass().getResource("Nom-Pen3.jpg")));
		Ciudad KiemRiep = new Ciudad("Siem Reap",new LatLng(13.3670968, 103.84481340000002),new ImageIcon(getClass().getResource("Kiem-Riep1.jpg")), new ImageIcon(getClass().getResource("Kiem-Riep2.jpg")), new ImageIcon(getClass().getResource("Kiem-Riep3.jpg")));
		Ciudad Doha = new Ciudad("Doha",new LatLng(25.2854473,51.53103979999992),new ImageIcon(getClass().getResource("Doha1.jpg")), new ImageIcon(getClass().getResource("Doha2.jpg")), new ImageIcon(getClass().getResource("Doha3.jpg")));
		Ciudad Pekin = new Ciudad("Pekin",new LatLng(39.90419989999999,116.40739630000007),new ImageIcon(getClass().getResource("Pekin1.jpg")), new ImageIcon(getClass().getResource("Pekin2.jpg")), new ImageIcon(getClass().getResource("Pekin3.jpg")));
		Ciudad Shanghai = new Ciudad("Shanghai",new LatLng(31.2303904, 121.47370209999997),new ImageIcon(getClass().getResource("Shanghai1.jpg")), new ImageIcon(getClass().getResource("Shanghai2.jpg")), new ImageIcon(getClass().getResource("Shanghai3.jpg")));
		Ciudad Tianjin = new Ciudad("Tianjin",new LatLng(39.3433574, 117.36164759999997),new ImageIcon(getClass().getResource("Tianjin1.jpg")), new ImageIcon(getClass().getResource("Tianjin2.jpg")), new ImageIcon(getClass().getResource("Tianjin3.jpg")));
		Ciudad Canton = new Ciudad("Canton",new LatLng(23.12911, 113.26438499999995),new ImageIcon(getClass().getResource("Canton1.jpg")), new ImageIcon(getClass().getResource("Canton2.jpg")), new ImageIcon(getClass().getResource("Canton3.jpg")));
		Ciudad Pionyang = new Ciudad("Pionyang",new LatLng(39.0392193,125.76252410000006),new ImageIcon(getClass().getResource("Pionyang1.jpg")), new ImageIcon(getClass().getResource("Pionyang2.jpg")), new ImageIcon(getClass().getResource("Pionyang3.jpg")));
		Ciudad Hamhung = new Ciudad("Hamhung",new LatLng(39.9838002, 127.6124552),new ImageIcon(getClass().getResource("Hamhung1.jpg")), new ImageIcon(getClass().getResource("Hamhung2.jpg")), new ImageIcon(getClass().getResource("Hamhung3.jpg")));
		Ciudad Seul = new Ciudad("Seul",new LatLng(37.566535,126.97796919999996),new ImageIcon(getClass().getResource("Seul1.jpg")), new ImageIcon(getClass().getResource("Seul2.jpg")), new ImageIcon(getClass().getResource("Seul3.jpg")));
		Ciudad Busan = new Ciudad("Busan",new LatLng(35.1795543, 129.07564160000004),new ImageIcon(getClass().getResource("Busan1.jpg")), new ImageIcon(getClass().getResource("Busan2.jpg")), new ImageIcon(getClass().getResource("Busan3.jpg")));
		Ciudad AbuDabi = new Ciudad("Abu Dhabi",new LatLng(24.453884,54.37734380000006),new ImageIcon(getClass().getResource("Abu-Dabi1.jpg")), new ImageIcon(getClass().getResource("Abu-Dabi2.jpg")), new ImageIcon(getClass().getResource("Abu-Dabi3.jpg")));
		Ciudad Manila = new Ciudad("Manila",new LatLng(14.5995124,120.9842195),new ImageIcon(getClass().getResource("Manila1.jpg")), new ImageIcon(getClass().getResource("Manila2.jpg")), new ImageIcon(getClass().getResource("Manila3.jpg")));
		Ciudad Cebu = new Ciudad("Cebu",new LatLng(10.3156992, 123.88543660000005),new ImageIcon(getClass().getResource("Cebu1.jpg")), new ImageIcon(getClass().getResource("Cebu2.jpg")), new ImageIcon(getClass().getResource("Cebu3.jpg")));
		Ciudad Tiflis = new Ciudad("Tiflis",new LatLng(41.7151377,44.82709599999998),new ImageIcon(getClass().getResource("Tiflis1.jpg")), new ImageIcon(getClass().getResource("Tiflis2.jpg")), new ImageIcon(getClass().getResource("Tiflis3.jpg")));
		Ciudad Sujumi = new Ciudad("Sujumi",new LatLng(43.0015252,41.02341530000001),new ImageIcon(getClass().getResource("Sujumi1.jpg")), new ImageIcon(getClass().getResource("Sujumi2.jpg")), new ImageIcon(getClass().getResource("Sujumi3.jpg")));
		Ciudad NuevaDelhi = new Ciudad("Nueva Delhi",new LatLng(28.6139391, 77.20902120000005),new ImageIcon(getClass().getResource("Nueva-Delhi1.jpg")), new ImageIcon(getClass().getResource("Nueva-Delhi2.jpg")), new ImageIcon(getClass().getResource("Nueva-Delhi3.jpg")));
		Ciudad Mumbai = new Ciudad("Mumbai",new LatLng(19.0759837,72.87765590000004),new ImageIcon(getClass().getResource("Mumbai1.jpg")), new ImageIcon(getClass().getResource("Mumbai2.jpg")), new ImageIcon(getClass().getResource("Mumbai3.jpg")));
		Ciudad Agra = new Ciudad("Agra",new LatLng(27.1766701, 78.00807450000002),new ImageIcon(getClass().getResource("Agra1.jpg")), new ImageIcon(getClass().getResource("Agra2.jpg")), new ImageIcon(getClass().getResource("Agra3.jpg")));
		Ciudad Calcuta = new Ciudad("Calcuta",new LatLng(22.572646, 88.36389499999996),new ImageIcon(getClass().getResource("Calcuta1.jpg")), new ImageIcon(getClass().getResource("Calcuta2.jpg")), new ImageIcon(getClass().getResource("Calcuta3.jpg")));
		Ciudad Yakarta = new Ciudad("Yakarta",new LatLng(-6.17511,106.86503949999997),new ImageIcon(getClass().getResource("Yakarta1.jpg")), new ImageIcon(getClass().getResource("Yakarta2.jpg")), new ImageIcon(getClass().getResource("Yakarta3.jpg")));
		Ciudad Surabaya = new Ciudad("Surabaya",new LatLng(-7.2574719,112.75208829999997),new ImageIcon(getClass().getResource("Surabaya1.jpg")), new ImageIcon(getClass().getResource("Surabaya2.jpg")), new ImageIcon(getClass().getResource("Surabaya3.jpg")));
		Ciudad Bandung = new Ciudad("Bandung",new LatLng(-6.9174639, 107.61912280000001),new ImageIcon(getClass().getResource("Bandung1.jpg")), new ImageIcon(getClass().getResource("Bandung2.jpg")), new ImageIcon(getClass().getResource("Bandung3.jpg")));
		Ciudad Bagdad = new Ciudad("Bagdad",new LatLng(33.3128057,44.36148750000007),new ImageIcon(getClass().getResource("Bagdad1.jpg")), new ImageIcon(getClass().getResource("Bagdad2.jpg")), new ImageIcon(getClass().getResource("Bagdad3.jpg")));
		Ciudad Mosul = new Ciudad("Mosul",new LatLng(36.3566484,43.16400039999996 ),new ImageIcon(getClass().getResource("Mosul1.jpg")), new ImageIcon(getClass().getResource("Mosul2.jpg")), new ImageIcon(getClass().getResource("Mosul3.jpg")));
		Ciudad Kirkuk = new Ciudad("Kirkuk",new LatLng(35.4655761,44.380392099999995),new ImageIcon(getClass().getResource("Kirkuk1.jpg")), new ImageIcon(getClass().getResource("Kirkuk2.jpg")), new ImageIcon(getClass().getResource("Kirkuk3.jpg")));
		Ciudad Teheran = new Ciudad("Teheran",new LatLng(35.6891975,51.388973599999986),new ImageIcon(getClass().getResource("Teheran1.jpg")), new ImageIcon(getClass().getResource("Teheran2.jpg")), new ImageIcon(getClass().getResource("Teheran3.jpg")));
		Ciudad Isfahan = new Ciudad("Isfahan",new LatLng(32.6546275, 51.66798259999996),new ImageIcon(getClass().getResource("Isfahan1.jpg")), new ImageIcon(getClass().getResource("Isfahan2.jpg")), new ImageIcon(getClass().getResource("Isfahan3.jpg")));
		Ciudad Jerusalen =  new Ciudad("Jerusalen",new LatLng(31.768319,35.21370999999999),new ImageIcon(getClass().getResource("Jerusalen1.jpg")), new ImageIcon(getClass().getResource("Jerusalen2.jpg")), new ImageIcon(getClass().getResource("Jerusalen3.jpg")));
		Ciudad TelAviv = new Ciudad("Tel Aviv",new LatLng(32.0852999, 34.78176759999997),new ImageIcon(getClass().getResource("Tel-Aviv1.jpg")), new ImageIcon(getClass().getResource("Tel-Aviv2.jpg")), new ImageIcon(getClass().getResource("Tel-Aviv3.jpg")));
		Ciudad Tokio = new Ciudad("Tokio",new LatLng(35.6894875,139.69170639999993),new ImageIcon(getClass().getResource("Tokio1.jpg")), new ImageIcon(getClass().getResource("Tokio2.jpg")), new ImageIcon(getClass().getResource("Tokio3.jpg")));
		Ciudad Kioto = new Ciudad("Kioto",new LatLng(35.0116363,135.76802939999993),new ImageIcon(getClass().getResource("Kioto1.jpg")), new ImageIcon(getClass().getResource("Kioto2.jpg")), new ImageIcon(getClass().getResource("Kioto3.jpg")));
		Ciudad Osaka = new Ciudad("Osaka",new LatLng(34.6937378,135.50216509999996),new ImageIcon(getClass().getResource("Osaka1.jpg")), new ImageIcon(getClass().getResource("Osaka2.jpg")), new ImageIcon(getClass().getResource("Osaka3.jpg")));
		Ciudad Hiroshima = new Ciudad("Hiroshima",new LatLng(34.3852029,132.45529269999997),new ImageIcon(getClass().getResource("Hiroshima1.jpg")), new ImageIcon(getClass().getResource("Hiroshima2.jpg")), new ImageIcon(getClass().getResource("Hiroshima3.jpg")));
		Ciudad Aman = new Ciudad("Aman",new LatLng(31.9453666,35.92837159999999),new ImageIcon(getClass().getResource("Aman1.jpg")), new ImageIcon(getClass().getResource("Aman2.jpg")), new ImageIcon(getClass().getResource("Aman3.jpg")));
		Ciudad Gerasa = new Ciudad("Gerasa",new LatLng(32.2746515,35.896076499999936),new ImageIcon(getClass().getResource("Gerasa1.jpg")), new ImageIcon(getClass().getResource("Gerasa2.jpg")), new ImageIcon(getClass().getResource("Gerasa3.jpg")));
		Ciudad Astana = new Ciudad("Astana",new LatLng(51.16052269999999,71.4703558),new ImageIcon(getClass().getResource("Astana1.jpg")), new ImageIcon(getClass().getResource("Astana2.jpg")), new ImageIcon(getClass().getResource("Astana3.jpg")));
		Ciudad Almaty = new Ciudad("Almaty",new LatLng(43.2220146,76.8512485),new ImageIcon(getClass().getResource("Almaty1.jpg")), new ImageIcon(getClass().getResource("Almaty2.jpg")), new ImageIcon(getClass().getResource("Almaty3.jpg")));
		Ciudad Biskek = new Ciudad("Bishkek",new LatLng(42.8746212, 74.56976170000007),new ImageIcon(getClass().getResource("Bishkek1.jpg")), new ImageIcon(getClass().getResource("Bishkek2.jpg")), new ImageIcon(getClass().getResource("Bishkek3.jpg")));
		Ciudad Osh = new Ciudad("Osh",new LatLng(40.5139985, 72.81609759999992),new ImageIcon(getClass().getResource("Osh1.jpg")), new ImageIcon(getClass().getResource("Osh2.jpg")), new ImageIcon(getClass().getResource("Osh3.jpg")));
		Ciudad KuwaitCity = new Ciudad("Kuwait City",new LatLng(29.375859,47.97740520000002),new ImageIcon(getClass().getResource("Kuwait-City1.jpg")), new ImageIcon(getClass().getResource("Kuwait-City2.jpg")), new ImageIcon(getClass().getResource("Kuwait-City3.jpg")));
		Ciudad Vientiane = new Ciudad("Vientiane",new LatLng(17.9757058,102.63310350000006),new ImageIcon(getClass().getResource("Vientiane1.jpg")), new ImageIcon(getClass().getResource("Vientiane2.jpg")), new ImageIcon(getClass().getResource("Vientiane3.jpg")));
		Ciudad LuangPrabang = new Ciudad("Luang Prabang",new LatLng(19.892258,102.13553589999992),new ImageIcon(getClass().getResource("Luang-Prabang1.jpg")), new ImageIcon(getClass().getResource("Luang-Prabang2.jpg")), new ImageIcon(getClass().getResource("Luang-Prabang3.jpg")));
		Ciudad Beirut = new Ciudad("Beirut",new LatLng(33.8937913,35.50177669999994),new ImageIcon(getClass().getResource("Beirut1.jpg")), new ImageIcon(getClass().getResource("Beirut2.jpg")), new ImageIcon(getClass().getResource("Beirut3.jpg")));
		Ciudad KualaLumpur = new Ciudad("Kuala Lumpur",new LatLng(3.139003,101.68685499999992),new ImageIcon(getClass().getResource("Kuala-Lumpur1.jpg")), new ImageIcon(getClass().getResource("Kuala-Lumpur2.jpg")), new ImageIcon(getClass().getResource("Kuala-Lumpur3.jpg")));
		Ciudad PulauPinang = new Ciudad("Pulau Pinang",new LatLng(5.4356367,100.30909999999994),new ImageIcon(getClass().getResource("Pulau-Pinang1.jpg")), new ImageIcon(getClass().getResource("Pulau-Pinang2.jpg")), new ImageIcon(getClass().getResource("Pulau-Pinang3.jpg")));
		Ciudad Male = new Ciudad("Male",new LatLng(4.1754959,73.50934740000002),new ImageIcon(getClass().getResource("Male1.jpg")), new ImageIcon(getClass().getResource("Male2.jpg")), new ImageIcon(getClass().getResource("Male3.jpg")));
		Ciudad UlanBator = new Ciudad("Ulan Bator",new LatLng(47.88639879999999,106.90574390000006),new ImageIcon(getClass().getResource("Ulan-Bator1.jpg")), new ImageIcon(getClass().getResource("Ulan-Bator2.jpg")), new ImageIcon(getClass().getResource("Ulan-Bator3.jpg")));
		Ciudad Moron = new Ciudad("Moron",new LatLng(49.6428895, 100.17718960000002),new ImageIcon(getClass().getResource("Moron1.jpg")), new ImageIcon(getClass().getResource("Moron2.jpg")), new ImageIcon(getClass().getResource("Moron3.jpg")));
		Ciudad Erdenet = new Ciudad("Erdenet",new LatLng(49.054082,104.07165329999998),new ImageIcon(getClass().getResource("Erdenet1.jpg")), new ImageIcon(getClass().getResource("Erdenet2.jpg")), new ImageIcon(getClass().getResource("Erdenet3.jpg")));
		Ciudad Katmandu = new Ciudad("Katmandu",new LatLng(27.7172453, 85.3239605),new ImageIcon(getClass().getResource("Katmandu1.jpg")), new ImageIcon(getClass().getResource("Katmandu2.jpg")), new ImageIcon(getClass().getResource("Katmandu3.jpg")));
		Ciudad Pokhara = new Ciudad("Pokhara",new LatLng(28.237987, 83.99558789999992),new ImageIcon(getClass().getResource("Pokhara.jpg")), new ImageIcon(getClass().getResource("Pokhara2.jpg")), new ImageIcon(getClass().getResource("Pokhara3.jpg")));
		Ciudad Mascate = new Ciudad("Mascate",new LatLng(23.58589,58.40592270000002),new ImageIcon(getClass().getResource("Mascate1.jpg")), new ImageIcon(getClass().getResource("Mascate2.jpg")), new ImageIcon(getClass().getResource("Mascate3.jpg")));
		Ciudad Salalah = new Ciudad("Salalah",new LatLng(17.0506675,54.10658639999997),new ImageIcon(getClass().getResource("Salalah1.jpg")), new ImageIcon(getClass().getResource("Salalah2.jpg")), new ImageIcon(getClass().getResource("Salalah3.jpg")));
		Ciudad Islamabad = new Ciudad("Islamabad",new LatLng(33.7293882,73.09314610000001),new ImageIcon(getClass().getResource("Islamabad1.jpg")), new ImageIcon(getClass().getResource("Islamabad2.jpg")), new ImageIcon(getClass().getResource("Islamabad3.jpg")));
		Ciudad Karachi = new Ciudad("Karachi",new LatLng(24.8614622,67.00993879999999),new ImageIcon(getClass().getResource("Karachi1.jpg")), new ImageIcon(getClass().getResource("Karachi2.jpg")), new ImageIcon(getClass().getResource("Karachi3.jpg")));
		Ciudad Hebron = new Ciudad("Hebron",new LatLng(31.532569,35.09982600000001),new ImageIcon(getClass().getResource("Hebron1.jpg")), new ImageIcon(getClass().getResource("Hebron2.jpg")), new ImageIcon(getClass().getResource("Hebron3.jpg")));
		Ciudad Rafah = new Ciudad("Rafah",new LatLng(31.29677999999999,34.24348199999997),new ImageIcon(getClass().getResource("Rafah1.jpg")), new ImageIcon(getClass().getResource("Rafah2.jpg")), new ImageIcon(getClass().getResource("Rafah3.jpg")));
		Ciudad Singapur = new Ciudad("Singapur",new LatLng(1.352083,103.81983600000001),new ImageIcon(getClass().getResource("Singapur1.jpg")), new ImageIcon(getClass().getResource("Singapur2.jpg")), new ImageIcon(getClass().getResource("Singapur3.jpg")));
		Ciudad Damasco = new Ciudad("Damasco",new LatLng(33.5138073,36.27652790000002),new ImageIcon(getClass().getResource("Damasco1.jpg")), new ImageIcon(getClass().getResource("Damasco2.jpg")), new ImageIcon(getClass().getResource("Damasco3.jpg")));
		Ciudad Alepo = new Ciudad("Alepo",new LatLng(36.2021047,37.13426030000005),new ImageIcon(getClass().getResource("Alepo1.jpg")), new ImageIcon(getClass().getResource("Alepo2.jpg")), new ImageIcon(getClass().getResource("Alepo3.jpg")));
		Ciudad Homs = new Ciudad("Homs",new LatLng(34.7324273,36.71369589999995),new ImageIcon(getClass().getResource("Homs1.jpg")), new ImageIcon(getClass().getResource("Homs2.jpg")), new ImageIcon(getClass().getResource("Homs3.jpg")));
		Ciudad Colombo = new Ciudad("Colombo",new LatLng(6.9270786,79.86124300000006),new ImageIcon(getClass().getResource("Colombo1.jpg")), new ImageIcon(getClass().getResource("Colombo2.jpg")), new ImageIcon(getClass().getResource("Colombo3.jpg")));
		Ciudad Kandy = new Ciudad("Kandy",new LatLng(7.2905715,80.63372619999996),new ImageIcon(getClass().getResource("Kandy1.jpg")), new ImageIcon(getClass().getResource("Kandy2.jpg")), new ImageIcon(getClass().getResource("Kandy3.jpg")));
		Ciudad Bangkok = new Ciudad("Bangkok",new LatLng(13.7563309,100.50176510000006),new ImageIcon(getClass().getResource("Bangkok1.jpg")), new ImageIcon(getClass().getResource("Bangkok2.jpg")), new ImageIcon(getClass().getResource("Bangkok3.jpg")));
		Ciudad ChiangMai = new Ciudad("Chiang Mai",new LatLng(18.7060641, 98.98171630000002),new ImageIcon(getClass().getResource("Chiang-Mai1.jpg")), new ImageIcon(getClass().getResource("Chiang-Mai2.jpg")), new ImageIcon(getClass().getResource("Chiang-Mai3.jpg")));
		Ciudad ChiangRai = new Ciudad("Chiang Rai",new LatLng(19.9104798, 99.84057600000006),new ImageIcon(getClass().getResource("Chiang-Rai1.jpg")), new ImageIcon(getClass().getResource("Chiang-Rai2.jpg")), new ImageIcon(getClass().getResource("Chiang-Rai3.jpg")));
		Ciudad Taipei = new Ciudad("Taipei",new LatLng(25.0329694,121.56541770000001),new ImageIcon(getClass().getResource("Taipei1.jpg")), new ImageIcon(getClass().getResource("Taipei2.jpg")), new ImageIcon(getClass().getResource("Taipei3.jpg")));
		Ciudad Kaoshsjung = new Ciudad("Kaohsiung",new LatLng(22.6272784, 120.30143529999998),new ImageIcon(getClass().getResource("Kaohsiung1.jpg")), new ImageIcon(getClass().getResource("Kaohsiung2.jpg")), new ImageIcon(getClass().getResource("Kaohsiung3.jpg")));
		Ciudad Dusambe = new Ciudad("Dusambe",new LatLng(38.5597722,68.78703840000003),new ImageIcon(getClass().getResource("Dusambe1.jpg")), new ImageIcon(getClass().getResource("Dusambe2.jpg")), new ImageIcon(getClass().getResource("Dusambe3.jpg")));
		Ciudad Judzhant = new Ciudad("Judzhant",new LatLng(40.26751549999999, 69.64528769999993),new ImageIcon(getClass().getResource("Judzhant1.jpg")), new ImageIcon(getClass().getResource("Judzhant2.jpg")), new ImageIcon(getClass().getResource("Judzhant3.jpg")));
		Ciudad Asjabad = new Ciudad("Asjabad",new LatLng(37.9600766,58.32606290000001),new ImageIcon(getClass().getResource("Asjabad1.jpg")), new ImageIcon(getClass().getResource("Asjabad2.jpg")), new ImageIcon(getClass().getResource("Asjabad3.jpg")));
		Ciudad Mary = new Ciudad("Mary",new LatLng(37.6092461, 61.86432519999994),new ImageIcon(getClass().getResource("Mary1.jpg")), new ImageIcon(getClass().getResource("Mary2.jpg")), new ImageIcon(getClass().getResource("Mary3.jpg")));
		Ciudad Turkmenabat = new Ciudad("Turkmenabat",new LatLng(39.0041313, 63.56880799999999),new ImageIcon(getClass().getResource("Turkmenabat1.jpg")), new ImageIcon(getClass().getResource("Turkmenabat2.jpg")), new ImageIcon(getClass().getResource("Turkmenabat3.jpg")));
		Ciudad Ankara = new Ciudad("Ankara",new LatLng(39.9333635,32.85974190000002),new ImageIcon(getClass().getResource("Ankara1.jpg")), new ImageIcon(getClass().getResource("Ankara2.jpg")), new ImageIcon(getClass().getResource("Ankara3.jpg")));
		Ciudad Estambul = new Ciudad("Estambul",new LatLng(41.0082376, 28.97835889999999),new ImageIcon(getClass().getResource("Estambul1.jpg")), new ImageIcon(getClass().getResource("Estambul2.jpg")), new ImageIcon(getClass().getResource("Estambul3.jpg")));
		Ciudad Esmirna = new Ciudad("Esmirna",new LatLng(38.423734, 27.142826000000014),new ImageIcon(getClass().getResource("Esmirna1.jpg")), new ImageIcon(getClass().getResource("Esmirna2.jpg")), new ImageIcon(getClass().getResource("Esmirna3.jpg")));
		Ciudad Taskent = new Ciudad("Tashkent",new LatLng(41.2994958,69.24007340000003),new ImageIcon(getClass().getResource("Tashkent1.jpg")), new ImageIcon(getClass().getResource("Tashkent2.jpg")), new ImageIcon(getClass().getResource("Tashkent3.jpg")));
		Ciudad Bujara = new Ciudad("Bujara",new LatLng(39.7680827, 64.45557689999998),new ImageIcon(getClass().getResource("Bujara1.jpg")), new ImageIcon(getClass().getResource("Bujara2.jpg")), new ImageIcon(getClass().getResource("Bujara3.jpg")));
		Ciudad Hanoi = new Ciudad("Hanoi",new LatLng(21.0277644,105.83415979999995),new ImageIcon(getClass().getResource("Hanoi1.jpg")), new ImageIcon(getClass().getResource("Hanoi2.jpg")), new ImageIcon(getClass().getResource("Hanoi3.jpg")));
		Ciudad Hue = new Ciudad("Hue",new LatLng(16.4498, 107.5623501),new ImageIcon(getClass().getResource("Hue1.jpg")), new ImageIcon(getClass().getResource("Hue2.jpg")), new ImageIcon(getClass().getResource("Hue3.jpg")));
		Ciudad DaNang = new Ciudad("Da Nang",new LatLng(16.0544068,108.20216670000002),new ImageIcon(getClass().getResource("Da-Nang1.jpg")), new ImageIcon(getClass().getResource("Da-Nang2.jpg")), new ImageIcon(getClass().getResource("Da-Nang3.jpg")));
		Ciudad Sana = new Ciudad("Sana",new LatLng(15.3694451,44.19100660000004),new ImageIcon(getClass().getResource("Sana1.jpg")), new ImageIcon(getClass().getResource("Sana2.jpg")), new ImageIcon(getClass().getResource("Sana3.jpg")));
		Ciudad Aden = new Ciudad("Aden",new LatLng(12.7854969,45.018654800000036),new ImageIcon(getClass().getResource("Aden1.jpg")), new ImageIcon(getClass().getResource("Aden2.jpg")), new ImageIcon(getClass().getResource("Aden3.jpg")));
		
		
		tabla.put(1, Kabul); 
		tabla.put(2, Kandahar);	 
		tabla.put(3, Riad); 
		tabla.put(4, Yiida ); 
		tabla.put(5, Erevan); 			
		tabla.put(6, Artashat); 
		tabla.put(7, Baku); 
		tabla.put(8, Ganya); 
		
		tabla.put(9, Daca);	
		tabla.put(10, Chittagong); 
		tabla.put(11, Riffa); 
		tabla.put(12, Naipyido); 
		tabla.put(13, Rangun);
		tabla.put(14, Bandar); 
		
		tabla.put(15, Thimphu); 		
		tabla.put(16, Paro);				
		tabla.put(17, NomPen);  
		tabla.put(18, KiemRiep);  
		tabla.put(19, Doha);  
		tabla.put(20, Pekin);  
		tabla.put(21, Shanghai);  
		tabla.put(22, Tianjin);  
		tabla.put(23, Canton);  
		
		tabla.put(24, Pionyang);  
		tabla.put(25, Hamhung); 
		tabla.put(26, Seul);  
		tabla.put(27, Busan);  
		tabla.put(28, AbuDabi);  
		tabla.put(29, Manila);  
		tabla.put(30, Cebu);  
		
		tabla.put(31, Tiflis);  
		tabla.put(32, Sujumi);  
		tabla.put(33, NuevaDelhi);  
		tabla.put(34, Mumbai);  
		tabla.put(35, Agra);  
		tabla.put(36, Calcuta);  
		tabla.put(37, Yakarta);  
		tabla.put(38, Surabaya);  
		tabla.put(39, Bandung);  

		tabla.put(49, Bagdad);  
		tabla.put(41, Mosul);  
		tabla.put(42, Kirkuk);  
		tabla.put(43, Teheran);  
		tabla.put(44, Isfahan);  
		tabla.put(45, Jerusalen);  
		tabla.put(46, TelAviv);  
		tabla.put(47, Tokio);  
		tabla.put(48, Kioto);  
		
		tabla.put(49, Osaka);  
		tabla.put(50, Hiroshima);  
		tabla.put(51, Aman);  
		tabla.put(52, Gerasa);  
		tabla.put(53, Astana);  
		tabla.put(54, Almaty);  
		tabla.put(55, Biskek);  
		
		tabla.put(56, Osh);  
		tabla.put(57, KuwaitCity);  
		tabla.put(58, Vientiane);  
		tabla.put(59, LuangPrabang); 
		tabla.put(60, Beirut);  
		tabla.put(61, KualaLumpur);  
		tabla.put(62, PulauPinang);  
		tabla.put(63, Male);  
	
		tabla.put(64, UlanBator);  
		tabla.put(65, Moron);  
		tabla.put(66, Erdenet);  
		tabla.put(67, Katmandu);  
		tabla.put(68, Pokhara);  
		tabla.put(69, Mascate);  
		tabla.put(70, Salalah);  

		tabla.put(71, Islamabad);  
		tabla.put(72, Karachi);  
		tabla.put(73, Hebron);  
		tabla.put(74, Rafah);  
		tabla.put(75, Singapur);  
		tabla.put(76, Damasco);  
		
		tabla.put(77, Alepo);  
		tabla.put(78, Homs);  
		tabla.put(79, Colombo);  
		tabla.put(80, Kandy);  
		tabla.put(81, Bangkok);  
		tabla.put(82, ChiangMai);  
		tabla.put(83, ChiangRai);  
		tabla.put(84, Taipei);  
		
		tabla.put(85, Kaoshsjung);  
		tabla.put(86, Dusambe);  
		tabla.put(87, Judzhant);  
		tabla.put(88, Asjabad);  
		tabla.put(89, Mary);  
		tabla.put(90, Turkmenabat);  
		
		tabla.put(91, Ankara);  
		tabla.put(92, Estambul);  
		tabla.put(93, Esmirna);  
		tabla.put(94, Taskent);  
		tabla.put(95, Bujara);  
		
		tabla.put(96, Hanoi);  
		tabla.put(97, Hue);  
		tabla.put(98, DaNang);  
		tabla.put(99, Sana);  
		tabla.put(100,Aden);  
		
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
 	HashMap<Integer, Ciudad> ciudades = Mapa.asia.getTabla();
 
	double num = Math.random()*multiplicador;
	int n = (int)num;
	 
	return ciudades.get(n);
		
	}
	
	

}
