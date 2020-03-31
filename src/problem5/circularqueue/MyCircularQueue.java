/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue

import problem5.node.Node;
import problem5.student.Student;

import java.util.ArrayList;

public class MyCircularQueue {
    private Node front;
    private int size;

    // Constructor
    public MyCircularQueue() {
        front = null;
        size = 0;
    }

    public void enqueue(ArrayList<Student> addData) {
        for (Student s : addData
        ) {
            if (s.getBackLogCounter() - s.getAppearingCounter() == 0) {
            } else if (s.getBackLogCounter() - s.getAppearingCounter() > 0) {
                //code to enqueue
                Node temp = new Node(s);
                if (this.front == null) {
                    front = temp;
                    temp.setNext(temp);
                    size++;
                } else {
                    temp.setNext(this.front);
                    Node parser = this.front;
                    while (parser.getNext() != this.front) {
                        parser = parser.getNext();
                    }
                    parser.setNext(temp);
                    front = temp;
                    size++;
                }
            } else {

                /*
                 Message-display in case of invalid Student Data
                 */
                System.out.println("Given Data is not Valid");
            }
        }

    }


    /*
     Helper method : to print Queue
     */
    public void printQueue() {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print(temp.getData().toStrings() + "--->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData().toStrings());
            }
        }
    }
}
