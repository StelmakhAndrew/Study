package ParallelPrograming;

class ArithmeticFunctions {

    static float[] additionArrays(float[] A, float[] B) {
        for (int i = 0; i < B.length; i++) {
            A[i] = A[i] + B[i];
        }
        return A;
    }

    static float[][] differenceMatrix(float[][] A, float[][] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = A[i][j] - B[i][j];
            }
        }
        return A;
    }


    static float[][] multiplicationMatrix(float[][] A, float[][] B) {
        float[][] res = new float[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }

    static float[] multiplicationMatrix(float[] A, float[][] B) {
        float[] res = new float[A.length];
        for (int j = 0; j < B[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
                res[j] += A[i] * B[i][j];

            }
        }
        return res;
    }

    static float maxMatrixElem(float[][] A) {
        float result = 0;
        for (float[] aA : A) {
            for (int j = 0; j < A.length; j++) {
                if (aA[j] > result) result = aA[j];
            }

        }
        return result;
    }

    static float maxArrayElem(float[] A) {
        float result = 0;
        for (float aA : A) {
            if (aA > result) result = aA;
        }
        return result;
    }

}
