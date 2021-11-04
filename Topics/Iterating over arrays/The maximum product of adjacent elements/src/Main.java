import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] maxArr = new int[size];
        int max1 = -9999;
        int max2 = -9998;
        int count = 0;


        for (int i = 0; i < maxArr.length; i++) {
            maxArr[i] = sc.nextInt();
            if (maxArr[i] > max1 ) {
                max1 = maxArr[i];
                count = i;
            }
            if (maxArr[i] == max1) {
                maxArr[i] = 0;
            }
            if (i == maxArr.length - 1) {
                maxArr[count] = 0;
            }
        }

        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] > max2) {
                max2 = maxArr[i];
            }

        }

//        for (Integer j : maxArr) {
//            System.out.println(j + " ");
//        }
        System.out.println(max1 * max2);


    }
}