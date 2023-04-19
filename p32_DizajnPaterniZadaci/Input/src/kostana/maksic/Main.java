package kostana.maksic;

import java.io.DataInputStream;
import java.io.FileOutputStream;


public class Main {

	public static void main(String[] args) throws Exception {
		/*Osnovne UI operacije 
		 * Za ulazne i izlazne operacije UI Java koristi tokove(Stream)
		 * Strimovi obezbedjuju nacine za rad sa podacima koji se primaju i salju
		 */
		
		//Klasa koja omogucuje da se poveze tastatrua sa strimom ili tokom
		DataInputStream dis = new DataInputStream(System.in);
		
		//Povezivanje fajla sa klasom FileOutputStream podaci koji se unose do zadatog fajla
		FileOutputStream fos = new FileOutputStream("rezultat.txt");
		
		System.out.println("Danas cu poloziti Javu :)");
		
		//read()
		//write()
		char ch;
		while ((ch = (char)dis.read()) != '$') {
				fos.write(ch);
			}
		fos.close();
		
	}

}