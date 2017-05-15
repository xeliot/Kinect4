import java.util.Scanner;

public class Game{
  
  private int playerTurn;
  private String player1Name;
  private String player2Name;
  
  public static void main(String[] args){
    System.out.println("Welcome to Kinect4");
    System.out.println("Designed by Dave, Santosh, and JJ");
    Scanner scan = new Scanner(System.in); // Create new scanner
    Board board = new Board(); // Create new board
    board.printBoard(); // Initial board print
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