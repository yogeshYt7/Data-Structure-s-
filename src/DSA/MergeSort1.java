package DSA;

import java.util.Arrays;

public class MergeSort1 {


    public static void main(String[] args) {
        int[] arr = { 4, 6, 5, 3, 2, 1 };
        int size = arr.length - 1;
        partition(arr, 0, size);
        System.out.println(Arrays.toString(arr));
    }

    static void partition(int[] arr, int Li, int Hi) {
        if (Hi > Li) {
            int mid = (Li + Hi) / 2;
            partition(arr, Li, mid);
            partition(arr, mid + 1, Hi);
            mergesort(arr, Li, mid, Hi);
        }
    }

    static void mergesort(int[] arr, int left, int mid, int right) {
        int[] LTA = new int[mid - left + 1];
        int[] RTA = new int[right - mid];

        for (int i = 0; i <= mid - left; i++) {
            LTA[i] = arr[left + i];
        }
        for (int i = 0; i < right - mid; i++) {
            RTA[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        for (int k = left; k <= right; k++) {
            if (i <= mid - left && (j >= right - mid || LTA[i] <= RTA[j])) {
                arr[k] = LTA[i];
                i++;
            } else {
                arr[k] = RTA[j];
                j++;
            }
        }
    }
}