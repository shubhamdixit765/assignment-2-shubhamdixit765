/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.node.TreeNode;

public class MyQueue {
    private Node front;
    private Node rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node ns = new Node();
        ns.setData(data);
        if (front == null) {
            front = rear = ns;
        } else {
            rear.setNext(ns);
            rear = ns;
        }
    }

    public void preSuccessor(TreeNode root) {
        if (root == null)
            return;
        else {
            enqueue(root.getKey());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
        }
    }

    public void getPreSucc() {
        Node temp = front.getNext();
        while (temp != null) {
            System.out.print(temp.getData() + "\t");
            temp = temp.getNext();
        }
    }
}
