import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        long n = Long.parseLong(arr[0]);
        char p = arr[1].charAt(0);
        long m = Long.parseLong(arr[2]);
        final char plus = '+';
        final char minus = '-';
        final char multiplication = '*';
        final char division = '/';

        switch (p) {
            case (plus) :
                System.out.println(n + m);
                break;
            case (minus) :
                System.out.println(n - m);
                break;
            case (division) :
                if (m == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(n / m);
                }
                break;
            case (multiplication) :
                System.out.println(n * m);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}