import java.util.Scanner;

public class Game{
  
  private int playerTurn;
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Board board = new Board();
    board.printBoard();
    while(board.checkWin()==-1){
      System.out.println("Player 1, please enter a column (1-7).");
      int p1 = scan.nextInt();
      board.dropPiece(p1-1, 0);
      board.printBoard();
      if(board.checkWin()!=-1){
        System.out.println("Player 1 wins!");
        break;
      }
      System.out.println("Player 2, please enter a column (1-7).");
      int p2 = scan.nextInt();
      board.dropPiece(p2-1, 1);
      board.printBoard();
      if(board.checkWin()!=-1){
        System.out.println("Player 2 wins!");
        break;
      }
    }
    System.out.println("The game is over");
  }
}