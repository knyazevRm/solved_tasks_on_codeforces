package ru.vsu.knyazev.roman.taskB.task1678B1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://codeforces.com/problemset/problem/1678/B1
 */

public class TokitsukazeAndGoodLine {

    private static int getNumMinOperForGoodLine(int len, String str) {
        int[] arrOfBit = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int countOper = 0;
        for (int i = 0; i < len - 1; i += 2) {
            if (arrOfBit[i] != arrOfBit[i + 1]) {
                countOper++;
            }
        }

        return countOper;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < num; i++) {
            System.out.println(getNumMinOperForGoodLine(Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine()));
        }
    }
}
