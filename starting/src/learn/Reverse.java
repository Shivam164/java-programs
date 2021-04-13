package learn;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int i = a.length()-1;
		String ans = "";
		while(i>=0) {
			ans=ans.concat(a.substring(i,i+1));
			i--;
		}
		System.out.println(ans);

	}

}
