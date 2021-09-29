package com.Bridgelabz;

public class Queues_main {
    public static void main(String[] args) {
        Queues queue = new Queues();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.display();

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.display();
    }
}







