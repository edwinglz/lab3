public class King extends Queen{
    
    //attributes are inherited

    //constructors
    public King(){

    }

    public King(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    public boolean verifyMove(char column, int row){
        return false;
    }
}