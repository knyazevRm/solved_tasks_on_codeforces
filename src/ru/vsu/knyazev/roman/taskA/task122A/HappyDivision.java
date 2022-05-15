package ru.vsu.knyazev.roman.taskA.task122A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/122/A
 */

public class HappyDivision {

    private static final int[] happyNum = new int[]{4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

    private static String checkNumForHappiness() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < happyNum.length; i++) {
            if (num % happyNum[i] == 0) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(checkNumForHappiness());
    }
}
