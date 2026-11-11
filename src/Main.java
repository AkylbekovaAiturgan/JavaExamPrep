
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        printGipotenuza(3, 4 );

    }
    public static void printGipotenuza(int a, int b) {
        int d =(a * a) + (b * b);
        double result = Math.sqrt(d);
        System.out.println(result);
    }
}

