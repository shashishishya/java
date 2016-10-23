//and this reference compare oprator will give false if you compare using the == operator

public class Compare1{
	public static void main(String args[]){
		String s1 = "shashi";
		String s2 = "shashi";
		String s3 = new String("shashi");
		//refernce object

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);//compare refernce object with different object
		//it return false only
}
}
