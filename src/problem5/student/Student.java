/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student {
    private int rollNumber;
    private String Name;
    private int backLogCounter;
    private int appearingCounter;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        Name = name;
    }

    public Student(int rollNumber, String name, int backLogCounter, int appearingCounter) {
        this.rollNumber = rollNumber;
        Name = name;
        this.backLogCounter = backLogCounter;
        this.appearingCounter = appearingCounter;
    }

    // getter & setter methods
    public int getRollNumber() {
        return rollNumber;
    }


    public int getBackLogCounter() {
        return backLogCounter;
    }


    public int getAppearingCounter() {
        return appearingCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", Name='" + Name + '\'' +
                '}';
    }

    public String toStrings() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", Name='" + Name + '\'' +
                ", backLogCounter=" + backLogCounter +
                ", appearingCounter=" + appearingCounter +
                '}';
    }
}
