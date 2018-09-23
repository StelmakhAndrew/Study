package Shasha;

import java.util.Arrays;

public class L2_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{}, 6)));
    }

    public static int[] solution(int[] A, int K) {
        int[] array = new int[A.length];
        if (A.length == 0){
            return A;
        }
        K = K%A.length;
        for (int i = 0; i < A.length; i++) {
                if (array.length <= i + K) {
                    array[i + K - array.length] = A[i];
                } else {
                    array[i + K] = A[i];
                }

        }
        return array;

    }
}
