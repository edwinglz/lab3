public class Pawn extends ChessPiece{
    
    //attributes are inherited

    //constructors
    public Pawn(){

    }

    public Pawn(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    public boolean verifyMove(char column, int row){
        return false;
    }
}