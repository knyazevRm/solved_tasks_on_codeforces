package ru.vsu.knyazev.roman.taskA.taskWatermelon;

import java.util.Scanner;

/*
https://codeforces.com/contest/4/problem/A
 */
public class Main {

    private static String check_weight(String w) {
        int weight = Integer.parseInt(w);

        if (weight %2 == 0 && weight != 2) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(check_weight(in.nextLine()));
    }
}
