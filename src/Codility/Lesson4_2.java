package Codility;


import java.util.ArrayList;

public class Lesson4_2 {
    public static void main(String[] args) {
        System.out.println(solution(5 , new int[]{3, 1, 3,1,2,  5,6}));
    }

    public static int solution(int X, int[] A) {
        ArrayList<Integer> array = new ArrayList<>();
        for (Integer elem:A) {
            array.add(elem);
        }
        int max =0;
        for (int i = X; i >0 ; i--) {
            if (array.indexOf(i) == -1) return -1;
            else if (array.indexOf(i)> max) { max = array.indexOf(i);
        }}
        return max;
    }
}
