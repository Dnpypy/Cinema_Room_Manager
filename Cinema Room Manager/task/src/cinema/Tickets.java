package cinema;

import static cinema.CreateHall.*;

public class Tickets {
    private static final int limitSeats = 60;

    public static int countingTickets () {
        new CreateHall();
        twoRowCol();
        createMatrixHall();
        int oneTicket = 10;
        int twoTicket = 8;

        if (totalNumberOfSeats() < limitSeats) {
            int oneHalfHall = 0;
            int twoHalfHall = 0;
            //  *****  10$
            //  *****  10$
            //  *****  8$
            //  *****  8$
            //  < 60
            // Если общее количество мест в кинозале не более 60,
            // то цена КАЖДОГО билета составляет 10 долларов.

            // > 60  $10 and $8
            //В более ПРОСТОРНОМ зале билеты стоят 10 долларов за переднюю половину рядов
            // и 8 долларов за заднюю половину.
            if (twoRowCol().length % 2 == 0) {
                oneHalfHall = twoRowCol().length / 2;
                oneTicket = oneTicket * oneHalfHall;
                twoTicket = twoTicket * oneHalfHall;
            } else if ((twoRowCol() && 1) == 1) {
                twoHalfHall = (twoRowCol().length / 2) + 1;
            }
        }

        return ticket;
    }

    public static int totalNumberOfSeats(String[][] hall) {
        int numsSeats = 0;
        for (int i = 0; i < twoRowCol().length; i++) {
            for (int j = 0; j < twoRowCol()[i].length; j++) {
                if (hall[i][j] == SEAT) {
                    numsSeats++;
                }
            }

        }
        return numsSeats;
    }
}
