package cinema;

import static cinema.Cinema.rowSeatTicket;

public class Tickets {

    // количество сидений после которого цена билетов изменяется < >
    private static final int limitSeats = 60;

    // переменная для подсчета общей суммы билетов(в 3/5 не задействовано)
    public static int allTicket = 0;

    // передается стоимость билета в класс Cinema
    public static int ticketSeat = 0;

    // метод для подсчета общего количество мест в зале
    public static int totalNumberOfSeats(int a, int b) {
        return a * b;
    }

    // Подсчет общей суммы $ билетов в зале
    public static String[][] countingTickets (String[][] arr) {

        int rowSize = arr.length;
        int colSize = arr[0].length;
        int seats = totalNumberOfSeats(rowSize, colSize);
        int ticketTen = 10;
        int ticketEight = 8;

        //  < 60
        // Если общее количество мест в кинозале не более 60,
        // то цена КАЖДОГО билета составляет 10 долларов.
        if (seats < limitSeats) {
            allTicket = ticketTen * seats;
            // стоимость билета
            ticketSeat = 10;
            // > 60  $10 and $8
            //В более ПРОСТОРНОМ зале билеты стоят 10 долларов за переднюю половину рядов
            // и 8 долларов за заднюю половину.
        } else if (seats > limitSeats){
           // ticketPrice = false;

            int oneHalfHall = 0;
            int twoHalfHall = 0;
            if (rowSize % 2 == 0) {

               oneHalfHall = rowSize / 2;
               twoHalfHall = rowSize - oneHalfHall;

                // стоимость билета первая половина рядом 10
                ticketSeat = rowSeatTicket <= oneHalfHall ? 10 : 8;

                allTicket = (oneHalfHall * ticketTen  * colSize) + (twoHalfHall *  colSize * ticketEight);

            } else if ((rowSize & 1) == 1) { // 7 rowSize  9 colSize
                rowSize = rowSize - 1;
                oneHalfHall = rowSize / 2;
                twoHalfHall = rowSize - oneHalfHall;

                // стоимость билета первая половина рядом 10
                ticketSeat = rowSeatTicket <= oneHalfHall ? 10 : 8;

                // Пример подсчета allT = ( 3 * 10 * 9 = 270) + (3 * 9 * 8 = 216) + (9 * 8)
                allTicket = (oneHalfHall * ticketTen  * colSize) + (twoHalfHall *  colSize * ticketEight) + (colSize * ticketEight);
            }
        }
        //return allTicket; в 3/5 не задействовано
        return arr;
    }

}
