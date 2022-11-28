// Given an array of integers,
// sort the elements in the array in ascending order.
// The quick sort algorithm should be used to solve this problem.

import java.util.Arrays;

class quickSort {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length < 2) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] arr, int L, int R) {
        if(L < R){
            swap(arr, L + (int)(Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while(L  < more) {
            if(arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            }else if(arr[L] > arr[R]) {
                swap(arr, --more, L);
            }else
                L++;
        }
        swap(arr, more, R);
        return new int[] {less + 1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

public class question10 {
    public static void main(String[] args) {
        quickSort ob = new quickSort();

        int[] arr1 = new int[]{1};
        System.out.println(Arrays.toString(ob.sortArray(arr1)));

        int[] arr2 = new int[]{3, 2, 1};
        System.out.println(Arrays.toString(ob.sortArray(arr2)));

        int[] arr3 = new int[]{4, 2, -3, 6, 1};
        System.out.println(Arrays.toString(ob.sortArray(arr3)));
    }
}
