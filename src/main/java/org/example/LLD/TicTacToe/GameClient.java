package org.example.LLD.TicTacToe;

public class GameClient {
    public static void main(String[] args) {
        Player player1 = new Player("Nirmal", Symbol.CROSS);
        Player player2 = new Player("Nishant", Symbol.CIRCLE);
        Game game = new Game(player1, player2);
        game.play();
    }
}
