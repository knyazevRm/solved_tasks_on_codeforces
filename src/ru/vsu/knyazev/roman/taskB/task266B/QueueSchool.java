package ru.vsu.knyazev.roman.taskB.task266B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/266/B
 */

public class QueueSchool {

    private static String getQueueAfter(int n, int t, char[] arr) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1;) {
                if (arr[j + 1] - arr[j] == 5) {
                    arr[j] = 'G';
                    arr[j + 1] = 'B';
                    j += 2;
                } else {
                    j++;
                }
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int t = Integer.parseInt(strings[1]);

        System.out.println(getQueueAfter(n, t, bufferedReader.readLine().toCharArray()));
    }
}
