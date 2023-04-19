package kostana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj:");
		int broj = 0;

		broj = sc.nextInt();
		// int broj1=0;
		int cifra = 0;
		int t = broj;
		int broj1 = 0;

		while (broj > 0) {
			cifra = broj % 10;
			
			broj = broj / 10;
			broj1=cifra;
			System.out.println(broj1);
		}
			
				System.out.println(broj1);
			
		}

	}


