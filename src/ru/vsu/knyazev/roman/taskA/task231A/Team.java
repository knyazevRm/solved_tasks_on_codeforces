package ru.vsu.knyazev.roman.taskA.task231A;

import java.util.Scanner;

/*
https://codeforces.com/contest/231/problem/A
 */

public class Team {

    private static boolean checkTask(String answer) {
        int resultSum = 0;

        for (Character ch:
             answer.toCharArray()) {
            if (ch != ' ') {
                resultSum += Character.getNumericValue(ch);
            }
        }

        return resultSum >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfTask = Integer.parseInt(sc.nextLine());
        int countResolved = 0;
        for (int i = 0; i < countOfTask; i++) {
            if (checkTask(sc.nextLine())) {
                countResolved++;
            }
        }
        System.out.println(countResolved);
    }
}
