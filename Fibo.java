public class Fibo {
    // code for prime nos
    public static void main(String[] args) {
        int c = 0;
        int n = 0;
        int i = 1;
        int j = 1;

        while (n < 20) {
            j = 1;
            c = 0;
            while (j <= i) {
                if (i % j == 0) {
                    c++;
                }
                j++;
            }
            if (c == 2) {
                System.out.println(i);
                n++;
            }
            i++;
        }
    }
}
