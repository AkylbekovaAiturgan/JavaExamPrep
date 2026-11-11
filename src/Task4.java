import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = CheckNum(n);
        String c = CheckEven(n);
        System.out.println("The number " + n + " is an " + c +  " and " + s + ".");


    }

    public static String CheckNum(int a) {

        if (a > 0) {
            return "Positive";
        } else if (a == 0) {
            return "Zero";
        } else {
            return "Negative";
        }
    }
    public  static String CheckEven(int a) {
        if (a%2==0){
            return "Even";

        }
        else{
            return "Odd";
        }
    }
}

