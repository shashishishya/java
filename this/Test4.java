//this is based on the this keyword invoke method

class Test4{
	int id;
	String name;
	
	Test4(){
		System.out.println("default constructor -----------------");
	}

	Test4(int id,String name){
		this();
		this.id = id;
		this.name = name;
	}

	void display(){
		System.out.println("outcome is " + id + name);
	}
	public static void main(String args[]){
		Test4 t1 = new Test4(1,"basavar");
		Test4 t2 = new Test4(2, "shobha");
		t1.display();
		t2.display();
	}
	}
