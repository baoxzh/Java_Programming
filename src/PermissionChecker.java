public class PermissionChecker {
    public static void main(String[] args) {
        int permissions = 0b1011;
        int mask = 0b1000; // 只关注最高位是否为1
        boolean hasPermission = (permissions & mask) == mask; // 位与操作
        System.out.println("用户是否有权限：" + hasPermission);
    }
}