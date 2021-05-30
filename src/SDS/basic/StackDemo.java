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
class Stack { 
    static final int MAX = 10;
    int a[] = new int[MAX]; // Maximum size of Stack 
    //0...Max-1
    int top;// kiểm soát đỉnh ngăn xếp
    Stack() {
        top = -1;
    } 
    boolean isEmpty() {
        return (top < 0);
    } 
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else { 
            a[++top] = x; // top++;a[top]=x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x;
            x= a[top--]; //x=a[top];top=top-1;
            return x;
        }
    }
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
}

// Driver code
class StackDemo {

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
