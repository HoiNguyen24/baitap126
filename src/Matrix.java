package src;

import java.util.Arrays;

public class Matrix {
    public static void MatrixMax(float[][] matrix){
        float max = matrix[0][0];
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(max < matrix[i][j]) max = matrix[i][j];
            }
        }
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(max == matrix[i][j]) System.out.println(matrix[i][j]);;
            }
        }
    }
    public static float MatrixCal(float[][] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i][i] == 0){
                int t = i;
                while(a[i][i] == 0){
                    for(int k = 0 ; k < a.length;k++){
                        float temp  = a[i][k];
                        a[i][k] = -a[t][k];
                        a[t][k] = temp;
                    }
                    if(t == a.length-1)
                    {
                        break;
                    }
                    t++;
                }
            }
            for(int j = i+1;j < a.length;j++){
                if(a[j][i] == 0) {
                    continue;
                }
                if(a[j][i] != 0){
                    float t=a[j][i]/a[i][i];
                    for(int k=i; k<a.length; k++){
                        a[j][k] -=t*a[i][k];
                    }
                }
            }
        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
        float result = 1;
        for (int i = 0 ; i < a.length;i++){
            result *= a[i][i];
        }
        return result;
    }
    public static boolean MatrixDx(float[][] a){
        for(int i = 0 ; i < a.length;i++){
            for(int j = 0 ; j < a.length;j++){
                  if(i == j ) continue;
                  if(a[i][j] != a[j][i]) return false;
            }
        }
        return true;
    }
}
