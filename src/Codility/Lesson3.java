package Codility;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 2, 4,3, 5, 6, 6, 8, 7, 5, 7, 8}));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i <A.length -1 ; i = i+2) {
            if (A[i]!= A[i+1]){
                return A[i];
            }
        }
        return 0;
    }
}
