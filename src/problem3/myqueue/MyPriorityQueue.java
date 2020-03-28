/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node

public class MyPriorityQueue {
    private Node front;
    private Node rear;

    public MyPriorityQueue() {
        this.front = null;
        this.rear = null;
    }
    public boolean isEmpty() {
        return front == null;
    }

    public void insert(int data, int priority) {
        Node n = new Node(data, priority);
        if (isEmpty() || n.getPriority() < front.getPriority()) {
            n.setNext(front);
            front = n;
        } else {
            Node tem = front;
            while (tem.getNext() != null && tem.getNext().getPriority() <= n.getPriority()) {
                tem = tem.getNext();
            }
            n.setNext(tem.getNext());
            tem.setNext(n);
        }
    }



}
