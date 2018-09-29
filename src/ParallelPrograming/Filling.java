package ParallelPrograming;

class  Filling {
    static int defaultNumber;

    static float[] fillArrays(float[] array){
        if (array.length == 4) {
            return new float[]{defaultNumber, defaultNumber, defaultNumber, defaultNumber};
        }else {
            for (int i = 0; i <array.length ; i++) {
                array[i] = (float) (Math.random()*10);
            }
            return array;
        }
    }

    static float[][] fillMatrix(float[][] matrix){
        if (matrix[0].length == 4){
            return new float[][] {{defaultNumber, defaultNumber, defaultNumber, defaultNumber},
                                {defaultNumber, defaultNumber, defaultNumber, defaultNumber},
                                {defaultNumber, defaultNumber, defaultNumber, defaultNumber},
                                {defaultNumber, defaultNumber, defaultNumber, defaultNumber}};
        }else {
            for (int i = 0; i <matrix[0].length ; i++) {
                for (int j = 0; j <matrix.length ; j++) {
                    matrix[i][j] = (float) (Math.random()*10);
                }
            }
            return matrix;
        }
    }
}
