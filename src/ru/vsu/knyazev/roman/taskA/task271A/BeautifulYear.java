package ru.vsu.knyazev.roman.taskA.task271A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/271/A
 */

public class BeautifulYear {

    private static boolean checkYear(int year) {
        String strOfYear = String.valueOf(year);
        for (int i = 0; i < strOfYear.length() - 1; i++) {
            for (int j = i + 1; j < strOfYear.length(); j++) {
                if (strOfYear.charAt(i) == strOfYear.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int getNextYear(int tmpYear) {
        for (int i = tmpYear + 1; true; i++) {
            if (checkYear(i)) {
                return i;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getNextYear(Integer.parseInt(bufferedReader.readLine())));
    }
}
