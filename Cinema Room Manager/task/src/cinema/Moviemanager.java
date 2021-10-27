package cinema;


public class Moviemanager {
    private static final int ROW = 7;
    private static final int COL = 8;
    private static final String[][] matrixHall = new String[ROW][COL];
    private static final String SEATS = "S"; //  free seats
    private static final String EMPTYTWO = "  "; //  empty

    public static String[][] createMatrixHall() {

//        for (int a = 0; a <= ROW; a++) {
//           System.out.print ((a + 1) + " ");
//        }
        matrixHall[0][0] = EMPTYTWO;
        for (int i = 0; i < ROW; i++) {
            matrixHall[i][0] = (i + 1) + " ";
            for (int j = 0; j < COL; j++) {
                matrixHall[0][j] = (j + 1) + " ";
                //System.out.print(matrixHall[i][j] + " ");
            }
            System.out.println();
        }
        return matrixHall;
    }
//        System.out.println("Cinema:");
//        System.out.print("  ");
//
//        for (int a = 0; a <= ROW; a++) {
//           System.out.print ((a + 1) + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < ROW; i++) {
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < COL; j++) {
//                matrixHall[i][j] = EMPTY;
//                System.out.print(matrixHall[i][j] + " ");
//            }
//            System.out.println();
//        }
//        return matrixHall;


}
