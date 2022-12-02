package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A5);
        Assert.assertEquals(bishopBlack.position(), Cell.A5);
    }

    @Test
    public void whenCopyEquals() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A5);
        Figure bishopBlack2 = bishopBlack.copy(Cell.E1);
        Assert.assertEquals(bishopBlack2.position(), Cell.E1);
    }

    @Test
    public void whenWayEquals() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(bishopBlack.way(Cell.G5), expected);
    }

    @Test
    public void whenIsDiagonalTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.G5);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenIsDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.G4);
        Assert.assertFalse(rsl);
    }
}