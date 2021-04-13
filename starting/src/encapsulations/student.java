package encapsulations;

public class student {
	private int age;
	private String name;
	
	public void getAge(int age,String name) {
		System.out.println("my name is "+ name);
	}
    public void setAge(int age) {
    	if(age>20) {
    		System.out.println("you are too old to be a student of this school");
    		
    	}else {
    		this.age = age;
    		System.out.println("you are eligible to go to school ");
    	}
    }
}
