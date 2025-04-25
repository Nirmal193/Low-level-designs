package org.example.LLD.TicTacToe;

public class Board {
   private Symbol[][] board;
   private Symbol winner;
   private Integer move;
   public Board(){
       winner = Symbol.EMPTY;
       board = new Symbol[3][3];
       this.move = 0;
       initializeBoard();
   }
   private void initializeBoard(){
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               board[i][j] = Symbol.EMPTY;
           }
       }
   }
   public void printBoard(){
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(board[i][j].getValue());
           }
           System.out.println();
       }
   }
   public Symbol getWinner(){
       return this.winner;
   }
   public int remainingMove(){
       return 9-move;
   }
   public boolean makeMove(int row, int col, Symbol symbol){
       if(move >=9 ||row >=3 || col >= 3 || board[row][col] != Symbol.EMPTY){
           System.out.println("please choose a valid spot");
           return false;
       }else {
           board[row][col] = symbol;
           move++;
           return true;
       }
   }

   public boolean hasWon(){
       for (int row = 0; row < 3; row++) {
           if (board[row][0] != Symbol.EMPTY &&
                   board[row][0] == board[row][1] &&
                   board[row][1] == board[row][2]) {
                winner = board[row][0];
               return true;
           }
       }
       for (int col = 0; col < 3; col++) {
           if (board[0][col] != Symbol.EMPTY &&
                   board[0][col] == board[1][col] &&
                   board[1][col] == board[2][col]) {
                winner = board[0][col];
               return true;
           }
       }
       if (board[0][0] != Symbol.EMPTY &&
               board[0][0] == board[1][1] &&
               board[1][1] == board[2][2]) {
            winner = board[0][0];
           return true;
       }
       if( board[0][2] != Symbol.EMPTY &&
               board[0][2] == board[1][1] &&
               board[1][1] == board[2][0]){
            winner = board[0][2];
            return true;
       }
       return false;
   }
}
