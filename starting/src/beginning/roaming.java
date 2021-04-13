package beginning;
import java.util.Scanner;
public class roaming {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your chemistry marks");
		int chem = sc.nextInt();
        System.out.println("enter your mathematics marks");
        int maths = sc.nextInt();
        System.out.println("enter your physics marks");
        int phy = sc.nextInt();
        System.out.println("Average of your marks is:");
        System.out.println(chem+maths+phy/3);
	}

}
