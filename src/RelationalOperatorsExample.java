public class RelationalOperatorsExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        // 等于 ==
        boolean isEqual = a == b;
        System.out.println("a == b: " + isEqual);
        // 不等于 !=
        boolean isNotEqual = a != b;
        System.out.println("a != b: " + isNotEqual);
        // 大于 >
        boolean isGreaterThan = a > b;
        System.out.println("a > b: " + isGreaterThan);
        // 小于 <
        boolean isLessThan = a < b;
        System.out.println("a < b: " + isLessThan);
        // 大于等于 >=
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("a >= b: " + isGreaterThanOrEqual);
        // 小于等于 <=
        boolean isLessThanOrEqual = a <= b;
        System.out.println("a <= b: " + isLessThanOrEqual);
        // 字符串比较
        String hello = "hello";
        String world = "world";
        String anotherHello = "hello";
        System.out.println("\"hello\".equals(\"hello\"): " + hello.equals(anotherHello)); // true
        System.out.println("\"hello\" == \"hello\": " + (hello == anotherHello)); // true, in this case, because of string internment
        System.out.println("\"hello\" == new String(\"hello\"): " + (hello == new String("hello"))); // false
        // 复合条件表达式
        int x = 5;
        boolean isInBetween = x > 0 && x < 10;
        System.out.println("x > 0 && x < 10: " + isInBetween);
        // 循环中使用关系运算符
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array element at index " + i + " is: " + array[i]);
        }
        // 使用关系运算符进行对象排序
    }
}