package ru.vsu.knyazev.roman.taskA.task791A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
https://codeforces.com/contest/791/problem/A
 */

public class Main {

    private static int weightMore() throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = arr[0];
        int b = arr[1];
        int yearPass = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            yearPass++;
        }

        return yearPass;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(weightMore());
    }
}