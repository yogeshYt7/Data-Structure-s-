package DSA;

public class Queue {
	int[] arr;
	int beginingofQueue;
	int topofQueue;

	public Queue(int size) {
		arr = new int[size];
		beginingofQueue = -1;
		topofQueue = -1;
		System.err.println("The Queue is Created Successfully");
	}

	public boolean isEmpty() {
		if ((beginingofQueue == -1) || (topofQueue == arr.length - 1)) {
			return true;

		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (topofQueue == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}
	public void enQueue(int value) {
		if (isFull()) {
			System.err.println("Queue is full");
		}else if (isEmpty()) {
			beginingofQueue=0;
			topofQueue++;
			arr[topofQueue]=value;
			System.out.println("The value "+value+" is inserted");
		}else {
			topofQueue++;
			arr[topofQueue]=value;
			System.out.println("The value "+value+" is inserted");
			
		}
	}
	public int deQueue(int i) {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			int value= arr[beginingofQueue];
			beginingofQueue++;
			if (beginingofQueue>topofQueue) {
				beginingofQueue=topofQueue=-1;
			}
			return value;
		}
		
	}
	public void delete() {
		arr= null;
		System.out.println("Queue is Deleted");
		
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
//		*******************************
			q.enQueue(10);
			q.enQueue(20);
			q.enQueue(30);
			q.enQueue(40);
			q.enQueue(50);
			q.enQueue(60);
			q.enQueue(52);
//		******************************
		System.out.println(q.deQueue(40));
		q.delete();
	}

}
