// String classes

public class Test1{
	public static void main(String args[]){
		String s1 = "Shashi";

		System.out.println(s1.toUpperCase());//convert to uppser case
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		// final value should original value not latest changes
		//trimming code value
		String s2 = "           shashikumar   ";
		System.out.println("without string  " +s2);
		System.out.println("trimming string  " +s2.trim());

		//startswith and endsWith
		//gives the boolean value insted string
		System.out.println("startwith function string  " +s1.startsWith("Sh"));
		System.out.println("ends with function string  " +s1.endsWith("hi"));
	
		// if you want find charAt latter by position

		System.out.println("values at position 2  " + s1.charAt(2));
		System.out.println("values at position 5  " + s1.charAt(5));

		//finding leangth of the string

		System.out.println("leangth of the string " + s1.length());
		// it cacluting the value of the string include the string
		System.out.println("leangth of the string " + s2.length());

			//String.valueOf() function will take the values from declared variable

		int a = 10;
		String s = String.valueOf(a);
		
		System.out.println("aaaaaaaaa   " + s + 10);

		// our replasing string concept which ever you want it

		String s5 = "shashi is working in HARMAN connected services";
		String s6 = s5.replace("shashi","SHASHIKUMAR");
		System.out.println("final String afetr replacement   " + s6);


}
}
