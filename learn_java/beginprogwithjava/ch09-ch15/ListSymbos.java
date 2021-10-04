public class ListSymbos {

    enum Symbol {cherry, lemon, kumquat, rutabaga}

    public static void main(String args[]) {
        for (Symbol aReel : Symbol.values()) {
            System.out.println(aReel);
        }
    }
}
