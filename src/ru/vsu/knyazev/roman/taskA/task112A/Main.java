package ru.vsu.knyazev.roman.taskA.task112A;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
https://codeforces.com/contest/112/problem/A
 */
public class Main {

    private static int Lex_order() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toLowerCase().toCharArray();
        char[] str2 = br.readLine().toLowerCase().toCharArray();
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] < str2[i]) {
                return -1;
            } else if (str1[i] > str2[i]){
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Lex_order());
    }
}
