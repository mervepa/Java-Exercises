/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class QueueClass {

    public static void main(String[] args) {

        Queue queue = new Queue();
        for (int i = 1; i <=20; i++) {
            queue.enqueue(i);
        }
        for (int i = 1; i <=20; i++) {
            System.out.printf("%2d ", queue.dequeue());
        }
    }
}
class Queue{
        private int[] elements;
        private int size;
        private int default_capacity;

        public Queue(int default_capacity) {
            this.default_capacity = default_capacity;
            elements = new int[default_capacity];
        }

        public Queue() {
             this(8);
        }

        public void enqueue(int v) {
            if (size >= elements.length) {
                int[] temp = new int[size * 2];
                System.arraycopy(elements,0, temp,0, size);
                elements = temp;
            }
            elements[size++] = v;
        }

        public int dequeue() {
            int v = elements[0];
            size--;
            for (int i =0; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            return v;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }

        public int defaultCapacity() {
            return default_capacity;
        }
}

