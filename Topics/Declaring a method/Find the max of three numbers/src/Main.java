import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        final int d = 1;
        final int e = 2;
        final int f = 3;
        if (a >= b && a >= c) {
            return d;
        } else if (b >= c && b >= a) {
            return e;
        } else {
            return f;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}