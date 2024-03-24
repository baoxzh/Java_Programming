enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumSwitchExample {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("周一");
                break;
            case FRIDAY:
                System.out.println("周五");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("周末");
                break;
            default:
                System.out.println("工作日");
                break;
        }
    }
}