import java.util.Arrays;

public class CPQ1A {

	public static void main(String[] args) {

		System.out.println("Eg1 - Input is : [4, 6, 8, 15, 20, 22, 10, 3, 9, 2]");
		int[] inputArray = {4, 6, 8, 15, 20, 22, 10, 3, 9, 2};
		int[] outputArray = SelectionSort.selectionSortSimple(inputArray);
		System.out.print("Output using selection sort : ");
		System.out.println(Arrays.toString(outputArray));

		System.out.println("Eg2 - Input is : [2, 5, 6, 4, 10, 9, 8, 1, 10, 5]");
		int[] inputArray1 = {2, 5, 6, 4, 10, 9, 8, 1, 10, 5};
		int[] outputArray1 = SelectionSort.selectionSortSimple(inputArray1);
		System.out.print("Output using selection sort : ");
		System.out.println(Arrays.toString(outputArray1));

		System.out.println("Eg3 - Input is : [2, 5, 9, 4, 10, 7, 8, 1, 11, 5]");
		int[] inputArray2 = {2, 5, 9, 4, 10, 7, 8, 1, 11, 5};
		int[] outputArray2 = SelectionSort.selectionSortSimple(inputArray2);
		System.out.print("Output using selection sort : ");
		System.out.println(Arrays.toString(outputArray2));
	}

}

