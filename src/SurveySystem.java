import java.util.Scanner;
public class SurveySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] surveys = {
                {"问题1：...", "问题2：...", "问题3：..."}, // 主题1的问题
                {"问题1：...", "问题2：...", "问题3：..."}  // 主题2的问题
        };
        System.out.println("请选择问卷主题：1. 主题1, 2. 主题2");

        // Ensure input is an int and in the range [1, 2]
        int choice = -1;
        while (choice < 1 || choice > 2) {
            try {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 2) {
                    System.out.println("输入无效, 请再次输入");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("输入无效, 请再次输入");
                scanner.next();  // Clear the input
            }
        }
        String[] selectedSurvey = surveys[choice - 1];
        String[] answers = new String[selectedSurvey.length];
        for (int i = 0; i < selectedSurvey.length; i++) {
            System.out.println(selectedSurvey[i]);
            answers[i] = scanner.next();
        }
        System.out.println("你的回答：");
        for (int i = 0; i < selectedSurvey.length; i++) {
            System.out.println("问题：" + selectedSurvey[i]);
            System.out.println("回答：" + answers[i]);
        }
        scanner.close();
    }
}