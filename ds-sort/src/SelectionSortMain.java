
public class SelectionSortMain {

	public static void main(String[] args) {
		int[] array = {10,3,2,5,8,4,1,9};
		SelectionSort.printArray(array);
		SelectionSort.selectionSort(array);
		System.out.println();
		SelectionSort.printArray(array);
	}

}
