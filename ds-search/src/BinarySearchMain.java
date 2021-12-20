
public class BinarySearchMain {

	public static void main(String[] args) {
		int[] inputArray = { -22, -15, 1, 7, 20, 35, 55 };

		System.out.println(iterativeBinarySearch(inputArray, -15));
		System.out.println(iterativeBinarySearch(inputArray, 35));
		System.out.println(iterativeBinarySearch(inputArray, 8888));
		System.out.println(iterativeBinarySearch(inputArray, 1));

		System.out.println(recursiveBinarySearch(inputArray, -15));
		System.out.println(recursiveBinarySearch(inputArray, 35));
		System.out.println(recursiveBinarySearch(inputArray, 8888));
		System.out.println(recursiveBinarySearch(inputArray, 1));

	}

	public static int recursiveBinarySearch(int[] inputArray, int value) {
		return recursiveBinarySearch(inputArray, 0, inputArray.length, value);
	}

	private static int recursiveBinarySearch(int[] inputArray, int start, int end, int value) {

		if (start >= end) {
			return -1;
		}

		int midpoint = (start + end) / 2;
//		System.out.println("midpoint = " + midpoint);

		if (inputArray[midpoint] == value) {
			return midpoint;
		} else if (inputArray[midpoint] < value) {
			return recursiveBinarySearch(inputArray, midpoint + 1, end, value);
		} else {
			return recursiveBinarySearch(inputArray, start, midpoint,  value);
		}

	}

	private static int iterativeBinarySearch(int[] inputArray, int value) {
		int start = 0;
		int end = inputArray.length;

		while (start < end) {
			int midpoint = (start + end) / 2;
//			System.out.println(" midpoint: " + midpoint);

			if (inputArray[midpoint] == value) {
				return midpoint;
			} else if (inputArray[midpoint] < value) {
				start = midpoint + 1;
			} else {
				end = midpoint;
			}
		}
		return -1;
	}

}
