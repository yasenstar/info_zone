import java.io.*;    //导入Java中支持I/O类的包
public class streamtest {
    public static void main(String args[]) {
        String str;
        //创建标准输入流对象stdin来接收键盘System.in的输入
        InputStreamReader stdin = new InputStreamReader(System.in);
        //以缓冲流模式来接收stnin
        BufferedReader bufin = new BufferedReader(stdin);
        //使用try和catch机制来处理输入的异常
        try {
            System.out.print("请输入字符： ");
            //用str字符串对象来接收键盘输入的一行数据
            str = bufin.readLine();
            System.out.println("你输入的字符为： " + str);
        }
        catch(Exception e) {
            //System.out.println("发生I/O错误!!!");
            System.err.println("发生I/O错误!!!");
            e.printStackTrace();
        }
    }
}
