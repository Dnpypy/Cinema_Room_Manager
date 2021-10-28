import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr =  new int[n][m];
        int num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num = sc.nextInt();
                arr[i][j] = num;
            }
        }

        int max = Integer.MIN_VALUE;

        int indexRow = 0;
        int indexCol = 0;

        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (max == arr[i][j]) {
                    if (indexRow == i) {
                        // col <
                        if (indexCol < j) {
                            max2 = indexCol;
                        } else {
                            max2 = j;
                        }
                        // row <
                    } else if (indexRow < i) {
                        max1 = indexRow;
                    } else  {
                        max1 = i;
                    }
                } else if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexRow = i;
                    indexCol = j;
                }


            }
        }
        System.out.print(max1 + " " + max2);
    }
}