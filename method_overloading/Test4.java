public class Test4{
	void show(int a,int b){
		System.out.println("sum of the value " + (a+b));	
	}
	void show(double a,double b){
		System.out.println("double value is the " + (a+b));				
	}
	
	public static void main(String[] args){
		Test4 t4 = new Test4();
		t4.show(10.2,10.4);
		t4.show(2,2);	
	}
}