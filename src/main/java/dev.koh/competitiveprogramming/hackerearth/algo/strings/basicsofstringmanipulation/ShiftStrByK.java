package dev.koh.competitiveprogramming.hackerearth.algo.strings.basicsofstringmanipulation;

import java.util.Scanner;

public class ShiftStrByK {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        shiftStrByK(scanner.nextLine(), scanner.nextInt());

    }

    private static void shiftStrByK(String s, int k) {

        int len = s.length();
        char[] cStr = new char[len];

        for (int i = 0; i < len; i++) {
            int pos = (i + k) % len;
            cStr[pos] = s.charAt(i);
        }

        for (char c : cStr)
            System.out.print(c);

//        int pos = k % len;
//        System.out.print(s.substring(len - pos));
//        System.out.println(s.substring(0, len - pos));

    }

}
