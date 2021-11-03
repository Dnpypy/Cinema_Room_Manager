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
        //3
        //1 2 3
        //2 3   false
        final int twoN = 2;
        int[] arrT = new int[twoN];

        for (int i = 0; i < twoN; i++) {
            arrT[i] = sc.nextInt();
        }
//        3
//        1 2 3
//        3 4  true
        int oneNum = arrT[0];  // 3
        int twoNum = arrT[1];  // 4
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == oneNum && twoNum != arr[i + 1] && twoNum != arr[i - 1]) {
               // System.out.println(arr[i]);
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
                break;
            }
        }

    }
}