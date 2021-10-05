/* 位移运算符
* 左移"<<"，右移">>"，无符号右移">>>"
 */

public class BitwiseOperator {
    public static void main(String args[]) {
        int password = 751248;
        int key = 7;
        System.out.println("原密码: " + password);
        
        password = password<<key;
        System.out.println("经过左移运算加密后的结果: " + password);

        password = password>>key;
        System.out.println("经过右移运算还原后的结果: " + password);
    }
}
