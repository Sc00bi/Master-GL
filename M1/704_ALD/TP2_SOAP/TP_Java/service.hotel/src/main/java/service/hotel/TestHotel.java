package service.hotel;

import java.util.ArrayList;
import java.util.Date;

/*
 * Classe de test du projet de gestion d'Hotels
 */
public class TestHotel {

	public static void main(String[] args) {
		Date d1 = new Date(2020, 10, 9);
		Date d2 = new Date(2020, 9, 10);
		System.out.println(d1.before(d2));
		System.out.println(d2.before(d1));
		
		ArrayList<Integer> formule1 = new ArrayList<Integer>();
		formule1.add(1);
		
		ArrayList<Integer> formule2 = new ArrayList<Integer>();
		formule2.add(2);
		
		ArrayList<Integer> formule3 = new ArrayList<Integer>();
		formule3.add(2);
		formule3.add(2);
		
		Chambre chambre101 = new Chambre(formule1, 101, 55.5);
		Chambre chambre102 = new Chambre(formule1, 102, 55.5);
		Chambre chambre103 = new Chambre(formule1, 103, 55.5);
		
		Chambre chambre201 = new Chambre(formule2, 201, 71.0);
		Chambre chambre202 = new Chambre(formule2, 202, 71.0);
		
		Chambre chambre301 = new Chambre(formule3, 301, 108.0);
		
		chambre301.estDipo(d1, d2);
		
		Client tom = new Client("Bros", "Tom", 12345678, 9, 22);
		
		Reservation r1 = new Reservation(tom, "2022/08/09", "2022/08/12");
		
		System.out.println(chambre301.reserver(r1));
		
		Reservation r2 = new Reservation(tom, "2022/08/09", "2022/08/12");
		
		System.out.println(chambre301.reserver(r2));
		
		Adresse adr1 = new Adresse("France", "Montpellier", "d'Argencourt", 190);
		
		System.out.println(adr1);
		
		PositionGPS gps1 = new PositionGPS(43.6120942 ,3.8844784);
		
		System.out.println(gps1);
		
		Hotel hotel1 = new Hotel("Crowne Plaza", 4, gps1, adr1);
		
		System.out.println(hotel1);
		
		System.out.println(chambre103);
		
		System.out.println(r1);
		
		
		
		
		
		
		

	}

}
