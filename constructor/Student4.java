class Student4{
	int id;
	String name;
	Student4(int id,String name){
		this.id = id;
		this.name =name;
	}
	void display(){
		System.out.println("output  " + id + " " + name);
	}

	public static void main(String args[]){
	 Student4 s1 = new Student4(2,"shashikumar");
	Student4 s2 = new Student4(3,"shashikumar jakkali basavarajappa");
	s1.display();
	s2.display();
	}
}
