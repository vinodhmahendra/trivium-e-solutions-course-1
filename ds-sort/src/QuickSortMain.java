
public class QuickSortMain {

	public static void main(String[] args) {
		int[] array = {10,3,2,7,5,8,4,1,2,9,7,8,11};
		QuickSort.quickSort(array, 0, array.length-1);
		QuickSort.printArray(array);
	}

}
