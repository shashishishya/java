//copy of the constuctor with constuctor usage
class Test1{
  int id;
  String name;

Test1(int id,String name){
	this.id=id;
	this.name=name;
}
Test1(Test1 t){
	id=t.id;
	name = t.name;
}
void display(){
	System.out.println("values are the " + id + " " + name );
}
public static void main(String args[]){
	Test1 t1 = new Test1(2,"basavarajappa");
	Test1 t2 = new Test1(t1);
	t1.display();
	t2.display();
}
}
