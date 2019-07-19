package dev.koh.competitiveprogramming.hackerrank.DSA.LinkedList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CycleDetection {

    private static final Scanner scanner = new Scanner(System.in);

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    private static boolean hasCycle(SinglyLinkedListNode head) {
        // Add code here
        boolean ans = false;

        SinglyLinkedListNode bunny = head;
        SinglyLinkedListNode turtle = head;

/*
        while (turtle != null && bunny != null && bunny.next != null) {

            turtle = turtle.next;
            bunny = bunny.next.next;

            if (turtle == bunny)
                return true;
        }
        return false;
*/

        while (turtle.next != null) {

            turtle = turtle.next;
            if (bunny.next == null || bunny.next.next == null)
                return false;

            bunny = bunny.next.next;

            if (turtle == bunny)
                return true;
        }

        return ans;
    }

    // Complete the hasCycle function below.

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            int index = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
            SinglyLinkedListNode temp = llist.head;

            for (int i = 0; i < llistCount; i++) {
                if (i == index) {
                    extra = temp;
                }

                if (i != llistCount - 1) {
                    temp = temp.next;
                }
            }

            temp.next = extra;

            boolean result = hasCycle(llist.head);

            bufferedWriter.write(String.valueOf(result ? 1 : 0));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

    private static class SinglyLinkedListNode {
        private int data;
        private SinglyLinkedListNode next;

        private SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    private static class SinglyLinkedList {
        private SinglyLinkedListNode head;
        private SinglyLinkedListNode tail;

        private SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        private void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
}
