// if you declare value it's should be icrement value
class Counterstatic
{
  static int count =0 ;
  Counterstatic(){
	count++;
	System.out.println(" counted value " + count );
  }

  public static void main(String args[]){
	Counterstatic c1 = new Counterstatic();
	Counterstatic c2 = new Counterstatic();
	Counterstatic c3 = new Counterstatic();
  }
}
