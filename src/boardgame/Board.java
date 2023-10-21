package boardgame;

public class Board {
    private int rows;
    private int columms;
    private Piece[][] pieces;

    public Board (int rows, int columm){
        this.rows = rows;
        this.columms = columm;
        pieces = new Piece [rows][columm];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumms() {
        return columms;
    }

    public void setColumms(int columms) {
        this.columms = columms;
    }

    public Piece piece(int row, int columm){
        return pieces [row][columm];
    }

    public Piece piece (Position position){
        return pieces [position.getRow()][position.getColumm()];
    }
}
