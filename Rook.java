public class Rook extends ChessPiece{
    
    //attributes are inherited

    //constructors
    public Rook(){

    }

    public Rook(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    @Override 
    public boolean verifyMove(char targetCol, int targetRow) {
        char currentCol = getColumn();
        int currentRow = getRow();

        // Rook moves along straight lines: same column OR same row
        boolean sameCol = (currentCol == targetCol);
        boolean sameRow = (currentRow == targetRow);

        if (sameCol && sameRow) {
            return false;
        }

        return sameCol || sameRow;
    }
}