public class Queen extends Bishop{
    
    //attributes are inherited

    //constructors
    public Queen(){

    }

    public Queen(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    public boolean verifyMove(char column, int row){
        return false;
    }
}