package practice;

import java.util.LinkedList;
import java.util.List;

public class Stack<E> {

	List<E> list = new LinkedList<>();
	
	public void push(E e) {
		list.add(e);
	}
	public void pop() throws Exception {
		
		if(list.isEmpty()) {
			throw new Exception("poping from empty list cannnot be done");
		}
		int n = list.size();
		list.remove(n-1);
	}
	public E peek(){
		int n = list.size();
		return list.get(n-1);
	}
}
