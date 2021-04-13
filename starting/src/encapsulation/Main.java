package encapsulation;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		


		List<Integer> l = new LinkedList();
		
		l.add(2);
		l.add(4);
		l.add(8);
		l.add(0);
		l.set(3,7);
		
		int n = l.size();
		
		Iterator<Integer> here = l.iterator();
		
		System.out.println(l.get(3));
		
		System.out.println(l.contains(5));
		
		

 


	}

	
        }

