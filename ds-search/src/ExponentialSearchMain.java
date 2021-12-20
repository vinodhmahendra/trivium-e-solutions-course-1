import java.util.Arrays;

public class ExponentialSearchMain {

	public static void main(String[] args) {
		int[] array = {5,10,15,20,25,20,35,40,45,50,55,60};
		
		int searchValue = 50;
		
		int result = exponentialSearch(array,array.length, searchValue);
		
		System.out.println("Element is present at index " + result);

	}

	private static int exponentialSearch(int[] array, int length, int searchValue) {
		// if searchValue is at position one
		if ( array[0] == searchValue) {
			return 0;
		}
		
		// find the range for the binary search
		int i = 1;
		while( i < length && array[i] <= searchValue) {
			i = i * 2;
		}
		
		//now call the binary search
		//return Arrays.binarySearch(array, (i/2), Math.min(i, length), searchValue);
		
		return BinarySearchMain.recursiveBinarySearch(array, searchValue);
	}

}
