package DSA;

import java.util.Arrays;


public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2, 5 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot - 1);
			quickSort(arr, pivot + 1 ,end+
					0);
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot=end;
		int left =start-1;
		for (int i = start; i < arr.length; i++) {
			if (arr[i]<=arr[pivot]) {
				left++;
				int temp=arr[i];
				arr[i]=arr[left];
				arr[left]=temp;
			}
		}
		return left;
	}

}
