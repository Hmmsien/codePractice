//Given a target integer T,
//a non-negative integer K
//and an integer array A sorted in ascending order,

//find the K closest numbers to T in A.
//If there is a tie, the smaller elements are always preferred.

import java.util.ArrayList;
import java.util.List;

public class question6 {
    public static List<Integer> findClosestElements(int[] A, int K, int T) {
        int l = 0;
        int r = A.length - 1;
        List<Integer> result = new ArrayList<>(K);

        while (r - l >= K) {
            if (Math.abs(A[l] - T) > Math.abs(A[r] - T)) {
                l++;
                System.out.println(("l: ")+l);
            } else {
                r--;
            }
        }

        for (int i = l; i <= r; i++) {
            result.add(A[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        System.out.println(findClosestElements(test1, 3, 2));
        int[] test2 = {1, 4, 6, 8};
        System.out.println(findClosestElements(test2, 3, 3));
    }
}
