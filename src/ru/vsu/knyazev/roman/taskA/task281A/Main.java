package ru.vsu.knyazev.roman.taskA.task281A;

/*
https://codeforces.com/contest/281/problem/A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    private static String getUpWord() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getUpWord());;
    }
}