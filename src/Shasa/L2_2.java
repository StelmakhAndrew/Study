package Shasa;

import java.util.Arrays;

public class L2_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 1){
            return A[0];
        }
        if (A[A.length-1] != A[A.length-2]){
            return A[A.length-1];
        }
        for (int i = 0; i < A.length-1; i=i+2) {
            if(A[i] != A[i+1]){
                return A[i];
            }

        }
        return 0;
    }
}

