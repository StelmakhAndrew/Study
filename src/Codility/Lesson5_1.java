package Codility;

public class Lesson5_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1}));
    }


    public static int solution(int[] A) {
    int count = 0;
    int resualt = 0;
        for (int aA : A) {
            if (aA == 0) count++;
            else resualt = resualt + count;
        }
        return resualt;
    }
}
