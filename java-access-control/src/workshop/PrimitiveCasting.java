package workshop;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		int i1 = 56;
		long l1 = i1;
		System.out.println(" The result is " + l1);
		
		long l2 = 56l;
		int i2 = (int) l2;
		System.out.println("the result is " + i2);
		
		double d3 = 3.999999999d;
		int i3 =  (int) d3;
		System.out.println(" the result is " + i3);
		
		int i4 = 129;
		byte b4 =  (byte) i4;
		System.out.println(" the result is " + b4);
		
		long l5 = 56l;
		float f5 = (float) l5;
		System.out.println(" the result is " + f5);
		
		
//		char c = 'A'; // 16 bit
//		short s = c; // 16 bit
		
		System.out.println(" char (MIN)" + (int) Character.MIN_VALUE + " char (MAX) " + (int) Character.MAX_VALUE);
		
		System.out.println(" short (MIN)" + Short.MIN_VALUE + " short (MAX) " + Short.MAX_VALUE);
		
		
		char c = 'A';
		int i = c;
		System.out.println(" char (MIN)" + (int) Character.MIN_VALUE + " char (MAX) " + (int) Character.MAX_VALUE);
		System.out.println(" int (MIN)" + Integer.MIN_VALUE + " int (MAX) " + Integer.MAX_VALUE);
	}

}
