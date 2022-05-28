package ru.vsu.knyazev.roman.taskA.task467A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuraAndSettlement {

    private static boolean checkRoomForTwo(int[] arr) {
        if (arr[1] - arr[0] > 1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfRoom = Integer.parseInt(bufferedReader.readLine());
        int numOfSuitableRooms = 0;

        for (int i = 0; i < numOfRoom; i++) {
            String[] tmpRoom = bufferedReader.readLine().split(" ");
            if (checkRoomForTwo(new int[]{Integer.parseInt(tmpRoom[0]), Integer.parseInt(tmpRoom[1])})) {
                numOfSuitableRooms++;
            }
        }

        System.out.println(numOfSuitableRooms);
    }
}
