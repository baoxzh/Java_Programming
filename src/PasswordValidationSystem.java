import java.util.Scanner;
public class PasswordValidationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password, confirmPassword;
        boolean isValid;
        do {
            System.out.print("请输入你的密码：");
            password = scanner.nextLine();
            isValid = isPasswordValid(password);
            if (!isValid) {
                System.out.println("密码不符合安全标准，请重新输入！");
                continue;
            }
            System.out.print("请再次输入你的密码进行确认：");
            confirmPassword = scanner.nextLine();
            if (!password.equals(confirmPassword)) {
                System.out.println("两次密码输入不匹配，请重新尝试！");
            } else {
                System.out.println("密码设置成功！");
                break;
            }
            System.out.print("是否要重新设置密码？(yes/no)：");
        } while (scanner.next().equalsIgnoreCase("yes"));
        System.out.println("感谢使用密码验证系统！");
    }
    private static boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}