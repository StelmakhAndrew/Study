package Codility;

import java.util.Arrays;

public class Lesson4_4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2,-4}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int pos = Arrays.binarySearch(A, 0);
        if (pos < 0 ) {
            pos = (pos * (-1)) - 1;
            if (pos < A.length && A[pos] != 1 ) return 1;
        }
        if (pos == A.length) return 1;
        if (A.length == 1) {
            if (A[0] == 1) return 2;
            else return 1;
        }
        for (int i = pos; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] > 1) {
                return A[i] + 1;
            }
        }
        return A[A.length-1]+1;
    }
}
