package com.Bridgelabz;
public class Queues {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front, rear;

    Queues() {
        this.front = null;
        this.rear = null;
    }
  // UC3 Ability to create Queue of 56,30 and 70.
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println("Element is Add: " + newNode.data);
    }

    public int size() {
        int count = 0;
        Node temp = this.front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // UC4 Ability to dequeue from the begining.
    public int deQueue() {
        if (this.front == null) {
            System.out.println("Empty Queue.");
            return -1;
        }
        Node temp = this.front;
        this.front = this.front.next;
        return temp.data;
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}