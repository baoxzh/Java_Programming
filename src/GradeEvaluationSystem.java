public class GradeEvaluationSystem {
    public static void main(String[] args) {
        int score = 85; // 假设的学生分数
        char grade;
        String reward = "";
        boolean parentMeeting = false;
        // 使用 if-else 语句判定成绩等级
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        // 使用 switch 语句分配奖励
        switch (grade) {
            case 'A':
                reward = "优秀奖学金";
                break;
            case 'B':
            case 'C':
                reward = "表现良好奖励";
                break;
            default:
                reward = "无奖励";
                parentMeeting = true; // 需要家长会议
                break;
        }
        // 使用条件运算符判断是否需要家长会议
        String meetingMessage = parentMeeting ? "需要家长会议" : "无需家长会议";
        // 输出结果
        System.out.println("成绩等级: " + grade);
        System.out.println("奖励: " + reward);
        System.out.println(meetingMessage);
    }
}