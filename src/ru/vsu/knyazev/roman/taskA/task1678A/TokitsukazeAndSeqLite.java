package ru.vsu.knyazev.roman.taskA.task1678A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://codeforces.com/problemset/problem/1678/A
 */

public class TokitsukazeAndSeqLite {

    private static int countOfOper(int lenghtOfSeq, int[] seq) {

        int min = lenghtOfSeq;
        boolean zeroFlag = false;
        for (int i = 0; i < lenghtOfSeq; i++) {
            if (seq[i] == 0) {
                min--;
                zeroFlag = true;
            }
        }

        if (zeroFlag) {
            return min;
        }

        for (int i = 0; i < lenghtOfSeq - 1; i++) {
            int j = i + 1;
            while (j < lenghtOfSeq) {
                if (seq[i] != seq[j]) {
                    j++;
                } else {
                    return lenghtOfSeq;
                }
            }
        }

        return lenghtOfSeq + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfSeq = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numOfSeq; i++) {
            System.out.println(countOfOper(Integer.parseInt(bufferedReader.readLine()),
                    Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()));
        }
    }
}
