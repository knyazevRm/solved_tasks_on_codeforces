package ru.vsu.knyazev.roman.taskA.task58A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/58/A
 */

public class Chat {

    private static String getHello() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str  = bufferedReader.readLine();
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int index_hello = 0;
        for (int i = 0; i < str.length(); i++) {
            if (hello[index_hello] == str.charAt(i)) {
                index_hello++;
            }

            if (index_hello == 5) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getHello());
    }
}
