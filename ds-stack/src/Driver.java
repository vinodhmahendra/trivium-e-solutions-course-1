
public class Driver {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		System.out.println("is  stack empty ? " + stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.push(4);
		
		System.out.println("The pop : " + stack.pop());
		System.out.println("The Peek : " + stack.peek());

	}

}
