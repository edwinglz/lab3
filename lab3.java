import java.util.Scanner;

//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//  Lab Three - Six Piece Chess Array - Made by Edwin Gonzalez, Osmar Leon ^v^
//
//  Main Objective: User chooses chess piece type, color, and current coordinates for six different chess pieces. 
//  Then a target coordinate is chosen and the program will verify if each piece can move to that target coordinate or not.
//  The program will then output the results of each piece's movement verification and terminate after a single run.
//--------------------------------------------------------------------------------------------------------------------------------------------
// Change Log:
// 9/27 - Framework for classes was made, Pieces, Chessboard, ChessPiece, Main created.
// 9/28 - Piece type classes VerifyMove methods created.
// 9/28 - Main method created, user input for piece type, color, and coordinates created. Updated comment header.
// 9/28 - Updates on main method including every input validation, moved and implemented column enum type to Chessboard class.
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------

public class lab3{

    //enum classes
    public enum PieceType {
        KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
    }


    //custom method to make sure piece type name is correct
    public static PieceType getPieceType(Scanner scanner, ChessPiece[] piecesArray) {
        while (true) {
            System.out.print("Piece type (KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN): ");
            String input = scanner.nextLine().trim().toUpperCase();

            // check if name is real piece type
            PieceType type;
            try {
                type = PieceType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid piece type! Please enter one of the listed pieces.\n");
                continue;  // back to the prompt
            }

            // check if name of piece has been used already
            boolean samePiece = false;
            for (int i = 0; i < piecesArray.length; i++) {

                //if null that means no more pieces
                if(piecesArray[i] == null){
                    break;
                }
                if (input.equals(piecesArray[i].getPieceName().toUpperCase())) {
                    samePiece = true;
                    break;
                }
            }
            if (samePiece) {
                System.out.println("Chess piece already used! Please pick a new one.");
                continue;  // back to the prompt
            }

            //passed both checks
            return type;
        }
    }

    //MAIN
    public static void main(String[] args){
        Chessboard chessboard = new Chessboard();
        Scanner scanner = new Scanner(System.in);

        ChessPiece[] pieces = new ChessPiece[6];
        System.out.println("Welcome! The program will ask for details to create six chess pieces. Please enter the details as prompted.");
        
        //for loop to get user input for each piece and create the corresponding chess piece in the array
        for(int i = 0; i < pieces.length; i++){
            System.out.println("Enter details for piece " + (i + 1) + ":");

            //Get Piece Type
            PieceType pieceType = getPieceType(scanner, pieces);
            //Get Color
            String color;
            while(true){
                System.out.print("Color (white or black): ");
                color = scanner.nextLine().toLowerCase().trim();
                if (color.equals("white") || color.equals("black")){
                    break;
                }else{
                    System.out.println("Invalid color. Please try again.");
                }
            }

            //Get Row and Column
            int row;
            char column;
            while (true) {
                System.out.println("\nPlease type the starting position of your piece (e.g., e4): ");
                String targetPosition = scanner.nextLine().trim();

                // Check basic length and types before getting column and row
                if (targetPosition.length() == 2 
                    && Character.isLetter(targetPosition.charAt(0)) 
                    && Character.isDigit(targetPosition.charAt(1))) {

                    column = targetPosition.toLowerCase().charAt(0);
                    row = Character.getNumericValue(targetPosition.charAt(1));

                    // Check if on the board
                    if (chessboard.withinChessboard(column, row)) {
                        break; // Valid input, exit loop
                    }
                }
                System.out.println("Invalid starting position! Must be on board (e.g., e4).");
            }
       

            switch(pieceType){
                case KING:
                    pieces[i] = new King("King", color, row, column);
                    break;
                case QUEEN:
                    pieces[i] = new Queen("Queen", color, row, column);
                    break;
                case ROOK:
                    pieces[i] = new Rook("Rook", color, row, column);
                    break;
                case BISHOP:
                    pieces[i] = new Bishop("Bishop", color, row, column);
                    break;
                case KNIGHT:
                    pieces[i] = new Knight("Knight", color, row, column);
                    break;
                case PAWN:
                    pieces[i] = new Pawn("Pawn", color, row, column);
                    break;
            }
        }
        //end of for loop

        //Get target coordinates
        char targetColumn;
        int targetRow;
        while (true) {
          System.out.println("\nPlease type the target position of your piece (e.g., e4): ");
          String targetPosition = scanner.nextLine().trim();

          // Check basic length and types before getting column and row
          if (targetPosition.length() == 2 
            && Character.isLetter(targetPosition.charAt(0)) 
            && Character.isDigit(targetPosition.charAt(1))) {

            targetColumn = targetPosition.toLowerCase().charAt(0);
            targetRow = Character.getNumericValue(targetPosition.charAt(1));

            // Check if on the board
            if (chessboard.withinChessboard(targetColumn, targetRow)) {
                break; // Valid input, exit loop
            }
          }
          System.out.println("Invalid target position! Must be on board (e.g., e4).");
        }
        
        //traverse array and check if it is a valid move
        for(int i=0;i<pieces.length;i++){
            break;
        }
    }
}