/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author dsu-29
 */

public class QueueClient {
    public static void main(String[] args) {
        Queue_2 list = new Queue_2();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.printQueue();
        list.deque();
        list.printQueue();
    }
}
