public class NestedLoopControl {
    public static void main(String[] args) {
        outerLoop: // 外部循环的标签
        for (int i = 0; i < 5; i++) {
            innerLoop: // 内部循环的标签
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    break innerLoop; // 退出内部循环
                }
                if (i == 3) {
                    break outerLoop; // 退出外部循环
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}