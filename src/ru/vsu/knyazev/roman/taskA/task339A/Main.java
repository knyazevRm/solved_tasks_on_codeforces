package ru.vsu.knyazev.roman.taskA.task339A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://codeforces.com/contest/339/problem/A
 */

public class Main {

    private static String matSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String delimeter = "\\+";
        String[] str = br.readLine().split(delimeter);
        if (str.length < 2) {
            return str[0];
        }
        Arrays.sort(str, (o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2));
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);
        sb.append("+");
        for (int i = 1; i < str.length - 1; i++) {
            sb.append(str[i]);
            sb.append("+");
        }
        sb.append(str[str.length - 1]);

        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        System.out.println(matSum());
    }
}
