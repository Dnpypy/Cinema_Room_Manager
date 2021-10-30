package cinema;

public class CreateHall {

    public static final String SEAT = "S";

    // Определения размера зала
    public static String[][] twoRowCol (int a, int b) {
        return new String[a][b];
    }

    // Создание зала
    public static String[][] createMatrixHall(String[][] arr) {
        System.out.println("Cinema:");
        System.out.print("  ");

        for (int a = 0; a <= arr.length; a++) {
            System.out.print((a + 1) + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
           System.out.print((i + 1) + " ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = SEAT;
                System.out.print(arr[i][j] + " ");
            }
           System.out.println();
        }
        return arr;
    }


}
