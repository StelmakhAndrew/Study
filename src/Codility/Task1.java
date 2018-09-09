package Codility;

public class Task1 {
    public static void main(String[] args) {
    solution(5);
    }
    public static int solution(int N) {
        String b ="";
        while(N !=0 ) {
            b =  b + N%2;
            N = N/2;
        }
        System.out.println(b);


        return N;
    }
}
