
public class Queue {
	int[] arr;
	int topOfQueue;
	int beginingOfQueue;
	
	public Queue(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginingOfQueue = -1;
		System.out.println("The Queue is successfully created with  size of: " + size);
	}
	
	public void deleteQueue() {
		arr = null;
		System.out.println("The Queue is Successfully Deleted!");
	}
	//deQueue
	public int deQueue() {
		if ( isEmpty() ) {
			System.out.println("The Queue is empty!");
			return -1;
		}else {
			int result = arr[beginingOfQueue];
			beginingOfQueue++;
			if(beginingOfQueue > topOfQueue) {
				beginingOfQueue = topOfQueue = -1;
			}
			return result;
		}
	}
	
	//enqueue
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("The Queue is Full!");
		}else if (isEmpty()) {
			beginingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted " + value + " in the queue");
		}else {
			topOfQueue ++;
			arr[topOfQueue] = value;
			System.out.println("Sucessffully inserted " +value+ " in the queue");
				
		}
	}
	
	public int peek() {
		if ( !isEmpty()) {
			return arr[beginingOfQueue];
		}else {
			System.out.println("The Queue is Empty");
			return  -1;
		}
	}
	
	public boolean isEmpty() {
		if ( (beginingOfQueue == -1) || (beginingOfQueue == arr.length) ) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		 if ( topOfQueue == arr.length -1 ) {
			 return true;
		 }else {
			 return  false;
		 }
	}
}
