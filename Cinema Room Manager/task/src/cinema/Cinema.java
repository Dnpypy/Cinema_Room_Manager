package cinema;


import java.util.*;
/**
 * Create hall cinema, sell tickets, check available seats, see sales statistics
 * @author User 143077307
 */
public class Cinema {

    //************************************************************************//
    //*************************** @VALUES ***********************************//
    //**********************************************************************//

    /**
     * *************** seats *******************
     *
     * @value SEAT free seat
     * @value RESERVE reserve seat
     * @value limitSeats the limit of seats after which the ticket price changes
     * @value flagReserve check seat in hall
     * @value perc Percentage % The number of purchased tickets represented as a percentage
     * @value seats all seats in hall
     */

    public  static final String SEAT = "S";
    private static final String RESERVE = "B";
    public  static final int limitSeats = 60;
    public  static boolean flagReserve = true;
    public  static double perc = 0.00;
    public  static int seats = 0;

    /**
     * **************** tickets ******************
     *
     * @value allTicket calculating the total amount of tickets
     * @value ticketSeat the cost of a Cinema
     * @value countcountTickets check number tickets
     * @value rowSeatTicket gets row in while(buy ticket)
     * @value ticketT established ticket price
     * @value ticketE established ticket price
     */

    public static int allTicket = 0;
    public static int ticketSeat = 0;
    public static int countTickets = 0;
    public static int rowSeatTicket = 0;
    public static final int ticketT = 10;
    public static final int ticketE = 8;

    /**
     * @value row number of rows when creating a hall
     * @value col number of cols when creating a hall
     */

    private static int row = 0;
    private static int col = 0;

    /**
     * @value sc the scanner was reading data from the console
     */
    public static final Scanner sc = new Scanner(System.in);


    //**********************************************************************//
    //*************************** METHOD MAIN ******************************//
    //**********************************************************************//

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        col = sc.nextInt();

        /* -> create hall */
        String[][] arr = twoRowCol(row, col);
        createMatrixHall(arr);
        matrixOutput(arr);
        System.out.println();

        /*
          @value tR the cycle works while the numbers are coming in
         * @value num choice menu
         */

        boolean tR = true;
        int num;
        menuCinema();

