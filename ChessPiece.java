public abstract class ChessPiece{

    //attributes
    private String piece_name;
    private String  color;
    private int row;
    private char column;

    //constructors
    public ChessPiece(){

    };

    public ChessPiece(String piece_name,String color,int row,char column){
        this.piece_name = piece_name;
        this.color = color;
        this.row = row;
        this.column = column;
    }

    //abstract method
    abstract boolean verifyMove(char column, int row);

    //getters

    public String getColor(){
        return this.color;
    }

    public char getColumn(){
        return this.column;
    }

    public int getRow(){
        return this.row;
    }

    public String getPieceName(){
        return this.piece_name;
    }

    //setters

    public void setColumn(char column){
        this.column = column;
    }

    public void setRow(int row){
        this.row = row;
    }
}