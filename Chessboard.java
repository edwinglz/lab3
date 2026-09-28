public class Chessboard {
    //column enum
    public enum columns {
        a, b, c, d, e, f, g, h
    }
    public static final int MIN_ROW = 1;
    public static final int MAX_ROW = 8;

    public Chessboard() {
    }

    public boolean withinChessboard(char column, int row) {
        boolean validColumn;
        try {
            columns.valueOf(String.valueOf(Character.toLowerCase(column)));
            validColumn = true;
        } catch (IllegalArgumentException e) {
            validColumn = false;
        }
        return validColumn && row >= MIN_ROW && row <= MAX_ROW;
    }
}