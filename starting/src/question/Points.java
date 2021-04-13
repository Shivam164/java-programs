package question;
import java.util.Scanner;
public class Points {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
      	int x=0;
	int t=n/3;
	int u=n/5;
	int v=n/10;
	
	for(int i=0;i<=t;i++){
	    for(int j=0;j<=u;j++){
	        for(int k=0;k<=v;k++){
	            if(n==3*i+5*j+10*k){
	                x++;
	            }
	        }
	    }
	}
	
        
        System.out.println("no. of possible ways "+ x);
	}

}
