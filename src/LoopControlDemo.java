public class LoopControlDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // 当 i 等于 5 时退出循环
            }
            if (i % 2 == 0) {
                continue; // 如果 i 是偶数，跳过当前迭代
            }
            System.out.println(i);
        }
    }
}