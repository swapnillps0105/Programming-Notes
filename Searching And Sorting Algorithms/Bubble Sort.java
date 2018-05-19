// @Authour: Daniel Ye @Date: January 4, 2017
class Bubble_Sort {
	/* Bubble sort works by repeatedly swapping
	 * the adjacent elements if they are in wrong order.
	 * It requires that the set of numbers are passed
	 * over multiple times to ensure that it is sorted. */
	public int[] bubbleSort(int[] arr) {
		/* The minimum number of times that the array
		 * needs to be passed over to ensure that it
		 * is sorted, is the length of the array-1,
		 * because each time it passes through the set,
		 * it sorts/moves the largest number to one end. */
		for (int i = 0;i<arr.length-1;i++) {
			/* Another loop is needed to swap each
			 * element and its neighbor. It will loop
			 * from index 0 to the length of the array-i-1
			 * because once it passes over the array once,
			 * the last(largest) element is already sorted,
			 * so it does not need to go back to it. */
			for (int j = 0;j<arr.length-i-1;j++) {
				/*Check if the next element is smaller than
				 * the current element, if so, then swap them
				 * using a temp variable as a placeholder. */
				if (arr[j+1]<arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