        while (tR) {
            num = sc.nextInt();
            if (num == 1) {
                matrixOutput(arr);
                menuCinema();
            } else if (num == 2) {
                while (true) {
                    System.out.println("\nEnter a row number:");
                    int xBuy = sc.nextInt();
                    rowSeatTicket = xBuy;
                    System.out.println("Enter a seat number in that row:");
                    int yBuy = sc.nextInt();

                    /* flag check reserve */
                    try {
                        checkReserveSeat(arr, xBuy, yBuy);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        flagReserve = false;
                        System.out.println("Wrong input!");
                    }
                    if (flagReserve) {
                        buyTicketSeat(arr, xBuy, yBuy);
                        countTickets++;
                        countingTickets(arr);
                        break;
                    }
                }
                menuCinema();
            } else if (num == 3) {
                printStatistics();
            } else if (num == 0) {
                menuCinema();
                tR = false;
            } else {
                tR = false;
            }
        }
    }

    //**********************************************************************//
    //*************************** OTHERS METHODS****************************//
    //**********************************************************************//

    public static void printStatistics() {
        System.out.println("\nNumber of purchased tickets: " + countTickets);
        /* 6 * 10   60 / 81 */
        perc = ((double) countTickets * 10 / (double) (row * col)) * 10;
        System.out.printf("Percentage: %.2f%%%n", perc);
        System.out.println("Current income: $" + ticketSeat);
        countAllTicket();
        menuCinema();
    }

    /**
     * menuCinema output menu cinema
     */

    public static void menuCinema() {
        System.out.println("\n1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit\n");
    }

    /**
     * matrixOutput output cinema hall
     * @param arr passed change a two-dimensional array with changed seats
     */

    public static void matrixOutput(String[][] arr) {
        System.out.println("\nCinema:\n");
        System.out.print("  ");

        /* check row > col, col > row, row == col, int f >>> + or - row or col */
        if (arr.length > arr[0].length) {
            int f = arr.length - arr[0].length;
            for (int a = 0; a < arr.length - f; a++) {
                System.out.print((a + 1) + " ");
            }
        } else if (arr.length < arr[0].length) {
            int f = arr[0].length - arr.length;
            for (int a = 0; a < arr.length + f; a++) {
                System.out.print((a + 1) + " ");
            }
        } else {
            for (int a = 0; a < arr.length; a++) {
                System.out.print((a + 1) + " ");
            }
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

    /**
     * create rows col
     * @param a rows
     * @param b seats
     */
    public static String[][] twoRowCol(int a, int b) {
        return new String[a][b];
    }

    /**
     * @param arr filling the hall empty seat
     */
    public static void createMatrixHall(String[][] arr) {
        for (String[] strings : arr) {
            Arrays.fill(strings, SEAT);
        }
    }

    /**
     * totalNumberOfSeats counting current all seats
     * @param a row length
     * @param b columns length
     */
    public static int totalNumberOfSeats(int a, int b) {
        return a * b;
    }

    /**
     * @value allTicket output all ticket price
     */
    public static void countAllTicket() {
        if (row * col > limitSeats) {
            allTicket = ticketT * (row / 2);
            allTicket = allTicket + ticketE * (row - row / 2);
            allTicket = allTicket * col;
        } else {
            allTicket = ticketT * row * col;
        }
        System.out.println("Total income: $" + allTicket);
    }

    /**
     * @param arr cinema 2D Multi-dimensional array that represent a cinema.
     */
    public static void countingTickets(String[][] arr) {
        var rowSize = arr.length;
        var colSize = arr[0].length;
        seats = totalNumberOfSeats(rowSize, colSize);
        var temp = 0;
        if (seats < limitSeats) {
            temp = ticketT;
        } else {
            int oneHalfHall = rowSize / 2;
            if (rowSeatTicket <= oneHalfHall) {
                temp = ticketT;
            } else {
                temp = ticketE;
            }
        }
        System.out.println("\nTicket price: $" + temp);
        ticketSeat += temp;
    }

    /**
     * @param seat a two-dimensional array of an already created hall is transmitted
     * @param a    row number for the ticket
     * @param b    seat number for the ticket
     */
    public static void buyTicketSeat(String[][] seat, int a, int b) {
        a -= 1;
        b -= 1;
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                if (seat[a][b].equals(seat[i][j])) {
                    seat[a][b] = RESERVE;
                    break;
                }
            }
        }
    }

    /**
     * @param seat a two-dimensional array of an already created hall is transmitted
     * @param a    row number for the ticket
     * @param b    seat number for the ticket
     * @value a message that the seat is occupied
     */
    public static void checkReserveSeat(String[][] seat, int a, int b) {
        a -= 1;
        b -= 1;
        var ex = true;
        if ((a > seat.length || b > seat[0].length) && (a < 0 || b < 0)) {
            System.out.println("Wrong input!");
            flagReserve = false;
            ex = false;
        } else if (a > seat.length || b > seat[0].length) {
            System.out.println("Wrong input!");
            flagReserve = false;
            ex = false;
        } else if (a < 0 || b < 0) {
            System.out.println("Wrong input!");
            flagReserve = false;
            ex = false;
        }

        for (String[] strings : seat) {
            if (!ex) {
                break;
            }
            for (int j = 0; j < strings.length; j++) {
                if (seat[a][b].equals(RESERVE)) {
                    System.out.println("\nThat ticket has already been purchased!\n");
                    flagReserve = false;
                    ex = false;
                    break;
                } else {
                    flagReserve = true;
                }

            }
        }
    }

}