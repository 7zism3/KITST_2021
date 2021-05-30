/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicDataStructure;

/**
 *
 * @author Hung
 */
/* Java program to implement basic stack
operations */
class StackArray {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    StackArray()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
 
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
}
 
// Driver code
class Main {
    public static void main(String args[])
    {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}