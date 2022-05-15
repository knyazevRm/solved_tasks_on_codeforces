package ru.vsu.knyazev.roman.taskA.task1671A;


/*
https://codeforces.com/problemset/problem/1671/A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Line {

    private static boolean checkStr(String string) {
        if (string.length() < 2) {
            return false;
        }

        for (int i = 0; i < string.length(); ) {
            int j = i;
            while (j < string.length() && string.charAt(i) == string.charAt(j)) {
                j++;
            }

            if (j == i + 1) {
                return false;
            }

            i = j;
        }

        return true;
    }

    private static void possibleStr() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] arrayStr = new String[n];

        for (int i = 0; i < n; i++) {
            arrayStr[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < n; i++) {
            if (checkStr(arrayStr[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        possibleStr();
    }
}
