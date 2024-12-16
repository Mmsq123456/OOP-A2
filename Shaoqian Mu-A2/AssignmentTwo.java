//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Collections;

public class AssignmentTwo {
    public AssignmentTwo() {
    }

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
        assignmentTwo.partFourA();
        assignmentTwo.partFourB();
        assignmentTwo.partFive();
        assignmentTwo.partSix();
        assignmentTwo.partSeven();
    }

    public void partThree() {
        Employee employee = new Employee("Tom", "male", 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Visitor1", "female", 20, "adult_ticket", "2024-1-1","10","True");
        Visitor v2 = new Visitor("Visitor2", "female", 42, "adult_ticket", "2024-2-2","8","False");
        Visitor v3 = new Visitor("Visitor3", "", 18, "student_ticket", "2024-3-3","5","True");
        Visitor v4 = new Visitor("Visitor4", "female", 7, "child_ticket", "2024-4-4","15","True");
        Visitor v5 = new Visitor("Visitor5", "male", 60, "senior_ticket", "2024-5-5","17","False");
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);
        ride.printQueue();
        ride.removeVisitorFromQueue(v1);
        ride.printQueue();
    }

    public void partFourA() {
        Employee employee = new Employee("Visitor", "male", 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Visitor1", "male", 20, "adult_ticket", "2024-1-1","20","True");
        Visitor v2 = new Visitor("Visitor2", "female", 42, "adult_ticket", "2024-2-2","21","False");
        Visitor v3 = new Visitor("Visitor3", "male", 18, "student_ticket", "2024-3-3","24","True");
        Visitor v4 = new Visitor("Visitor4", "female", 7, "child_ticket", "2024-4-4","26","True");
        Visitor v5 = new Visitor("Visitor5", "male", 60, "senior_ticket", "2024-5-5","27","False");
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);
        ride.printQueue();
        int result = ride.checkVisitorFromHistory(v2);
        if (result == 1) {
            System.out.println(v2.getName() + "In the history of current visitors!");
        } else {
            System.out.println(v2.getName() + "Not in the current visitor visit history!");
        }

        System.out.println("Historical number of visitors：" + ride.numberOfVisitors());
        ride.printRideHistory();
    }

    public void partFourB() {
        Employee employee = new Employee("Visitor", "male", 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Visitor1", "male", 20, "adult_ticket", "2024-1-1","31","True");
        Visitor v2 = new Visitor("Visitor2", "female", 42, "adult_ticket", "2024-2-2","35","True");
        Visitor v3 = new Visitor("Visitor3", "male", 18, "student_ticket", "2024-3-3","19","False");
        Visitor v4 = new Visitor("Visitor4", "female", 7, "child_ticket", "2024-4-4","12","False");
        Visitor v5 = new Visitor("Visitor5", "male", 60, "senior_ticket", "2024-5-5","28","True");
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);
        System.out.println("pre-sort：");
        ride.printRideHistory();
        Collections.sort(ride.visitorList, new Ride());
        System.out.println("After sort：");
        ride.printRideHistory();
    }

    public void partFive() {
        Employee employee = new Employee("Visitor", "male", 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Visitor1", "male", 20, "adult_ticket", "2024-1-1","27","False");
        Visitor v2 = new Visitor("Visitor2", "female", 42, "adult_ticket", "2024-2-2","29","True");
        Visitor v3 = new Visitor("Visitor3", "male", 18, "student_ticket", "2024-3-3","57","False");
        Visitor v4 = new Visitor("Visitor4", "female", 7, "child_ticket", "2024-4-4","59","True");
        Visitor v5 = new Visitor("Visitor5", "male", 60, "senior_ticket", "2024-5-5","26","False");
        Visitor v6 = new Visitor("Visitor6", "male", 25, "adult_ticket", "2024-6-6","49","True");
        Visitor v7 = new Visitor("Visitor7", "female", 31, "adult_ticket", "2024-7-7","59","False");
        Visitor v8 = new Visitor("Visitor8", "male", 25, "student_ticket", "2024-8-8","52","False");
        Visitor v9 = new Visitor("Visitor9", "female", 6, "child_ticket", "2024-9-9","41","False");
        Visitor v10 = new Visitor("Visitor10", "male", 61, "senior_ticket", "2024-10-10","53","True");
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);
        ride.addVisitorToQueue(v6);
        ride.addVisitorToQueue(v7);
        ride.addVisitorToQueue(v8);
        ride.addVisitorToQueue(v9);
        ride.addVisitorToQueue(v10);
        ride.printQueue();
        ride.setMaxRider(4);
        ride.runOneCycle();
        System.out.println("One period has been executed. Procedure！！！！！");
        ride.printQueue();
        ride.printRideHistory();
    }

    public void partSix() {
        Employee employee = new Employee("Tom", "male", 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Mike", "male", 20, "adult_ticket", "2024-1-1","18","True");
        Visitor v2 = new Visitor("Lily", "female", 42, "adult_ticket", "2024-2-2","17","True");
        Visitor v3 = new Visitor("John", "male", 18, "student_ticket", "2024-3-3","40","False");
        Visitor v4 = new Visitor("Sarah", "female", 7, "child_ticket", "2024-4-4","57","False");
        Visitor v5 = new Visitor("David", "male", 60, "senior_ticket", "2024-5-5","42","True");
        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);
        ride.exportRideHistory("VisitorToHistory");
    }

    public void partSeven() {
        Employee employee = new Employee("Tom", "male", 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        ride.importRideHistory("VisitorToHistory");
        System.out.println("Number of visitors to historical records:" + ride.numberOfVisitors());
        ride.printRideHistory();
    }
}
