import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        char[][] ar = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ar[i][j] = '.';
                if (i == j) {
                    ar[i][j] = '*';
                }
                if (i == size - j - 1) {
                    ar[i][j] = '*';
                }

                if (i == size / 2) {
                    ar[i][j] = '*';
                }

                if (j == size / 2) {
                    ar[i][j] = '*';
                }

            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ar[i][j] + " ");

            }
            System.out.println();
        }


    }
}