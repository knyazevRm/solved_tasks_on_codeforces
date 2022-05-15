package ru.vsu.knyazev.roman.taskC.task1675C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/1675/C
 */
public class Detective {

    private static int getSuspectNum(String str) {
        int id_last_one = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                id_last_one = i;
            }
        }

        int suspect = 0;
        for (int i = id_last_one; i < str.length(); i++) {
            suspect++;
            if (str.charAt(i) == '0') {
                break;
            }
        }

        return suspect;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(getSuspectNum(bufferedReader.readLine()));
        }
    }
}
