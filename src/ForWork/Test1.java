package ForWork;

import java.math.BigInteger;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
//        generate();
        String elem = "123456787654321";
        long starttime = System.nanoTime();
        myPalindrom(elem);
        System.out.println("time 1 " + (System.nanoTime() - starttime));

        starttime = System.nanoTime();
        palindrom(elem);
        System.out.println("time 2 " + (System.nanoTime() - starttime));

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
        BigInteger result;
        String stroka = "";
        for (int elem : arrayList) {
            for (int ee1 : arrayList) {
                result = BigInteger.valueOf(elem * ee1);
                stroka = String.valueOf(result);
                if (myPalindrom(stroka)) System.out.println(stroka);

            }
        }
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