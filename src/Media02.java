class Media02 {
    public static void main(String[] args) {
        int s = PrintSr(00, 999, 77);
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

