import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {

    @Test
    public void evolution1(){
        int[][] A = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] B = {{0,0,0},{0,0,0},{0,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(1);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void evolution2(){
        int[][] A = {{0,0,1},{0,1,0},{0,0,1}};
        int[][] B = {{0,0,0},{0,1,1},{0,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(1);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void evolution3(){
        int[][] A = {{1,1,1},{0,1,0},{1,1,1}};
        int[][] B = {{0,1,0},{0,0,0},{0,1,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(2);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void evolution4(){
        int[][] A = {{1,1,1},{0,1,0},{1,1,1}};
        int[][] B = {{0,0,0},{0,0,0},{0,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(4);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void evolution5(){
        int[][] A = {{1,0,1},{0,1,1},{1,1,0}};
        int[][] B = {{0,0,0},{0,0,1},{0,1,1}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(2);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void neighbors1() {
        int[][] A= {{1, 0, 1}, {0, 1, 1}, {1, 1, 0}};
        GameOfLife gol = new GameOfLife(A);
        assertEquals(1, gol.neighbors(0,0));
    }
    @Test
    public void neighbors2() {
        int[][] A= {{1, 0, 1}, {0, 1, 1}, {1, 1, 0}};
        GameOfLife gol = new GameOfLife(A);
        assertEquals(5, gol.neighbors(1,1));
    }
    @Test
    public void neighbors3() {
        int[][] A= {{1, 1, 1}, {1, 1, 1}, {1, 1, 0}};
        GameOfLife gol = new GameOfLife(A);
        assertEquals(3, gol.neighbors(2,2));
    }
    @Test
    public void neighbors4() {
        int[][] A= {{1, 0, 0}, {0, 0, 1}, {0, 1, 0}};
        GameOfLife gol = new GameOfLife(A);
        assertEquals(1, gol.neighbors(1,2));
    }
    @Test
    public void neighbors5() {
        int[][] A= {{0, 0, 1}, {0, 0, 0}, {1, 0, 0}};
        GameOfLife gol = new GameOfLife(A);
        assertEquals(0, gol.neighbors(0,2));
    }
    @Test
    public void oneStep1() {
        int[][] A = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] B = {{0,0,0},{0,0,0},{0,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(1);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void oneStep2() {
        int[][] A = {{0,0,1},{0,1,0},{0,0,1}};
        int[][] B = {{0,0,0},{0,1,1},{0,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(1);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void oneStep3() {
        int[][] A = {{1,1,1},{0,1,0},{1,1,1}};
        int[][] B = {{0,1,0},{0,0,0},{0,1,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(2);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void oneStep4() {
        int[][] A = {{1,1,1},{0,1,0},{1,1,1}};
        int[][] B = {{0,0,0},{0,0,0},{0,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(4);
        assertArrayEquals(B, gol.getBoard());
    }
    @Test
    public void oneStep5() {
        int[][] A = {{1,0,1},{0,1,1},{1,1,0}};
        int[][] B = {{0,0,0},{0,0,1},{0,1,1}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(2);
        assertArrayEquals(B, gol.getBoard());
    }

}