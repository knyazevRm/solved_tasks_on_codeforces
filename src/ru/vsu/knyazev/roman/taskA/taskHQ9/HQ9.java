package ru.vsu.knyazev.roman.taskA.taskHQ9;

import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/133/A
 */
public class HQ9 {

    /*public static void _133A() throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String arg = bi.readLine();
        for (int i = 0; i < arg.length(); i++) {
            if("HQ9".contains(arg.substring(i, i+1))) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.contains("H") || str.contains("Q") || str.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
