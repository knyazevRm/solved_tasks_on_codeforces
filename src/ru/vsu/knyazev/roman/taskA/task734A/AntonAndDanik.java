package ru.vsu.knyazev.roman.taskA.task734A;

/*
https://codeforces.com/problemset/problem/734/A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonAndDanik {

    private static String getWinner(int len, String seqOfGame) {
        int numOfGameWonByAnton = 0;
        for (int i = 0; i < len; i++) {
            if (seqOfGame.charAt(i) == 'A') {
                numOfGameWonByAnton++;
            }
        }

        if (numOfGameWonByAnton > len - numOfGameWonByAnton) {
            return "Anton";
        } else if (numOfGameWonByAnton < len - numOfGameWonByAnton) {
            return "Danik";
        }

        return "Friendship";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfGame = Integer.parseInt(bufferedReader.readLine());
        System.out.println(getWinner(numOfGame, bufferedReader.readLine()));
    }
}
