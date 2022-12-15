package CodeCS;
import java.util.*;
public class RotateImage {
    // You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
    int[][] solution(int[][] a) {
        int[][] res = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                res[j][a.length - 1 - i] = a[i][j];
            }
        }
        return res;



    }
}
