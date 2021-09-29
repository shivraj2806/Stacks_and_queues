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

        public void display() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

