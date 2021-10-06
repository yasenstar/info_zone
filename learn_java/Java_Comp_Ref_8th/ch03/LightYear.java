public class LightYear {
    public static void main(String args[]) {
        int lightSpeed = 300000;  // km per second
        long days = 365;
        long seconds;
        long lightYear;

        seconds = days * 24 * 60 * 60;

        lightYear = lightSpeed * seconds;

        System.out.println("One LightYear is " + lightYear + " Kilometers.");
    }
}
