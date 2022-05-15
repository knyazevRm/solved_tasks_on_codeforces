package ru.vsu.knyazev.roman.taskA.taskArchimedes;

import java.util.*;

/*
https://codeforces.com/gym/103600/problem/B
 */

public class Archimedes {

    static HashMap<Integer, Integer> map = new HashMap<>(Map.of(0, 1,1, 2));

    private static int getMin(int n) {
        if (!map.containsKey(n)) {
            if (n %2 == 0) {
                map.put(n, getMin(n - 2) + getMin(n - 2) + 1);
            } else {
                map.put(n, getMin(n - 1) + getMin(n - 3) + 1);
            }
        }
        return map.get(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println(getMin(count));
    }
}
