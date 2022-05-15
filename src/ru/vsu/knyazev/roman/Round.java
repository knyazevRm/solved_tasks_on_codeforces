package ru.vsu.knyazev.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round {

    private static String getAnswer(String nM, String a) {
        String[] str = nM.split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        if (n > m) {
            return "NO";
        }

        str = a.split(" ");
        int[] point = new int[str.length];
        for (int i = 0; i < point.length; i++) {
            point[i] = Integer.parseInt(str[i]);
        }

        int chairClose = 0;

        chairClose += point[0];

        if (chairClose > m) {
            return "NO";
        }

        chairClose++;

        if (chairClose > m) {
            return "NO";
        }

        chairClose += point[0];

        if (chairClose > m) {
            return "NO";
        }

        for (int i = 1; i < point.length - 1; i++) {
            chairClose++;

            if (chairClose > m) {
                return "NO";
            }

            chairClose += point[i];

            if (chairClose >= m) {
                return "NO";
            }
        }

        if (chairClose + point[point.length - 1] + 1 > m) {
            return "NO";
        }


        return "YES";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String countD = bi.readLine();
        for (int i = 0; i < Integer.parseInt(countD); i++) {
            System.out.println(getAnswer(bi.readLine(), bi.readLine()));
        }
        bi.close();
    }
}
