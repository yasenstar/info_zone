public class CompareString {
    public static void main(String[] arguments) {
        String favorite = "chainsaw";
        String guess = "pool cue";
        System.out.println("Is Fin's favorite weapon is " + guess + " ?");
        System.out.println("to Upper Case: " + favorite.toUpperCase());
        System.out.println("Answer: " + favorite.equals(guess));
        System.out.println("Fin's favorite is " + favorite.length() + " characters");

    }
}
