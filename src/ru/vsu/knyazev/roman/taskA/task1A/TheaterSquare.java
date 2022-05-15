package ru.vsu.knyazev.roman.taskA.task1A;

import java.util.Arrays;
import java.util.Scanner;

/*
https://codeforces.com/contest/1/problem/A
 */
public class TheaterSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();
        long firstNum = (long) Math.ceil((double) arr[0] / arr[2]);
        long secNum = (long) Math.ceil((double) arr[1] / arr[2]);
        System.out.println(firstNum * secNum);
    }
}
