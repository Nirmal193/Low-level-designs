package org.example.LLD.TicTacToe;

public class Player {
    private String name;
    private Symbol symbol;
    public Player (String name,Symbol symbol){
        this.symbol = symbol;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
