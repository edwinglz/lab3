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
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------

public class lab3{

    //enum classes
    public enum PieceType {
        KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
    }
    public enum columns {
        a, b, c, d, e, f, g, h
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
            System.out.print("Piece type (KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN): ");

            //Get Piece Type
            String typeInput = scanner.nextLine().toUpperCase();
            PieceType pieceType = PieceType.valueOf(typeInput);
            //Get Color
            System.out.print("Color (white or black): ");
            String color = scanner.nextLine().toLowerCase();
            //Get Row
            System.out.print("Row (1-8): ");
            int row = scanner.nextInt();
            scanner.nextLine(); // consume newline
            //Get Column
            System.out.print("Column (a-h): ");
            char column = scanner.nextLine().charAt(0);

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
        System.out.print("Enter target coordinate(e.g., e4): ");
        String targetInput = scanner.nextLine();
        char targetColumn = targetInput.charAt(0);
        int targetRow = Character.getNumericValue(targetInput.charAt(1));
        
    }
}