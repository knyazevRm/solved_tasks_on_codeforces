package ru.vsu.knyazev.roman.taskA.task50A;

import java.util.Scanner;

/*
https://codeforces.com/contest/50/problem/A
 */
public class DominoStyling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        /*if (m %2 == 1 && n %2 == 1) {
            System.out.println(Math.max(m, n) * (Math.min(m, n) - 1) / 2 + Math.max(m, n) / 2);
        } else {
            System.out.println(m * n / 2);
        }*/
        System.out.println(m * n / 2);
    }
}
