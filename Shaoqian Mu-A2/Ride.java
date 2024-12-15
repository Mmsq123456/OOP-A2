//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ride implements RiderInterface, Comparator<Visitor> {
    private String rideName;
    private int rideStatus = 0;
    private Employee operator;
    public Queue<Visitor> visitorQueue = new LinkedList();
    public List<Visitor> visitorList = new LinkedList();
    public int maxRider = 0;
    private int numOfCycles = 0;

    public Ride() {
    }

    public Ride(String rideName, int rideStatus, Employee operator) {
        this.rideName = rideName;
        this.rideStatus = rideStatus;
        this.operator = operator;
    }

    public String getRideName() {
        return this.rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getRideStatus() {
        return this.rideStatus;
    }

    public void setRideStatus(int rideStatus) {
        this.rideStatus = rideStatus;
    }

    public Employee getOperator() {
        return this.operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public Queue<Visitor> getVisitorQueue() {
        return this.visitorQueue;
    }

    public void setVisitorQueue(Queue<Visitor> visitorQueue) {
        this.visitorQueue = visitorQueue;
    }

    public int getMaxRider() {
        return this.maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            this.visitorQueue.offer(visitor);
            System.out.println(visitor.getName() + "已成功添加参观队列！");
        } else {
            System.out.println(visitor.getName() + "未成功添加参观队列！");
        }

    }

    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor != null) {
            this.visitorQueue.remove(visitor);
            System.out.println(visitor.getName() + "已成功移除参观队列！");
        } else {
            System.out.println(visitor.getName() + "已成功移除参观队列！");
        }

    }

    public void printQueue() {
        if (this.visitorQueue.isEmpty()) {
            System.out.println("当前参观队列为空！");
        } else {
            System.out.println("参观队列内容如下:");

            for(Visitor visitor : this.visitorQueue) {
                System.out.println(visitor.toString());
            }
        }

    }

    public void addVisitorToHistory(Visitor visitor) {
        this.visitorList.add(visitor);
        System.out.println(visitor.getName() + "游客已从参观队列中至游客参观历史中！");
        if (this.getVisitorQueue().contains(visitor)) {
            this.removeVisitorFromQueue(visitor);
        }

    }

    public int checkVisitorFromHistory(Visitor visitor) {
        int n = this.visitorList.indexOf(visitor);
        return n == -1 ? 0 : 1;
    }

    public int numberOfVisitors() {
        return this.visitorList.size();
    }

    public void printRideHistory() {
        if (this.numberOfVisitors() == 0) {
            System.out.println("游客参观历史记录数据为空！");
        } else {
            Iterator iterator = this.visitorList.iterator();
            System.out.println("游客参观历史记录数据如下：");

            while(iterator.hasNext()) {
                Visitor visitor = (Visitor)iterator.next();
                System.out.println(visitor.toString());
            }

            System.out.println();
        }

    }

    public void runOneCycle() {
        if (this.operator == null) {
            System.out.println("无操作员,游乐设施无法运行！");
        } else if (this.visitorQueue.isEmpty()) {
            System.out.println("无游客队列,游乐设施无法运行！");
        } else {
            int riders = this.maxRider > this.visitorQueue.size() ? this.visitorQueue.size() : this.maxRider;

            for(int i = 0; i < riders; ++i) {
                Visitor visitor = (Visitor)this.visitorQueue.remove();
                this.visitorList.add(visitor);
            }

            ++this.numOfCycles;
            System.out.println("游乐设施运行" + this.numOfCycles + "次，接待了" + riders + "个游客。");
        }
    }

    public int compare(Visitor v1, Visitor v2) {
        int result = Integer.compare(v1.getAge(), v2.getAge());
        return result == 0 ? v1.getTicketDate().compareTo(v2.getTicketDate()) : result;
    }

    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for(Visitor visitor : this.visitorList) {
                writer.write(visitor.toString());
                writer.write("\n");
            }

            System.out.println("数据已成功导出！导出文件名:" + filename);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while(true) {
                String line;
                if ((line = reader.readLine()) == null) {
                    System.out.println("数据已成功导入！导入文件名:" + filename);
                    break;
                }

                String[] str = line.split("\t");
                String name = str[0].substring(8);
                char gender = str[1].charAt(0);
                int age = Integer.parseInt(str[2]);
                String ticketType = str[3];
                String ticketDate = str[4];
                Visitor visitor = new Visitor(name, gender, age, ticketType, ticketDate);
                if (visitor != null) {
                    this.addVisitorToQueue(visitor);
                    this.addVisitorToHistory(visitor);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
