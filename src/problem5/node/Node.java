/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties

import problem5.student.Student;

public class Node {
    private Student student;
    private Node next;

    public class Node {
        private Student student;
        private Node next;

        public Node(Student student) {
            this.student = student;
            next = null;
        }

        public Student getData() {
            return student;
        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
