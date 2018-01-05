import java.util.ArrayList;

public class SelectionSort {

	/**
	 * 	 * Implementation of Selection Sort in traditional way.
	 * 	 	 * @param a - input array which needs to be sorted
	 * 	 	 	 * @return int[] - sorry array.
	 * 	 	 	 	 */
	static int[] selectionSortSimple(int[] a){
		int i,j;
		int n = a.length;
		int swapElement;

		for (j = 0; j < n-1; j++) 
		{
			int min = j;
			for (i = j+1; i < n; i++) {
				if (a[i] < a[min]) {
					min = i;
				}
			}

			if(min != j) 
			{
				swapElement = a[j];
				a[j] = a[min];
				a[min] = swapElement;
			}
		}
		return a;
	}

	/**
	 * 	 * Implementation of selection sort for just K elememts.
	 * 	 	 * @param a - input array which needs to be sorted
	 * 	 	 	 * @param k - number of elements that needs to be sorted.
	 * 	 	 	 	 * @return int[] - sorry array with only k elements sorted.
	 * 	 	 	 	 	 */
	static int[] selectionSortWithKElemt(int[] a, int k) {
		int i,j;
		int n = a.length;
		int swapElement;

		for (j = 0; j < k; j++) 
		{
			int min = j;
			for (i = j+1; i < n; i++) {
				if (a[i] < a[min]) {
					min = i;
				}
			}

			if(min != j) 
			{
				swapElement = a[j];
				a[j] = a[min];
				a[min] = swapElement;
			}
		}
		return a;
	}
}

