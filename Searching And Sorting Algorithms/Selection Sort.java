// @Authour: Daniel Ye @Date: January 5, 2017
class Selection_Sort {
    /* Selection sort works by repeatedly finding the
     * minimum element from the unsorted subarray,
     * and putting it at the start of the subarray. Once the
     * first minimum is found in the unsorted subarray and moved to the
     * beginning, it will then narrow down the boundary of the unsorted 
     * subarray to not include the already sorted element. */
	public int[] selectionSort(int[] arr) {
		/* this loop will act as the minimum boundary of 
         * unsorted subarray, as each time it sorts and moves
         * the smallest number to the beginning of the array,
         * it will move the unsorted boundary past the sorted index, and
         * will continue sorting the unsorted array from arr[i+1...end] */
        for (int i = 0; i < arr.length-1; i++) {
            // Find the minimum element in unsorted subarray
            int minIndex = i;
            /* Loop from i+1 to the end of the array, and
             * each time this loops, it finds the smallest number
             * in the subarray, and will move it to the beginning
             * so the next time it loops it can start at 
             * the index after the sorted element(i+1). */
            for (int j = i+1; j < arr.length; j++) {
            	//find the index of the smallest number in the subarray
            	 if (arr[j] < arr[minIndex]) {
            			minIndex = j;
            	 }
            }
            // Swap the found smallest element with the first element of subarray
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
	}
}
