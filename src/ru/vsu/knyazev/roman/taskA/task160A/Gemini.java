package ru.vsu.knyazev.roman.taskA.task160A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/160/A
 */
public class Gemini {

    private static int getMinNumOfCoin() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfCount = Integer.parseInt(bufferedReader.readLine());
        int[] arrOfCoin = new int[numOfCount];
        String[] strOfCoin = bufferedReader.readLine().split(" ");

        int sumOfArray = 0;
        for (int i = 0; i < arrOfCoin.length; i++) {
            arrOfCoin[i] = Integer.parseInt(strOfCoin[i]);
            sumOfArray += arrOfCoin[i];
        }

        for (int i = 1; i < arrOfCoin.length; i++) {
            int value = arrOfCoin[i];
            int j = i - 1;
            while (j >= 0) {
                if (value < arrOfCoin[j]) {
                    arrOfCoin[j + 1] = arrOfCoin[j];
                    j--;
                } else {
                    break;
                }
            }

            arrOfCoin[j + 1] = value;
        }

        int currSum = 0;
        int result = 0;
        for (int i = arrOfCoin.length - 1; i >= 0 && 2 * currSum <= sumOfArray; i--) {
            currSum += arrOfCoin[i];
            result++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getMinNumOfCoin());
    }
}
