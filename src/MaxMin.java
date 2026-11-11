import java.util.Random;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = MaxMin(n);
        System.out.println(r);

    }

    public static int MaxMin(int n) {
        int max = 0;
        int min = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int c = (int) (Math.random() * 101);
            System.out.print(c + " ");
            if (c > i) {
                max = c;
            } else {
                min = c;
            }
        }
        return max;
    }
}
//не правильно перерешай



