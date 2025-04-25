package org.example.LLD.TicTacToe;

public enum Symbol {
    CIRCLE ('O'),
    CROSS('X'),
    EMPTY('-');
    private final char value;
    Symbol(char value){
        this.value = value;
    }
    public char getValue(){
        return value;
    }
}
