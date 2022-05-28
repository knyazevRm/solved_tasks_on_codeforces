package ru.vsu.knyazev.roman.taskA.task1686A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Everything {

    private static int getSumOfSeqElem(int[] seq, int indexExtraElem, int sizeOfSeq) {
        int currSumOfSeq = 0;
        int i = 0;
        while (i < sizeOfSeq) {
            if (!(i == indexExtraElem)) {
                currSumOfSeq += seq[i];
            }
            i++;
        }

        return currSumOfSeq;
    }

    private static boolean checkToGetTheSameSeqAfterInsertArithmeticMean(int[] initSeq) {
        int sizeOfSeq = initSeq.length;

        int indexOfExtraElem = 0;
        while (indexOfExtraElem < sizeOfSeq) {
            int currSumOfSeqWithoutI = getSumOfSeqElem(initSeq, indexOfExtraElem, sizeOfSeq);
            int arithmeticMean;

            if (currSumOfSeqWithoutI % (sizeOfSeq - 1) == 0) {
                arithmeticMean = currSumOfSeqWithoutI / (sizeOfSeq - 1);

                if (arithmeticMean == initSeq[indexOfExtraElem]) {
                    return true;
                }
            }

            indexOfExtraElem++;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int countOfSeq = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < countOfSeq; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] tmpSeq = bufferedReader.readLine().split(" ");
            int[] seq = new int[n];
            for (int j = 0; j < n; j++) {
                seq[j] = Integer.parseInt(tmpSeq[j]);
            }

            boolean flag = checkToGetTheSameSeqAfterInsertArithmeticMean(seq);
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
