
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] maxArr = new int[size];
        long max =  Integer.MIN_VALUE;
        int outputMax1 = 0;
        int outputMax2 = 0;

        for (int i = 0; i < maxArr.length; i++) {
            maxArr[i] = sc.nextInt();
        }

        for (int i = 0; i < maxArr.length; i++) {
            if (i + 1 == maxArr.length) {
                break;
            }

            int temp = maxArr[i] * maxArr[i + 1];
            if (temp > max) {
                max = temp;
                outputMax1 = maxArr[i];
                outputMax2 = maxArr[i + 1];
            }
        }
        System.out.println(outputMax1 * outputMax2);
    }
}