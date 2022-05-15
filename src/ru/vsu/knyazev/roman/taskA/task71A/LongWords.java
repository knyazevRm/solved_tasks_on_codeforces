package ru.vsu.knyazev.roman.taskA.task71A;

import java.util.Scanner;

/*
https://codeforces.com/contest/71/problem/A
 */
public class LongWords {

    public static String getName(String name) {
        int size = name.length();
        if (size <= 10) {
            return name;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(name.charAt(0));
        sb.append(size - 2);
        sb.append(name.charAt(size - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfStr = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < countOfStr; i++) {
            System.out.println(getName(sc.nextLine()));
        }
    }
}
