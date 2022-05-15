package ru.vsu.knyazev.roman.taskA.task263A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Matrix {

    private static int getShortWay(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    return Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
        int[][] mat = new int[5][5];
        for (int i = 0; i < 5; i++) {
            mat[i] = Arrays.stream(dr.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(getShortWay(mat));
    }
}
