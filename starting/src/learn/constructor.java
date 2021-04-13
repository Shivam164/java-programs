package learn;
class car{
	int wheels;
	car(){
		
	}
	boolean isSmooth;
	String colour;
	car(String colour){
		this.colour=colour;
		System.out.println("colour of my car is "+ colour);
	}
}
public class constructor {

	public static void main(String[] args) {
     car car1 = new car("red");
     System.out.println(car1.colour);
	}

}
