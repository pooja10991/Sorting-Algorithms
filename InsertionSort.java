import java.util.Arrays;

public class InsertionSort {

	/**
	 * 	 * Implementation of Insertion sort.
	 * 	 	 * @param a - array that needs to be sorted.
	 * 	 	 	 * @param n - number of elements in the array that is to be sorted.
	 * 	 	 	 	 * @return int[] - sorted array.
	 * 	 	 	 	 	 */
	static int[] insertionSortSimple(int[] a, int n) {
		int i, j;
		int key;

		for(j=1; j<n; j++) {
			key = a[j];
			i = j-1;
			while(i>=0 && a[i]>key) {
				a[i+1] = a[i];
				i = i-1;
			}
			a[i+1] = key;
		}

		return a;
	}


	/**
	 * 	 * Implementation of Cool Sort with iterative method.
	 * 	 	 * @param a - array that needs to be sorted.
	 * 	 	 	 * @param h - array with the steps which sort the partial subarrays.
	 * 	 	 	 	 * @return int[] - sorted array.
	 * 	 	 	 	 	 */
	static int[] coolSort(int[] a, int[] h) {
		int j;
		int[] b = new int[a.length];
		int[] position = new int[a.length];
		int k = 0, m = 0;
		int i = h.length-1;
		h = insertionSortSimple(h, h.length);

		while(i>=0) {
			m = 0;
			while(m<=h[i]) {
				k = 0;
				for(j=m; j<a.length; j=j+h[i]) {
					b[k] = a[j];
					position[k] = j;
					k++;
				}
				b = insertionSortSimple(b, k);
				m++;
				for(int l=0; l<k; l++) {
					a[position[l]] = b[l];
				}
			}	
			System.out.println("Step"+h[i]+" : "+Arrays.toString(a));
			i--;
		}

		return a;
	}


	/**
	 * 	 * Implementation of cool sort with recursive method. This will in turn call CoolSortRec with the steps in h.
	 * 	 	 * @param a - array to be sorted.
	 * 	 	 	 * @param h - array with the steps which sort the partial subarrays.
	 * 	 	 	 	 * @return int[] - sorted array.
	 * 	 	 	 	 	 */
	static int[] coolSortWithRec(int[] a, int[] h) {
		for(int l = 0; l<h.length; l++) {
			a = coolSortRec(a,h[l],0);
			System.out.println("Step"+h[l]+" : "+Arrays.toString(a));
		}
		return a;
	}


	/**
	 * 	 * Form the subarrays for the steps, sort them using insertion sort and merge the sorted subarrays back to form the sorted array.
	 * 	 	 * @param a - array that is to be sorted.
	 * 	 	 	 * @param h - array with the steps which sort the partial subarrays.
	 * 	 	 	 	 * @param i - position at which subarray starts.
	 * 	 	 	 	 	 * @return int[] - sorted array for individual step.
	 * 	 	 	 	 	 	 */
	static int[] coolSortRec(int[] a, int h, int i) {
		int j, k, m=0;
		int[] position = new int[a.length];
		int[] b = new int[a.length];

		if(i<=h) {
			for(j=i; j<a.length; j=j+h) {
				b[m] = a[j];
				position[m] = j;
				m++;
			}
			b = insertionSortSimple(b, m);
			for(k=0; k<m; k++) {
				a[position[k]] = b[k];
			}
			coolSortRec(a, h, i+1);
		}
		else {
			return a;
		}

		return a;
	}
}

