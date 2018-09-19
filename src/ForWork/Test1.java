package ForWork;

import java.math.BigInteger;
import java.util.ArrayList;

public class Test1 {
    private static int element1 = 0;
    private static int element2 = 0;
    private static long polindrom = 0;

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        generate();
        System.out.println("time  " + (System.nanoTime() - startTime));
       // 999949999
       // 30109
       // 33211
        // time  5503159510
        // time  5459094986
    }

    private static void generate() {
        int a1;
        int a3;
        int a7;
        int a9;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 10001; i < 100000; i = i + 10) {
            a1 = i;
            a3 = i + 2;
            a7 = i + 6;
            a9 = i + 8;
            if (Test2.rabinMiller(a1)) arrayList.add(a1);
            if (Test2.rabinMiller(a3)) arrayList.add(a3);
            if (Test2.rabinMiller(a7)) arrayList.add(a7);
            if (Test2.rabinMiller(a9)) arrayList.add(a9);
        }
        int index =0 ;
//        long startedTime = System.nanoTime();

        long result;
        String stroka;
        for (int k = arrayList.size() - 1; k > index; k--) {
            for (int d = arrayList.size() - 1; d > 0; d--) {
                result = (long)arrayList.get(k) * (long)arrayList.get(d);
                stroka = String.valueOf(result);
                if (myPalindrom(stroka)) {
                    if (result > polindrom) {
                        polindrom = result;
                        element1 = arrayList.get(k);
                        element2 = arrayList.get(d);
                        index = d;
                    }
                    break;
                }

            }
        }
        System.out.println(polindrom);
        System.out.println(element2);
        System.out.println(element1);
//        System.out.println("time search " + (System.nanoTime() - startedTime));

    }

    private static boolean palindrom(String str) {
        return str.equals(new StringBuilder().append(str).reverse().toString());
    }

    private static boolean myPalindrom(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }


}