package cinema;

import static cinema.CreateHall.*;

public class Tickets {

    private static final int limitSeats = 60;

    public static int totalNumberOfSeats(int a, int b) {
        return a * b;
    }

    public static int countingTickets (String[][] arr) {

        int rowSize = arr.length;
        int colSize = arr[0].length;
        int seats = totalNumberOfSeats(rowSize, colSize);
        int ticketTen = 10;
        int ticketEight = 8;
        int allTicket = 0;

        //  < 60
        // Если общее количество мест в кинозале не более 60,
        // то цена КАЖДОГО билета составляет 10 долларов.
        if (seats < limitSeats) {
            allTicket = ticketTen * seats;

            // > 60  $10 and $8
            //В более ПРОСТОРНОМ зале билеты стоят 10 долларов за переднюю половину рядов
            // и 8 долларов за заднюю половину.
        } else if (seats > limitSeats){
            int oneHalfHall = 0;
            int twoHalfHall = 0;
            if (rowSize % 2 == 0) {
               oneHalfHall = rowSize / 2;
               twoHalfHall = rowSize - oneHalfHall;
                allTicket = (oneHalfHall * ticketTen) * (twoHalfHall * ticketEight) * colSize;
            } else if ((rowSize & 1) == 1) {
                rowSize = rowSize - 1;
                oneHalfHall = rowSize / 2;
                twoHalfHall = rowSize - oneHalfHall;
                allTicket = (oneHalfHall * ticketTen * colSize) * (twoHalfHall * ticketEight * colSize) * rowSize * colSize;
            }
        }
        return allTicket;
    }

}
