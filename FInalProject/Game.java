import java.util.Scanner;
import java.util.InputMismatchException;

public class Game{
  
  private String player1Name;
  private String player2Name;
  private Board board;
  
  public Game(String p1Name, String p2Name){
    player1Name = p1Name;
    player2Name = p2Name;
    board = new Board();
  }
  
  public void intro(){
    System.out.println("Welcome to Kinect4");
    System.out.println("Designed by Dave, Santosh, and JJ");
    System.out.println("----------------------------------");
    board.printBoard();
  }
  
  public void play(){
    intro();
    Scanner scan = new Scanner(System.in);
    while(board.checkWin()==-1){
      System.out.println(player1Name + ", please enter a column (1-7).");
      int p1 = -1;
      // TODO: CHECK VALIDITY OF VALUE ENTERED
      while(p1 == -1){
        try{
          p1 = scan.nextInt();
        }catch (InputMismatchException e){
          System.out.println("Invalid; please re-enter value.");
          scan.next();
        }
      }
      if(p1 < 1 || p1 > 7){
        System.out.println("Invalid number; please re-enter value.");
        continue;
      }
      board.dropPiece(p1-1, 0);
      board.printBoard();
      if(board.checkWin()!=-1){
        System.out.println(player1Name + " wins!");
        break;
      }
      System.out.println(player2Name + ", please enter a column (1-7).");
      int p2 = -1;
      // TODO: CHECK VALIDITY OF VALUE ENTERED
      while(p2 == -1){
        try{
          p2 = scan.nextInt();
        }catch (InputMismatchException e){
          System.out.println("Invalid; please reenter value.");
        }
      }
      if(p2 < 1 || p2 > 7){
        System.out.println("Invalid number; please reenter valuedeagea");
        continue;
      }
      board.dropPiece(p2-1, 1);
      board.printBoard();
      if(board.checkWin()!=-1){
        System.out.println(player2Name + " wins!");
        break;
      }
    }
    System.out.println("Thanks for playing");
    scan.close();
  }
}