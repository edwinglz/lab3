public class Queen extends Bishop{
    
    //attributes are inherited

    //constructors
    public Queen(){

    }

    public Queen(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }

    public boolean verifyMoveRook(char targetCol, int targetRow) {
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
    @Override 
    public boolean verifyMove(char targetCol, int targetRow) {
        // Queen movement is valid if it moves like a Bishop or a Rook
        return super.verifyMove(targetCol, targetRow) || verifyMoveRook(targetCol, targetRow);
    }
}