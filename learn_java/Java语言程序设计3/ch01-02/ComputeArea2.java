// package learn_java.Java语言程序设计3;

import java.util.Scanner;

public class ComputeArea2 {
    public static void main(String args[]){
        double radius;
        double area;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("请输入半径值： ");
        radius = keyboard.nextDouble();
        area = radius * radius * Math.PI;
        System.out.println("圆的面积是： " + area);
        keyboard.close();
    }
}
