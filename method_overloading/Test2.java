public class Test2{
  void sum(int a,float b){
	System.out.println("testing account "  + (a+b));
  }
  void sum(int a,float b, int c){
   	System.out.println(" total 3 argument  " + (a+b+c));
  }
  public static void main(String[] args){
	Test2 t2 = new Test2();
	t2.sum(2,2);
	t2.sum(2,2,3);
 }
}	
