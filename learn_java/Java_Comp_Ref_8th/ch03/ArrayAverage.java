public class ArrayAverage {
    public static void main(String args[]) {
        double nums[] = {10.2, 11.2, 12.3, 13.5, 14.6};
        double result = 0;
        
        for (int i = 0; i<5; i++) {
            result += nums[i];
        }

        System.out.println("Average is " + result / 5);
    }
}
