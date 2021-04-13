package learn;
class Modi{
	String name;
	void eat() {
		System.out.println("Modi is eating");
	}
	Modi(String name){
		this.name=name;
	}
}
	class Papu extends Modi{
		Papu(String name) {
			super(name);
		}
		{
			System.out.println(" i am in the block");
		}
		void eat() {
			System.out.println("Papu is eating");
		}
		void word() {
			super.eat();
			eat();
		}
	}

public class Polymorphism {

	public static void main(String[] args) {
		
  Papu p = new Papu("Rahul");
  p.word();
     
	}

}
 
