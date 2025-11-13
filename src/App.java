public class App {
    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception {
        int x = 0;
        long millis = 350;
        double q = 2.0;
        double E = 5.0;
        double m = 6.0;

        double a = (q*E)/m;

        do {
            for (int i = 0; i < x; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            x++;
            millis -= a;
            if(millis < 20)
                millis = 20;
            Thread.sleep(millis);
            System.out.print(CLEAN_SCREEN);
        } while (true);
    }
}
 // he modidicado para ramanueva