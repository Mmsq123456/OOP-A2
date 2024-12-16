import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    // 定义一个枚举来表示可以根据哪些属性进行比较
    public enum ComparisonProperty {
        TICKET_DATE, DURATION, FIRST_VISIT // 注意：FIRST_VISIT在Visitor类中可能需要调整为boolean类型
    }

    private ComparisonProperty property;

    // 构造方法，接收一个ComparisonProperty来指定比较的属性
    public VisitorComparator(ComparisonProperty property) {
        this.property = property;
    }

    @Override
    public int compare(Visitor v1, Visitor v2) {
        switch (property) {
            case TICKET_DATE:
                // 假设ticketDate是ISO 8601格式的日期字符串，可以直接比较
                return v1.getTicketDate().compareTo(v2.getTicketDate());
            case DURATION:
                // 假设duration是表示时间长度的字符串，可以比较它们
                // 注意：如果duration是数值（如小时、分钟等），应该转换为相应的数值类型进行比较
                return v1.getduration().compareTo(v2.getduration());
            case FIRST_VISIT:
                // 这里需要调整Visitor类中的Firstvisit属性为boolean类型，并相应地更新getter和setter方法
                // 假设Firstvisit已经被重命名为isFirstVisit，并且类型为boolean
                // if (v1.isFirstVisit() && !v2.isFirstVisit()) return -1;
                // if (!v1.isFirstVisit() && v2.isFirstVisit()) return 1;
                // return 0; // 如果两者都是首次访问或都不是，则相等
                // 由于目前Firstvisit是String类型，这里仅作示例，不进行实际比较
                throw new UnsupportedOperationException("FIRST_VISIT as String is not supported for comparison");
            default:
                throw new IllegalArgumentException("Invalid comparison property: " + property);
        }
    }
}