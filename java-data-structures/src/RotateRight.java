import java.util.Arrays;

public class RotateRight {

	public static void main(String[] args) {
		int[] x = { 10,20,30,40,50};
		
		int no_of_times = 3;
		
		System.out.println("original array : " + Arrays.toString(x));
		
		for ( int i = 0 ; i < no_of_times; i++) {
			int j , last;
			
			last = x [x.length - 1];
			//System.out.println(" the last element : " + last);
			
			
			for ( j = x.length-1 ; j > 0; j--) {
				x[j] = x[j-1];
			}
			
			x[0] = last;
		}
		
		System.out.println();

		
		System.out.println("After Rotation " +no_of_times + " the array is : " + Arrays.toString(x));
	}

}
