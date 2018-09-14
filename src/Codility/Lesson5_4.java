package Codility;

import java.util.Arrays;

public class Lesson5_4 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
//        solution(new int[]{4, 2, 2, 5, 1, 5, 8});
    }

    public static int solution(int[] A) {
        int start = 0;
        int end = 0;
        int sum = (A[start]);
        int min = (sum / (end - start + 1));
        int result = 0;
        while (end < A.length - 1) {
            end++;
              result = (A[end-1] + A[end])/(2);
            if (min > result) min = result;
        }
        Arrays.sort(A);
        if (Arrays.binarySearch(A , 1) >= 0) return 1;
        return min;
    }
}
