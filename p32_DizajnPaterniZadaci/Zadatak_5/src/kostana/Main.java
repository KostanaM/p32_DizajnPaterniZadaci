package kostana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
				
		Scanner ulaz = new Scanner (System.in);
		System.out.println("Unesite broj n: ");
		int n = ulaz.nextInt();
		
		int x[] = new int[100];
		
		
		System.out.println("Unesite brojeve: ");
		for(int i=1; i<=n; i++) {
		x[i]=ulaz.nextInt();
		}
		int s=0;
		for(int i=1; i<=n; i++) {
			if(x[i] % 2 !=0 && x[i] < 0) {
				s += x[i];}
		else if (x[i]== 0)
				System.out.println("Greska");
			
			}
		System.out.println(s);	
		ulaz.close();
		}
			

		}
	
		


	
