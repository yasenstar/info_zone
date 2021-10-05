import java.util.Scanner;

public class LoginService {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("请输入6位数字密码: ");
        
        int password = keyboard.nextInt();

        boolean result = (password == 123456);

        System.out.println("用户密码是否正确： " + result);

        keyboard.close();
    }
}
