package ru.vsu.knyazev.roman.taskA.task189A;

/*
https://codeforces.com/contest/189/problem/A
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    private static int cut() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int left = arr[0];
        int a = arr[1];
        int b = arr[2];
        int c = arr[3];
        int[] array = new int[left + 1];
        array[0] = 0;
        for (int i = 1; i <= left; i++) {
            array[i] = -1;
        }

        for (int i = 1; i <= left; i++) {
            if (i - a >= 0 && array[i - a] != -1) {
                array[i] = array[i - a] + 1;
            }

            if (i - b >= 0 && array[i - b] != -1) {
                array[i] = Math.max(array[i], array[i - b] + 1);
            }

            if (i - c >= 0 && array[i - c] != -1) {
                array[i] = Math.max(array[i], array[i - c] + 1);
            }
        }

        return array[left];
    }


    public static void main(String[] args) throws IOException {
        System.out.println(cut());
    }
}
