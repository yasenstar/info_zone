import java.util.Scanner;

public class BetterLoginService {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        String password;
        int i = 0;

        do {
            System.out.print("请输入6位数字密码: ");
            password = keyboard.nextLine();
            i++;
        } while (!"651472".equals(password) && i<3);

        if (i<3) {
            System.out.println("登录成功！");
        } else {
            System.out.println("超出尝试次数");
        }

        keyboard.close();
    }
}
