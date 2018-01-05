
public class FindMatchIndex {

	/**
	 * 	 * Implementation of find the index i such that A[i]=i using recursion.
	 * 	 	 * @param a - array from which the index needs to be found.
	 * 	 	 	 * @param r - starting of the array.
	 * 	 	 	 	 * @param l - ending of the array.
	 * 	 	 	 	 	 * @return int i - index such that A[i]=i.
	 * 	 	 	 	 	 	 */
	static int findIndex(int[] a, int r, int l) {
		int m,i=0;

		if (l<r)
			return -1;

		m = (r+l+1)/2;

		if(a[m]==m)
			return m;
		else if (a[m]<m) {
			r = m+1;
			i = findIndex(a, r, l);
		}
		else if (a[m]>m) {
			l = m-1;
			i = findIndex(a, r, l);
		}

		return i;
	}
}

