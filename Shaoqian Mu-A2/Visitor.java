//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Visitor extends Person {
    private String ticketType;
    private String ticketDate;
    private String duration;
    private String Firstvisit;
    public Visitor() {
    }

    public Visitor(String name, String gender, int age, String ticketType, String ticketDate,String duration,String Firstvisit) {
        super(name, gender, age);
        this.ticketType = ticketType;
        this.ticketDate = ticketDate;
        this.duration = duration;
        this.Firstvisit = Firstvisit;
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

    public String getduration() {
        return this.duration;
    }

    public void setduration(String duration) {
        this.duration = duration;
    }

    public String getFirstvisit() {
        return this.Firstvisit;
    }

    public void setFirstvisit(String duration) {
        this.Firstvisit = Firstvisit;
    }

    public String toString() {
        String var10000 = super.toString();
        return "Visitor:" + var10000 + "\t" + this.ticketType + "\t" + this.ticketDate+ "\t" + this.duration+ "\t" + this.Firstvisit;
    }
}
