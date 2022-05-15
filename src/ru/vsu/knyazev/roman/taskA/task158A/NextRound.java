package ru.vsu.knyazev.roman.taskA.task158A;


import java.util.Scanner;

/*
https://codeforces.com/contest/158/problem/A
 */
public class NextRound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int m = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);
        String[] parts = sc.nextLine().split(" ");
        int[] points = new int[m];
        for (int i = 0; i < m; i++) {
            points[i] = Integer.parseInt(parts[i]);
        }

        int past = 0;
        for (int i = 0; i < m; i++) {
            if (points[i] >= points[k - 1] && points[i] > 0) {
                past++;
            }
        }

        System.out.println(past);

    }
}
