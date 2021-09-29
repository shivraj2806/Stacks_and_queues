package com.Bridgelabz;

public class MainStacks {
    public static void main(String[] args) {

        Stacks stack = new Stacks();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.display();

        System.out.println(stack.peak());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
    }
}

