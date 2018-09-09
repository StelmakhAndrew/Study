package Codility;

public class Lesson3_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
    }


    public static int solution(int[] A) {
        int k =0;
        int sum1=0;
        int sum2=0;
        int minDif = Integer.MAX_VALUE;
        int sumAr=0;
        for (int elem:A ) {
            sumAr = elem + sumAr;
        }
        do{


            for (int j = 0; j <=k ; j++) {
                sum1 = sum1+A[j];
            }

            sum2 = sumAr - sum1;


            if(Math.abs(sum2 - sum1) < minDif){
                minDif = Math.abs(sum2 - sum1);
            }
            sum1 =0;

            k++;
        }while (k!= A.length-1);
        return minDif;
    }
}
