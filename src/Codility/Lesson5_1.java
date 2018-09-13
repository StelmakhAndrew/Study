package Codility;

public class Lesson5_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1,1,1,1,1, 1,1,1,1}));
    }


    public static int solution(int[] A) {
    int count = 0;
    long result = 0;
        for (int aA : A) {
            if (aA == 0) count++;
            else result = result + count;
        }
        if (result > 1000000000L) return -1;
        return (int)result;
    }
}
