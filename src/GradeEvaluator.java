public class GradeEvaluator {
    public static void main(String[] args) {
        int score = 82;
        String grade;
        if (score >= 90) {
            grade = "优秀";
        } else if (score >= 80) {
            grade = "良好";
        } else if (score >= 70) {
            grade = "中等";
        } else if (score >= 60) {
            grade = "及格";
        } else {
            grade = "不及格";
        }
        System.out.println("等级：" + grade);
    }
}