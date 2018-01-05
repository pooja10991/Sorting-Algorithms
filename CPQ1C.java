
public class CPQ1C {

	static double median(int[] a) {
		int middle = 0;
		double median = 0;
		middle = a.length/2;
		double x,y;

		if(a.length%2==0)
		{
			a = SelectionSort.selectionSortWithKElemt(a, middle+1);
			x = a[middle];
			y = a[middle-1];
			median = (x+y)/2;
		}
		else if(a.length%2!=0)
		{
			a = SelectionSort.selectionSortWithKElemt(a, middle);
			median = a[middle];
		}	

		return median;
	}


	public static void main(String[] args) {

		System.out.println("Eg1 - Inptut is : {4, 6, 8, 15, 20, 22, 10, 3, 9, 2}");
		int[] inputArray = {4, 6, 8, 15, 20, 22, 10, 3, 9, 2};
		double median = CPQ1C.median(inputArray);
		System.out.println("median is : "+median);


		System.out.println("Eg2 - Inptut is : {2, 5, 6, 4, 10, 9, 8, 1, 10, 5}");
		int[] inputArray1 = {2, 5, 6, 4, 10, 9, 8, 1, 10, 5};
		double median1 = CPQ1C.median(inputArray1);
		System.out.println("median is : "+median1);
	}

}

