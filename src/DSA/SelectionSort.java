package DSA;

import java.util.Arrays;

public class SelectionSort {


	static void sorting(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 1, 3, 2 };
		sorting(a);
	}
}