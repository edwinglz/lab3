public class Pawn extends ChessPiece{
    
    //attributes are inherited

    //constructors
    public Pawn(){

    }

    public Pawn(String piece_name,String color,int row,char column){
        super(piece_name, color, row, column);
    }
    // Pawn movement validation
    @Override 
    public boolean verifyMove(char targetCol, int targetRow) {
        char targetColLower = Character.toLowerCase(targetCol);
        char currentColLower = Character.toLowerCase(getColumn());

        // A pawn can never change columns if there are no other pieces to capture
        if (targetColLower != currentColLower) {
            return false;
        }

        // White moves UP (+1 row, or +2 rows from starting row 2)
        if (getColor().equalsIgnoreCase("WHITE")) {
            if (targetRow == getRow() + 1) {
                return true;
            }
            // Optional: standard chess allows 2 squares forward from row 2
            if (getRow() == 2 && targetRow == getRow() + 2) {
                return true;
            }
        }
        // Black moves DOWN (-1 row, or -2 rows from starting row 7)
        else if (getColor().equalsIgnoreCase("BLACK")) {
            if (targetRow == getRow() - 1) {
                return true;
            }
            // Optional: standard chess allows 2 squares forward from row 7
            if (getRow() == 7 && targetRow == getRow() - 2) {
                return true;
            }
        }

        return false;
    }
}