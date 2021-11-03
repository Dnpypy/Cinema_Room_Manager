import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean t = false;
        for (int i = 0; i < num; i++) {
            if (arr[i] == n) {
                try {
                    if (arr[i - 1] == m || arr[i + 1] == m) {
                        t = true;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
        }
        System.out.print(t);

    }
}