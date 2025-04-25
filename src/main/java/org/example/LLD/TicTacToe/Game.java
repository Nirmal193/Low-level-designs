package org.example.LLD.TicTacToe;

import java.util.Scanner;

public class Game {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    public Game(Player player1, Player player2){
        board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }
    public void play(){
        Scanner scan = new Scanner(System.in);
        while(board.hasWon() == false && board.remainingMove() > 0){
            System.out.println(currentPlayer.getName() + " please make a move of " + currentPlayer.getSymbol());
            int row = scan.nextInt();
            int col = scan.nextInt();
            if(board.makeMove(row,col,currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println("Move made by " + currentPlayer.getName());
                currentPlayer = currentPlayer==player1 ? player2 : player1;
            }else{
                System.out.println("please choose a valid spot");
                board.printBoard();
            }
        }
        if(board.hasWon()) {
            System.out.println("The Winner is:- " + board.getWinner());
        }else{
            System.out.println("Game is Draw");
        }
        board.printBoard();
        scan.close();
    }
}
