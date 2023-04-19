package kostana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite sate: ");
		int sat = sc.nextInt();

		System.out.print("Unesite minute: ");
		int minute = sc.nextInt();
		
		
		if (sat >= 9 &&  sat < 17 ) {
				System.out.print("Mail je poslat u toku radnog vremena ");	
			}
		
		else System.out.print("Posaljite mail u toku radnog vremena. Izmedju 9 i 17h");
			

	}

}
