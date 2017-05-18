import java.util.Scanner;

public class Runner{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Player 1, please enter your name.");
    String p1Name = scan.nextLine();
    System.out.println("Player 2, please enter your name.");
    String p2Name = scan.nextLine();
    Game game = new Game(p1Name, p2Name);
    game.play();
  }
}