package ParallelPrograming;

import java.util.Arrays;
import static ParallelPrograming.ArithmeticFunctions.*;
import static ParallelPrograming.Filling.*;

public class Lab2 {
    private static int N = 1000;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Lab2 started");
        Thread[] threads = new Thread[3];

        threads[0] = new Thread(() -> {
            System.out.println("Task 1 started");
            float A[] = new float[N],
                    B[] = new float[N],
                    C[] = new float[N],
                    D[] = new float[N],
                    E[];
            float MA[][] = new float[N][N],
                    MD[][] = new float[N][N];
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
            synchronized (threads) {
                defaultNumber = 1;
                A = fillArrays(A);
                B = fillArrays(B);
                C = fillArrays(C);
                D = fillArrays(D);
                MA = fillMatrix(MA);
                MD = fillMatrix(MD);
            }
            E = additionArrays(additionArrays(additionArrays(A, B), C), multiplicationMatrix(D, multiplicationMatrix(MA, MD)));
            System.out.println("E = " + Arrays.toString(E));
            System.out.println("Task 1 finished");
        });


        threads[1] = new Thread(() -> {
            System.out.println("Task 2 started");
            float q;
            float MH[][] = new float[N][N],
                    MK[][] = new float[N][N],
                    ML[][] = new float[N][N];
            synchronized (threads) {
                defaultNumber = 2;
                MH = fillMatrix(MH);
                MK = fillMatrix(MK);
                ML = fillMatrix(ML);
            }
            q = maxMatrixElem(differenceMatrix(multiplicationMatrix(MH, MK), ML));
            System.out.println("q = " + q);
            System.out.println("Task 2 finished");
        });

        threads[2] = new Thread(() -> {
            System.out.println("Task 3 started");
            float s;
            float R[] = new float[N],
                    T[] = new float[N];
            float MO[][] = new float[N][N],
                    MP[][] = new float[N][N];
            synchronized (threads) {
                defaultNumber = 3;
                R = fillArrays(R);
                T = fillArrays(T);
                MO = fillMatrix(MO);
                MP = fillMatrix(MP);
            }
            s = maxArrayElem(multiplicationMatrix(additionArrays(R, T), multiplicationMatrix(MO, MP)));
            System.out.println("s = " + s);
            System.out.println("Task 3 finished");
        });
        threads[0].start();
        threads[1].start();
        threads[1].setPriority(1);
        threads[2].start();
        threads[0].join();
        threads[1].join();
        threads[2].join();
        System.out.println("Lab2 finished");
    }
}
