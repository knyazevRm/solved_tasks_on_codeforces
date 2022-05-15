package ru.vsu.knyazev.roman.taskA.task677A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/677/A
 */

public class VanyaAndFence {

    private static int getLengthOfFence() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndH = bufferedReader.readLine().split(" ");
        String[] arrOfLengthOfBoy = bufferedReader.readLine().split(" ");

        int numOfBoy = Integer.parseInt(nAndH[0]);
        int lengthOfTense = Integer.parseInt(nAndH[1]);

        int resultN = 0;
        for (int i = 0; i < numOfBoy; i++) {
            if (lengthOfTense < Integer.parseInt(arrOfLengthOfBoy[i])) {
                resultN += 2;
            } else {
                resultN++;
            }
        }

        return resultN;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getLengthOfFence());
    }
}
