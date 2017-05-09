import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

//NOTE
//RED IS "O" IS 0
//BLUE IS "X" IS 1

public class Board{
  
  private int[][] board;
  
  public Board(){ //create new board
    board = new int[6][7];
    for(int row=0; row<board.length; row++){
      for(int col=0; col<board[0].length; col++){
        board[row][col] = -1; //initialize everything to -1 means that there are no players on the board
      }
    }
  }
  
  
  //DROP PIECE IN COLUMN: need to specify column and color of piece
  //return true if drop piece is successful
  //return false if drop piece is unsuccessful
  public boolean dropPiece(int column, int color){
    if(board[0][column]!=-1){
      return false; //that column is full
    }
    for(int row=board.length-1; row>=0; row--){
      if(board[row][column]==-1){
        board[row][column] = color;
        return true; //drop piece successful
      }
    }
    return false;
  }
  
  public void printBoard(){
    System.out.print(" ");
    for(int i=0; i<board[0].length*2; i++){System.out.print("_");} //print out top frame
    for(int i=0; i<board.length; i++){
      System.out.println();
      System.out.print("|");
      for(int j=0; j<board[0].length; j++){
        if(board[i][j]==-1){
          System.out.print("_");
        }else if(board[i][j]==0){
          System.out.print("O");
        }else if(board[i][j]==1){
          System.out.print("X");
        }
        System.out.print(" ");
      }
      System.out.print("|");
    }
    System.out.println();
    System.out.print(" ");
    for(int i=0; i<board[0].length*2; i++){System.out.print("_");} //print out bottom frame
    System.out.println();
  }
  
  //If a player won, return who won (1 or 0)
  //If no player won, return -1
  public int checkWin(){
    //CHECK SIDEWAYS 4 in a row
    for(int row=0; row<board.length; row++){
      for(int col=0; col<board[0].length-4; col++){
        if((board[row][col]!=-1) && (board[row][col]==board[row][col+1]) && (board[row][col+1]==board[row][col+2]) && (board[row][col+2]==board[row][col+3]) && (board[row][col+3]==board[row][col+4])){
          return board[row][col];
        }
      }
    }
    //CHECK VERTICALLY 4 in a row
    for(int row=0; row<board.length-4; row++){
      for(int col=0; col<board[0].length; col++){
        if((board[row][col!=-1]) && (board[row][col]==board[row+1][col]) && (board[row+1][col]==board[row+2][col]) && (board[row+2][col]==board[row+3][col]) && (board[row+3][col]==board[row+4][col])){
          return board[row][col];
        }
      }
    }
    //CHECK DIAGONALLY -SLOPE 4 in a row
    
    //CHECK DIAGONALLY +SLOPE 4 in a row
  }
  
  public static void main(String[] args){
    Board board = new Board();
    board.dropPiece(0, 0);
    board.dropPiece(0, 1);
    board.printBoard();
  }
}