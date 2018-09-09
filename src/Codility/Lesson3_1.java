package Codility;

public class Lesson3_1 {
    public static void main(String[] args) {
        System.out.println(solution(4, 54, 34));
    }

    private static int solution(int X, int Y, int D) {
        int result = (Y - X) / D;
        if ((X + D * result) >= Y) return result;
        return result + 1;
    }


}
