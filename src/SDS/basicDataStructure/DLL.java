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
public class DLL { 
    Node head; // head of list 
    class Node { 
        int data;
        Node prev;
        Node next;  
        Node(int d) {
            data = d; prev=next=null;
        }
    } 
    // Adding a node at the front of the list -- chèn vào đầu
    public void push(int new_data) {
        /* (1) Tạo nút mới, điều chỉnh 3 tham chiếu */
        Node new_Node = new Node(new_data);  
        new_Node.next = head;
        new_Node.prev = null;
        /* (2). change prev of head node to new node */
        if (head != null) {
            head.prev = new_Node;
        } 
        /* (3). move the head to point to the new node */
        head = new_Node;
    } 
    /* Given a node as prev_node, insert a new node after the given node */
    public void InsertAfter(Node prev_Node, int new_data) {  
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        } 
        /* (1) */
        Node new_node = new Node(new_data);  
        new_node.next = prev_Node.next; 
        prev_Node.next = new_node; 
        new_node.prev = prev_Node;
 
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
        // thứ tức khác ???
    }

    // Add a node at the end of the list
    void append(int new_data) { 
        Node new_node = new Node(new_data); //
        Node last = head; /* used in step 5*/ 
     
        /*  If the Linked List is empty, then make the new
         * node as head */
        if (head == null) { 
            head = new_node;
            return;
        }  
        /* Else traverse till the last node */
        while (last.next != null) {
            last = last.next;
        } 
        /*   Change the next of last node */
        last.next = new_node; 
        /*  Make last node as previous of new node */
        new_node.prev = last;
    }

    // This function prints contents of
    // linked list starting from the given node
    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    /* Driver program to test above functions*/
    public static void main(String[] args) {
        /* Start with the empty list */
        DLL dll = new DLL();

        // Insert 6. So linked list becomes 6->NULL
        dll.append(6); 
        // Insert 7 at the beginning. So
        // .. linked list becomes 7->6->NULL
        dll.push(7);

        // Insert 1 at the beginning. So
        // linked list becomes 1->7->6->NULL
        dll.push(1);

        // Insert 4 at the end. So linked
        // list becomes 1->7->6->4->NULL
        dll.append(4); 
        // Insert 8, after 7. So linked
        // list becomes 1->7->8->6->4->NULL
        dll.InsertAfter(dll.head.next, 8);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}
