public class SimpleDoWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("计数：" + count);
            count++;
        } while (count < 5);
    }
}