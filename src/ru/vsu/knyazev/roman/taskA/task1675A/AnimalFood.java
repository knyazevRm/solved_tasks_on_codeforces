package ru.vsu.knyazev.roman.taskA.task1675A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
https://codeforces.com/problemset/problem/1675/A
 */

public class AnimalFood {

    private static String checkFoodForAnimal(int[] countOfFood) {
        int a = countOfFood[0];
        int b = countOfFood[1];
        int c = countOfFood[2];
        int x = countOfFood[3];
        int y = countOfFood[4];
        int numOfRemainingFoodForCat;
        int numOfRemainingFoodForDog;

        if (x == 0) {
            numOfRemainingFoodForCat = 0;
        } else {
            numOfRemainingFoodForCat = Math.max(x - a, 0);
        }

        if (y == 0) {
            numOfRemainingFoodForDog = 0;
        } else {
            numOfRemainingFoodForDog = Math.max(y - b, 0);
        }


        return numOfRemainingFoodForCat + numOfRemainingFoodForDog <= c ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numStr = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numStr; i++) {
            System.out.println(checkFoodForAnimal(Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()));
        }
    }
}
