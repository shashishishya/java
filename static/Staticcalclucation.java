class Staticcalclucation{
 // cube caluclate the value	
	static int cube(int x){
		return (x*x*x);
	}
	
	public static void main(String args[]){
		// pass the value to the above function
		int result = Staticcalclucation.cube(5);
		System.out.println("output values  " + result );
	}
 }
