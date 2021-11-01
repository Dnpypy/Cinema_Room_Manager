package cinema;


import java.util.Scanner;

import static cinema.Tickets.countingTickets;
import static cinema.Tickets.ticketSeat;

public class Cinema {

    /**
     * @value rowSeatTicket the variable is passed to the class Ticket
     * @value RESERVE reserve seat
     * @value sc the scanner was reading data from the console
     */
    private static final Scanner sc = new Scanner(System.in);
    private static final String RESERVE = "B";
    public static int rowSeatTicket = 0;

    public static void main(String[] args) {

        int row = getBasicRowsCount();
        int col = getBasicSeatsInEachRowCount();
        CreateHall ch = new CreateHall();
        Tickets tk = new Tickets();

        // создание зала
        String[][] arr = ch.twoRowCol(row, col);
        arr = ch.createMatrixHall(arr);

        // вывод меню
        menuCinema();

        int num;
        boolean cinemaTr = true;

   while (cinemaTr) {
            num = sc.nextInt();
            if (num == 1) {
                matrixOutput(arr);
                menuCinema();
                //break outer;
            } else if (num == 2) {
                String[][] cinema = tk.countingTickets(arr);
                System.out.println("Enter a row number:");
                int n = sc.nextInt();
                System.out.println("Enter a seat number in that row:");
                int m = sc.nextInt();
                rowSeatTicket = n;
                checkTicketSeat(cinema, n, m);
                countingTickets(cinema);
                System.out.println();
                System.out.println();
                System.out.println("Ticket price: $" + ticketSeat + "\n");
                menuCinema();
            }  else if (num == 0) {
                cinemaTr = false;
            }
        }


    }
    /**
     * menuCinema output menu cinema
     */
    public static void menuCinema() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit\n");
    }

    /**
     * getRowsCount takes the initial value of the rows input
     */
    public static int getBasicRowsCount() {
        System.out.print("Enter the number of rows:" + '\n');
        int rowsCount = sc.nextInt();
        return rowsCount;
    }

    /**
     * getSeatsInEachRowCount takes the initial value of entering seats in rows
     */
    public static int getBasicSeatsInEachRowCount() {
        System.out.print("Enter the number of seats in each row:" + '\n');
        int seatsInEachRowCount = sc.nextInt();
        System.out.println();
        return seatsInEachRowCount;
    }

    /**
     * @param seat a two-dimensional array of an already created hall is transmitted
     * @param a row number for the ticket
     * @param b seat number for the ticket
     * @return seat a two-dimensional array with a marked place
     */
    public static String[][] checkTicketSeat(String[][] seat, int a, int b) {
        a -= 1; b -= 1;
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                if (seat[a][b] == seat[i][j]) {
                    seat[a][b] = RESERVE;
                }

            }
        }
        return seat;
    }

    /**
     * matrixOutput output cinema hall
     * @param arr passed change a two-dimensional array with changed seats
     */
    public static void matrixOutput(String[][] arr) {
        System.out.println("\nCinema:");
        System.out.print("  ");

        for (int a = 0; a <= arr.length; a++) {
            System.out.print((a + 1) + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}