package ru.vsu.knyazev.roman.taskA.task110A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/110/A
 */
public class LuckyNum {

    private static String nearLuckyNum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int countOfLuckyNum = 0;
        for (char ch: str.toCharArray()) {
            if (ch == '4' || ch == '7') {
                countOfLuckyNum++;
            }
        }

        for (char num: Integer.toString(countOfLuckyNum).toCharArray()) {
            if (!(num == '4' || num == '7')) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(nearLuckyNum());
    }
}
