class Student5{
	int id;
	String name;
	int age;
	Student5(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student5(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age = age;
	}

	void display(){
		System.out.println( id + "  " + name + "  " +age +"\n");
	}

public static void main(String args[]){
	Student5 st1 = new Student5(1,"shashikumar");
	Student5 st2 = new Student5(1,"shashikumar",23);	
	// in the first it takes age as the 0
	// in second it takes value from it
	st1.display();
	st2.display();
	}
   }
