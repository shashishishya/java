/*
If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it

*/

class Staticmethod{
	int id;
	String name;
	static String col = "SSIT";
	
	static void change(){
	  col = " SHASHIKUMAR";
	}
	Staticmethod(int id,String name){
		this.id = id;
		this.name = name;
	}

	void display(){
		System.out.println("output value " + id + " " + name + " " + col );
	}

public static void main(String args[]){
	// to invoke the static change method 
	Staticmethod.change();
	Staticmethod s1 = new Staticmethod(1,"chandrappa");
	Staticmethod s2 = new Staticmethod(2,"bASAVARAJAPPA");

	s1.display();
	s2.display();	
 }
}
