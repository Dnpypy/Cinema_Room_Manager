import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        final int twoN = 2;
        int[] twoArr = new int[twoN];

        for (int i = 0; i < twoN; i++) {
            twoArr[i] = sc.nextInt();
        }

        int oneNum = twoArr[0];
        int twoNum = twoArr[1];

        boolean tNumberChange = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == oneNum && arr[i - 1] == twoNum || arr[i] == twoNum && arr[i - 1] == oneNum) {
                tNumberChange = false;
                break;
            }
        }
        System.out.println(tNumberChange);

    }
}