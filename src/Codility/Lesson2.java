package Codility;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{}, 1)));
    }
    public static int[] solution(int[] A, int K) {
        if (A.length ==0)
            return A;

        K = K % A.length;

        if (K == 0)return A;
        int [] resualt1;
        int [] resualt2;
        int [] resualt;

        resualt1 = Arrays.copyOfRange(A,A.length - K  , A.length);
        System.out.println(Arrays.toString(resualt1));
        resualt2 = Arrays.copyOfRange(A , 0, A.length - K  );
        System.out.println(Arrays.toString(resualt2));

        resualt = Arrays.copyOf(resualt1 , A.length);
        System.arraycopy(resualt2, 0, resualt, resualt1.length, resualt2.length);

        return resualt;
    }

}
