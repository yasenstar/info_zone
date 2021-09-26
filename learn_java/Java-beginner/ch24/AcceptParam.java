import java.awt.Graphics;
import java.applet.Applet;
public class AcceptParam extends Applet {
    String tempString;
    String score;

    public void init() {
        //得到Web页面中的str参数的值
        tempString = getParameter("str");
        if(tempString.equals("及格")) {
            score = "60~70";
        }
        else if(tempString.equals("中")) {
            score = "70~80";
        }
        else if(tempString.equals("良")) {
            score = "80~90";
        }
        else if(tempString.equals("优")) {
            score = "90~100";
        }
        else {
            score = "0~60";
        }
    }

    public void paint(Graphics g) {
        g.drawString(score, 10, 25);
    }

    public static void main(String args[]) {
        
    }
}
