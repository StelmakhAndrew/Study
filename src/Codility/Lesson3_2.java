package Codility;

import java.util.Arrays;

public class Lesson3_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 1, 6, 7, 8}));
    }

    private static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] == 2) {
                return A[i] + 1;
            }
        }
        if (A[0] != 1) return 1;
        System.out.println(A[A.length - 1] + 1);
        return A[A.length - 1] + 1;
    }
}
