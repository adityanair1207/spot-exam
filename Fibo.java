public class Fibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i < 7; i++) {
            System.out.println(a);
            System.out.println(b);
            if (c == 6765) {
                a = b + c;
                b = c + a;
                c = a + b;
                continue;
            }
            System.out.println(c);

            a = b + c;
            b = c + a;
            c = a + b;
        }
    }
}
