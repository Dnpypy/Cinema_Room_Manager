import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > min) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}