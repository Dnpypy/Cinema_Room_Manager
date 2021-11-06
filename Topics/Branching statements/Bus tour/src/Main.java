import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // cm height
        int size = sc.nextInt(); //number of bridges
        int[] bridgesN = new int[size];

        for (int i = 0; i < size; i++) {
            bridgesN[i] = sc.nextInt();
        }

        String output2  = "Will not crash";

        for (int i = 0; i < size; i++) {
            if (h > bridgesN[i] || h == bridgesN[i]) {
                output2 = "Will crash on bridge " + (i + 1);
                break;
            }
        }
        System.out.println(output2);
    }
}