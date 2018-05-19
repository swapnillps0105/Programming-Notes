// @Authour: Daniel Ye @Date: January 4, 2017
class InsertionSort {
	/* Insertion sort works by taking a number
	 * and inserting it in its correctly sorted
	 * position in the array by comparing it to
	 * previous elements. */
	public static int [] insertionSort(int[] arr) {
		//Loop from index 1 to the end of the array.
		for (int i = 1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			/* Use a while loop to check if the
			 * previous element is larger than the key,
			 * and if it is true, move elements of 
			 * arr[0..i-1] to one position ahead
             * of their current position */
			while (j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			/* Now place the key in its correctly sorted spot, j+1
			 * because j-- at the end of the loop will make j one
			 * less than the desired index. */
			arr[j+1] = key;
		}
		return arr;
	}
}