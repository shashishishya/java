//StringBuffer can mutables means we can able to change the string 

//example shown below side

public class Test1{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("java");
		StringBuffer sb1 = new StringBuffer("kumar");
		sb.append("hello");
		sb1.insert(0,"shashi");
		//java code here to insert the value where ever the string is free like position and string
		System.out.println("output is   " + sb);
}
}
