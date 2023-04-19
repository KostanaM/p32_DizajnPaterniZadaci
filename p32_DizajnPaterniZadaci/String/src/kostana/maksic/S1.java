package kostana.maksic;

public class S1 {

	public static void main(String[] args) {
		// 1. Stringovi se predstavljaju klasom String

		String str = "123dsfgqgrgg____/5fe6+";
		System.out.println(str);

		// 2. Kreiranje stringa pomocu kljucne reči new
		String str1 = new String("Danas je utorak 24.01.2023.");
		System.out.println(str1);

		// 3. Inicijalizacija stringa posotjecim stringom
		String s1 = "Podatak1";
		System.out.println(s1);
		String s2 = new String(s1);
		System.out.println(s2);

		// 4. Inicijalizacija nizom char vrednosti
		char s3[] = { 'J', 'a', 'v', 'a' };
		System.out.println(s3);

		// 5. Inicijalizacija podnizom
		String s4 = new String(s3, 1, 3);
		String s5 = new String();
		System.out.println(s4);
		
	}
}
