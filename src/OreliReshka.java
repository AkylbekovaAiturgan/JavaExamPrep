import java.util.Random;
import java.util.Scanner;
public class OreliReshka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = OreliReshka(n);
        System.out.println(r);

    }
    public static int OreliReshka(int n){
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int number = (int)(Math.random() * 2);
            System.out.println(number);

            if (number == 0) {
                sum++;
            }
        }
        return sum;

    }
}
