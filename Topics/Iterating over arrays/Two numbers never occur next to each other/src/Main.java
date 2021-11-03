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
        int[] twoArr = new int[twoN];

        for (int i = 0; i < twoN; i++) {
            twoArr[i] = sc.nextInt();
        }
//        3
//        1 2 3
//        3 4  true
        int oneNum = twoArr[0];  // 3
        int twoNum = twoArr[1];  // 4
        int count = arr[0];
        boolean tNumberChange = false;
        for (int i = 0; i < arr.length - 1; i++) {
            // 3 == 3 && 4 != 2 && 4 != 1
            // 3 == 3 && 4 != 3 && 4 !=
            //                       4 !=
            if ((oneNum == arr[i] && twoNum != arr[i + 1] && twoNum != arr[i - 1]) ||
               (twoNum == arr[i] && oneNum != arr[i + 1] && oneNum != arr[i - 1])){
                tNumberChange = true;
                break;
            }
        }
        System.out.println(tNumberChange);

    }
}