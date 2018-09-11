package Codility;

public class Lesson1 {
    public static void main(String[] args) {
//        System.out.println(solution(5));
//        System.out.println(solution(529));
//        System.out.println(solution(32));
//        System.out.println(solution(1041));
//        System.out.println(solution(561892));
    }
    private static int solution(int N) {
        String b ="";
        while(N !=0 ) {
            b = b +(N % 2);
            N = N/2;
        }
        System.out.println(b);
        char [] ss = b.toCharArray();
        int maxLen= 0 ;
        int count = 0;
        boolean flag = false;
        for (char s : ss) {
            if (s == '1') {
                flag = true;
            }
            if (s == '0' && flag) {
                count++;
            } else if (s == '1') {
                if (count >= maxLen) {
                    maxLen = count;

                }

            }
        }
        return maxLen;
    }
}
