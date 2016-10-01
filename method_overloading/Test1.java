/*
	this code help full access overloading method calling.

*/

public class Test1{
		void sum(int a,int b){
			System.out.println("total two arguments" + (a+b));
		}
		void sum(int a, int b,int c){
			System.out.println("total three arguments" + (a+b+c));
		}
	public static void main(String[] args){
		Test1 t1 = new Test1();
		t1.sum(2,3);
		t1.sum(2,3,4);
	}
}	
