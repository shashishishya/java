//method using equals and sorting and reference method
public class Compare{
	public static void main(String args[]){
		String s1 = "shashi";
		String s2 = "shashi";
		String s5 = "SHASHI";
		String s3 = new String("shashi");
		String s4 = "kumar";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));

		// equals compare the without the reference value gives true result
}}
