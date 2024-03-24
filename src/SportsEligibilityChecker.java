public class SportsEligibilityChecker {
    public static void main(String[] args) {
        boolean isMale = true;
        double weight = 72.5;
        boolean canParticipate = (isMale && weight >= 60.0 && weight <= 80.0) ||
                (!isMale && weight >= 50.0 && weight <= 70.0);
        System.out.println("是否可以参加运动会: " + canParticipate);
    }
}