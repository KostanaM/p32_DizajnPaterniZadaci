package k;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class hfaha {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("koki.txt");
		System.out.println("Sadrzaj fajla");
		
		int t;
		while((t = fis.read()) != -1) {
			System.out.print((char)t);
			int ch;
			
		}
			fis.close();
	
		
	}

}
