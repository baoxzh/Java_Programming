public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10; // 定义乘法表的大小，例如10x10
        // 外层循环控制行
        for (int i = 1; i <= size; i++) {
            // 内层循环控制列
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t"); // 打印乘积，并使用制表符分隔
            }
            System.out.println(); // 每打印完一行后输出一个换行符
        }
    }
}