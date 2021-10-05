//???

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String info[][] = new String[10][10];
        int id = 0;
        boolean continueShopping = true;

        do {
            info[id][0] = String.valueOf(id);
            System.out.print("商品名称: ");
            info[id][1] = keyboard.nextLine();
            System.out.print("数量: ");
            info[id][2] = keyboard.nextLine();
            System.out.print("单价: ");
            info[id][3] = keyboard.nextLine();
            System.out.print("继续购物？(y/n) ");
            if (keyboard.nextLine().equals("n")) {
                continueShopping = false;
            }
        } while (continueShopping);

        double total = 0;

        for (String[] x : info) {
            System.out.println(x);
        }

        keyboard.close();
    }
}
