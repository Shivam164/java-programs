package practice;

import java.util.*;


public class Iterval {
	public static LinkedList<Integer> rotate(LinkedList<Integer> l,int i,int j){
	       int k=0;
	       if((j-i+1)%2 == 0){
	           while(k+i<=(i+j)/2){
	               int temp = l.get(k+i);
	               l.set(k+i,l.get(j-k));
	               l.set(j-k,temp);
	               k++;
	           }
	       }else{
	            while(k+i<(i+j)/2){
	                int temp = l.get(k+i);
	                l.set(k+i,l.get(j-k));
	                l.set(j-k,temp);
	                k++;
	               }
	           }
	           return l;
	   }
	public static void main(String[] args) {
		
		 LinkedList<Integer> list = new LinkedList<>();
		 
	       list.add(23);
	       list.add(14);
	       list.add(92);
	       rotate(list,1,2);
	       System.out.println(list);
		
			}

}
