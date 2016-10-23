class Operation{
	int square(int n){
		return n*n;
	}
}
// this is the way of the user od code reusabilty
class Circle{
	Operation op;
	double pi =3.142;
	double area(int radius){
		op = new Operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}

public static void main(String args[]){
	Circle c = new Circle();
	double d = c.area(3);
	System.out.println("hello sir "+ d);
	}
}
		
