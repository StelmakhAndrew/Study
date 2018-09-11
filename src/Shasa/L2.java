package Shasa;

import java.util.Arrays;

public class L2 {
    public static void main(String[] args) {
        int art = solution(8);
        System.out.println(art);
    }

    public static int solution(int N) {
        String convert = Integer.toBinaryString(N);
        String[] g = convert.split(String.valueOf(1), 0);
        int a ;
        int max = 0;
        if (convert.endsWith("1")) {
            for (String aG : g) {
                a = aG.length();
                if (a > max) {
                    max = a;
                }
            }
        }
        else{
            for (int i = 0; i < g.length - 1; i++) {
                a = g[i].length();
                if (a > max) {
                    max = a;
                }
            }
        }
        return max;
    }
}
