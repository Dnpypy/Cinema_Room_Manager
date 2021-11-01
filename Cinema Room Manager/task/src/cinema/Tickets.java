package cinema;

import static cinema.Cinema.rowSeatTicket;

public class Tickets {

    /**
     * @value limitSeats the limit of seats after which the ticket price changes
     * @value allTicket calculating the total amount of tickets(3/5 dont work)
     * @value ticketSeat the cost of a Cinema class ticket is transferred
     */
    private static final int limitSeats = 60;
    public static int allTicket = 0;
    public static int ticketSeat = 0;

    public static int totalNumberOfSeats(int a, int b) {
        return a * b;
    }

    /**
     * @param arr cinema 2D Multi-dimensional array that represent a cinema.
     * @return arr calculating the cost of tickets in the hall
     */
    public static String[][] countingTickets (String[][] arr) {

        int rowSize = arr.length;
        int colSize = arr[0].length;
        int seats = totalNumberOfSeats(rowSize, colSize);
        int ticketTen = 10;
        int ticketEight = 8;

        if (seats < limitSeats) {
            allTicket = ticketTen * seats;
            ticketSeat = 10;
        } else if (seats > limitSeats){
            int oneHalfHall = 0;
            int twoHalfHall = 0;
            if (rowSize % 2 == 0) {
                oneHalfHall = rowSize / 2;
                twoHalfHall = rowSize - oneHalfHall;
                ticketSeat = rowSeatTicket <= oneHalfHall ? 10 : 8;
                allTicket = (oneHalfHall * ticketTen  * colSize) + (twoHalfHall *  colSize * ticketEight);
            } else if ((rowSize & 1) == 1) {
                rowSize = rowSize - 1;
                oneHalfHall = rowSize / 2;
                twoHalfHall = rowSize - oneHalfHall;
                ticketSeat = rowSeatTicket <= oneHalfHall ? 10 : 8;
                allTicket = (oneHalfHall * ticketTen  * colSize) + (twoHalfHall *  colSize * ticketEight) + (colSize * ticketEight);
            }
        }
        return arr;
    }

}
