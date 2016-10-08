class Test2{
	int id;
	String name;
//with any of the this keyword
/*

hello world  1 shashikumar
hello world  2 jakkali

*/
	Test2(int id,String name){
		this.id=id;//used this keyword here
		this.name=name;
	}

	void display(){
		System.out.println("hello world  " + id + " " + name);
	}
	public static void main(String args[]){
		Test2 t1 = new Test2(1,"shashikumar");
		Test2 t2 = new Test2(2,"jakkali");
		t1.display();
		t2.display();
	}
}
