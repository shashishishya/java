class Student{
  int id;
  String name;

  void display(){
	System.out.println("helo shshi \n" + id + name);
  }

public static void main(String[] args){
	Student s = new Student();
	s.display();
	//if ewe use this value it will create default constuctor values
	s.display();
}
}
