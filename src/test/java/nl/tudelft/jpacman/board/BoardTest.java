package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests that a Board with a valid grid of Squares (created successfully).
 */
class BoardTest {

    @Test
    void testValidBoard() {
        // 1x1 grid with one valid BasicSquare
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();

        // Create the board
        Board board = new Board(grid);

        //verify board
        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
        assertThat(board.withinBorders(0, 0)).isTrue();
    }
    @Test
    void testInvalidBoardNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;

        assertThrows(AssertionError.class, () -> new Board(grid));
    }

}
