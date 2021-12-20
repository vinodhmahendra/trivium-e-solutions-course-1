
public class Driver {

	public static void main(String[] args) {
		Queue queue = new Queue(3);
		
		System.out.println(queue.isEmpty());
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		
		queue.enQueue(4);
		
		System.out.println(queue.isFull());
		
		System.out.println(queue.peek());
		
		System.out.println("DeQueue: " +queue.deQueue());
		
		queue.deleteQueue();
	}

}
