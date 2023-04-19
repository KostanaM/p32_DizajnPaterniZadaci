package kostana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
		System.out.println("Unesite broj:");
		int n;
		if(n>0) 	{
		n = sc.nextInt();	
		}
		int cifra = 0;
		int t=broj;
		int broj1=0;
		while  (broj > 0) {
			
			cifra = broj % 10;	
			broj1=(broj1*10)+cifra;
			broj = broj / 10; 
		}
			System.out.println(broj1);
		
		if (t==broj1){
		System.out.println("Broj je polidron");
		}
		else 
			System.out.println("Broj nje polidron");
	sc.close();
	}
		
					
	}