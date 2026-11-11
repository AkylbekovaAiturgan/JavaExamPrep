import java.util.Scanner;

public class Coordinait {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int x = in.nextInt();
        String s = Coordinat(y, x);
        System.out.println(s);
    }

    public static String Coordinat(int y, int x) {

        if (y == 0 && x == 0) {
            return "Origin.";
        } else if (y > 0 && x > 0) {
            return "First Quadrant";
        } else if (y > 0 && x < 0) {
            return "Second Quadrant";
        } else if (y < 0 && x > 0) {
            return "Fourth Quadrant";
        } else if (y < 0 && x < 0) {
            return "Third Quadrant";
        } else if (y == 0) {
            return "Y-axis";
        } else {
            return "X-axis";
        }
    }
}

