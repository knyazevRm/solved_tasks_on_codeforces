package ru.vsu.knyazev.roman.taskA.task266A;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/contest/266/problem/A
 */

public class Main {

    private static int stoneOnTable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int resultDel = 0;
        char curr = str[0];
        for (int i = 1; i < num; i++) {
            if (curr == str[i]) {
                resultDel++;
            } else {
                curr = str[i];
            }
        }

        return resultDel;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(stoneOnTable());
    }
}
