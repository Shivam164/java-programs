package question;

import java.util.Scanner;

public class Flip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the elements of array");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		if(n%2==0) {
			for(int i=0;i<n/2;i++) {
				int temp = a[i];
				a[i]=a[n-1-i];
				a[n-1-i]=temp;
			}
		}
		
		else {
			for(int i=0;i<n/2;i++) {
				int temp = a[i];
				a[i]=a[n-1-i];
				a[n-1-i]=temp;
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
