package beginning;
import java.util.Scanner;
public class ayush {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
        if(age<18) {
        	System.out.println("you are a child,can't go in");
        }if(age>=18) {
        	System.out.println("you are eligible to go in");
        }
	}

}
