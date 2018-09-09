package Codility;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 8,  9,7, 6}, 3)));
    }
    public static int[] solution(int[] A, int K) {
        K = K % A.length;
        System.out.println(K);
        int [] resualt1;
        int [] resualt2;
        int [] resualt;

        resualt1 = Arrays.copyOfRange(A,A.length - K  , A.length);
        System.out.println(Arrays.toString(resualt1));
        resualt2 = Arrays.copyOfRange(A , 0, K -1  );
        System.out.println(Arrays.toString(resualt2));
        resualt = Arrays.copyOf(resualt1 , A.length);
        System.arraycopy(resualt2, 0, resualt, A.length - K+1, K-1);

        return resualt;
    }

}
