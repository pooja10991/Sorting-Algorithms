import java.util.Arrays;

public class CPQ2 {

	public static void main(String[] args) {

		System.out.println("Eg1 - Input is : [4, 6, 8, 15, 20, 22, 10, 3, 9, 2] and h = [5, 3, 1].");
		int input[] = {4, 6, 8, 15, 20, 22, 10, 3, 9, 2};
		int h[] = {5, 3, 1};
		int[] output = InsertionSort.coolSort(input,h);
		System.out.print("Output using Cool sort : ");
		System.out.println(Arrays.toString(output));


		System.out.println("Eg2 - Input is : [2, 5, 9, 4, 10, 7, 8, 1, 11, 5] and h = [5, 2, 1].");
		int input1[] = {2, 5, 9, 4, 10, 7, 8, 1, 11, 5};
		int h1[] = {5, 2, 1};
		int output1[] = InsertionSort.coolSortWithRec(input1, h1);
		System.out.print("Output using Cool sort : ");
		System.out.println(Arrays.toString(output1));


		System.out.println("Eg2 - Input is : [62, 83, 18, 53, 07, 17, 95, 86, 47, 69, 25, 28] and h = [5, 3, 1].");
		int input2[] = {62, 83, 18, 53, 07, 17, 95, 86, 47, 69, 25, 28};
		int h2[] = {5, 3, 1};
		int output2[] = InsertionSort.coolSortWithRec(input2, h2);
		System.out.print("Output using Cool sort : ");
		System.out.println(Arrays.toString(output2));
	}

}

