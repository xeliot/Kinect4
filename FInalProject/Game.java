import java.util.Scanner;

public class Game{
  
  //private int playerTurn;
  private static String player1Name;
  private static String player2Name;
  
  public static void main(String[] args){
    System.out.println("Welcome to Kinect4");
    System.out.println("Designed by Dave, Santosh, and JJ");
    System.out.println("----------------------------------");
    Scanner scan = new Scanner(System.in); // Create new scanner
    Board board = new Board(); // Create new board
    System.out.println("Hi Player 1. Please enter your name");
    player1Name = scan.nextLine();
    System.out.println("Hi Player 2. Please enter your name");
    player2Name = scan.nextLine();
    board.printBoard(); // Initial board print
    while(board.checkWin()==-1){
      System.out.println(player1Name + ", please enter a column (1-7).");
      int p1 = scan.nextInt();
      board.dropPiece(p1-1, 0);
      board.printBoard();
      if(board.checkWin()!=-1){
        System.out.println(player1Name + " wins!");
        break;
      }
      System.out.println(player2Name + ", please enter a column (1-7).");
      int p2 = scan.nextInt();
      board.dropPiece(p2-1, 1);
      board.printBoard();
      if(board.checkWin()!=-1){
        System.out.println(player2Name + " wins!");
        break;
      }
    }
    System.out.println("Thanks for playing");
  }
}