package pattern;

class robot{
	 static void sayhi() {
		System.out.println("i am in robot :)");
	}
}

public class ReadStatic extends robot{
	
	static int cube(int x) {
		
		return x*x*x;
	}
	
     void read() {
    	 super.sayhi();
		System.out.println("yes i am in method");
	}

	public static void main(String[] args) {
		
		ReadStatic obj = new ReadStatic();
		
		obj.read();
		
		
		
		robot r = new robot();
		r.sayhi();
		
		System.out.println(cube(8));
		
		

	}

}
