package com.Bridgelabz;
public class Stacks {
    Node top;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }
    //****************************UC1 Create a stacks of 56->30->70**************************
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println("Element Push: " + top.data);
    }

//**************************UC2 pop from the stacks**************************************************
    public int peak() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return top.data;
    }

    public int pop() {
        int poped;

        if (isEmpty()) {
            System.out.println("Empty Stack.");
            return -1;
        }
        poped = top.data;
        top = top.next;

        return poped;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}