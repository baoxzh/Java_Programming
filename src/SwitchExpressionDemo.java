public class SwitchExpressionDemo {
    public static void main(String[] args) {
        final int variable = 1; // 示例变量
        final int value1 = 1; // 示例值1
        final int value2 = 2; // 示例值2
        final int calculation1 = 100; // 计算结果1
        final int calculation2 = 200; // 计算结果2
        final int defaultValue = -1; // 默认值

        int result = switch (variable) {
            case value1 -> {
                // 计算并返回结果
                yield calculation1;
            }
            case value2 -> calculation2; // 简化的单行形式
            // 更多case...
            default -> defaultValue;
        };
        System.out.println("结果: " + result);
    }
}