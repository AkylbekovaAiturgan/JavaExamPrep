import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        printSledPrev(179);

    }
    public static void printSledPrev(int a) {
        int d =a+1;
        int b = a-1;
        System.out.println("The next number for the number " + a + " is " + d);
        System.out.println("The previous number for the number " + a + " is " + b);

    }
}


