import java.util.Scanner;
class PrevNext {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = prentNext(n);
        int c = prentPrev(n);
        System.out.println("The next number for the number  " +  n + " is " + s + ".");
        System.out.println("The previous number for the number " +  n + " is " + c + ".");
    }

    public static int prentNext(int a) {
        int b = a + 1;
        return b;

    }

    public static int prentPrev(int a) {
        int d = a - 1;
        return d;
    }
}
