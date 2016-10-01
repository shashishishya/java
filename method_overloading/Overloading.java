//type promotion method using the overloading method
class Overloading{
	void show(int a, long b){
	//	int c=a+b; this will also through some error because type missmatch
		System.out.println("sum value " + (a+b));
	}
	void show(int a,int b,int c){
		int d = a+b+c;
		System.out.println("three letters value " + d);
	}

public static void main(String[] args){
	Overloading ov = new Overloading();
	ov.show(10,10);
	ov.show(20,20,20);
//	ov.show(30); this method id not there it will through error finally
}
}
