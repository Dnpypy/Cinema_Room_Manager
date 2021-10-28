import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] ar = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ar[i][j] = input.nextInt();
            }
        }

        boolean t = true;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] != ar[j][i]) {
                    t = false;
                    break;
                }

            }
        }

        if (t) {
            System.out.println("YES");
        } else if (!t) {
            System.out.println("NO");
        }


    }
}
