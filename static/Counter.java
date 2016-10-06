class Counter{
	int counter = 0;
	Counter(){
		counter++;
		System.out.println("value id the " + counter);
		//this will reset again and it won't changes
	}
	
public static void main(String[] args){
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	Counter c3 = new Counter();
}
}	
