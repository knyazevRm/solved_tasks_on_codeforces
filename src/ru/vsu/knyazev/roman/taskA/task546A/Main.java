package ru.vsu.knyazev.roman.taskA.task546A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/contest/546/problem/A
 */
public class Main {

    private static int soldiersAndBananas() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int k = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int w = Integer.parseInt(str[2]);

        int currSale = 0;
        for (int i = 1; i <= w; i++) {
            currSale += k * i;
        }

        return (currSale > n) ? currSale - n : 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(soldiersAndBananas());
    }
}
