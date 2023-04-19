package kostana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int s=0, broj=0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Unesite n: ");
		 int n = sc.nextInt();
		
		 System.out.println("Unesite brojeve: ");
		 for(int i = 1; i <= n; i++) {
			 broj = sc.nextInt(); 
		 }
		 
		if(broj % 2 != 0 && broj < 0) {
			s += broj;
			
		System.out.println("Zbir neparnih i negativnih brojeva je " + s);	}
	 }
			
}

