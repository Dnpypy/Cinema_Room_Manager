package cinema;

public class CreateHall {

    /**
     * @value SEAT free seat
     */
    public static final String SEAT = "S";

    /**
     *  create rows col
     * @param a rows
     * @param b seats
     */
    public static String[][] twoRowCol (int a, int b) {
        return new String[a][b];
    }

    /**
     * @param arr a hall without seats is transferred
     * @return arr the hall with marked free seats
     */
    public static String[][] createMatrixHall(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = SEAT;
            }
        }
        return arr;
    }


}
