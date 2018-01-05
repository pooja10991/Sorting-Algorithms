
public class CPQ3 {

	public static void main(String[] args) {

		System.out.println("Eg1 - Input is : [0, 1, 2, 3, 4, 5].");
		int[] input = {0, 1, 2, 3, 4, 5};
		int output = FindMatchIndex.findIndex(input, 0, input.length-1);
		System.out.println("output is : "+output);
		System.out.println("if output = -1 means there was no index such that a[i] = i else it will return the index");

		System.out.println("Eg2 - Input is : [11, 12, 13, 14, 15, 16].");
		int[] input1 = {11, 12, 13, 14, 15, 16};
		int output1 = FindMatchIndex.findIndex(input1, 0, input1.length-1);
		System.out.println("output is : "+output1);
		System.out.println("if output = -1 means there was no index such that a[i] = i else it will return the index");

		System.out.println("Eg3 - Input is : [0, 1, 2, 14, 15, 16].");
		int[] input2 = {0, 1, 2, 14, 15, 16};
		int output2 = FindMatchIndex.findIndex(input2, 0, input2.length-1);
		System.out.println("output is : "+output2);
		System.out.println("if output = -1 means there was no index such that a[i] = i else it will return the index");
	}

}

