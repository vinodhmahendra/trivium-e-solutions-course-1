import java.util.Scanner;

public class Matrices {

	 

	public static void main(String[] args) {
		
		int sum = 0; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of arrays and specify how many elements should be present in array");
		
		int no_of_arrays = scanner.nextInt();
		int how_many_elements_in_each_array = scanner.nextInt();
		
		//construct a 2D array
		int[][] x = new int[no_of_arrays][how_many_elements_in_each_array];
		
		System.out.println("Enter elements of x matrix");
		
		for (int i = 0; i < no_of_arrays; i++) {
			for (int j = 0; j < how_many_elements_in_each_array; j++) {
				x[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter the number of arrays and specify how many elements should be present in array(2)");
		int no_of_arrays_1 = scanner.nextInt();
		int how_many_elements_in_each_array_1 = scanner.nextInt();
		
		
		if ( how_many_elements_in_each_array != no_of_arrays_1) {
			System.out.println("the matrices can't be multiplied with each other.");
		}else {
			int[][] y = new int[no_of_arrays_1][how_many_elements_in_each_array_1];
			
			int[][] multiply = new int[no_of_arrays][how_many_elements_in_each_array_1];
			
			System.out.println("Enter elements of y matrix");
			for (int i = 0; i < no_of_arrays_1; i++) {
				for (int j = 0; j < how_many_elements_in_each_array_1; j++) {
					y[i][j] = scanner.nextInt();
				}
			}
			
			
			for (int c = 0 ; c < no_of_arrays ; c++) {
				for (int d = 0 ; d < how_many_elements_in_each_array_1; d++) {
					for (int k = 0 ; k < no_of_arrays_1; k++) {
						sum = sum + x[c][k] * y[k][d];
					}
					
					multiply[c][d] = sum;
					sum = 0;
				}
			}
			
			System.out.println("Product of the matrices");
		
			for (int c = 0 ; c < no_of_arrays ; c++) {
				for (int d = 0 ; d < how_many_elements_in_each_array_1;d++) {
					System.out.print(multiply[c][d] + "\t");
				}
				System.out.println();
			}
		}
	
		
		
	}

} 