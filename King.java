public class King extends Queen{
    
    //attributes are inherited

    //constructors
    public King(){

    }

    public King(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    public boolean verifyMove(char targetCol, int targetRow) {
        int colDiff = Math.abs(getColumn() - targetCol);
        int rowDiff = Math.abs(getRow() - targetRow);

        // A King cannot move more than 1 square away in either direction
        if (colDiff > 1 || rowDiff > 1) {
            return false;
        }

        // If movement is one square in any direction, then if 
        // it is also a valid Queen move, it is also a valid King move
        //                                  *is this a greek philosophy type thought? lol
        return super.verifyMove(targetCol, targetRow);
    }
}