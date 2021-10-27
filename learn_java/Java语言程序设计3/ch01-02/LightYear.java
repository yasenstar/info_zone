public class LightYear {
    public static void main(String args[]){
        final int LIGHT_SPEED = 300000;
        long seconds = 365 * 24 * 60 * 60;
        long distance = LIGHT_SPEED * seconds;
        System.out.println("One Light Year's Distance is " + distance + " Kilometers.");
    }
}
