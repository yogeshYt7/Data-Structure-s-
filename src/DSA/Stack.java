package DSA;
//stack is linear data structure which follow LIFO
//in b/w of Stack insertion and deletion of stack

public class Stack {
	int [] arr;
	int topofStack;
	public Stack(int size) {
		arr= new int[size];
		topofStack=-1;
		System.out.println("the stack is created with size of "+size);
		
	}
	public boolean isEmpty() {
		if (topofStack==-1) 
		{
			return true;	
		}else {
			return false;
		}
		
		
	}
	public boolean isfull() {
		if (topofStack==arr.length-1) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
