import java.util.Scanner;

//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//  Lab Three - Continous Chess Piece Practice - Made by Edwin Gonzalez, Osmar Leon ^v^
//
//  Main Objective: User chooses a chess piece type and color, chooses current and target coordinates to attempt different
//  chess moves to practice chess moves!  
//
//
//--------------------------------------------------------------------------------------------------------------------------------------------
// Change Log:
// 9/27 - Framework for classes was made, Pieces, Chessboard, ChessPiece, Main created.
// 9/28 - Piece type classes VerifyMove methods created.
//--------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------

public class lab3{

    //enum classes
    public enum PieceType {
        KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
    }
    public enum columns {
        a, b, c, d, e, f, g, h
    }
    public static void main(String[] args){
        Chessboard chessboard = new Chessboard();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! If you are here this means you are trying to verify a chess piece's movement.");
        
    }
}