public class Knight extends ChessPiece{
    
    //attributes are inherited

    //constructors
    public Knight(){

    }

    public Knight(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    //validation
    public boolean verifyMove(char column, int row){
        char targetCol = Character.toLowerCase(column);
        char currentCol = Character.toLowerCase(getColumn());

        //current = target
        if(targetCol == currentCol && row == getRow()){
            return false;
        }
        
        //validation
        if((Math.abs(currentCol - targetCol) == 1 && Math.abs(getRow() - row) == 2) || (Math.abs(getRow() - row) == 1 && Math.abs(currentCol - targetCol) == 2)){
            return true;
        }
        
        return false;
    }
}