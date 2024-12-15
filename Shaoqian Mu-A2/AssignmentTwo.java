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
        Employee employee = new Employee("Tom", '男', 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Mike", '男', 25, "adult_ticket", "2024-12-10");
        Visitor v2 = new Visitor("Lily", '女', 30, "adult_ticket", "2024-12-11");
        Visitor v3 = new Visitor("John", '男', 18, "student_ticket", "2024-12-12");
        Visitor v4 = new Visitor("Sarah", '女', 6, "child_ticket", "2024-12-13");
        Visitor v5 = new Visitor("David", '男', 60, "senior_ticket", "2024-12-14");
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
        Employee employee = new Employee("Tom", '男', 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Mike", '男', 25, "adult_ticket", "2024-12-10");
        Visitor v2 = new Visitor("Lily", '女', 30, "adult_ticket", "2024-12-11");
        Visitor v3 = new Visitor("John", '男', 18, "student_ticket", "2024-12-12");
        Visitor v4 = new Visitor("Sarah", '女', 6, "child_ticket", "2024-12-13");
        Visitor v5 = new Visitor("David", '男', 60, "senior_ticket", "2024-12-14");
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
            System.out.println(v2.getName() + "在当前游客参观历史中！");
        } else {
            System.out.println(v2.getName() + "不在当前游客参观历史中！");
        }

        System.out.println("游客参观历史人数：" + ride.numberOfVisitors());
        ride.printRideHistory();
    }

    public void partFourB() {
        Employee employee = new Employee("Tom", '男', 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Mike", '男', 25, "adult_ticket", "2024-12-10");
        Visitor v2 = new Visitor("Lily", '女', 30, "adult_ticket", "2024-12-11");
        Visitor v3 = new Visitor("John", '男', 18, "student_ticket", "2024-12-12");
        Visitor v4 = new Visitor("Sarah", '女', 6, "child_ticket", "2024-12-13");
        Visitor v5 = new Visitor("David", '男', 60, "senior_ticket", "2024-12-14");
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);
        System.out.println("排序前：");
        ride.printRideHistory();
        Collections.sort(ride.visitorList, new Ride());
        System.out.println("排序后：");
        ride.printRideHistory();
    }

    public void partFive() {
        Employee employee = new Employee("Tom", '男', 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Mike", '男', 25, "adult_ticket", "2024-12-10");
        Visitor v2 = new Visitor("Lily", '女', 30, "adult_ticket", "2024-12-11");
        Visitor v3 = new Visitor("John", '男', 18, "student_ticket", "2024-12-12");
        Visitor v4 = new Visitor("Sarah", '女', 6, "child_ticket", "2024-12-13");
        Visitor v5 = new Visitor("David", '男', 60, "senior_ticket", "2024-12-14");
        Visitor v6 = new Visitor("Mik", '男', 26, "adult_ticket", "2024-12-10");
        Visitor v7 = new Visitor("Liy", '女', 32, "adult_ticket", "2024-12-9");
        Visitor v8 = new Visitor("Jon", '男', 21, "student_ticket", "2024-12-2");
        Visitor v9 = new Visitor("Sra", '女', 4, "child_ticket", "2024-12-18");
        Visitor v10 = new Visitor("Dav", '男', 65, "senior_ticket", "2024-12-9");
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
        System.out.println("一周期已执行完毕！！！！！");
        ride.printQueue();
        ride.printRideHistory();
    }

    public void partSix() {
        Employee employee = new Employee("Tom", '男', 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        Visitor v1 = new Visitor("Mike", '男', 25, "adult_ticket", "2024-12-10");
        Visitor v2 = new Visitor("Lily", '女', 30, "adult_ticket", "2024-12-11");
        Visitor v3 = new Visitor("John", '男', 18, "student_ticket", "2024-12-12");
        Visitor v4 = new Visitor("Sarah", '女', 6, "child_ticket", "2024-12-13");
        Visitor v5 = new Visitor("David", '男', 60, "senior_ticket", "2024-12-14");
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
        Employee employee = new Employee("Tom", '男', 32, "Roller_Coaster_Rider", 8000);
        Ride ride = new Ride("Roller_Coaster", 1, employee);
        ride.importRideHistory("VisitorToHistory");
        System.out.println("游客参观历史记录数量:" + ride.numberOfVisitors());
        ride.printRideHistory();
    }
}
