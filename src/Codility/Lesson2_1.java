package Codility;

import java.util.Arrays;

public class Lesson2_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,5,3,2}, 3)));
    }

    public static int[] solution(int[] A, int K) {
        int len = A.length;
        if (len == 0)
            return A;

        K = K % len;

        if (K == 0) return A;
        int[] resualt1;
        int[] resualt;

        resualt1 = Arrays.copyOfRange(A, len - K, len);
        resualt = Arrays.copyOf(resualt1, len);
        System.arraycopy(Arrays.copyOfRange(A, 0, len - K), 0, resualt, resualt1.length, len - K);

        return resualt;
    }

}
