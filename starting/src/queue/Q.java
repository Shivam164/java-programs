package queue;

import java.util.*;

public class Q {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int q = sc.nextInt();
		int arr[] = new int[q];
		List<Integer> l = new LinkedList<>();
		for(int i = 0;i<n;i++) {
			int a = sc.nextInt();
			l.add(a);
		}
	
		for(int i = 0;i<q;i++) {
			int b = sc.nextInt();
			int k = l.indexOf(b);			
			l.remove(k);
			l.add(0,b);
			arr[i]=k;
		}
		
		for(int i = 0;i<q;i++) {
			System.out.print((arr[i]+1) + " ");
		}
	}

}
