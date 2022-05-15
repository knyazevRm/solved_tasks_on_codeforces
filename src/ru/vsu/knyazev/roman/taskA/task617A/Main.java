package ru.vsu.knyazev.roman.taskA.task617A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/617/A
 */

public class Main {

    private static int getMinStepToFriendHome() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int range = Integer.parseInt(br.readLine());
        int numOfStep = 0;

        for (int i = 5; i >= 1 && range != 0; i--) {
            int lengthOfI = range / i;
            numOfStep += lengthOfI;
            range -= lengthOfI * i;
        }

        return numOfStep;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getMinStepToFriendHome());
    }
}
