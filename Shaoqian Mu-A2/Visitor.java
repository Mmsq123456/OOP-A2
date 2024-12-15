//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Visitor extends Person {
    private String ticketType;
    private String ticketDate;

    public Visitor() {
    }

    public Visitor(String name, char gender, int age, String ticketType, String ticketDate) {
        super(name, gender, age);
        this.ticketType = ticketType;
        this.ticketDate = ticketDate;
    }

    public String getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketDate() {
        return this.ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String toString() {
        String var10000 = super.toString();
        return "Visitor:" + var10000 + "\t" + this.ticketType + "\t" + this.ticketDate;
    }
}
