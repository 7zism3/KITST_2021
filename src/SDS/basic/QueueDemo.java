/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Hung
 */
class Queue {
    private static int queue[]; 
    private static int capacity, front, rear  ;// kích thước, 
    
    Queue (int c) {
        front = rear = 0; // rỗng
        capacity = c;
        queue = new int[capacity];//0 đến (c-1)
    }

    // function to insert an element at the rear of the queue
    static void queueEnqueue(int data) {
        // check queue is full or not
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } // insert element at the rear
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    } 
    // function to delete an element
    // from the front of the queue
    static void queueDequeue() {
        // if queue is empty
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } // shift all the elements from index 2 till rear
        // to the right by one
        else {
            // dồn hàng lên
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            } 
            // store 0 at rear indicating there's no element
            if (rear < capacity) {
                queue[rear] = 0;//
            }

            // decrement rear
            rear--;
        }
        return;
    }

    // print queue elements
    static void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        } 
        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    // print front of queue
    static void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
}

public class QueueDemo {

    // Driver code
    public static void main(String[] args) {
        // Create a queue of capacity 4
        Queue  q = new Queue (4);

        // print QueueDemo elements
        q.queueDisplay();

        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);

        // print QueueDemo elements
        q.queueDisplay();

        // insert element in the queue
        q.queueEnqueue(60);

        // print QueueDemo elements
        q.queueDisplay();

        q.queueDequeue();
        q.queueDequeue();
        System.out.printf("\n\nafter two node deletion\n\n");

        // print QueueDemo elements
        q.queueDisplay();

        // print front of the queue
        q.queueFront();
    }
}
