package dev.koh.competitivecoding.exams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeVitaPractice {

    public static void main(String[] args) {

//        System.out.println("Begin.");
        CodeVitaPractice obj = new CodeVitaPractice();
        obj.solutionA();
//        System.out.println("\nEnd.");
    }

    private void solutionA() {

        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();
        scanner.nextLine();

        String str = scanner.nextLine();
        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {

            int q = scanner.nextInt() - 1;
            char c = str.charAt(q);
            Pattern pattern = Pattern.compile(c + "");
            Matcher matcher = pattern.matcher(str.substring(0, q));

            int count = 0;
            while (matcher.find())
                count++;
            System.out.println(count);
//                displayList(arrayList);
//                System.out.println(" | t : " + t + " | j : " + j);


        }

/*

        int t = 0;
        for(int j = t + 1; j <arrayList.size(); j++){
//            displayList(arrayList);
//            System.out.println(" | t : " + t + " | j : " + j);

            if(arrayList.get(t) < arrayList.get(j)){
                arrayList.remove(t);
                t = j;
            }
        }
*/

    }

    private void solutionB() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Long> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++)
            arrayList.add(scanner.nextLong());

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {

            long t = arrayList.get(0);

            for (int j = i + 1; j < arrayList.size(); j++) {
//                displayList(arrayList);
//                System.out.println(" | t : " + t + " | j : " + j);

                if (t < arrayList.get(j)) {
                    arrayList.remove(t);
                    t = arrayList.get(j);
                }
            }


        }
/*

        int t = 0;
        for(int j = t + 1; j <arrayList.size(); j++){
//            displayList(arrayList);
//            System.out.println(" | t : " + t + " | j : " + j);

            if(arrayList.get(t) < arrayList.get(j)){
                arrayList.remove(t);
                t = j;
            }
        }
*/

        System.out.println(arrayList.size());
    }

/*
    void displayList(ArrayList<Integer> arrayList){
        for(int i : arrayList)
            System.out.print(i + " ");
    }
*/

}
