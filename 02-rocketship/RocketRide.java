
/**
 * Successfully Print a Rocketship on the Terminal.
 *
 * Volodymyr Pasichnyak
 * 09/23/2022
 */
class RocketRide{
    public static void main(String[] args){
        head();
        body();
        text();
        body();
        head();
    }//closes main method
    public static void head(){
        System.out.println("       /\\       ");
        System.out.println("      /  \\      ");
        System.out.println("     /    \\     ");
    }//closes head() method
    public static void body() {
        System.out.println("    +------+     ");
        System.out.println("    |      |     ");
        System.out.println("    |      |     ");
        System.out.println("    +------+     ");
    }// closes body() method
    public static void text() {
        System.out.println("    |United|     ");
        System.out.println("    |States|     ");
    }//closes text() method
}//closes class
