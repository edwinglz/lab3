public class Knight extends ChessPiece{
    
    //attributes are inherited

    //constructors
    public Knight(){

    }

    public Knight(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    public boolean verifyMove(char column, int row){
        return false;
    }
}