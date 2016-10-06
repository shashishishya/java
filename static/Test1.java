class Test1{
	int id;
	String name;
	static String col ="SSIT"; // static variable is unique it con't able to change
	Test1(int id,String name){
		this.id = id;
		this.name = name;
	}


	void display(){
		System.out.println("our code is the " + id + " " + name + "  " + col);
	}
	public static void main(String args[]){
		Test1 t1 = new Test1(2,"shashikumar jakkali");
		Test1 t2 = new Test1(3," ashko kumar dgl");
		t1.display();
		t2.display();
}
}
