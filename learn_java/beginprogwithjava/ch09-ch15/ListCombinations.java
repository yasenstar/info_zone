public class ListCombinations {

    enum Symbol {cherry, lemon, kumquat, rutabaga}

    public static void main(String args[]) {
        for (Symbol Reel1 : Symbol.values()) {
            for (Symbol Reel2 : Symbol.values()) {
                for (Symbol Reel3 : Symbol.values()) {
                    for (Symbol Reel4 : Symbol.values()) {
                        System.out.println(Reel1 + "\t" + Reel2 + "\t" + Reel3 + "\t" + Reel4);
                    }
                }
            }
        }
    }
}
