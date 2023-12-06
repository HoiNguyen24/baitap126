import src.Matrix;
import src.Array;
public class App {
    public static void main(String[] args) {
        float[][] matrix = new float[][]{
            {1,1,1,1},
            {1,1,1,1}
                ,{1,1,1,1},
                {1,1,1,1}
        };
        Matrix matrix1 = new Matrix();
        System.out.println(matrix1.MatrixDx(matrix));
        System.out.println(matrix1.MatrixCal(matrix));
        Array arr =  new Array();
//        arr.fibonaci(5);
        int[] arrr = new int[]{2,1,2,3,3,4};
        /*
            2 1 2 3 3 4
            3 1 2 2 3 4
            3 2 1 2 3 4
            3 3 1 2 2 4
            3 3 2 1 2 4

        */

        arr.sort(arrr);
        for(int i = 0 ; i < arrr.length; i++){
            System.out.println(arrr[i]);
        }
    }
}
