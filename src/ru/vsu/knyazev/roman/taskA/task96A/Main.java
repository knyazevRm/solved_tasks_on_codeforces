package ru.vsu.knyazev.roman.taskA.task96A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/96/A
 */

public class Main {
    private static String football() throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int numOfConsecutiveElements = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                numOfConsecutiveElements++;
                if (numOfConsecutiveElements == 7) {
                    return "YES";
                }
            } else {
                numOfConsecutiveElements = 1;
            }
        }

        return "NO";
    }


    public static void main(String[] args) throws IOException {
        System.out.println(football());
    }
}
