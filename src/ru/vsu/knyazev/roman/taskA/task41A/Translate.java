package ru.vsu.knyazev.roman.taskA.task41A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/41/A
 */
public class Translate {

    private static String checkStrForCorrectTranslation() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strBeforeTrans = bufferedReader.readLine();
        String strAfterTrans = bufferedReader.readLine();

        if (strAfterTrans.length() != strBeforeTrans.length()) {
            return "NO";
        }

        for (int i = 0; i < strBeforeTrans.length(); i++) {
            if (strBeforeTrans.charAt(i) != strAfterTrans.charAt(strAfterTrans.length() - 1 - i)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(checkStrForCorrectTranslation());
    }
}
