package ru.vsu.knyazev.roman.taskB.task1675B;

/*
https://codeforces.com/problemset/problem/1675/B
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seq {

    private static int getCountOfOper(int numOfElem, String str) {
        int[] elem = new int[numOfElem];
        String[] arrayOfStr = str.split(" ");
        for (int i = 0; i < numOfElem; i++) {
            elem[i] = Integer.parseInt(arrayOfStr[i]);
        }

        int countOfOper = 0;
        for (int i = numOfElem - 2; i >= 0; i--) {
            while (elem[i] >= elem[i + 1]) {
                elem[i] /= 2;
                countOfOper++;
                if (elem[i] == 0) {
                    break;
                }
            }

            if (elem[i] >= elem[i + 1]) {
                return -1;
            }
        }

        return countOfOper;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int countOfTest = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < countOfTest; i++) {
            System.out.println(getCountOfOper(Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine()));
        }
    }
}
