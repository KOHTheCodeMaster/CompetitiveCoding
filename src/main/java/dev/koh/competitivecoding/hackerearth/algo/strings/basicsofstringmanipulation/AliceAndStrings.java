package dev.koh.competitivecoding.hackerearth.algo.strings.basicsofstringmanipulation;

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
 *  Last Modified  : 19th July 2K19, 08:37 PM..!!
 *
 *  <| ================================================================ |>
 *
 *  3rd Commit - [1 Q. | GeeksForGeeks]
 *  1. CrackTheSeries [100%] | GeeksForGeeks > Company Problems > Cognizant
 *
 *  Note:
 *      MathContext is used for Better precision when dealing with Huge values
 *
 *  <| ================================================================ |>
 *
 *  2nd Commit - [2 Q. | GeeksForGeeks | HackerRank]
 *  1. CycleDetection [100%] | HackerRank > DSA > LinkedList
 *  2. ReversedLinkedList [100%] | GeeksForGeeks > Company Problems > Cognizant
 *
 *  Note:
 *      Detect Loop in linked list problem of GeeksForGeeks which is
 *      same as CycleDetection [HR] prompted with Time Limit Exceeded Error with
 *      Time should be < 0.2 seconds
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









