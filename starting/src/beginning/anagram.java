package beginning;
import java.util.Scanner;
public class anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first word :");
		String a = sc.nextLine();
        System.out.println("enter the second word :");
        String b = sc.nextLine();
        boolean isAnagram = false;
		boolean visited[] = new boolean[a.length()];

        if(a.length() == b.length()) {
        	
        	for(int i=0;i<a.length();i++) {
        		isAnagram = false;
        		for(int j=0;j<b.length();j++) {
        			if(a.charAt(i) == b.charAt(j) && !visited[j]) {
        				isAnagram = true;
        				visited[j] = true;
        				break;
        		}
        	}if(!isAnagram) {
        		break;
        	}
        	}
        }
        	if(isAnagram) {
        		System.out.println("is an anagram");
        	}
        else {
        	System.out.println("not an anagram");
        }
	}

}
