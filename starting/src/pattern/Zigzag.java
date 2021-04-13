package pattern;

import java.util.Scanner;

public class Zigzag {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int i=0;i<n;i=i+4) {
			System.out.print("   *");
		}
		
		System.out.println(" ");
		System.out.print(" ");
		
		for(int i=0;i<n;i=i+2) {
			System.out.print(" *");
		}
		
		System.out.println(" ");
		System.out.print(" ");
		
		for(int i=0;i<n;i=i+4) {
			System.out.print("*   ");
		}
     
	}

}
