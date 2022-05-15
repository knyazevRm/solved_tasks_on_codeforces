package ru.vsu.knyazev.roman.taskA.task69A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
https://codeforces.com/contest/69/problem/A
 */

public class Main {

    private static String youngPhysicist() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][3];
        for (int i = 0; i < num; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < num; j++) {
                sum += arr[j][i];
            }

            if (sum != 0) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(youngPhysicist());
    }
}