package ForWork;

import java.math.BigInteger;
import java.util.ArrayList;

public class Test1 {
    private static int firstPrime = 0;
    private static int secondPrime = 0;
    private static long palindrome = 0;

    public static void main(String[] args) {
//        long startTime = System.nanoTime();
        searchPrime();
        System.out.println("" + firstPrime);
        System.out.println("" + secondPrime);
        System.out.println("" + palindrome);

//        System.out.println("time  " + (System.nanoTime() - startTime));
       // 999949999
       // 30109
       // 33211
        // time  5503159510
        // time  5459094986
    }

    private static void searchPrime() {
        int a1;
        int a3;
        int a7;
        int a9;
        ArrayList<Integer> arrayList = new ArrayList(10000);
        for (int i = 10001; i < 100000; i = i + 10) {
            a1 = i;
            a3 = i + 2;
            a7 = i + 6;
            a9 = i + 8;
            if (rabinMiller(a1)) arrayList.add(a1);
            if (rabinMiller(a3)) arrayList.add(a3);
            if (rabinMiller(a7)) arrayList.add(a7);
            if (rabinMiller(a9)) arrayList.add(a9);
        }
        int index =0 ;
        long result;
        String stroka;
        for (int k = arrayList.size() - 1; k > index; k--) {
            for (int d = arrayList.size() - 1; d > 0; d--) {
                result = (long)arrayList.get(k) * (long)arrayList.get(d);
                stroka = String.valueOf(result);
                if (myPalindrom(stroka)) {
                    if (result > palindrome) {
                        palindrome = result;
                        firstPrime = arrayList.get(k);
                        secondPrime = arrayList.get(d);
                        index = d;
                    }
                    break;
                }
            }
        }
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

    public static boolean rabinMiller(Integer elem) {
        BigInteger bigInteger = BigInteger.valueOf(elem);
        return bigInteger.isProbablePrime((int) Math.log(elem));
    }
}