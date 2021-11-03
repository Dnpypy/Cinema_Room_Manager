import java.util.*;

class Main {

    public static Scanner sc = new Scanner(System.in);
    public static int size;
    public static int[] arrN;
    public static int count = 0;
    public static int lastN = 0;

    public static void main(String[] args) {
        // put your code here
        size = sc.nextInt();
        arrN = readArray();
        lastN = sc.nextInt();
        System.out.println(countingNums(arrN, lastN));

    }  // main

    public static int[] readArray() {
        arrN = new int[size];
        for (int i = 0; i < size; i++) {
            arrN[i] = sc.nextInt();
        }
        return Arrays.copyOf(arrN, arrN.length);
    }

    public static int countingNums(int[] arr, int a) {
        for (int i : arr) {
            if (a == i) {
                count++;
            }
        }
        return count;
    }
}