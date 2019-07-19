package dev.koh.competitivecoding.hackerearth.algo.strings.basicsofstringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortSubstring {

    public static void main(String[] args) {

        //  Time Stamp : 17th July 2K19, 08:37 PM..!!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        try {
            t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {

                String[] str = br.readLine().split(" ");
                String s = str[0];
                int n = Integer.parseInt(str[1]);
                int m = Integer.parseInt(str[2]);

//                char[] cStr = s.toCharArray();
                int len = s.length();
                Character[] cStr2 = new Character[len];

                for (int j = 0; j < len; j++) {
                    if (j < n)
                        System.out.print(s.charAt(j));
                    else
                        cStr2[j] = s.charAt(j);
                }

                Arrays.sort(cStr2, n, m + 1, Collections.reverseOrder());

                for (int k = n; k < len; k++) System.out.print(cStr2[k]);
                System.out.println();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}


/*
    public static void main(String[] args) {

        //  Time Stamp : 17th July 2K19, 08:37 PM..!!

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        t = scanner.nextInt(); //Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

//                String [] str = br.readLine().split(" ");
            String s = scanner.next(); // str[0];
            int n = scanner.nextInt(); //Integer.parseInt(str[1]);
            int m = scanner.nextInt(); //Integer.parseInt(str[2]);
//            scanner.nextLine();

//                char[] cStr = s.toCharArray();
            int len = s.length();
            Character [] cStr2 = new Character[len];

            for (int j = 0; j < len; j++) cStr2[j] = s.charAt(j);

            Arrays.sort(cStr2, n, m+1, Collections.reverseOrder());

            for (char c : cStr2) System.out.print(c);
            System.out.println();

        }


    }

 */