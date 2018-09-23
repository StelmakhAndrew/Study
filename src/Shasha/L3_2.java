package Shasha;

import java.util.Arrays;

public class L3_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,4,5,2,6,8,7,9}));

    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) {
            return 1;
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] + 1!= A[i + 1] ) {
                    return A[i] + 1;
                }
            }

        }
        if (A[0] != 1) {
            return 1;
        }
        return A[A.length - 1] + 1;

    }
}
