public class Board {
    /*verantwoordelijk voor het bijhouden van de positie van de stukken op het bord*/

    private char[][] board = new char[8][8];
    private String startPosition;

    public Board(){
        /*bord wordt gemaakt met begin positie van de stukken*/
        startPosition =
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
                board[row][col] = startPosition.charAt(index++);
            }
        }
    }


    public void printBoard() {
        for(int row = 0; row < board.length; row++){
            System.out.print(board.length - row + " ");
            for(int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for(char i = 'a'; i < 'i'; i++){
            System.out.print(i + " ");
        }
    }
    public void move(String move){

        String[] m  = move.split("-");
        String start = m[0];
        String end = m[1];
        System.out.println(start + "-" + end);
        int[] startPosition = CoordinateSystem.coordinateToIndex(start);
        int[] endPosition = CoordinateSystem.coordinateToIndex(end);
        char piece =  board[startPosition[0]][startPosition[1]];

        board[startPosition[0]][startPosition[1]] = '.';
        board[endPosition[0]][endPosition[1]] = piece;
    }

    /*

    output

8 r n b q k b n r
7 p p p p p p p p
6 . . . . . . . .
5 . . . . . . . .
4 . . . . . . . .
3 . . . . . . . .
2 P P P P P P P P
1 R N B Q K B N R
  a b c d e f g h
  */

}




