/* this copy constructor with out using copy constuctor method method

	using object datavalue copy we can do some situtions occured 

*/
class Test2{
	int id;
	String name;
	Test2(int id,String name){
		this.id=id;
		this.name = name;
	}
	Test2(){
	}
	void display(){
		System.out.println("output getting in the form of the " + id + " " + name);
	}
	
	public static void main(String args[]){
		Test2 t1 = new Test2(2,"shobha");
		Test2 t2 = new Test2();
		t2.id = t1.id;
		t2.name = t1.name;
		t1.display();
		t2.display();
	}
 }
