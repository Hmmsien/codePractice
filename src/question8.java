// Given an array of integers,
// sort the elements in the array in ascending order.
// The selection sort algorithm should be used to solve this problem.

import java.util.Arrays;

class selectionSort {
    public int[] sortArray(int[] nums) {
        // selection sort
        // iterate array, 0 - length - 1
        // compare i with i+1 - length -1
        // swap smallest num at first index

        if(nums.length < 2)
            return nums;

        for (int i=0; i < nums.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j <nums.length; j++) {
                minIndex = nums[minIndex] < nums[j]? minIndex:j;
            }
            swap(nums,i,minIndex);
        }
        return nums;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = 0;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

public class question8 {
    public static void main(String[] args) {
        selectionSort ob = new selectionSort();

        int[] arr1 = new int[]{1};
        System.out.println(Arrays.toString(ob.sortArray(arr1)));

        int[] arr2 = new int[]{3, 2, 1};
        System.out.println(Arrays.toString(ob.sortArray(arr2)));

        int[] arr3 = new int[]{4, 2, -3, 6, 1};
        System.out.println(Arrays.toString(ob.sortArray(arr3)));
    }
}
