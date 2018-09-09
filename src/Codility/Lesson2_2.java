package Codility;

import java.util.Arrays;

public class Lesson2_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 2, 4, 2, 9, 3, 5, 6, 6, 8, 5, 7, 7, 8}));
    }

    private static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i = i + 2) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
        return A[A.length - 1];
    }
}
