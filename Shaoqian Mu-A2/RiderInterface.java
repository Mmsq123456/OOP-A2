//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public interface RiderInterface {
    void addVisitorToQueue(Visitor var1);

    void removeVisitorFromQueue(Visitor var1);

    void printQueue();

    void runOneCycle();

    void addVisitorToHistory(Visitor var1);

    int checkVisitorFromHistory(Visitor var1);

    int numberOfVisitors();

    void printRideHistory();
}
