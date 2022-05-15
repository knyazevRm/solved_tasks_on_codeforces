package ru.vsu.knyazev.roman.taskA.task116A;


/*
https://codeforces.com/problemset/problem/116/A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tram {

    private static int calcMaxValueOfTram() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int max = 0;
        int currValue = 0;
        for (int i = 0; i < n; i++) {
            String[] tmp = bufferedReader.readLine().split(" ");
            currValue += -Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]);
            if (currValue > max) {
                max = currValue;
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(calcMaxValueOfTram());
    }
}
