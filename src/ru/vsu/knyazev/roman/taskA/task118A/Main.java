package ru.vsu.knyazev.roman.taskA.task118A;

/*
https://codeforces.com/contest/118/problem/A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Main {

    private static String getNewString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toLowerCase().toCharArray();
        Character[] vowels = new Character[]{'a', 'o', 'y', 'e', 'u', 'i'};
        List<Character> a = Arrays.asList(vowels);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (!a.contains(str[i])) {
                sb.append('.');
                sb.append(str[i]);
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        System.out.println(getNewString());
    }
}