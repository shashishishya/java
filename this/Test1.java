class Test1{
	int id;
	String name;
//without any of the this keyword
/*

hello world  0 null
hello world  0 null

*/
	Test1(int id,String name){
		id=id;
		name=name;
	}

	void display(){
		System.out.println("hello world  " + id + " " + name);
	}
	public static void main(String args[]){
		Test1 t1 = new Test1(1,"shashikumar");
		Test1 t2 = new Test1(2,"jakkali");
		t1.display();
		t2.display();
	}
}
