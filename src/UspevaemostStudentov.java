import java.util.Random;
import java.util.Scanner;
public class UspevaemostStudentov {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = Studenty(n);
        System.out.println(r);

    }
    public static int Studenty(int n){
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int c = (int)(Math.random() * 101);
            System.out.println(c);
            if (c >= 90) {
                sum1++;

            }
            else if (c >= 80 && c <90){
                sum2++;
            }
            else if( c >= 60 && c <80){
                sum3++;
            } else if (c < 60) {
                sum4++;
            }
        }
        return sum1;
    }
}

