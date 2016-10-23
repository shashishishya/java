class A{

void msg(){
	System.out.println("hello a class");
}
}
class B{
void msg(){
	System.out.println(" hello b class");
}
}
// this multiple inheritance not support in the java
class C extends A,B{
	public static void main(String args[]){
		C obj = new C();
		obj.msg();
	}
}
