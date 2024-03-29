package dev.koh.competitivecoding.geeksforgeeks.companyquestions;

import java.io.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList1 {
    static PrintWriter out;
    Node head;  // head of lisl
    Node lastNode;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int n = Integer.parseInt(br.readLine());
            LinkedList1 llist = new LinkedList1();
            String nums[] = br.readLine().split(" ");
            if (n > 0) {
                int a1 = Integer.parseInt(nums[0]);
                Node head = new Node(a1);
                llist.addToTheLast(head);
            }
            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(nums[i]);
                llist.addToTheLast(new Node(a));
            }
            llist.head = new ReverseLL().reverseList(llist.head);

            llist.printList();

            t--;
        }
        out.close();
    }

    /* Linked list Node*/
    /* Utility functions */
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            lastNode = node;
        } else {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }

    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            out.print(temp.data + " ");
            temp = temp.next;
        }
        out.println();
    }
}


/*This is a function problem.You only need to complete the function given below*/
//function Template for Java
/* Return reference of new head of the reverse linked list
 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */
class ReverseLL {
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head) {
        // add code here

        Node current = head, prev = null, nextNode;

        while (current != null) {

            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;

        }

        return prev;
    }
}
