package cinema;

import java.util.Scanner;

public class Cinema {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int col = sc.nextInt();

        CreateHall ch = new CreateHall();
        Tickets tk = new Tickets();
        String[][] arr = ch.twoRowCol(row, col);
        String[][] newArr = ch.createMatrixHall(arr);
        int a = tk.countingTickets(newArr);

        System.out.println("Total income:");
        System.out.println("$" + a);
    }
}