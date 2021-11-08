import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = sc.nextInt();
        boolean t = false;

        for (Integer i : arr) {
            if (i == count) {
                t = true;
                break;
            }
        }
        System.out.println(t);

    }
}