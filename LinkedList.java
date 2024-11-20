/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author dsu-29
 */


public class LinkedList {
    private Node front;
    private Node rear;

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void insertLast(int new_data) {
        Node new_node = new Node(new_data);
        if (isEmpty()) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }
    }

    public int deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    void displayList() {
        System.out.println("=== Displaying Elements of DEQ ===");
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
