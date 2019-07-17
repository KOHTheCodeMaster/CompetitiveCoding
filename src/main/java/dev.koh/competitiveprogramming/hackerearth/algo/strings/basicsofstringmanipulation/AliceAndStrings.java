package dev.koh.competitiveprogramming.hackerearth.algo.strings.basicsofstringmanipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class AliceAndStrings {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        String ans = solve(s1, s2);
        System.out.println(ans);

    }

    private static String solve(String s1, String s2) {

        String ans = "NO";
        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 != l2) return ans;

        for (int i = 0; i < l2; i++) {
            if (s1.charAt(i) > s2.charAt(i))
                return ans;
        }

        return "YES";

    }

}

/*
 *  Date Created  : 17th July 2K19, 09:46 PM..!!
 *
 *  <| ================================================================ |>
 *
 *  Init Commit - [Hacker Earth]
 *  1. Algorithms > Strings > Basics Of String Manipulations
 *  2. 4 Questions Solved
 *     3 [100%]   |   1 [50%] SortSubstring
 *
 *  <| ================================================================ |>
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */









