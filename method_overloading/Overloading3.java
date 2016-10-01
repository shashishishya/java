//type promotion method using the overloading method
class Overloading3{
	//always call this file insted of the existing file this is easy way to do if may any error 
	//it will make precission error
	void show(int a, long b){
	//	int c=a+b; this will also through some error because type missmatch
		System.out.println("sum value " + (a+b));
	}
	void show(long a,int b){
		System.out.println("three letters value ");
	}

public static void main(String[] args){
	Overloading ov = new Overloading();
	//ov.show(10,10);
	ov.show(20,20);
//	ov.show(30); this method id not there it will through error finally
}
}
