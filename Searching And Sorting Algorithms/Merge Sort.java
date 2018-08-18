// @Authour: Daniel Ye @Date: August 17, 2018
public class Merge_Sort {
	/* Merge Sort divides input array in two halves, 
	 * calls itself for the two halves and then merges the two sorted halves. 
	 * Works best for sorting large sets of numbers
	 */
	private static void merge(int[] L, int[] R, int[] A) {
		int nL = L.length;
		int nR = R.length;
		int indexL = 0; //index of the smallest unpicked number in L
		int indexR = 0;
		int mergeIndex = 0;
		while (indexL < nL && indexR < nR) {
			if (L[indexL]<=R[indexR]) { //if left element <= right element, add it to A
				A[mergeIndex] = L[indexL];
				indexL++; //move to next smallest unpicked in L
			} else {
				A[mergeIndex] = R[indexR];
				indexR++; //move to next smallest unpicked in L
			}
			mergeIndex++; //move to next A index
		}
		//if there are leftover elements in L or R arrays, add them all into A[]
		while (indexL < nL) {
			A[mergeIndex] = L[indexL];
			indexL++;
			mergeIndex++;
		}
		while (indexR < nR) {
			A[mergeIndex] = R[indexR];
			indexR++;
			mergeIndex++;
		}
	}
	
	public static void mergeSort(int[] A, int l) {
		//base case: when A[] only has one element
		if (l<2) {
			return;
		}
		int mid = l/2;
		//Create L and R arrays and initialize them
		int[] L = new int[mid];
		int[] R = new int[l-mid];
		for (int i = 0;i<mid;i++) {
			L[i] = A[i];
		}
		for (int i = mid;i<l;i++) {
			R[i-mid] = A[i];
		}
		//call recursive function on L and R until they reach base case
		mergeSort(L,mid);
		mergeSort(R,l-mid);
		//Base case will be merged in sorted order
		merge(L,R,A);
	}
	public static void main(String[] args) {
		//Testing out Merge Sort algorithm
		int[] A = {7,12,0,3,99,7,2,53,22,-1};
		System.out.println("Unsorted List:");
		for (int i = 0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		mergeSort(A,A.length);
		System.out.println("Sorted List:");
		for (int i = 0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
	}
}
