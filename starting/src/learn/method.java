package learn;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		          Scanner s = new Scanner(System.in);
		          System.out.println("enter no of elements");
		          int n= s.nextInt();
		          System.out.println("enter the no of rotation you want");
		          int k= s.nextInt();
		          int a[]= new int[n];
		          int b[]=new int[n];
		          
		          System.out.println("enter the elements of array");

		        for(int i=0;i<n;i++){
		            a[i]=s.nextInt();
		        }

		        for(int i=0;i<n-k;i++){
		            a[i]=b[k+i];
		        }

		        for(int i=0;i<k;i++){
		            a[n-1-i]=b[i];
		        }
		        
		        for(int i=0;i<n;i++){
		            System.out.print(b[i]+" ");
		        }



		        /* Sample code to perform I/O:
		         * Use either of these methods for input

		        //BufferedReader
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String name = br.readLine();                // Reading input from STDIN
		        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		        //Scanner
		        Scanner s = new Scanner(System.in);
		        String name = s.nextLine();                 // Reading input from STDIN
		        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		        */

		        // Write your code here

		    
		

      }
}
