import java.util.Scanner;

public class ArrayMonthDays {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int monthDays[] = new int[12];
        int i;

        for (i=1; i<=12; i++) {
            System.out.print("How Many Days of Month " + i + "? ");
            monthDays[i-1] = keyboard.nextInt();
        }

        for (i=1; i<=12; i++) {
            System.out.println("Month " + i + " has " + monthDays[i-1] + " days.");
        }

        keyboard.close();;
    }
}
