class TorusGameOfLife extends GameOfLife{
    TorusGameOfLife(){
        super();
    }
    TorusGameOfLife(int size){
        super(size);
    }
    TorusGameOfLife(int[][] board){
        super(board);
    }

    @Override
    int neighbors(int r, int c){
        int neighbors = 0;
        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                int row = (c + i + size) % size;
                int col = (r + j + size) % size;
                neighbors += board[col][row];
            }
        }
        neighbors -= board[r][c];
        return neighbors;
    }
}