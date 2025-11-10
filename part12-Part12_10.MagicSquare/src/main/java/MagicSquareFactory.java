public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        if (size % 2 == 0) {
            return square; // Siamese method only works for odd sizes
        }

        int row = 0;
        int col = size / 2;

        for (int num = 1; num <= size * size; num++) {
            square.placeValue(col, row, num); // col = x, row = y

            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (square.readValue(nextCol, nextRow) != 0) {
                row = (row + 1) % size; // move down
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        return square;
    }
}
