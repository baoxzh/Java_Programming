public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        // 加法运算符
        int sum = 10 + 5;
        System.out.println("10 + 5 = " + sum);
        // 字符串连接
        String message = "Number:" + 25;
        System.out.println(message);
        // 减法运算符
        int difference = 10 - 5;
        System.out.println("10 - 5 = " + difference);
        // 乘法运算符
        int product = 10 * 5;
        System.out.println("10 * 5 = " + product);
        // 除法运算符（注意整数除法的结果）
        int quotient = 7 / 2;
        System.out.println("7 / 2 = " + quotient); // 结果为 3，而非 3.5
        // 浮点数除法
        double divisionResult = 7.0 / 2;
        System.out.println("7.0 / 2 = " + divisionResult); // 结果为 3.5
        // 取模运算符
        int remainder = 15 % 4;
        System.out.println("15 % 4 = " + remainder);
        // 自增运算符
        int a = 5;
        a++; // 等同于 a = a + 1;
        System.out.println("a++ = " + a);
        // 自减运算符
        int b = 5;
        b--; // 等同于 b = b - 1;
        System.out.println("b-- = " + b);
        // 注意前缀和后缀的区别
        int x = 5;
        int y = ++x; // x 先自增，然后赋值给 y
        System.out.println("y = ++x; x = " + x + ", y = " + y);
        int m = 5;
        int n = m++; // m 赋值给 n，然后 m 自增
        System.out.println("n = m++; m = " + m + ", n = " + n);
        // 使用括号改变运算顺序
        int complexCalculation = (2 + 3) * 4; // 加法先执行
        System.out.println("(2 + 3) * 4 = " + complexCalculation);
    }
}