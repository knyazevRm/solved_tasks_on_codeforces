package ru.vsu.knyazev.roman.taskA.task236A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
https://codeforces.com/contest/236/problem/A
 */
public class Main {

    private static String floorCheck() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();
        Character[] characters = new Character[arr.length()];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = arr.charAt(i);
        }
        Set<Character> set = new HashSet<>();
        Collections.addAll(set, characters);

        return set.size() % 2 == 1 ? "IGNORE HIM!" : "CHAT WITH HER!";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(floorCheck());
        ;
    }
}
