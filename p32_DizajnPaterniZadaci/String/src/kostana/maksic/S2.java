package kostana.maksic;

public class S2 {

	public static void main(String[] args) {

		char ch[] = { 'J', 'A', 'V', 'A' };

		String s7 = new String(ch);
		// Duzina stringa dobija se pomocu metode length
		System.out.println(" String = " + s7);
		System.out.println(" String = " + s7.length());
		System.out.println(" Duzina = " + "Java test primer".length());

		// Metoda equals vrsi leksikografsko poredjenje stringova, pri cemu se pravi
		// razlika izmedju
		// velikih i malih slova. Vraca true ako su stringovi isti, u suprotnom vraca
		// false.
		// Metoda iqualsIgnoreCase leksikograski poredi stringove, ali ne pravi razliku
		// izmedju malih i velikih slova.
		// Metoda copareTo poziva se kao:
		// s1.compareTo(s2)
		// vraca 0 ako su s1 i s2 jednaki, negativan broj ako je s1 manji, pozitivan
		// broj ako je s1 veci od s2.

		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";

		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + " equalsIgnoreCase " + s10 + " = " + s8.equalsIgnoreCase(s10));

		boolean b;

		String s11 = "JAVA";
		String s12 = "JAVA";
		String s13 = "Java";
		String s14 = new String("JAVA");
		String s15 = new String("JAVA");

		System.out.println(s11 + " equals " + s12 + " = " + s11.equalsIgnoreCase(s12));
		System.out.println(s11 + " == " + s12 + " = " + (s11 == s12));
		System.out.println(s11 + " equals " + s13 + " = " + s11.equals(s13));
		System.out.println(s11 + " == " + s13 + " = " + (s11 == s13));
		System.out.println(s11 + " equals " + s14 + " = " + s11.equals(s14));
		System.out.println(s11 + " == " + s14 + " = " + (s11 == s14));
		System.out.println(s14 + " equals " + s15 + " = " + s14.equals(s15));
		System.out.println(s14 + " == " + s15 + " = " + (s14 == s15));

		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";
		System.out.println(s16 + " compared to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compared to " + s18 + " = " + s16.compareTo(s18));

	}

}