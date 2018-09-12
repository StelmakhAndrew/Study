package Codility;

public class Lesson5_2 {
    public static void main(String[] args) {
        System.out.println(solution1(11, 11, 11));
        System.out.println(solution2(11, 11, 11));

    }

    private static int solution2(int A, int B, int K) {
        int result = B / K - A / K;
        if (A - B == 0) return A % K == 0 ? 1 : 0;
        if (A % K == 0) return result + 1;
        return result;
    }

    private static int solution1(int A, int B, int K) {
        int D;
        if (A % K == 0) {
            D = B / K - A / K + 1;
            return D;
        }
        D = B / K - A / K;
        return D;
    }
}

