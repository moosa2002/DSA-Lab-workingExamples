/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author dsu-29
 */

class Queue_2 {
    LinkedList llist;

    public Queue_2() {
        llist = new LinkedList();
    }

    public boolean isEmpty() {
        return llist.isEmpty();
    }

    public void enqueue(int new_data) {
        llist.insertLast(new_data);
    }

    public int deque() {
        return llist.deleteFirst();
    }

    void printQueue() {
        llist.displayList();
    }
}
