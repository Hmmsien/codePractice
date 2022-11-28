// Given an array of integers,
// sort the elements in the array in ascending order.
// The merge sort algorithm should be used to solve this problem.

import java.util.Arrays;

class mergSort {
    public int[] sortArray(int[] nums) {
        // merge sort
        int l = 0, r = nums.length - 1;
        process(nums, l , r);
        return nums;
    }

    public static void process(int[] nums, int l, int r) {
        if(l == r)
            return;
        int mid = l + ((r-l) >> 1);
        process(nums, l, mid);
        process(nums, mid+1, r);
        merge(nums, l, mid, r);
    }

    public static void merge(int[] nums, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;

        while ( p1 <= m && p2 <= r) {
            if(nums[p1] < nums[p2])
                help[i++] = nums[p1++];
            else
                help[i++] = nums[p2++];
        }

        while (p1 <= m)
            help[i++] = nums[p1++];
        while (p2 <= r)
            help[i++] = nums[p2++];
        for( i = 0; i < help.length; i++) {
            nums[l+i] = help[i];
        }
    }
}

public class question9 {
    public static void main(String[] args) {
        mergSort ob = new mergSort();

        int[] arr1 = new int[]{1};
        System.out.println(Arrays.toString(ob.sortArray(arr1)));

        int[] arr2 = new int[]{3, 2, 1};
        System.out.println(Arrays.toString(ob.sortArray(arr2)));

        int[] arr3 = new int[]{4, 2, -3, 6, 1};
        System.out.println(Arrays.toString(ob.sortArray(arr3)));
    }
}
