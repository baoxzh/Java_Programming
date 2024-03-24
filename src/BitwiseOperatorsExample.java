public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        int a = 12; // 二进制表示为 1100
        int b = 5;  // 二进制表示为 0101
        // 位与运算符 (&)
        int andResult = a & b; // 结果为 0100，即 4
        System.out.println("a & b: " + andResult);
        // 位非运算符 (~)
        int notResult = ~a; // 对 a 的每一位取反
        System.out.println("~a: " + notResult);
        // 位或运算符 (|)
        int orResult = a | b; // 结果为 1101，即 13
        System.out.println("a | b: " + orResult);
        // 位异或运算符 (^)
        int xorResult = a ^ b; // 结果为 1001，即 9
        System.out.println("a ^ b: " + xorResult);
        // 左位移运算符 (<<)
        int leftShift = a << 2; // 将 a 的位向左移动两位，结果为 110000，即 48
        System.out.println("a << 2: " + leftShift);
        // 右位移运算符 (>>)
        int rightShift = a >> 2; // 将 a 的位向右移动两位，遵循符号位扩展，结果为 0011，即 3
        System.out.println("a >> 2: " + rightShift);
        // 无符号右位移运算符 (>>>)
        int unsignedRightShift = -a >>> 2; // 对 -a 进行无符号右位移两位，不考虑符号位扩展
        System.out.println("-a >>> 2: " + unsignedRightShift);
        // 位运算符在数据加密的示例
        int original = 123456789;
        int key = 987654321; // 加密密钥
        int encrypted = original ^ key; // 加密
        int decrypted = encrypted ^ key; // 解密
        System.out.println("Original: " + original + ", Encrypted: " + encrypted + ", Decrypted: " + decrypted);
    }
}