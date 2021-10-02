public class CanIKeepKidsQuiet {
    public static void main(String args[]){
        int gumballs, kids, gumballsPerKid;
        boolean eachKidGetsTen;
        gumballs = 240;
        kids = 15;
        gumballsPerKid = gumballs / kids;

        System.out.println("True or false? Each kids gets 10 gumballs.");
        eachKidGetsTen = gumballsPerKid >=10;
        System.out.println(eachKidGetsTen);
    }    
}
