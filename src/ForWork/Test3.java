package ForWork;

import java.math.BigInteger;

public class Test3 {
    public static void main(String[] args) {
        polindrom(19051 , 47459 );
    }

    private static void polindrom(long elem, int eei) {
        BigInteger result;
        boolean flag = true;
        String stroka = "";
        result = BigInteger.valueOf(elem * eei);
        System.out.println(result);
        stroka = String.valueOf(result);
                char[] array = stroka.toCharArray();
                for (int i = 0; i < array.length / 2; i++) {
                    if (array[i] != array[array.length - i - 1]) {
                        flag = false;
                    }
                }
                if (flag) System.out.println("AAAAAAAAAAAAAAA" + result);
    }
}
