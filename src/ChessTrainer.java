import java.util.Scanner;

public class ChessTrainer {

    public static void main(String[] args) {
        Board board = new Board();
        boolean whosTurn = true;
        board.printBoard();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            if (whosTurn) {
                System.out.println("White's turn");
                System.out.print("Enter  move?");
                String move = input.nextLine();
                board.move(move);
                board.printBoard();
                whosTurn = false;
            } else {
                System.out.println("Black's turn");
                System.out.print("Enter a move?");
                String move = input.nextLine();
                board.move(move);
                board.printBoard();
                whosTurn = true;
            }
        }
        //System.out.println(CoordinateSystem.coordinateToIndex("e2")[0] + "," + CoordinateSystem.coordinateToIndex("e2")[1]);
        //System.out.println(CoordinateSystem.coordinateToIndex("a2")[0] + "," + CoordinateSystem.coordinateToIndex("a2")[1]);
        //System.out.println(CoordinateSystem.coordinateToIndex("h5")[0] + "," + CoordinateSystem.coordinateToIndex("h2")[1]);
        /*System.out.println();
        int[] index = {1, 4};
        String result = CoordinateSystem.indexToCoordinate(index);
        System.out.println(result);
        board.move("e2-e4");
        board.printBoard();
        board.move("e7-e5");
        board.printBoard();*/
    }
}
