
public class AddArguments {

	public static void main(String[] args) {
		

		int sum = 0;
		
		for(String arg : args) {
			try {
			sum += Integer.parseInt(arg);
			}catch(NumberFormatException e) {
				System.out.println("[ " + arg+ " ] is not an integer and will not be included in the sum");
			}
		}
		
		System.out.println("Sum = " + sum);
		
		
//		try {
//
//			int sum = 0;
//			
//			for(String arg : args) {
//				sum += Integer.parseInt(arg);
//			}
//			
//			System.out.println("Sum = " + sum);
//		}catch (NumberFormatException e) {
//			System.out.println("one of the command line argument is not an integer");
//		}
//		
//		int sum = 0;
//		
//		for(String arg : args) {
//			sum += Integer.parseInt(arg);
//		}
//		
//		System.out.println("Sum = " + sum);
		
		
				
	}
}
