package question;

import java.util.Scanner;

public class Rotation {
	
	static void leftrotate(int arr[],int n) {
		int temp = arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of elements in the array");
		int n= sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the elements of the ");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the number of rotations you want in array");
		int k=sc.nextInt();
		
		for(int j=0;j<k;j++) {
			leftrotate(a,n);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		

	}

	

}
