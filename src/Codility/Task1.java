package Codility;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(529));
        System.out.println(solution(32));
        System.out.println(solution(1041));
    }
    public static int solution(int N) {
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
        for (int i = 0; i < ss.length ; i++) {
            if (ss[i] == '1'){
                flag =true;
            }
            if (ss[i] == '0' && flag )
            {
                count++;
            } else if (ss[i] == '1')
            {
                if (count> maxLen) {
                    maxLen = count;
                    count = 0;
                }
            }
        }
        return maxLen;
    }
}
