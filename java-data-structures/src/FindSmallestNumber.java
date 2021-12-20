import java.util.Arrays;

public class FindSmallestNumber {

	
	public static void main(String[] args) {
		int[] x = {7,10,4,3,20,15};
		
		System.out.println("Array Elements: " + Arrays.toString(x));
		
		int k = 5;
		
		System.out.println("Kth smallest element is " + kthSmallest(x,k));
	}

	private static int kthSmallest(int[] x, int k) {
			
		Arrays.sort(x);
		
		System.out.println("After Sorting : " +Arrays.toString(x));
		
		//return k'th element in the sorted array
		return x[k-1];
	}
}
