//this is without this keyworld by using local instance variable proceccing

class Test3{
	int id;
	String name;
	Test3(int i,String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println("helo world  " + id + name);
	}
	public static void main(String args[]){
		Test3 t1 = new Test3(1,"shashi");
		Test3 t2 = new Test3(2, "jakkaliajs");
		t1.display();
		t2.display();
	}
}
