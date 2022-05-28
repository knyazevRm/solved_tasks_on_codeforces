package ru.vsu.knyazev.roman.taskA.task1686A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EverythingV2 {

    private static int getAllSum(int[] seq, int size) {
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += seq[i];
        }

        return sum;
    }

    private static String getResult(int[] seq, int size) {
        int[] sumWithoutOneElem = new int[size];
        final int sum = getAllSum(seq, size);

        for (int i = 0; i < size; i++) {
            sumWithoutOneElem[i] = sum - seq[i];
        }

        for (int j = 0; j < size; j++) {
            if (sumWithoutOneElem[j] % (size - 1) == 0) {
                if (seq[j] == (sumWithoutOneElem[j] / (size - 1))) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        MyScanner myScanner = new MyScanner();
        int countIter = myScanner.nextInt();
        for (int iterNum = 0; iterNum < countIter; iterNum++) {
            int currSizeOf = myScanner.nextInt();
            int[] currSeq = new int[currSizeOf];

            for (int i = 0; i < currSizeOf; i++) {
                currSeq[i] = myScanner.nextInt();
            }

            System.out.println(getResult(currSeq, currSizeOf));
        }
    }

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

