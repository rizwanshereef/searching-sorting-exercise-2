package com.stackroute;

import java.util.Scanner;

class Node
{
    int data;
    Node next;

    // Constructor to create a new node
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class BinarySearch
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Node head = null;

        // Using push() function to insert number to the linked list
        head = push(head, 1);
        head = push(head, 4);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 9);
        head = push(head, 10);

        System.out.println("Enter the number to be searched:");
        int value = scan.nextInt();
        if (binarySearch(head, value) == null)
        {
            System.out.println(value +" not present");
        }
        else
        {
            System.out.println(value +" Present");
        }
    }
    // function to insert a node at the beginning
    static Node push(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    /* Function to find middle element */
    static Node middleNode(Node start, Node last)
    {
        if (start == null)
            return null;

        Node slow = start;
        Node fast = start.next;

        while (fast != last)
        {
            fast = fast.next;
            if (fast != last)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    /* function to search for the value */

    static Node binarySearch(Node head, int value)
    {
        Node start = head;
        Node last = null;

        do
        {

            Node mid = middleNode(start, last);


            if (mid == null)
                return null;


            if (mid.data == value)
                return mid;

            else if (mid.data > value)
            {
                start = mid.next;
            }

            // If the value is more than mid.
            else
                last = mid;
        } while (last == null || last != start);

        return null;
    }



}