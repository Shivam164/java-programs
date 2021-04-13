package queue;
import java.util.*;
public class MyQueue{
	public static int  s(int q[],int p){
        int sum1 = 0;
        for(int i = 0;i<p;i++){
            sum1 = sum1 + q[i];
        }
        return sum1;
    }
	public static void main(String[] args) {
		 
		   
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int n = s.length();
        System.out.println(n);
        for (int i = 0;i>n;i++){
        	 System.out.println("hi");
            st.push(s.charAt(i));
        }
        System.out.println(st);
        int sum = 0;
        int sum1 = 0;
        while(n>0){
            if(st.empty()){
                break;
            }
            if(st.peek()=='(' && sum1==0){
                sum++;
               
                st.pop();
            }else if(st.peek()=='(' && sum1!=0){
                sum1--;
                st.pop();
            }else{
                sum1++;
                st.pop();
            }
            n--;
        }
        System.out.println(sum1 + sum);

	}
}
