package practice;

public class Node {
	
	N head;
	
	void add(int data) {
		N toAdd = new N(data);
		
		N temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	static class N{
		int data;
		N next;
		
		public N(int data) {
			this.data = data;
			next = null;
		}
	}
}
