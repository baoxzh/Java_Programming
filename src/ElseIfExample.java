public class ElseIfExample {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("数字是正数");
        } else if (number < 0) {
            System.out.println("数字是负数");
        } else {
            System.out.println("数字是 0");
        }
    }
}