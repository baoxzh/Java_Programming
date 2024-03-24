public class UnaryOperatorsExample {
    public static void main(String[] args) {
        // 初始化变量
        int a = 5, b = 10;
        // 使用正号和负号一元运算符
        System.out.println("+a: " + (+a)); // 输出 +5，即 5
        System.out.println("-b: " + (-b)); // 输出 -10，即 -10
        // 自增运算符前缀形式
        int prefixInc = ++a; // a 先增加到 6，然后赋值给 prefixInc
        System.out.println("Prefix Increment: ++a = " + prefixInc + ", a = " + a);
        // 自减运算符后缀形式
        int postfixDec = b--; // b 的当前值 10 赋给 postfixDec，然后 b 减少到 9
        System.out.println("Postfix Decrement: b-- = " + postfixDec + ", b = " + b);
        // 自增运算符后缀形式的示例，常见于循环中
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) { // 使用 i++
            System.out.println("array[" + i + "] = " + array[i]);
        }
        // 自减运算符前缀形式的应用
        int countDown = 3;
        while (--countDown > 0) { // 使用 --countDown
            System.out.println("Counting down: " + countDown);
        }
        // 注意事项：前缀和后缀在使用时的区别
        int x = 5, y = 5;
        System.out.println("x++ = " + x++ + " (x now is " + x + ")"); // 输出原始值 5，之后 x 变为 6
        System.out.println("++y = " + ++y + " (y now is " + y + ")"); // y 先变为 6，然后输出 6
    }
}