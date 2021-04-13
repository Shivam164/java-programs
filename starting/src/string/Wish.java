package string;

import java.util.*;

public class Wish {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
	        int r=0;
	       
	       for(int i = 0;i<t;i++){
	           int n = sc.nextInt();
	           int a = sc.nextInt();
	           int b = sc.nextInt();

	           r = (n*n*a*b)/(a+b) +1;
	           System.out.println(r);

	}

}}
