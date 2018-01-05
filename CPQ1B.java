
public class CPQ1B {

	/**
	 * 	 * @param args
	 * 	 	 */
	public static void main(String[] args) {

		System.out.println("Eg1 - Input is : [4, 6, 8, 15, 20, 22, 10, 3, 9, 2] and k = 4.");
		int[] inputArray = {4, 6, 8, 15, 20, 22, 10, 3, 9, 2};
		int k = 4;
		int[] outputArray = SelectionSort.selectionSortWithKElemt(inputArray, k);
		System.out.print("Output of selection sort with K elements : [");
		for(int i = 0 ; i < k ; i++) {
			System.out.print("  "+outputArray[i]);
		}
		System.out.println("  ]");

		System.out.println("Eg2 - Input is : [4, 6, 8, 15, 20, 22, 10, 3, 9, 2] and k = 6.");
		int k1 = 6;
		int[] outputArray1 = SelectionSort.selectionSortWithKElemt(inputArray, k1);
		System.out.print("Output of selection sort with K elements : [");
		for(int i = 0 ; i < k1 ; i++) {
			System.out.print("  "+outputArray1[i]);
		}
		System.out.println("  ]");


		System.out.println("Eg3 - Input is : [4, 11, 16, 13, 20, 7, 10, 3, 9, 2] and k = 5.");
		int[] input1 = {4, 11, 16, 13, 20, 7, 10, 3, 9, 2};
		int k2 = 5;
		int[] outputArray2 = SelectionSort.selectionSortWithKElemt(input1, k2);
		System.out.print("Output of selection sort with K elements : [");
		for(int i = 0 ; i < k2 ; i++) {
			System.out.print("  "+outputArray2[i]);
		}
		System.out.println("  ]");
	}

}
