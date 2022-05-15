package ru.vsu.knyazev.roman.taskA.task59A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/59/A
 */

public class Word {

    private static String getNewString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int numOfUpCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                numOfUpCase++;
            }
        }

        return str.length() / 2 < numOfUpCase ? str.toUpperCase() : str.toLowerCase();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getNewString());
    }
}
