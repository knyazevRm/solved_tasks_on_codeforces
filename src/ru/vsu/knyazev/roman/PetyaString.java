package ru.vsu.knyazev.roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class PetyaString {

    private static int weightMore() throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = arr[0];
        int b = arr[1];
        int yearPass = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            yearPass++;
        }

        return yearPass;
    }

    private static int stoneOnTable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int resultDel = 0;
        char curr = str[0];
        for (int i = 1; i < num; i++) {
            if (curr == str[i]) {
                resultDel++;
            } else {
                curr = str[i];
            }
        }

        return resultDel;
    }

    private static String youngShort() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < num; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            x += arr[0];
            y += arr[1];
            z += arr[2];
        }
        if (x == 0 && y == 0 && z == 0) {
            return "YES";
        }

        return "NO";
    }

    private static String youngPhysicist() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][3];
        for (int i = 0; i < num; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < num; j++) {
                sum += arr[j][i];
            }

            if (sum != 0) {
                return "NO";
            }
        }

        return "YES";
    }

    private static String floorCheckShort() throws IOException {
        int x = 0;
        int[] a = new int[30];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();
        for (int i = 0; i < arr.length(); i++) {
            a[arr.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 30; i++) {
            if (a[i] > 0) {
                x++;
            }
        }
        return x % 2 == 1 ? "IGNORE HIM!" : "CHAT WITH HER!";
    }


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

    private static String getUpWord() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }

    private static String matSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String delimeter = "\\+";
        String[] str = br.readLine().split(delimeter);
        if (str.length < 2) {
            return str[0];
        }
        Arrays.sort(str, (o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2));
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);
        sb.append("+");
        for (int i = 1; i < str.length - 1; i++) {
            sb.append(str[i]);
            sb.append("+");
        }
        sb.append(str[str.length - 1]);

        return sb.toString();
    }


    private static String getNewString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toLowerCase().toCharArray();
        Character[] vowels = new Character[]{'a', 'o', 'y', 'e', 'u', 'i'};
        List<Character> a = Arrays.asList(vowels);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (!a.contains(str[i])) {
                sb.append('.');
                sb.append(str[i]);
            }
        }

        return sb.toString();
    }

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

    private static int Lex_order() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toLowerCase().toCharArray();
        char[] str2 = br.readLine().toLowerCase().toCharArray();
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] < str2[i]) {
                return -1;
            } else if (str1[i] > str2[i]) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(weightMore());
    }
}
