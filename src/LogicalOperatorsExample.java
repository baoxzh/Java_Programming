public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // 逻辑与 (&&)
        boolean bothTrue = a && b;
        System.out.println("a && b: " + bothTrue); // 输出 false，因为不是两个表达式都为 true
        // 逻辑或 (||)
        boolean eitherTrue = a || b;
        System.out.println("a || b: " + eitherTrue); // 输出 true，因为至少一个表达式为 true
        // 逻辑非 (!)
        boolean notA = !a;
        System.out.println("!a: " + notA); // 输出 false，因为 a 是 true
        // 复合逻辑表达式
        int x = 5;
        boolean isInRange = x > 0 && x < 10;
        System.out.println("x > 0 && x < 10: " + isInRange); // 输出 true，因为 x 确实在 0 和 10 之间
        // 短路逻辑
        boolean shortCircuit = a || (b && !a);
        System.out.println("a || (b && !a): " + shortCircuit); // 输出 true，因为 a 为 true，后面的表达式不会被计算
        // 使用括号改变优先级
        boolean priorityChange = !(a && b) || (a && !b);
        System.out.println("!(a && b) || (a && !b): " + priorityChange); // 输出 true，展示了如何使用括号改变计算顺序
        // 多条件复杂判断
        boolean complexCondition = !a || b && (a || !b);
        System.out.println("!a || b && (a || !b): " + complexCondition); // 可能需要添加括号以明确意图
    }
}