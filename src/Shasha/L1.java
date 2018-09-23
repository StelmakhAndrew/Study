package Shasha;

public class L1 {

    public static void main(String[] args) {
      int ert = solution(5,10,2);
        System.out.println(ert);
    }


    public static int solution(int x, int y, int d){
        if (x!= y){
            int kilkist = (y-x)/d;
            if ((y-x)%d != 0){ kilkist++; }
            return kilkist;
        }
        else return 0;

    }
}
