package ru.vsu.knyazev.roman.taskA.task977A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/977/A
 */

public class Main {

    /*
    The second sol
     */
    private static int miscalWithRemainderOfTheDivision() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] tmpData = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(tmpData[0]);
        int k = Integer.parseInt(tmpData[1]);
        for (int i = 1; i <= k; i++) {
            int division = n % 10;
            if (division != 0) {
                n--;
            } else {
                n /= 10;
            }
        }
        return n;
    }

    /*
    The first solution
     */
    private static int miscalculation() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] tmpData = bufferedReader.readLine().split(" ");
        String n_str = tmpData[0];
        int n = Integer.parseInt(n_str);
        int k = Integer.parseInt(tmpData[1]);
        for (int i = 1; i <= k; i++) {
            if (n_str.charAt(n_str.length() - 1) == '0') {
                n_str = n_str.substring(0, n_str.length() - 1);
                n /= 10;
            } else {
                n--;
                n_str = Integer.toString(n);
            }
        }

        return n;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(miscalWithRemainderOfTheDivision());
    }
}
