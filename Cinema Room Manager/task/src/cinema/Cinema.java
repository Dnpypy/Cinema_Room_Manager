package cinema;

public class Cinema {


    private static final int ROW = 8;
    private static final int COL = 8;

    public static void main(String[] args) {

        String[][] matrixHall = new String[ROW][COL];
        System.out.println("Cinema:");
        for (int h = 1; h < 9; h++){

            System.out.print(h + " ");
        }

        System.out.print("\n");

        for (int i = 1; i < ROW; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < COL; j++) {
                matrixHall[i][j] = "S";
                System.out.print(matrixHall[i][j] + " ");
            }
            System.out.println();
        }
    }
}