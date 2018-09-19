package ForWork;

import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args) {
    }

    public static boolean theoryFerma(int i) {
        long result = (long) Math.pow((i / 2), i);
        return (result % i) == (i / 2 % i);
    }

    public static boolean rabinMiller(Integer elem) {
        BigInteger bigInteger = BigInteger.valueOf(elem);
        return bigInteger.isProbablePrime((int) Math.log(elem));
    }
}
