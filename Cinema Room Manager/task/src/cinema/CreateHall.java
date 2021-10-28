package cinema;


import java.util.Scanner;

public class CreateHall {
    //private static final int ROW = 7;
    //private static final int COL = 8;
    //private static final String[][] matrixHall = new String[ROW][COL];
    public static final String SEAT = "S"; //  free seat
    private static final Scanner sc = new Scanner(System.in);

    public static String[][] twoRowCol () {
       // System.out.println("Enter the number of rows:");
        int a = sc.nextInt();
       // System.out.println("Enter the number of seats in each row:");
        int b = sc.nextInt();
        String[][] matrixHall = new String[a][b];
        return matrixHall;
    }

    public static String[][] createMatrixHall() {

        //System.out.println("Cinema:");
        System.out.print("  ");

        for (int a = 0; a <= twoRowCol().length; a++) {
            System.out.print((a + 1) + " ");
        }

        System.out.println();

        for (int i = 0; i < twoRowCol().length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < twoRowCol()[i].length; j++) {
                twoRowCol()[i][j] = SEAT;
                System.out.print(twoRowCol()[i][j] + " ");
            }
            System.out.println();
        }
        return twoRowCol();
    }


}
