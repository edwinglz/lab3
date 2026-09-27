public class Bishop extends ChessPiece{
    
    //attributes are inherited

    //constructors
    public Bishop(){

    }

    public Bishop(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    public boolean verifyMove(char column, int row){
        char targetCol = Character.toLowerCase(column);
        char currentCol = Character.toLowerCase(getColumn());

        if(targetCol == currentCol && row == getRow()){
            return false;
        }
        boolean isBishopMove = Math.abs(targetCol - currentCol) == Math.abs(row - getRow());

        return isBishopMove;
    }
}