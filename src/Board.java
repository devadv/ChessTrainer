public class Board {
    /*verantwoordelijk voor het bijhouden van de positie van de stukken op het bord*/

    private char[][] board = new char[8][8];
    private String startposition;

    public Board(){
        /*bord wordt gemaakt met begin positie van de stukken*/
        startposition =
                "rnbqkbnr"+
                "pppppppp"+
                "........"+
                "........"+
                "........"+
                "........"+
                "PPPPPPPP"+
                "RNBQKBNR";

        int index = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col <8; col++) {
                board[row][col] = startposition.charAt(index++);
            }
        }
    }


    public void printBoard() {



    }

}




