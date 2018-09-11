package SP2;

public class d {
    public static void main(String[] args) {
        theory();
    }


    private static void theory() {
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5;
        int count = 0 ;
        for (int i = 10000; i < 100000; i++) {
            a1 = i / 10000;
            a2 = i / 1000 % 10;
            a3 = i % 1000 / 100;
            a4 = i % 100 / 10;
            a5 = i % 10;

            if ((a1 >= a2 && a2 >= a3 && a3 >= a4 && a4>=a5) || (a1 <= a2 && a2 <= a3 && a3 <= a4 && a4 <=a5)) {
//                System.out.print(a1);
//                System.out.print(a2);
//                System.out.print(a3);
//                System.out.print(a4);
//                System.out.print(a5);
//                System.out.println();
            count++;
            }
        }
        System.out.println(count/90000.0);
    }
}
