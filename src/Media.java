import java.util.Scanner;
class Media {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int s = PrintSr(167, 890, 78);
        System.out.println(s);


    }

    public static int PrintSr(int a, int b, int c) {
        if (b<a && a < c || c<a && a < b) {
            return a;
        } else if (a<b && b < c || c<b && b <a) {
            return b;
        } else {
            return c;
        }

    }
}

