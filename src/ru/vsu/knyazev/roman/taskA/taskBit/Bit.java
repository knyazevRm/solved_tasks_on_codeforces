package ru.vsu.knyazev.roman.taskA.taskBit;

import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/282/A
 */
public class Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] oper = new String[num];
        for (int i = 0; i < num; i++) {
            oper[i] = sc.nextLine();
        }

        int result = 0;
        for (int i = 0; i < oper.length; i++) {
            if (oper[i].contains("++")) {
                result++;
            } else {
                result--;
            }
        }

        System.out.println(result);
    }
}
