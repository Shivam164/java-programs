package question;
import java.util.Scanner;
public class Triple {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number in array ");
	int n = sc.nextInt();
	int array[] = new int[n];
	if(n>3) {
	boolean isTriplet = false;
	int t = 0;
	for(int i =0;i<n;i++) {
		array[i] = sc.nextInt();
	}
	for(int i =0;i<n-1;i++) {
		 isTriplet = false;
		for(int j =1+i;i<n;i++) {
			for(int k =1+j;k<n;k++) {
				if(array[i]+array[j]+array[k]==0) {
					t++;
				}
			}	
		}
	}
	System.out.println(t+" no of possible triplet ");
	}else {
		System.out.println(" no. of elements in array should be greater than 2");
	}
	}

}
