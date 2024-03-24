public class LabelledBreakDemo {
    public static void main(String[] args) {
        int n = 5; // 示例值
        boolean condition = false; // 示例条件，设置为false以避免立即跳出循环

        label: for (int i = 0; i < n; i++) {
            // 嵌套循环或代码
            System.out.println("在标签跳出之前的循环，i = " + i); // 显示循环执行情况
            if (condition) {
                break label; // 跳出带有标号label的循环
            }
        }

        System.out.println("已跳出带标签的循环");
    }
}