package Shasa;

import java.util.Arrays;

public class L3_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1000,1000}));
    }

    public static int solution(int[] A) {
        int[] arrayList = new int[A.length - 1];
        int count = 0;
        int d = 0;
        for (int i = 0; i < A.length; i++) {
            count += A[i];
        }
        int s = 0;
        for (int i = 0; i < A.length - 1; i++) {
            count -= A[i];
            d += A[i];
            s = count - d;
            arrayList[i] = Math.abs(s);
            System.out.println(Arrays.toString(arrayList));
        }
        Arrays.sort(arrayList);
        return arrayList[0];
    }
}
