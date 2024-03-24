import java.util.Scanner;

public class SimpleAccounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalIncome = 0.0, totalExpense = 0.0;
        int choice;

        while (true) {
            System.out.println("1. 添加收入");
            System.out.println("2. 添加支出");
            System.out.println("3. 显示总额");
            System.out.println("4. 退出");
            System.out.print("请选择一个选项：");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("输入收入金额：");
                    totalIncome += scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("输入支出金额：");
                    totalExpense += scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("总收入：" + totalIncome);
                    System.out.println("总支出：" + totalExpense);
                    break;
                case 4:
                    System.out.println("退出程序。");
                    return;
                default:
                    System.out.println("无效选项，请重新选择！");
                    break;
            }
        }
    }
}
